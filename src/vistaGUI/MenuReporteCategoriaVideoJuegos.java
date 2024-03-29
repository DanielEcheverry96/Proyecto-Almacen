/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaGUI;

import controlador.ManejadorCategoriaArticulo;
import controladorDB.ManejadorCategoriaArticuloBD;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class MenuReporteCategoriaVideoJuegos extends javax.swing.JFrame {

    /**
     * Creates new form MenuCategoriaVideoJuegos
     */
    ManejadorCategoriaArticulo mancatart;
    ManejadorCategoriaArticuloBD mancatartDB;
    DefaultTableModel model;
    int indiceFila = 0;
    String[] dato = new String[10];
    JFileChooser fileChooser = new JFileChooser();
    ImageIcon image = null;
    File archivo = null;
    String ruta = "E:\\daniel\\Descargas\\graySquare.jpeg";
    JLabel labelImagen = new JLabel("", new ImageIcon(ruta), JLabel.CENTER);

    public MenuReporteCategoriaVideoJuegos() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        mancatart = new ManejadorCategoriaArticulo();
        mancatartDB = new ManejadorCategoriaArticuloBD();
        model = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 9:
                        return ImageIcon.class;
                    default:
                        return String.class;
                }
            }
        };;
        model.addColumn("Id Categoria");
        model.addColumn("Nombre Categoria");
        model.addColumn("Id Articulo");
        model.addColumn("Nombre Articulo");
        model.addColumn("Cantidad");
        model.addColumn("Color");
        model.addColumn("Precio");
        model.addColumn("Id Marca");
        model.addColumn("Nombre Marca");
        model.addColumn("Imagen");
        jTable1.setModel(model);
        jTable1.getColumnModel().getColumn(0).setMinWidth(30);
        jTable1.getColumnModel().getColumn(9).setMinWidth(150);
        model.insertRow(indiceFila, dato);
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        fileChooser.addChoosableFileFilter(imageFilter);
        jTable1.setRowHeight(150);
        jTable1.setRowMargin(5);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.jpg")).getImage());
        ImageIcon ilogo = new ImageIcon(getClass().getResource("/imagenes/icono.jpg"));
        ImageIcon logo = new ImageIcon(ilogo.getImage().getScaledInstance(jlogo.getWidth(), jlogo.getHeight(), Image.SCALE_DEFAULT));
        jlogo.setIcon(logo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonOrdenarNombreAsc = new javax.swing.JButton();
        jButtonOrdenarPrecioAsc = new javax.swing.JButton();
        jButtonOrdenarNombreDesc = new javax.swing.JButton();
        jButtonOrdenarPrecioDesc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonReporte = new javax.swing.JButton();
        jButtonOrdenarID = new javax.swing.JButton();
        jlogo = new javax.swing.JLabel();

        setTitle("Reporte - Articulos Categoria VideoJuegos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonOrdenarNombreAsc.setText("Ordenar Nombre Ascendente");
        jButtonOrdenarNombreAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarNombreAscActionPerformed(evt);
            }
        });

        jButtonOrdenarPrecioAsc.setText("Ordenar Precio Ascendente");
        jButtonOrdenarPrecioAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPrecioAscActionPerformed(evt);
            }
        });

        jButtonOrdenarNombreDesc.setText("Ordenar Nombre Descendente");
        jButtonOrdenarNombreDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarNombreDescActionPerformed(evt);
            }
        });

        jButtonOrdenarPrecioDesc.setText("Ordenar Precio Descendente");
        jButtonOrdenarPrecioDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPrecioDescActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
        jTable1.setAlignmentX(0.2F);
        jTable1.setAlignmentY(0.2F);
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setSelectionBackground(new java.awt.Color(204, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        botonReporte.setText("Obtener Reporte");
        botonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonOrdenarNombreAsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOrdenarNombreDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonOrdenarPrecioAsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOrdenarPrecioDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addComponent(jButtonOrdenarID)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonReporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonOrdenarNombreAsc)
                            .addComponent(jButtonOrdenarPrecioAsc)
                            .addComponent(jButtonOrdenarID))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonOrdenarNombreDesc)
                            .addComponent(jButtonOrdenarPrecioDesc)))
                    .addComponent(jlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOrdenarNombreAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarNombreAscActionPerformed
        mancatart.ordenarMezcla();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < ManejadorCategoriaArticulo.arreglocategoriaarticulo.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getIdcategoria(), indiceFila, 0);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getNombrecat(), indiceFila, 1);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getIdArticulo(), indiceFila, 2);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getNombre(), indiceFila, 3);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getCantidad(), indiceFila, 4);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getColor(), indiceFila, 5);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getPrecio(), indiceFila, 6);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getMar().getId(), indiceFila, 7);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getMar().getDescripcion(), indiceFila, 8);
            jTable1.setValueAt(new ImageIcon(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getImagen()), indiceFila, 9);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonOrdenarNombreAscActionPerformed

    private void jButtonOrdenarPrecioAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPrecioAscActionPerformed
        mancatart.quicksort();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < ManejadorCategoriaArticulo.arreglocategoriaarticulo.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getIdcategoria(), indiceFila, 0);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getNombrecat(), indiceFila, 1);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getIdArticulo(), indiceFila, 2);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getNombre(), indiceFila, 3);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getCantidad(), indiceFila, 4);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getColor(), indiceFila, 5);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getPrecio(), indiceFila, 6);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getMar().getId(), indiceFila, 7);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getMar().getDescripcion(), indiceFila, 8);
            jTable1.setValueAt(new ImageIcon(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getImagen()), indiceFila, 9);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonOrdenarPrecioAscActionPerformed

    private void jButtonOrdenarNombreDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarNombreDescActionPerformed
        mancatart.ordenarMezclaDesc();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < ManejadorCategoriaArticulo.arreglocategoriaarticulo.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getIdcategoria(), indiceFila, 0);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getNombrecat(), indiceFila, 1);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getIdArticulo(), indiceFila, 2);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getNombre(), indiceFila, 3);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getCantidad(), indiceFila, 4);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getColor(), indiceFila, 5);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getPrecio(), indiceFila, 6);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getMar().getId(), indiceFila, 7);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getMar().getDescripcion(), indiceFila, 8);
            jTable1.setValueAt(new ImageIcon(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getImagen()), indiceFila, 9);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonOrdenarNombreDescActionPerformed

    private void jButtonOrdenarPrecioDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPrecioDescActionPerformed
        mancatart.quicksortDesc();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < ManejadorCategoriaArticulo.arreglocategoriaarticulo.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getIdcategoria(), indiceFila, 0);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getNombrecat(), indiceFila, 1);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getIdArticulo(), indiceFila, 2);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getNombre(), indiceFila, 3);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getCantidad(), indiceFila, 4);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getColor(), indiceFila, 5);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getPrecio(), indiceFila, 6);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getMar().getId(), indiceFila, 7);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getMar().getDescripcion(), indiceFila, 8);
            jTable1.setValueAt(new ImageIcon(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getImagen()), indiceFila, 9);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonOrdenarPrecioDescActionPerformed

    private void botonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteActionPerformed
        mancatartDB.consultarTodosArticulosCategorias(3030);

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < ManejadorCategoriaArticulo.arreglocategoriaarticulo.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getIdcategoria(), indiceFila, 0);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getNombrecat(), indiceFila, 1);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getIdArticulo(), indiceFila, 2);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getNombre(), indiceFila, 3);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getCantidad(), indiceFila, 4);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getColor(), indiceFila, 5);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getPrecio(), indiceFila, 6);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getMar().getId(), indiceFila, 7);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getMar().getDescripcion(), indiceFila, 8);
            jTable1.setValueAt(new ImageIcon(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getImagen()), indiceFila, 9);
            indiceFila++;
        }
    }//GEN-LAST:event_botonReporteActionPerformed

    private void jButtonOrdenarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarIDActionPerformed
        mancatart.sort();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < ManejadorCategoriaArticulo.arreglocategoriaarticulo.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getIdcategoria(), indiceFila, 0);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getNombrecat(), indiceFila, 1);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getIdArticulo(), indiceFila, 2);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getNombre(), indiceFila, 3);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getCantidad(), indiceFila, 4);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getColor(), indiceFila, 5);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getPrecio(), indiceFila, 6);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getMar().getId(), indiceFila, 7);
            jTable1.setValueAt(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getMar().getDescripcion(), indiceFila, 8);
            jTable1.setValueAt(new ImageIcon(ManejadorCategoriaArticulo.arreglocategoriaarticulo.get(i).getImagen()), indiceFila, 9);
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
//            java.util.logging.Logger.getLogger(MenuReporteCategoriaVideoJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuReporteCategoriaVideoJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuReporteCategoriaVideoJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuReporteCategoriaVideoJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuReporteCategoriaVideoJuegos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonReporte;
    private javax.swing.JButton jButtonOrdenarID;
    private javax.swing.JButton jButtonOrdenarNombreAsc;
    private javax.swing.JButton jButtonOrdenarNombreDesc;
    private javax.swing.JButton jButtonOrdenarPrecioAsc;
    private javax.swing.JButton jButtonOrdenarPrecioDesc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlogo;
    // End of variables declaration//GEN-END:variables
}
