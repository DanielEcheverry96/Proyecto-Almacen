/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaGUI;

import controlador.ManejadorObjetos;
import controladorDB.ManejadorMarcasDB;
import java.awt.Image;
import javax.swing.ImageIcon;
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
    ManejadorMarcasDB manmarDB;
    Integer idMarcaTemporal = null;
    DefaultTableModel model;
    int indiceFila = 0;
    String[] dato = new String[2];

    public MenuMarcaInter() {
        initComponents();
        this.setLocationRelativeTo(null);
        manobj = new ManejadorObjetos();
        manmarDB = new ManejadorMarcasDB();
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Marca");
        jTable2.setModel(model);
        model.insertRow(indiceFila, dato);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.jpg")).getImage());
        ImageIcon ilogo = new ImageIcon(getClass().getResource("/imagenes/icono.jpg"));
        ImageIcon logo = new ImageIcon(ilogo.getImage().getScaledInstance(jlogo.getWidth(), jlogo.getHeight(), Image.SCALE_DEFAULT));
        jlogo.setIcon(logo);
    }

    public void limpiar() {
        jTextFieldId.setText("");
        jTextFieldMarca.setText("");
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
        jButtonOrdenarNombreAsc = new javax.swing.JButton();
        jButtonOrdenarNombreDesc = new javax.swing.JButton();
        jButtonOrdenarID = new javax.swing.JButton();
        jlogo = new javax.swing.JLabel();

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

        setTitle("Marcas\n");

        jTitulo.setFont(new java.awt.Font("Segoe UI Historic", 3, 36)); // NOI18N
        jTitulo.setText("Marcas");

        jMarca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jMarca.setText("Nombre");

        jId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        jButtonOrdenarNombreAsc.setText("Ordenar Nombre Ascendente");
        jButtonOrdenarNombreAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarNombreAscActionPerformed(evt);
            }
        });

        jButtonOrdenarNombreDesc.setText("Ordenar Nombre Descendente");
        jButtonOrdenarNombreDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarNombreDescActionPerformed(evt);
            }
        });

        jButtonOrdenarID.setText("Ordenar ID");
        jButtonOrdenarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarIDActionPerformed(evt);
            }
        });

        jlogo.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonOrdenarNombreAsc)
                    .addComponent(jButtonOrdenarNombreDesc)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMarca)
                            .addComponent(jId))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jTextFieldId)))
                    .addComponent(jButtonOrdenarID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButtonInsertar))
                        .addGap(6, 6, 6))
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                        .addContainerGap(154, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTitulo)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jId)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jMarca)
                                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonOrdenarNombreAsc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOrdenarNombreDesc))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButtonInsertar)
                                .addGap(14, 14, 14)
                                .addComponent(jButton3)
                                .addGap(14, 14, 14)
                                .addComponent(jButton4)
                                .addGap(14, 14, 14)
                                .addComponent(jButton5)
                                .addGap(14, 14, 14)
                                .addComponent(jButton1))))
                    .addComponent(jlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOrdenarID)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        // Marca mar = new Marca(Integer.parseInt(jTextFieldId.getText()), jTextFieldMarca.getText());
        try {
            if (!ValidaEnteros.validaEnteros(jTextFieldId.getText())) {
                throw new ValidaEnteros();
            }
        } catch (ValidaEnteros e) {
            jMensaje.setText("El id que ingreso no es valido");
            jTextFieldId.setText("");
            return;
        }
        Marca mar = new Marca(Integer.parseInt(jTextFieldId.getText()), jTextFieldMarca.getText());
        if (manmarDB.insertar(mar)) {
            jMensaje.setText("Marca Insertada");
            model.insertRow(indiceFila, dato);
            jTable2.setValueAt(jTextFieldId.getText(), indiceFila, 0);
            jTable2.setValueAt(jTextFieldMarca.getText(), indiceFila, 1);
            indiceFila++;
            manobj.consultarTodos();
        } else {
            jMensaje.setText("Marca no insertada");
        }

        limpiar();
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        manmarDB.consultarTodos();

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
            if (manmarDB.borrar(idEliminar)) {
                JOptionPane.showMessageDialog(this, "Marca borrada exitosamente");
            } else {
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
//            if (!(posicion == -1)) {
//                if (manobj.modificar(posicion, marmod)) {
//                    JOptionPane.showMessageDialog(this, "Marca modificada exitosamente");
//                    indiceFila--;
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Error al modificar");
//            }
            if (manmarDB.modificar(a, marmod)) {
                JOptionPane.showMessageDialog(this, "Marca se ha modificado exitosamente");
                indiceFila--;
                manmarDB.consultarTodos();

            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar");
            }
        }
        limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        int idBuscado = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el ID a buscar"));
//
//        Marca resultado = (Marca) manobj.consultarId(idBuscado);
//        if (resultado == null) {
//            JOptionPane.showMessageDialog(this, "Marca no encontrada");
//        } else {
//            JOptionPane.showMessageDialog(this, "La marca encontrada es:\n" + resultado.toString());
//        }
        try {
            int idBuscado = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el ID a buscar"));
            Marca resultado = (Marca) manmarDB.consultarId(idBuscado);
            JOptionPane.showMessageDialog(this, "La marca encontrada es:\n" + resultado.toString());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Marca no encontrada");

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (manmarDB.borrarTodo()) {
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            indiceFila = 0;
            JOptionPane.showMessageDialog(this, "Todos las marcas se borraron exitosamente");
        } else {
            JOptionPane.showMessageDialog(this, "Error al borrar todo");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonOrdenarNombreAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarNombreAscActionPerformed
        manobj.ordenarMezcla();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < manobj.arregloMarcas.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable2.setValueAt(manobj.arregloMarcas.get(i).getId(), indiceFila, 0);
            jTable2.setValueAt(manobj.arregloMarcas.get(i).getDescripcion(), indiceFila, 1);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonOrdenarNombreAscActionPerformed

    private void jButtonOrdenarNombreDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarNombreDescActionPerformed
        manobj.ordenarMezclaDesc();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < manobj.arregloMarcas.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable2.setValueAt(manobj.arregloMarcas.get(i).getId(), indiceFila, 0);
            jTable2.setValueAt(manobj.arregloMarcas.get(i).getDescripcion(), indiceFila, 1);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonOrdenarNombreDescActionPerformed

    private void jButtonOrdenarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarIDActionPerformed
        manobj.sort();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < manobj.arregloMarcas.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable2.setValueAt(manobj.arregloMarcas.get(i).getId(), indiceFila, 0);
            jTable2.setValueAt(manobj.arregloMarcas.get(i).getDescripcion(), indiceFila, 1);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonOrdenarIDActionPerformed

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
    private javax.swing.JButton jButtonOrdenarID;
    private javax.swing.JButton jButtonOrdenarNombreAsc;
    private javax.swing.JButton jButtonOrdenarNombreDesc;
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
    private javax.swing.JLabel jlogo;
    // End of variables declaration//GEN-END:variables
}
