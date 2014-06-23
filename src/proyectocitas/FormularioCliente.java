package proyectocitas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class FormularioCliente extends javax.swing.JInternalFrame {

    public Conector BaseDatos = new Conector();

    public FormularioCliente() {
        initComponents();
        PrepararTabla("");
        bloquearTexto();
        bloquearBotones();
    }

    public void PrepararTabla(String valor) {
        String titulos[] = {"Codigo", "Nombre", "Apellidos", "Teléfono", "Móvil"};
        this.OrdenSQL = "SELECT * FROM Clientes WHERE NombreCompleto LIKE '%" + valor + "%'";
        this.jTable1.setModel(this.BaseDatos.TablaConsultar(OrdenSQL, titulos));
    }

    private void bloquearBotones() {
        BotonCancelar.setEnabled(false);
        BotonEliminar.setEnabled(false);
        BotonGuardar.setEnabled(false);
    }

    public void limpiar() {
        TextCodigo.setText("");
        TextNombre.setText("");
        TextApellidos.setText("");
        TextTelefono.setText("");
        TextMovil.setText("");
    }

    public void bloquearTexto() {
        TextNombre.setEditable(false);
        TextApellidos.setEditable(false);
        TextTelefono.setEditable(false);
        TextMovil.setEditable(false);
    }

    public void desbloquearTexto() {
        TextNombre.setEditable(true);
        TextApellidos.setEditable(true);
        TextTelefono.setEditable(true);
        TextMovil.setEditable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextCodigo = new javax.swing.JTextField();
        TextNombre = new javax.swing.JTextField();
        TextApellidos = new javax.swing.JTextField();
        TextTelefono = new javax.swing.JTextField();
        TextMovil = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        aux = new javax.swing.JTextField();
        BotonNuevo = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotonEliminar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Formulario Cliente");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Código");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Formulario Cliente");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellidos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Teléfono");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Móvil");

        TextCodigo.setEditable(false);

        TextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextTelefonoKeyTyped(evt);
            }
        });

        TextMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMovilActionPerformed(evt);
            }
        });
        TextMovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextMovilKeyTyped(evt);
            }
        });

        jLabel8.setText("Consultar:");

        aux.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                auxKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                auxKeyReleased(evt);
            }
        });

        BotonNuevo.setText("Nuevo");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

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

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
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

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exit.png"))); // NOI18N
        BotonSalir.setToolTipText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel1))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TextMovil)
                                            .addComponent(TextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonSalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(BotonNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCancelar)))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(TextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BotonSalir))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TextMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonNuevo)
                    .addComponent(BotonEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        switch (opcion) {
            case 1:
                this.OrdenSQL = "INSERT INTO Clientes(Nombre,Apellidos,Telefono,Movil,NombreCompleto)"
                        + "VALUES('" + TextNombre.getText() + "','" + TextApellidos.getText() + "','"
                        + TextTelefono.getText() + "','" + TextMovil.getText() + "','" + TextNombre.getText() + " " + TextApellidos.getText() + "')";
                this.BaseDatos.Insertar(OrdenSQL);
                break;
            case 2:
                this.OrdenSQL = "UPDATE Clientes SET Nombre = '" + TextNombre.getText() + "', Apellidos = '"
                        + TextApellidos.getText()
                        + "', Telefono = '" + TextTelefono.getText() + "', Movil = '" + TextMovil.getText()
                        + "', NombreCompleto = '" + TextNombre.getText() + " " + TextApellidos.getText() +"' WHERE IdCliente = " + TextCodigo.getText() + "";
                this.BaseDatos.Modificar(OrdenSQL);
                break;
            default:
                throw new AssertionError();
        }
        PrepararTabla("");
        bloquearTexto();
        BotonGuardar.setEnabled(false);
        BotonCancelar.setEnabled(false);
        BotonEliminar.setEnabled(false);
        BotonNuevo.setEnabled(true);
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        limpiar();
        BotonGuardar.setEnabled(false);
        BotonEliminar.setEnabled(false);
        BotonNuevo.setEnabled(true);
        BotonCancelar.setEnabled(false);
        bloquearTexto();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void auxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxKeyPressed
        PrepararTabla(aux.getText());
    }//GEN-LAST:event_auxKeyPressed

    private void auxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxKeyReleased
        //PrepararTabla(aux.getText());
    }//GEN-LAST:event_auxKeyReleased

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void TextMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMovilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextMovilActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        TextNombre.requestFocus();
        opcion = 1;
        limpiar();
        desbloquearTexto();
        BotonCancelar.setEnabled(true);
        BotonGuardar.setEnabled(true);
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar este registro de manera permanente?", "Eliminar registro", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
            String SentenciaSQL = "DELETE * FROM Clientes" + " WHERE IdCliente = " + TextCodigo.getText() + "";
            BaseDatos.Eliminar(SentenciaSQL);
        }
        PrepararTabla("");
        BotonCancelar.setEnabled(false);
        BotonEliminar.setEnabled(false);
        BotonGuardar.setEnabled(false);
        BotonNuevo.setEnabled(true);
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
        if (fila >= 0) {
            TextCodigo.setText(jTable1.getValueAt(fila, 0).toString());
            TextNombre.setText(jTable1.getValueAt(fila, 1).toString());
            TextApellidos.setText(jTable1.getValueAt(fila, 2).toString());
            TextTelefono.setText(jTable1.getValueAt(fila, 3).toString());
            TextMovil.setText(jTable1.getValueAt(fila, 4).toString());

        } else {
            JOptionPane.showMessageDialog(null, "No selecciono fila");
        }
        opcion = 2;
        desbloquearTexto();
        BotonGuardar.setEnabled(true);
        BotonEliminar.setEnabled(true);
        BotonCancelar.setEnabled(true);
        BotonNuevo.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void TextTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTelefonoKeyTyped
       char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (TextTelefono.getText().length() > 8) {
            evt.consume();
        }
    }//GEN-LAST:event_TextTelefonoKeyTyped

    private void TextMovilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextMovilKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (TextMovil.getText().length() > 8) {
            evt.consume();
        }
    }//GEN-LAST:event_TextMovilKeyTyped

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField TextApellidos;
    private javax.swing.JTextField TextCodigo;
    private javax.swing.JTextField TextMovil;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JTextField aux;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    String OrdenSQL;
    int opcion;
}
