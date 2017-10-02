/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaGUI;

import controlador.ManejadorObjetos;
import javax.swing.table.DefaultTableModel;
import modelo.Computadores;
import controlador.ManejadorComputadores;
import modelo.CategoriaElectronicosOficina;
import modelo.Marca;

/**
 *
 * @author Daniel
 */
public class MenuComputadorInter extends javax.swing.JFrame {
    ManejadorObjetos manObjetos;
    CategoriaElectronicosOficina mancate;
    ManejadorComputadores mancop;
    Integer idMarcaTemporal = null;
    DefaultTableModel model;
    int indiceFila = 0;
    String[] dato = new String[10];
    /**
     * Creates new form MenuComputadorInter
     */
    //String capmemoria, String tipoteclado, String tipomouse, String tipopantalla, int capalmacenamiento, int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar
    public MenuComputadorInter() {
        initComponents();
        manObjetos = new ManejadorObjetos();
        mancate = new CategoriaElectronicosOficina();
        mancop = new ManejadorComputadores();
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        model.addColumn("Color");
        model.addColumn("Marca");
        model.addColumn("Capacidad memoria");
        model.addColumn("Tipo teclado");
        model.addColumn("Tipo mouse");
        model.addColumn("Tipo pantalla");
        model.addColumn("Capacidad almacenamiento");
        jTable1.setModel(model);
        model.insertRow(indiceFila, dato);
        inicializarComboBox();
    }
    
        public void inicializarComboBox(){
        for(int i=0;i<manObjetos.arregloMarcas.size();i++){
           jComboBoxMarca.addItem(manObjetos.arregloMarcas.get(i).toString());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jLabelMarca = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelColor = new javax.swing.JLabel();
        jLabelUrl = new javax.swing.JLabel();
        jLabelTipMouse = new javax.swing.JLabel();
        jLabelTipTeclado = new javax.swing.JLabel();
        jLabelCapMemoria = new javax.swing.JLabel();
        jLabelTipPantalla = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldColor = new javax.swing.JTextField();
        jTextFieldUrl = new javax.swing.JTextField();
        jTextFieldTipoMouse = new javax.swing.JTextField();
        jTextFieldTipoTeclado = new javax.swing.JTextField();
        jTextFieldCapacidadMemoria = new javax.swing.JTextField();
        jTextFieldTipoPantalla = new javax.swing.JTextField();
        jButtonModificar = new javax.swing.JButton();
        jButtonConsultarUno = new javax.swing.JButton();
        jButtonConsultarTodo = new javax.swing.JButton();
        jButtonBorrarUno = new javax.swing.JButton();
        jButtonBorrarTodos = new javax.swing.JButton();
        jLabelCapacidadAlmacenamiento = new javax.swing.JLabel();
        jTextFieldCapacidadAlmacenamiento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelMensaje = new javax.swing.JLabel();
        jButtonInsertar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setText("Computador");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 11, -1, -1));

