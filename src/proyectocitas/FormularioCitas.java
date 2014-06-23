package proyectocitas;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static proyectocitas.HorasCitas.jDateChooser1;

public class FormularioCitas extends javax.swing.JInternalFrame {

    public Conector BaseDatos = new Conector();

    public FormularioCitas() {
        initComponents();
        bloquearBotones();
    }

    public void limpiarTexto() {
        TextCliente.setText("");
        TextFecha.setText("");
        TextHora.setText("");
        TextPatologia.setText("");
    }

    private void bloquearBotones() {
        BotonCancelar.setEnabled(false);
        BotonEliminar.setEnabled(false);
        BotonGuardar.setEnabled(false);
        BotonNuevo.setEnabled(false);
        BotonModificar.setEnabled(false);
        aux.setEditable(false);
        TextPatologia.setEditable(false);
        TextTratamiento.setEditable(false);
    }

    public void comprobar(String OrdenSQL2) {
        //COnsultar en la tabla citas la existencia
        // por fecha y hora
        OrdenSQL2 = "SELECT * "
                + "FROM Citas "
                + "WHERE Fecha = '" + fecha2 + "' AND Hora = '" + hora2 + "'";
        Campos2 = this.BaseDatos.ConsultaGenerica2(OrdenSQL2);
        if (Campos2[0].equals("error")) {
            codigoCita();//el ultimo registro de la tabla citas BaSE DATOS
            BotonNuevo.setEnabled(true);
        } else {
            BotonModificar.setEnabled(true);
            BotonEliminar.setEnabled(true);
            TextCita.setText(Campos2[0]);
            TextCliente.setText(Campos2[1]);
            TextFecha.setText(Campos2[2]);
            TextHora.setText(Campos2[3]);
            TextPatologia.setText(Campos2[4]);
            TextAsistencia.setText(Campos2[5]);
            TextTratamiento.setText(Campos2[6]);
        }
    }

    public void PrepararTabla(String valor) {
        comprobar(" ");
        String titulos[] = {"Codigo", "Nombre", "Apellidos"};
        this.OrdenSQL = "SELECT * FROM Clientes WHERE NombreCompleto LIKE '%" + valor + "%'";
        this.jTable1.setModel(this.BaseDatos.TablaConsultar(OrdenSQL, titulos));
    }

