package proyectocitas;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class HorasCitas extends javax.swing.JInternalFrame {

    public Conector BaseDatos = new Conector();

    public HorasCitas() {
        initComponents();
        jDateChooser1.setDate(new Date());
        jDesktopPane1.setBorder(new ImagenFondo());
        actualizarDatos();

    }



    public void actualizarDatos() {
        //para poder actualizar el texto 
        Text9ActionPerformed(null);
        Text10ActionPerformed(null);
        Text11ActionPerformed(null);
        Text12ActionPerformed(null);
        Text13ActionPerformed(null);
        Text17ActionPerformed(null);
        Text18ActionPerformed(null);
        Text19ActionPerformed(null);
    }

    public void limpiarTexto() {
        Text9.setText("");
        Text10.setText("");
        Text11.setText("");
        Text12.setText("");
        Text13.setText("");
        Text17.setText("");
        Text18.setText("");
        Text19.setText("");

    }

    public void abrirFormularioCitas() {
        //abre el FormularioCitas
        VentanaFormularioCitas = new FormularioCitas();

        if (VentanaFormularioCitas.isVisible() == false) {
            jDesktopPane1.add(VentanaFormularioCitas);
            FormularioCitas.TextFecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(HorasCitas.jDateChooser1.getDate()));
             //COge la fecha del JdataChosser1 y la introduce en el formularioCitas
            VentanaFormularioCitas.fecha2 = fecha;
            //coge el valor de fecha y la carga en la string fecha2 del formularioCitas
            VentanaFormularioCitas.hora2 = hora;
            VentanaFormularioCitas.PrepararTabla("");//llama al metodo prepararTabla de formulariocitas
            VentanaFormularioCitas.show();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Boton9 = new javax.swing.JButton();
        Boton10 = new javax.swing.JButton();
        Boton11 = new javax.swing.JButton();
        Boton12 = new javax.swing.JButton();
        Boton13 = new javax.swing.JButton();
        Boton17 = new javax.swing.JButton();
        Boton18 = new javax.swing.JButton();
        Boton19 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Text9 = new javax.swing.JTextField();
        Text10 = new javax.swing.JTextField();
        Text11 = new javax.swing.JTextField();
        Text12 = new javax.swing.JTextField();
        Text13 = new javax.swing.JTextField();
        Text17 = new javax.swing.JTextField();
        Text18 = new javax.swing.JTextField();
        Text19 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonActualizar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Boton9.setText("9:00");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });

        Boton10.setText("10:00");
        Boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton10ActionPerformed(evt);
            }
        });

        Boton11.setText("11:00");
        Boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton11ActionPerformed(evt);
            }
        });

        Boton12.setText("12:00");
        Boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton12ActionPerformed(evt);
            }
        });

        Boton13.setText("13:00");
        Boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton13ActionPerformed(evt);
            }
        });

        Boton17.setText("17:00");
        Boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton17ActionPerformed(evt);
            }
        });

        Boton18.setText("18:00");
        Boton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton18ActionPerformed(evt);
            }
        });

        Boton19.setText("19:00");
        Boton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton19ActionPerformed(evt);
            }
        });

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseExited(evt);
            }
        });
        jDateChooser1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jDateChooser1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Text9.setEditable(false);
        Text9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text9ActionPerformed(evt);
            }
        });

        Text10.setEditable(false);
        Text10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text10ActionPerformed(evt);
            }
        });

        Text11.setEditable(false);
        Text11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text11ActionPerformed(evt);
            }
        });

        Text12.setEditable(false);
        Text12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text12ActionPerformed(evt);
            }
        });

        Text13.setEditable(false);
        Text13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text13ActionPerformed(evt);
            }
        });

        Text17.setEditable(false);
        Text17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text17ActionPerformed(evt);
            }
        });

        Text18.setEditable(false);
        Text18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text18ActionPerformed(evt);
            }
        });

        Text19.setEditable(false);
        Text19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text19ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Visualizar Cita");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dar Cita");

        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exit.png"))); // NOI18N
        BotonSalir.setToolTipText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonSalir)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonActualizar))
                            .addComponent(Text10)
                            .addComponent(Text11)
                            .addComponent(Text12)
                            .addComponent(Text13)
                            .addComponent(Text17)
                            .addComponent(Text18)
                            .addComponent(Text19)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Text9, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonActualizar))
                .addGap(13, 13, 13)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton9)
                    .addComponent(Text9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton10)
                    .addComponent(Text10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton11)
                    .addComponent(Text11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton12)
                    .addComponent(Text12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton13)
                    .addComponent(Text13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton17)
                    .addComponent(Text17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton18)
                    .addComponent(Text18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton19)
                    .addComponent(Text19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonSalir)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(Boton9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Boton10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Boton11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Boton12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Boton13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Boton17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Boton18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Boton19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDateChooser1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Text9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Text10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Text11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Text12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Text13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Text17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Text18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Text19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BotonActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BotonSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDateChooser1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDateChooser1AncestorAdded
        fecha = "Error";
        try {
            Date date = jDateChooser1.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            fecha = String.valueOf(sdf.format(date));
            //transforma el formato y lo introduce a una variable String
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fecha Incorrecta y/o incompleta", "Fechas", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jDateChooser1AncestorAdded

    private void Boton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton19ActionPerformed
        hora19 = "19";
        hora = "19";
        abrirFormularioCitas();
        FormularioCitas.TextHora.setText(hora19);
    }//GEN-LAST:event_Boton19ActionPerformed

    private void Boton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton18ActionPerformed
        hora18 = "18";
        hora = "18";
        abrirFormularioCitas();
        FormularioCitas.TextHora.setText(hora18);
    }//GEN-LAST:event_Boton18ActionPerformed

    private void Boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton17ActionPerformed
        hora17 = "17";
        hora = "17";
        abrirFormularioCitas();
        FormularioCitas.TextHora.setText(hora17);
    }//GEN-LAST:event_Boton17ActionPerformed

    private void Boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton13ActionPerformed
        hora13 = "13";
        hora = "13";
        abrirFormularioCitas();
        FormularioCitas.TextHora.setText(hora13);
    }//GEN-LAST:event_Boton13ActionPerformed

    private void Boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton12ActionPerformed
        hora12 = "12";
        hora = "12";
        abrirFormularioCitas();
        FormularioCitas.TextHora.setText(hora12);
    }//GEN-LAST:event_Boton12ActionPerformed

    private void Boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton11ActionPerformed
        hora11 = "11";
        hora = "11";
        abrirFormularioCitas();
        FormularioCitas.TextHora.setText(hora11);
    }//GEN-LAST:event_Boton11ActionPerformed

    private void Boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton10ActionPerformed
        hora10 = "10";
        hora = "10";
        abrirFormularioCitas();
        FormularioCitas.TextHora.setText(hora10);//introduce la hora al texto de formulario citas
    }//GEN-LAST:event_Boton10ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        hora9 = "9";
        hora = "9";
        abrirFormularioCitas();//llama al metodo
        FormularioCitas.TextHora.setText(hora9);