        jLabelId.setText("Id");
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 34, -1, -1));

        getContentPane().add(jComboBoxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 100, 73, -1));

        jLabelMarca.setText("Marca");
        getContentPane().add(jLabelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 103, -1, -1));

        jLabelNombre.setText("Nombre");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 58, -1, -1));

        jLabelCantidad.setText("Cantidad");
        getContentPane().add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 141, -1, -1));

        jLabelPrecio.setText("Precio");
        getContentPane().add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 167, -1, -1));

        jLabelColor.setText("Color");
        getContentPane().add(jLabelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 195, -1, -1));

        jLabelUrl.setText("Url");
        getContentPane().add(jLabelUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 223, -1, -1));

        jLabelTipMouse.setText("Tipo Mouse");
        getContentPane().add(jLabelTipMouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 34, -1, -1));

        jLabelTipTeclado.setText("Tipo Teclado");
        getContentPane().add(jLabelTipTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 62, -1, -1));

        jLabelCapMemoria.setText("Capacidad Memoria");
        getContentPane().add(jLabelCapMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 101, -1, -1));

        jLabelTipPantalla.setText("Tipo Pantalla");
        getContentPane().add(jLabelTipPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 141, -1, -1));
        getContentPane().add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 31, 88, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 55, 88, -1));

        jTextFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 138, 111, -1));
        getContentPane().add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 164, 111, -1));
        getContentPane().add(jTextFieldColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 192, 111, -1));
        getContentPane().add(jTextFieldUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 220, 111, -1));
        getContentPane().add(jTextFieldTipoMouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 29, 74, -1));
        getContentPane().add(jTextFieldTipoTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 59, 73, -1));
        getContentPane().add(jTextFieldCapacidadMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 98, 74, -1));
        getContentPane().add(jTextFieldTipoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 138, 73, -1));

        jButtonModificar.setText("Modificar");
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 97, -1, -1));

        jButtonConsultarUno.setText("Consultar Uno");
        getContentPane().add(jButtonConsultarUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 134, -1, -1));

        jButtonConsultarTodo.setText("Consultar Todo");
        jButtonConsultarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarTodoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConsultarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 171, -1, -1));

        jButtonBorrarUno.setText("Borrar Uno");
        getContentPane().add(jButtonBorrarUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 208, -1, -1));

        jButtonBorrarTodos.setText("Borrar Todos");
        getContentPane().add(jButtonBorrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 249, -1, -1));

        jLabelCapacidadAlmacenamiento.setText("Capacidad Almacenamiento");
        getContentPane().add(jLabelCapacidadAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 195, -1, -1));
        getContentPane().add(jTextFieldCapacidadAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 192, 93, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 299, -1, 91));

        jLabelMensaje.setText("Estado");
        getContentPane().add(jLabelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 420, -1, -1));

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarTodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarTodoActionPerformed

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
       Computadores comp = new Computadores();
       comp.setIdArticulo(Integer.parseInt(jTextFieldId.getText()));
       comp.setNombre(jTextFieldNombre.getText());
       comp.setCantidad(Integer.parseInt(jTextFieldCantidad.getText()));
       comp.setPrecio(Float.parseFloat(jTextFieldPrecio.getText()));
       comp.setColor(jTextFieldColor.getText());
       comp.setIdMarca(0);
       comp.setCapmemoria(jTextFieldCapacidadMemoria.getText());
       comp.setTipoteclado(jTextFieldTipoTeclado.getText());
       comp.setTipomouse(jTextFieldTipoMouse.getText());
       comp.setTipopantalla(jTextFieldTipoPantalla.getText());
       comp.setCapalmacenamiento(Integer.parseInt(jTextFieldCapacidadAlmacenamiento.getText()));
       
       
        
        if (mancop.insertar(comp)) {
            jLabelMensaje.setText("Computador Insertado");
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(jTextFieldId.getText(), indiceFila, 0);
            jTable1.setValueAt(jTextFieldNombre.getText(), indiceFila, 1);
            jTable1.setValueAt(Integer.parseInt(jTextFieldCantidad.getText()), indiceFila, 2);
            jTable1.setValueAt(Float.parseFloat(jTextFieldPrecio.getText()), indiceFila, 3);
            jTable1.setValueAt(jTextFieldColor.getText(), indiceFila, 4);
            jTable1.setValueAt(0, indiceFila, 5);
            jTable1.setValueAt(jTextFieldCapacidadMemoria.getText(), indiceFila, 6);
            jTable1.setValueAt(jTextFieldTipoTeclado.getText(), indiceFila, 7);
            jTable1.setValueAt(jTextFieldTipoMouse.getText(), indiceFila, 8);
            jTable1.setValueAt(jTextFieldTipoPantalla.getText(), indiceFila, 9);
            jTable1.setValueAt(Integer.parseInt(jTextFieldCapacidadAlmacenamiento.getText()), indiceFila, 10);
            indiceFila++;
            mancop.consultarTodos();
        }
        else
            jLabelMensaje.setText("Computador no insertado");
        
    }//GEN-LAST:event_jButtonInsertarActionPerformed

   
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
            java.util.logging.Logger.getLogger(MenuComputadorInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuComputadorInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuComputadorInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuComputadorInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuComputadorInter().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCapMemoria;
    private javax.swing.JLabel jLabelCapacidadAlmacenamiento;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTipMouse;
    private javax.swing.JLabel jLabelTipPantalla;
    private javax.swing.JLabel jLabelTipTeclado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUrl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldCapacidadAlmacenamiento;
    private javax.swing.JTextField jTextFieldCapacidadMemoria;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldTipoMouse;
    private javax.swing.JTextField jTextFieldTipoPantalla;
    private javax.swing.JTextField jTextFieldTipoTeclado;
    private javax.swing.JTextField jTextFieldUrl;
    // End of variables declaration//GEN-END:variables
}
