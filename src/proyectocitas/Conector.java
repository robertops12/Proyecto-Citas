package proyectocitas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Conector {

    private String NombreBD = "AgendaCitas.mdb";     //Se identifica la BBDD
    private String ConexionDB = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + this.NombreBD;
    private String SentenciaSQL;
    private Connection CanalBD;
    private Statement Instruccion;
    private ResultSet Resultado;
    private Statement sentencia = null;
    private String[] Dades2;
    ResultSetMetaData metadatos;

    public Conector() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            this.CanalBD = DriverManager.getConnection(this.ConexionDB);
            this.Instruccion = this.CanalBD.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException SQLE) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONEXION CON BD\nERROR: " + SQLE.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException CNFE) {
            JOptionPane.showMessageDialog(null, "ERROR DRIVER BD JAVA\nERROR: " + CNFE.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Insertar(String SentenciaSQL) {
        this.SentenciaSQL = SentenciaSQL;
        try {
            this.Instruccion.executeUpdate(this.SentenciaSQL);
            JOptionPane.showMessageDialog(null, "EL REGISTRO SE AGREGO CON EXITO A LA BD", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException SQLE) {
            JOptionPane.showMessageDialog(null, "ERROR AL AÑADIR REGISTRO A LA BD\nERRORInsertar: " + SQLE.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Modificar(String SentenciaSQL) {
        this.SentenciaSQL = SentenciaSQL;
        try {
            this.Instruccion.executeUpdate(this.SentenciaSQL);
            JOptionPane.showMessageDialog(null, "REGISTRO MODIFICADO CON EXITO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException SQLE) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA MODIFICACION\nERRORModificar: " + SQLE.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Eliminar(String SentenciaSQL) {
        this.SentenciaSQL = SentenciaSQL;
        try {
            this.Instruccion.executeUpdate(this.SentenciaSQL);
            JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO DE LA BD", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException SQLE) {
            JOptionPane.showMessageDialog(null, "ERROR EN EL BORRADO\nERROREliminar: " + SQLE.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

//    public String[] Consultar(String SentenciaSQL) {
//        this.SentenciaSQL = SentenciaSQL;
//        String[] Datos = new String[4];
//        System.out.println(SentenciaSQL);
//        Datos[0] = "error";
//        try {
//            this.Resultado = Instruccion.executeQuery(this.SentenciaSQL);
//            Resultado.next();
//            Datos[0] = Resultado.getString("IdCitas");
//            Datos[1] = Resultado.getString("IdClientes");
//            Datos[2] = Resultado.getString("Fecha");
//            Datos[3] = Resultado.getString("Hora");
//            Datos[4] = Resultado.getString("Patologia");
//
//        } catch (SQLException SQLE) {
//            // JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA\nERRORCOnsultar: " + SQLE.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
//            // return null;
//        }
//        return Datos;
//    }

    public String[] ConsultaGenerica(String SentenciaSQL) {
        this.SentenciaSQL = SentenciaSQL;
        String[] Datos = null;
        try {
            this.Resultado = this.Instruccion.executeQuery(this.SentenciaSQL);
            ResultSetMetaData metaDatos = Resultado.getMetaData();
            int colum = metaDatos.getColumnCount();
            Datos = new String[colum];
            Resultado.next();
            for (int x = 0; x < colum; x++) {
                Datos[x] = Resultado.getString(x + 1);
            }
           
        } catch (SQLException SQLE) {
            Datos[0] = "error";
            //JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA\nERRORCOnsultar: " + SQLE.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return Datos;
    }
    public String[] ConsultaGenerica2(String SentenciaSQL) {
        this.SentenciaSQL = SentenciaSQL;
        String[] Datos = null;
        try {
            this.Resultado = this.Instruccion.executeQuery(this.SentenciaSQL);
            ResultSetMetaData metaDatos = Resultado.getMetaData();
            int colum = metaDatos.getColumnCount();
            Datos = new String[colum];
            Resultado.next();
            for (int x = 0; x < colum; x++) {
                Datos[x] = Resultado.getString(x + 1);
            }
           
        } catch (SQLException SQLE) {
            Datos[0] = "error";
            //JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA\nERRORCOnsultar: " + SQLE.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return Datos;
    }

    public DefaultTableModel TablaConsultar(String SentenciaSQL, String[] Cabecera) {
        this.SentenciaSQL = SentenciaSQL;
        DefaultTableModel modelo = new DefaultTableModel(null, Cabecera);

        String[] Datos = null;
        try {
            this.Resultado = Instruccion.executeQuery(this.SentenciaSQL);
            ResultSetMetaData metaDatos = Resultado.getMetaData();
            int colum = metaDatos.getColumnCount();
            Datos = new String[colum];
            while (Resultado.next()) {
                for (int x = 0; x < colum; x++) {
                    Datos[x] = Resultado.getString(x + 1);
                }
                modelo.addRow(Datos);
            }
        } catch (SQLException SQLE) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LOS DATOS DE LA BD \n ERRORTablaCOnsultar : " + SQLE.getMessage());
        }
        return modelo;
    }
}
