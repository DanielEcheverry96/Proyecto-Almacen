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
public class MenuZapatosInter extends javax.swing.JFrame {

    /**
     * Creates new form MenuZapatosInter
     */
    public MenuZapatosInter() {
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

        buttonGroupTipo = new javax.swing.ButtonGroup();
        buttonGroupUsuario = new javax.swing.ButtonGroup();
        jTextFieldTallaNumerica = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldUrl = new javax.swing.JTextField();
        jTextFieldColor = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jLabelMarca = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jButtonBorrarTodos = new javax.swing.JButton();
        jLabelTallaNumerica = new javax.swing.JLabel();
        jButtonConsultarUno = new javax.swing.JButton();
        jLabelColor = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelTipoTelevisor = new javax.swing.JLabel();
        jLabelUrl = new javax.swing.JLabel();
        jButtonBorrarUno = new javax.swing.JButton();
        jButtonConsultarTodo = new javax.swing.JButton();
        jLabelPrecio = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jButtonInsertar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelMensaje = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jRadioButtonPantalon = new javax.swing.JRadioButton();
        jRadioButtonCamiseta = new javax.swing.JRadioButton();
        jLabelUsuario = new javax.swing.JLabel();
        jRadioButtonNiño = new javax.swing.JRadioButton();
        jRadioButtonNiña = new javax.swing.JRadioButton();
        jRadioButtonHombre = new javax.swing.JRadioButton();
        jRadioButtonMujer = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNombre.setText("Nombre");

        jLabelMarca.setText("Marca");

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonBorrarTodos.setText("Borrar Todos");

        jLabelTallaNumerica.setText("Talla Numerica");

        jButtonConsultarUno.setText("Consultar Uno");

        jLabelColor.setText("Color");

        jLabelId.setText("ID");

        jLabelTipoTelevisor.setText("Tipo Zapato");

        jLabelUrl.setText("Url");

        jButtonBorrarUno.setText("Borrar Uno");

        jButtonConsultarTodo.setText("Consultar Todo");
        jButtonConsultarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarTodoActionPerformed(evt);
            }
        });

        jLabelPrecio.setText("Precio");

        jButtonModificar.setText("Modificar");

        jButtonInsertar.setText("Insertar");

        jLabelTitulo.setText("Zapatos");

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

        jLabelMensaje.setText("Estado");

        jLabelCantidad.setText("Cantidad");

        buttonGroupTipo.add(jRadioButtonPantalon);
        jRadioButtonPantalon.setText("Deportivo");
        jRadioButtonPantalon.setPreferredSize(new java.awt.Dimension(67, 14));
        jRadioButtonPantalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPantalonActionPerformed(evt);
            }
        });

        buttonGroupTipo.add(jRadioButtonCamiseta);
        jRadioButtonCamiseta.setText("Calle");
        jRadioButtonCamiseta.setPreferredSize(new java.awt.Dimension(69, 14));

        jLabelUsuario.setText("Usuario");

        buttonGroupUsuario.add(jRadioButtonNiño);
        jRadioButtonNiño.setText("Niño");

        buttonGroupUsuario.add(jRadioButtonNiña);
        jRadioButtonNiña.setText("Niña");

        buttonGroupUsuario.add(jRadioButtonHombre);
        jRadioButtonHombre.setText("Hombre");

        buttonGroupUsuario.add(jRadioButtonMujer);
        jRadioButtonMujer.setText("Mujer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUrl)
                                    .addComponent(jLabelTipoTelevisor)
                                    .addComponent(jLabelTallaNumerica))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldTallaNumerica)
                                    .addComponent(jRadioButtonCamiseta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(jRadioButtonPantalon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldUrl, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelUsuario)
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonNiña)
                                    .addComponent(jRadioButtonNiño)
                                    .addComponent(jRadioButtonHombre)
                                    .addComponent(jRadioButtonMujer))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonModificar)
                            .addComponent(jButtonConsultarUno)
                            .addComponent(jButtonConsultarTodo)
                            .addComponent(jButtonBorrarUno)
                            .addComponent(jButtonBorrarTodos)
                            .addComponent(jButtonInsertar))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabelTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jButtonInsertar)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonModificar)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonConsultarUno)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonConsultarTodo)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonBorrarUno)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonBorrarTodos))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUrl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUrl))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTipoTelevisor)
                            .addComponent(jRadioButtonPantalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButtonCamiseta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTallaNumerica)
                            .addComponent(jTextFieldTallaNumerica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUsuario)
                            .addComponent(jRadioButtonNiño, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButtonNiña, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonHombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButtonMujer, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarTodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarTodoActionPerformed

    private void jRadioButtonPantalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPantalonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPantalonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuZapatosInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuZapatosInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuZapatosInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuZapatosInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuZapatosInter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.ButtonGroup buttonGroupUsuario;
    private javax.swing.JButton jButtonBorrarTodos;
    private javax.swing.JButton jButtonBorrarUno;
    private javax.swing.JButton jButtonConsultarTodo;
    private javax.swing.JButton jButtonConsultarUno;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTallaNumerica;
    private javax.swing.JLabel jLabelTipoTelevisor;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUrl;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JRadioButton jRadioButtonCamiseta;
    private javax.swing.JRadioButton jRadioButtonHombre;
    private javax.swing.JRadioButton jRadioButtonMujer;
    private javax.swing.JRadioButton jRadioButtonNiña;
    private javax.swing.JRadioButton jRadioButtonNiño;
    private javax.swing.JRadioButton jRadioButtonPantalon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldTallaNumerica;
    private javax.swing.JTextField jTextFieldUrl;
    // End of variables declaration//GEN-END:variables
}