//        Boton9.setBackground(java.awt.Color.red);
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Text18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text18ActionPerformed
        jDateChooser1AncestorAdded(null);
        hora18 = "18";
        this.OrdenSQL = "SELECT Clientes.Nombre, Clientes.Apellidos, Citas.Patologia FROM Clientes INNER JOIN Citas ON Clientes.IdCliente = Citas.IdClientes WHERE Fecha = '" + fecha + "' AND Hora = '" + hora18 + "'";
        Campos = this.BaseDatos.ConsultaGenerica(OrdenSQL);
        if (Campos[0].equals("error")) {

        } else {
            Text18.setText("Paciente: " + Campos[0] + " " + Campos[1] + ", Patología: " + Campos[2]);
        }
    }//GEN-LAST:event_Text18ActionPerformed

    private void Text9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text9ActionPerformed
        
        jDateChooser1AncestorAdded(null);//Llamar para obtener valor de la fecha
        hora9 = "9";
        this.OrdenSQL = "SELECT Clientes.Nombre, Clientes.Apellidos, Citas.Patologia "
                + "FROM Clientes INNER JOIN Citas ON Clientes.IdCliente = Citas.IdClientes "
                + "WHERE Fecha = '" + fecha + "' AND Hora = '" + hora9 + "'";
        Campos = this.BaseDatos.ConsultaGenerica(OrdenSQL);
        limpiarTexto();
        if (Campos[0].equals("error")) {//si la consulta esta vacia no rellenar nada

        } else {//si la consulta tiene datos rellenar los campos
            Text9.setText("Paciente: " + Campos[0] + " " + Campos[1] + ", Patología: " + Campos[2]);
        }
    }//GEN-LAST:event_Text9ActionPerformed

    private void Text10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text10ActionPerformed
        jDateChooser1AncestorAdded(null);
        hora10 = "10";
        this.OrdenSQL = "SELECT Clientes.Nombre, Clientes.Apellidos, Citas.Patologia "
                + "FROM Clientes INNER JOIN Citas ON Clientes.IdCliente = Citas.IdClientes "
                + "WHERE Fecha = '" + fecha + "' AND Hora = '" + hora10 + "'";
        Campos = this.BaseDatos.ConsultaGenerica(OrdenSQL);
        if (Campos[0].equals("error")) {
        } else {
            Text10.setText("Paciente: " + Campos[0] + " " + Campos[1] + ", Patología: " + Campos[2]);
        }
    }//GEN-LAST:event_Text10ActionPerformed

    private void Text11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text11ActionPerformed
        jDateChooser1AncestorAdded(null);
        hora11 = "11";
        this.OrdenSQL = "SELECT Clientes.Nombre, Clientes.Apellidos, Citas.Patologia "
                + "FROM Clientes INNER JOIN Citas ON Clientes.IdCliente = Citas.IdClientes "
                + "WHERE Fecha = '" + fecha + "' AND Hora = '" + hora11 + "'";
        Campos = this.BaseDatos.ConsultaGenerica(OrdenSQL);
        if (Campos[0].equals("error")) {

        } else {
            Text11.setText("Paciente: " + Campos[0] + " " + Campos[1] + ", Patología: " + Campos[2]);
        }
    }//GEN-LAST:event_Text11ActionPerformed

    private void Text12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text12ActionPerformed
        jDateChooser1AncestorAdded(null);
        hora12 = "12";
        this.OrdenSQL = "SELECT Clientes.Nombre, Clientes.Apellidos, Citas.Patologia "
                + "FROM Clientes INNER JOIN Citas ON Clientes.IdCliente = Citas.IdClientes "
                + "WHERE Fecha = '" + fecha + "' AND Hora = '" + hora12 + "'";
        Campos = this.BaseDatos.ConsultaGenerica(OrdenSQL);
        if (Campos[0].equals("error")) {

        } else {
            Text12.setText("Paciente: " + Campos[0] + " " + Campos[1] + ", Patología: " + Campos[2]);
        }
    }//GEN-LAST:event_Text12ActionPerformed

    private void Text13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text13ActionPerformed
        jDateChooser1AncestorAdded(null);
        hora13 = "13";
        this.OrdenSQL = "SELECT Clientes.Nombre, Clientes.Apellidos, Citas.Patologia "
                + "FROM Clientes INNER JOIN Citas ON Clientes.IdCliente = Citas.IdClientes "
                + "WHERE Fecha = '" + fecha + "' AND Hora = '" + hora13 + "'";
        Campos = this.BaseDatos.ConsultaGenerica(OrdenSQL);
        if (Campos[0].equals("error")) {

        } else {
            Text13.setText("Paciente: " + Campos[0] + " " + Campos[1] + ", Patología: " + Campos[2]);
        }
    }//GEN-LAST:event_Text13ActionPerformed

    private void Text17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text17ActionPerformed
        jDateChooser1AncestorAdded(null);
        hora17 = "17";
        this.OrdenSQL = "SELECT Clientes.Nombre, Clientes.Apellidos, Citas.Patologia "
                + "FROM Clientes INNER JOIN Citas ON Clientes.IdCliente = Citas.IdClientes "
                + "WHERE Fecha = '" + fecha + "' AND Hora = '" + hora17 + "'";
        Campos = this.BaseDatos.ConsultaGenerica(OrdenSQL);
        if (Campos[0].equals("error")) {

        } else {
            Text17.setText("Paciente: " + Campos[0] + " " + Campos[1] + ", Patología: " + Campos[2]);
        }
    }//GEN-LAST:event_Text17ActionPerformed

    private void Text19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text19ActionPerformed
        jDateChooser1AncestorAdded(null);
        hora19 = "19";
        this.OrdenSQL = "SELECT Clientes.Nombre, Clientes.Apellidos, Citas.Patologia "
                + "FROM Clientes INNER JOIN Citas ON Clientes.IdCliente = Citas.IdClientes "
                + "WHERE Fecha = '" + fecha + "' AND Hora = '" + hora19 + "'";
        Campos = this.BaseDatos.ConsultaGenerica(OrdenSQL);
        if (Campos[0].equals("error")) {

        } else {
            Text19.setText("Paciente: " + Campos[0] + " " + Campos[1] + ", Patología: " + Campos[2]);
        }
    }//GEN-LAST:event_Text19ActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        actualizarDatos();
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void jDateChooser1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseExited
        BotonActualizar.doClick();
    }//GEN-LAST:event_jDateChooser1MouseExited

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton10;
    private javax.swing.JButton Boton11;
    private javax.swing.JButton Boton12;
    private javax.swing.JButton Boton13;
    private javax.swing.JButton Boton17;
    private javax.swing.JButton Boton18;
    private javax.swing.JButton Boton19;
    public static javax.swing.JButton Boton9;
    public static javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonSalir;
    public static javax.swing.JTextField Text10;
    public static javax.swing.JTextField Text11;
    public static javax.swing.JTextField Text12;
    public static javax.swing.JTextField Text13;
    public static javax.swing.JTextField Text17;
    public static javax.swing.JTextField Text18;
    public static javax.swing.JTextField Text19;
    public static javax.swing.JTextField Text9;
    public static com.toedter.calendar.JDateChooser jDateChooser1;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    String OrdenSQL;
    String OrdenSQLCitas;
    String Campos[] = new String[5];
    FormularioCitas VentanaFormularioCitas = null;
    String hora9, hora10, hora11, hora12, hora13, hora17, hora18, hora19;
    String fecha, hora, fecha2;

}
