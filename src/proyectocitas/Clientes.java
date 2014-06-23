
package proyectocitas;


public class Clientes extends javax.swing.JInternalFrame {

   
    public Clientes() {
        initComponents();
        setSize(1366,768);
        jDesktopPane1.setBorder(new ImagenFondo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        BotonNuevoCliente = new javax.swing.JButton();
        BotonInforme = new javax.swing.JButton();
        BotonAsistencia = new javax.swing.JButton();
        BotonHistorial = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clientes");
        setPreferredSize(new java.awt.Dimension(800, 400));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Gestión clientes");

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        BotonNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevousuario.png"))); // NOI18N
        BotonNuevoCliente.setToolTipText("Nuevo Cliente");
        BotonNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(BotonNuevoCliente);

        BotonInforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Clipboard-icon.png"))); // NOI18N
        BotonInforme.setToolTipText("Informe Cliente");
        BotonInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInformeActionPerformed(evt);
            }
        });
        jToolBar1.add(BotonInforme);

        BotonAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/checklist-icon.png"))); // NOI18N
        BotonAsistencia.setToolTipText("Informe Asistencia");
        BotonAsistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAsistencia.setFocusable(false);
        BotonAsistencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonAsistencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAsistenciaActionPerformed(evt);
            }
        });
        jToolBar1.add(BotonAsistencia);

        BotonHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/medical-report-icon.png"))); // NOI18N
        BotonHistorial.setToolTipText("Historial Paciente");
        BotonHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonHistorial.setFocusable(false);
        BotonHistorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonHistorial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHistorialActionPerformed(evt);
            }
        });
        jToolBar1.add(BotonHistorial);

        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exit2.png"))); // NOI18N
        BotonSalir.setToolTipText("Salir");
        BotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSalir.setFocusable(false);
        BotonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(BotonSalir);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 195, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoClienteActionPerformed
        //accede al formularioCliente
        if (VentanaAlta.isVisible() == false) {
            jDesktopPane1.add(VentanaAlta);
            VentanaAlta.show();
        }
        
    }//GEN-LAST:event_BotonNuevoClienteActionPerformed

    private void BotonInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInformeActionPerformed
        //accede al InformeCliente
        if (VentaInformeCliente.isVisible() == false) {
            jDesktopPane1.add(VentaInformeCliente);
            VentaInformeCliente.show();
        }
        VentaInformeCliente.PrepararTabla("");
    }//GEN-LAST:event_BotonInformeActionPerformed

    private void BotonAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAsistenciaActionPerformed
        //Accede al InformeAsistencia
        if (ventanaAsistencia.isVisible() == false) {
            jDesktopPane1.add(ventanaAsistencia);
            ventanaAsistencia.show();
        }
    }//GEN-LAST:event_BotonAsistenciaActionPerformed

    private void BotonHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHistorialActionPerformed
        //accede al InformeHistorial
        if (ventanaHistorial.isVisible() == false) {
            jDesktopPane1.add(ventanaHistorial);
            ventanaHistorial.show();
        }
    }//GEN-LAST:event_BotonHistorialActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
       dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAsistencia;
    private javax.swing.JButton BotonHistorial;
    private javax.swing.JButton BotonInforme;
    private javax.swing.JButton BotonNuevoCliente;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
    FormularioCliente VentanaAlta = new FormularioCliente();
    InformeCliente VentaInformeCliente = new InformeCliente();
    InformeAsistencia ventanaAsistencia = new InformeAsistencia();
    InformeHistorial ventanaHistorial = new InformeHistorial();
}
