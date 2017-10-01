/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaGUI;

import controlador.ManejadorObjetos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Marca;

/**
 *
 * @author Daniel
 */
public class MenuMarcaInter extends javax.swing.JFrame {

    /**
     * Creates new form MenuMarcaInter
     */
    ManejadorObjetos manobj;
    Integer idMarcaTemporal = null;
    DefaultTableModel model;
    int indiceFila = 0;
    String[] dato = new String[2];
    
    public MenuMarcaInter() {
        initComponents();
         manobj = new ManejadorObjetos();
         model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Marca");
        jTable2.setModel(model);
        model.insertRow(indiceFila, dato);
 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTitulo = new javax.swing.JLabel();
        jMarca = new javax.swing.JLabel();
        jId = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jMensaje = new javax.swing.JLabel();
        jButtonInsertar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

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

        jTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(0, 0, 204));
        jTitulo.setText("Marcas");

        jMarca.setText("Nombre");

        jId.setText("Id");

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Borrar Uno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar Todo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Consultar Uno");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Consultar Todo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMarca)
                    .addComponent(jId))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButtonInsertar))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTitulo)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonInsertar)
                        .addGap(14, 14, 14)
                        .addComponent(jButton3)
                        .addGap(14, 14, 14)
                        .addComponent(jButton4)
                        .addGap(14, 14, 14)
                        .addComponent(jButton5)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jId)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jMarca)
                            .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(14, 14, 14)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        Marca mar = new Marca(Integer.parseInt(jTextFieldId.getText()), jTextFieldMarca.getText());
        
        if (manobj.insertar(mar)) {
            jMensaje.setText("Marca Insertada");
            model.insertRow(indiceFila, dato);
            jTable2.setValueAt(jTextFieldId.getText(), indiceFila, 0);
            jTable2.setValueAt(jTextFieldMarca.getText(), indiceFila, 1);
            indiceFila++;
            manobj.consultarTodos();
        }
        else
            jMensaje.setText("Marca no insertada");
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     manobj.consultarTodos();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < manobj.arregloMarcas.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable2.setValueAt(manobj.arregloMarcas.get(i).getId(), indiceFila, 0);
            jTable2.setValueAt(manobj.arregloMarcas.get(i).getDescripcion(), indiceFila, 1);
            indiceFila++;
        }    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int filaSeleccionada = jTable2.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int idEliminar = Integer.parseInt(jTable2.getValueAt(filaSeleccionada, 0).toString());
            model.removeRow(filaSeleccionada);
            if (manobj.borrar(idEliminar)) {
                    JOptionPane.showMessageDialog(this, "Marca borrada exitosamente");    
                    }
            else {
            JOptionPane.showMessageDialog(this, "Error al borrar");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al borrar");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int filaSeleccionada = jTable2.getSelectedRow();
        System.out.println(filaSeleccionada);
        if (filaSeleccionada >= 0) {
            
            int a = Integer.parseInt(jTable2.getValueAt(filaSeleccionada, 0).toString());
            jTextFieldId.setText(jTable2.getValueAt(filaSeleccionada, 0).toString());
            jTextFieldMarca.setText(jTable2.getValueAt(filaSeleccionada, 1).toString());
            Marca marmod = new Marca(Integer.parseInt(jTextFieldId.getText()), jTextFieldMarca.getText());
            int posicion = manobj.busquedaBinaria(a);
                    if (!(posicion==-1)) {
                    if (manobj.modificar(posicion, marmod)) {
                        JOptionPane.showMessageDialog(this, "Marca modificada exitosamente");
                        indiceFila--;
                    }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Error al modificar");
                    }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int idBuscado = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el ID a buscar"));
            
            Marca resultado = (Marca) manobj.consultarId(idBuscado);
        if (resultado == null) {
            JOptionPane.showMessageDialog(this, "Marca no encontrada");
        }
        else{
            JOptionPane.showMessageDialog(this, "La marca encontrada es:\n" + resultado.toString());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if (manobj.borrarTodo()) {
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            indiceFila = 0;
            JOptionPane.showMessageDialog(this, "Todos las marcas se borraron exitosamente");
        } else {
            JOptionPane.showMessageDialog(this, "Error al borrar todo");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuMarcaInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuMarcaInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuMarcaInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuMarcaInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuMarcaInter().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JLabel jId;
    private javax.swing.JLabel jMarca;
    private javax.swing.JLabel jMensaje;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