    public void codigoCita() {
        int numero;
        this.OrdenSQL = "SELECT Citas.IdCitas "
                + "FROM Citas ORDER BY Citas.IdCitas DESC";
        Cita = this.BaseDatos.ConsultaGenerica(OrdenSQL);
        numero = Integer.parseInt(Cita[0]);
        numero = numero + 1;
        String numero2 = Integer.toString(numero);
        TextCita.setText(numero2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        TextCliente = new javax.swing.JTextField();
        TextFecha = new javax.swing.JTextField();
        TextHora = new javax.swing.JTextField();
        TextPatologia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCAsistencia = new javax.swing.JComboBox();
        BotonGuardar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        aux = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextCita = new javax.swing.JTextField();
        TextAsistencia = new javax.swing.JTextField();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextTratamiento = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        BotonNuevo = new javax.swing.JButton();

        jLabel8.setText("Consultar:");

        setClosable(true);
        setIconifiable(true);
        setTitle("Formulario Citas");

        TextCliente.setEditable(false);
        TextCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextClienteActionPerformed(evt);
            }
        });

        TextFecha.setEditable(false);
        TextFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFechaActionPerformed(evt);
            }
        });

        TextHora.setEditable(false);
        TextHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextHoraActionPerformed(evt);
            }
        });

        jLabel2.setText("Cliente");

        Fecha.setText("Fecha");

        jLabel4.setText("Hora");

        jLabel5.setText("Patología");

        jLabel6.setText("Asistencia");

        jCAsistencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        jCAsistencia.setToolTipText("Asistencia");

        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setText("Consultar:");

        aux.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                auxKeyPressed(evt);
            }
        });

        jLabel1.setText("Cita");

        TextCita.setEditable(false);

        TextAsistencia.setEditable(false);

        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        TextTratamiento.setColumns(20);
        TextTratamiento.setRows(5);
        jScrollPane2.setViewportView(TextTratamiento);

        jLabel3.setText("Tratamiento:");

        BotonNuevo.setText("Nuevo");
        BotonNuevo.setToolTipText("");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fecha)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TextHora)
                                            .addComponent(TextAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextFecha))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TextPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)
                                .addComponent(TextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextCita, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonModificar)
                    .addComponent(BotonEliminar)
                    .addComponent(BotonNuevo))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed

        String valor = (String) jCAsistencia.getSelectedItem();
        fecha = "Error";
        try {
            Date date = jDateChooser1.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            fecha = String.valueOf(sdf.format(date));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fecha Incorrecta o incompleta", "Fechas", JOptionPane.ERROR_MESSAGE);
        }
        switch (opcion) {

            case 1:
                this.OrdenSQL = "INSERT INTO Citas(IdCitas,IdClientes,Fecha,Hora,Patologia)"
                        + "VALUES(" + TextCita.getText() + "," + TextCliente.getText() + ",'"
                        + fecha + "','" + TextHora.getText() + "','" + TextPatologia.getText() + "')";
                this.BaseDatos.Insertar(OrdenSQL);
                break;
            case 2:
                this.OrdenSQL = "UPDATE Citas SET IdClientes = " + TextCliente.getText() + ", Fecha = '" + TextFecha.getText() + "', Hora = '" + TextHora.getText() + "', Patologia = '" + TextPatologia.getText() + "', Asistencia = '" + valor + "', Tratamiento = '" + TextTratamiento.getText() + "' WHERE IdCitas = " + TextCita.getText() + "";
                this.BaseDatos.Modificar(OrdenSQL);
                break;
            default:
                throw new AssertionError();
        }
        //Boton9.setBackground(java.awt.Color.red);
        dispose();
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void TextHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextHoraActionPerformed

    private void TextFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFechaActionPerformed
        //TextFecha.setText(new SimpleDateFormat("dd,MM,yyyy").format(HorasCitas.jDateChooser1.getDate()));
    }//GEN-LAST:event_TextFechaActionPerformed

    private void TextClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextClienteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
        if (fila >= 0) {
            TextCliente.setText(jTable1.getValueAt(fila, 0).toString());
        } else {
            JOptionPane.showMessageDialog(null, "No selecciono fila");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void auxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxKeyPressed
        PrepararTabla(aux.getText());
    }//GEN-LAST:event_auxKeyPressed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        TextCliente.setText("");
        TextPatologia.setText("");
        BotonGuardar.setEnabled(false);
        BotonModificar.setEnabled(false);
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        opcion = 2;
        aux.setEditable(true);
        TextPatologia.setEditable(true);
        TextTratamiento.setEditable(true);
        BotonGuardar.setEnabled(true);
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar la cita?", "Eliminar registro", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
            String SentenciaSQL = "DELETE * FROM Citas" + " WHERE IdCitas = " + TextCita.getText() + "";
            BaseDatos.Eliminar(SentenciaSQL);
        }
//        Boton9.setBackground(java.awt.Color.white);
        dispose();
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        aux.setEditable(true);
        TextPatologia.setEditable(true);
        BotonGuardar.setEnabled(true);
        BotonCancelar.setEnabled(true);
        BotonModificar.setEnabled(false);
        aux.requestFocus();
    }//GEN-LAST:event_BotonNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JLabel Fecha;
    private javax.swing.JTextField TextAsistencia;
    private javax.swing.JTextField TextCita;
    public static javax.swing.JTextField TextCliente;
    public static javax.swing.JTextField TextFecha;
    public static javax.swing.JTextField TextHora;
    private javax.swing.JTextField TextPatologia;
    private javax.swing.JTextArea TextTratamiento;
    private javax.swing.JTextField aux;
    private javax.swing.JComboBox jCAsistencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    String OrdenSQL;
    InformeCliente VentanaInforme = new InformeCliente();
    String fecha;
    String Campos[] = new String[5];
    String Campos2[] = new String[7];
    String Cita[] = new String[1];
    String OrdenSQL2;
    int opcion = 1;
    String fecha2 = "";
    String hora2 = "";
}
