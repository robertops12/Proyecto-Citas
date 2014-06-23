package proyectocitas;


public class InformeAsistencia extends javax.swing.JInternalFrame {

    public Conector BaseDatos = new Conector();

    public InformeAsistencia() {
        initComponents();
        PrepararTablaNombre("");

    }

    public void PrepararTablaNombre(String valor) {
        //Recibe el valor de aux del texo a buscar 
        //y hace una consulta al campo nombre completo 
        String titulos[] = {"IdCita", "Nombre", "Apellidos", "Fecha", "Hora", "Asistencia"};
        this.OrdenSQL = "SELECT Citas.IdCitas, Clientes.Nombre, Clientes.Apellidos, Citas.Fecha, Citas.Hora, Citas.Asistencia, Clientes.NombreCompleto "
                + "FROM Clientes INNER JOIN Citas ON Clientes.IdCliente = Citas.IdClientes "
                + "WHERE NombreCompleto LIKE '%" + valor + "%'";
        this.jTable1.setModel(this.BaseDatos.TablaConsultar(OrdenSQL, titulos));
    }

    public void PrepararTablaAsistencia(String valor) {
        //Recibe el valor de aux2 del texo a buscar 
        //y hace una consulta al campo asistencia 
        String titulos[] = {"IdCita", "Nombre", "Apellidos", "Fecha", "Hora", "Asistencia"};
        this.OrdenSQL = "SELECT Citas.IdCitas, Clientes.Nombre, Clientes.Apellidos, Citas.Fecha, Citas.Hora, Citas.Asistencia, Clientes.NombreCompleto "
                + "FROM Clientes INNER JOIN Citas ON Clientes.IdCliente = Citas.IdClientes "
                + "WHERE Asistencia LIKE '%" + valor + "%'";
        this.jTable1.setModel(this.BaseDatos.TablaConsultar(OrdenSQL, titulos));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        aux = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboAsistencia = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Informe Asistencia");
        setToolTipText("");

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
        jScrollPane1.setViewportView(jTable1);

        aux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auxActionPerformed(evt);
            }
        });
        aux.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                auxKeyPressed(evt);
            }
        });

        jLabel1.setText("Busqueda por nombre:");

        jLabel2.setText("Busqueda por Asistencia");

        ComboAsistencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        ComboAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAsistenciaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Informe de asistencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(ComboAsistencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void auxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxKeyPressed
        PrepararTablaNombre(aux.getText());
    }//GEN-LAST:event_auxKeyPressed

    private void ComboAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAsistenciaActionPerformed
        //Convierto el comboAsistencia a String
        String aux2 = (String) ComboAsistencia.getSelectedItem();
        PrepararTablaAsistencia(aux2);
    }//GEN-LAST:event_ComboAsistenciaActionPerformed

    private void auxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auxActionPerformed

    }//GEN-LAST:event_auxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboAsistencia;
    private javax.swing.JTextField aux;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    String OrdenSQL;
}
