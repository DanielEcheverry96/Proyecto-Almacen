/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaGUI;

/**
 *
 * @author danie
 */
public class MenuSierrasInter extends javax.swing.JFrame {

    /**
     * Creates new form MenuSierrasInter
     */
    public MenuSierrasInter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMarca = new javax.swing.JLabel();
        jLabelPotencia = new javax.swing.JLabel();
        jLabelColor = new javax.swing.JLabel();
        jButtonBorrarUno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonModificar = new javax.swing.JButton();
        jTextFieldColor = new javax.swing.JTextField();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jLabelTipo = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelMensaje = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldUrl = new javax.swing.JTextField();
        jTextFieldTipo = new javax.swing.JTextField();
        jLabelCantidad = new javax.swing.JLabel();
        jTextFieldPotencia = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldVelocidad = new javax.swing.JTextField();
        jLabelVelocidad = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonBorrarTodos = new javax.swing.JButton();
        jButtonConsultarUno = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jLabelUrl = new javax.swing.JLabel();
        jButtonConsultarTodo = new javax.swing.JButton();
        jButtonInsertar = new javax.swing.JButton();
        jTextFieldId = new javax.swing.JTextField();
        jLabelPeso = new javax.swing.JLabel();
        jLabelDiametroDisco = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jTextFieldDiametroDisco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelMarca.setText("Marca");

        jLabelPotencia.setText("Potencia");

        jLabelColor.setText("Color");

        jButtonBorrarUno.setText("Borrar Uno");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonModificar.setText("Modificar");

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelTipo.setText("Tipo");

        jLabelMensaje.setText("Estado");

        jTextFieldTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoActionPerformed(evt);
            }
        });

        jLabelCantidad.setText("Cantidad");

        jLabelNombre.setText("Nombre");

        jLabelVelocidad.setText("Velocidad");

        jLabelPrecio.setText("Precio");

        jLabelTitulo.setText("Sierras");

        jButtonBorrarTodos.setText("Borrar Todos");

        jButtonConsultarUno.setText("Consultar Uno");

        jLabelId.setText("ID");

        jLabelUrl.setText("Url");

        jButtonConsultarTodo.setText("Consultar Todo");
        jButtonConsultarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarTodoActionPerformed(evt);
            }
        });

        jButtonInsertar.setText("Insertar");

        jLabelPeso.setText("Peso");

        jLabelDiametroDisco.setText("Diametro Disco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelId)
                                            .addComponent(jLabelMarca)
                                            .addComponent(jLabelNombre)
                                            .addComponent(jLabelCantidad)
                                            .addComponent(jLabelPrecio))
                                        .addGap(45, 45, 45))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelColor)
                                        .addGap(48, 48, 48)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPrecio)
                                    .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUrl)
                                    .addComponent(jLabelTipo)
                                    .addComponent(jLabelPotencia)
                                    .addComponent(jLabelVelocidad)
                                    .addComponent(jLabelDiametroDisco)
                                    .addComponent(jLabelPeso))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldVelocidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPotencia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldUrl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDiametroDisco))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonConsultarUno)
                    .addComponent(jButtonConsultarTodo)
                    .addComponent(jButtonBorrarUno)
                    .addComponent(jButtonBorrarTodos)
                    .addComponent(jButtonInsertar))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonInsertar)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonModificar)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonConsultarUno)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonConsultarTodo)
                            .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jButtonBorrarUno)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBorrarTodos))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelId)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelMarca)
                                    .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCantidad)
                                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelPrecio)
                                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelColor)
                                    .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelUrl)
                                    .addComponent(jTextFieldUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTipo)
                                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelPotencia)
                                    .addComponent(jTextFieldPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelVelocidad)
                                            .addComponent(jTextFieldVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelPeso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelDiametroDisco))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jTextFieldDiametroDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTipoActionPerformed

    private void jButtonConsultarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarTodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarTodoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuSierrasInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSierrasInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSierrasInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSierrasInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSierrasInter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrarTodos;
    private javax.swing.JButton jButtonBorrarUno;
    private javax.swing.JButton jButtonConsultarTodo;
    private javax.swing.JButton jButtonConsultarUno;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelDiametroDisco;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelPotencia;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUrl;
    private javax.swing.JLabel jLabelVelocidad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldDiametroDisco;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldPotencia;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldTipo;
    private javax.swing.JTextField jTextFieldUrl;
    private javax.swing.JTextField jTextFieldVelocidad;
    // End of variables declaration//GEN-END:variables
}
