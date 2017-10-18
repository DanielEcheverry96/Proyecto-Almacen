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
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
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
    String nombreMarcaTemporal = " ";
    DefaultTableModel model;
    int indiceFila = 0;
    String[] dato = new String[11];

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
        model.addColumn("Marca");
        model.addColumn("Nombre");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        model.addColumn("Color");
        model.addColumn("Capacidad memoria");
        model.addColumn("Tipo Teclado");
        model.addColumn("Tipo Mouse");
        model.addColumn("Tipo Pantalla");
        model.addColumn("Capacidad Almacenamiento");
        jTable1.setModel(model);
        model.insertRow(indiceFila, dato);
        inicializarComboBox();
    }

    public void inicializarComboBox() {
        for (int i = 0; i < manObjetos.arregloMarcas.size(); i++) {
            jComboBoxMarca.addItem(manObjetos.arregloMarcas.get(i).getDescripcion());
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setTitle("Computadores");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelTitulo.setText("Computador");

        jLabelId.setText("Id");

        jComboBoxMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMarcaItemStateChanged(evt);
            }
        });

        jLabelMarca.setText("Marca");

        jLabelNombre.setText("Nombre");

        jLabelCantidad.setText("Cantidad");

        jLabelPrecio.setText("Precio");

        jLabelColor.setText("Color");

        jLabelUrl.setText("Url");

        jLabelTipMouse.setText("Tipo Mouse");

        jLabelTipTeclado.setText("Tipo Teclado");

        jLabelCapMemoria.setText("Capacidad Memoria");

        jLabelTipPantalla.setText("Tipo Pantalla");

        jTextFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonConsultarUno.setText("Consultar Uno");
        jButtonConsultarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarUnoActionPerformed(evt);
            }
        });

        jButtonConsultarTodo.setText("Consultar Todo");
        jButtonConsultarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarTodoActionPerformed(evt);
            }
        });

        jButtonBorrarUno.setText("Borrar Uno");
        jButtonBorrarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarUnoActionPerformed(evt);
            }
        });

        jButtonBorrarTodos.setText("Borrar Todos");
        jButtonBorrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarTodosActionPerformed(evt);
            }
        });

        jLabelCapacidadAlmacenamiento.setText("Capacidad Almacenamiento");

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

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        jButton1.setText("Ordenar Nombre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ordenar Precio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelId)
                        .addGap(89, 89, 89)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabelTipMouse)
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldCapacidadMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonConsultarTodo)
                                    .addComponent(jButtonBorrarUno)
                                    .addComponent(jButtonConsultarUno, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonModificar)
                                            .addComponent(jButtonInsertar)))
                                    .addComponent(jButtonBorrarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)))
                            .addComponent(jTextFieldTipoMouse, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTipoTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabelTitulo)))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMarca)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelCantidad)
                            .addComponent(jLabelPrecio))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxMarca, 0, 88, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldCantidad)
                            .addComponent(jTextFieldPrecio))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCapMemoria)
                            .addComponent(jLabelTipTeclado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTipPantalla)
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCapacidadAlmacenamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(jTextFieldTipoPantalla)))
                            .addComponent(jLabelCapacidadAlmacenamiento)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelColor)
                            .addComponent(jLabelUrl))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUrl, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jTextFieldColor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabelTitulo)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelId))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelTipMouse))
                    .addComponent(jTextFieldTipoMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabelNombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelMarca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelCantidad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelPrecio)
                                        .addGap(3, 3, 3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabelTipTeclado)
                                .addGap(8, 8, 8)
                                .addComponent(jLabelCapMemoria))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTipoTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCapacidadMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabelTipPantalla))
                                    .addComponent(jTextFieldTipoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCapacidadAlmacenamiento)
                                    .addComponent(jTextFieldCapacidadAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabelColor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelUrl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jTextFieldUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButtonInsertar)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultarUno)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonConsultarTodo)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonBorrarUno)))
                .addGap(15, 15, 15)
                .addComponent(jButtonBorrarTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabelMensaje)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarTodoActionPerformed

        mancop.consultarTodos();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < CategoriaElectronicosOficina.arreglocomputadores.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getIdArticulo(), indiceFila, 0);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getMar().getDescripcion(), indiceFila, 1);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getNombre(), indiceFila, 2);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getCantidad(), indiceFila, 3);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getPrecio(), indiceFila, 4);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getColor(), indiceFila, 5);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getCapmemoria(), indiceFila, 6);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getTipoteclado(), indiceFila, 7);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getTipomouse(), indiceFila, 8);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getTipopantalla(), indiceFila, 9);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getCapalmacenamiento(), indiceFila, 10);
            indiceFila++;
        }

    }//GEN-LAST:event_jButtonConsultarTodoActionPerformed

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        Computadores comp = new Computadores();
        Marca mar = new Marca();
        comp.setIdArticulo(Integer.parseInt(jTextFieldId.getText()));
        mar.setId(idMarcaTemporal);
        mar.setDescripcion(nombreMarcaTemporal);
        comp.setMar(mar);
        comp.setNombre(jTextFieldNombre.getText());
        comp.setCantidad(Integer.parseInt(jTextFieldCantidad.getText()));
        comp.setPrecio(Float.parseFloat(jTextFieldPrecio.getText()));
        comp.setColor(jTextFieldColor.getText());
        comp.setCapmemoria(jTextFieldCapacidadMemoria.getText());
        comp.setTipoteclado(jTextFieldTipoTeclado.getText());
        comp.setTipomouse(jTextFieldTipoMouse.getText());
        comp.setTipopantalla(jTextFieldTipoPantalla.getText());
        comp.setCapalmacenamiento(Integer.parseInt(jTextFieldCapacidadAlmacenamiento.getText()));

        if (mancop.insertar(comp)) {
            jLabelMensaje.setText("Computador Insertado");
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(jTextFieldId.getText(), indiceFila, 0);
            jTable1.setValueAt(nombreMarcaTemporal, indiceFila, 1);
            jTable1.setValueAt(jTextFieldNombre.getText(), indiceFila, 2);
            jTable1.setValueAt(Integer.parseInt(jTextFieldCantidad.getText()), indiceFila, 3);
            jTable1.setValueAt(Float.parseFloat(jTextFieldPrecio.getText()), indiceFila, 4);
            jTable1.setValueAt(jTextFieldColor.getText(), indiceFila, 5);
            jTable1.setValueAt(jTextFieldCapacidadMemoria.getText(), indiceFila, 6);
            jTable1.setValueAt(jTextFieldTipoTeclado.getText(), indiceFila, 7);
            jTable1.setValueAt(jTextFieldTipoMouse.getText(), indiceFila, 8);
            jTable1.setValueAt(jTextFieldTipoPantalla.getText(), indiceFila, 9);
            jTable1.setValueAt(Integer.parseInt(jTextFieldCapacidadAlmacenamiento.getText()), indiceFila, 10);
            indiceFila++;
            mancop.consultarTodos();
        } else {
            jLabelMensaje.setText("Computador no insertado");
        }

    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed

        int filaSeleccionada = jTable1.getSelectedRow();
        System.out.println(filaSeleccionada);

        if (filaSeleccionada >= 0) {

            Computadores compmod = new Computadores();
            int a = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 0).toString());
            jTextFieldId.setText(jTable1.getValueAt(filaSeleccionada, 0).toString());
            String nombreMarcaMod = jTable1.getValueAt(filaSeleccionada, 1).toString();
            jTextFieldNombre.setText(jTable1.getValueAt(filaSeleccionada, 2).toString());
            jTextFieldCantidad.setText(jTable1.getValueAt(filaSeleccionada, 3).toString());
            jTextFieldPrecio.setText(jTable1.getValueAt(filaSeleccionada, 4).toString());
            jTextFieldColor.setText(jTable1.getValueAt(filaSeleccionada, 5).toString());
            jTextFieldCapacidadMemoria.setText(jTable1.getValueAt(filaSeleccionada, 6).toString());
            jTextFieldTipoTeclado.setText(jTable1.getValueAt(filaSeleccionada, 7).toString());
            jTextFieldTipoMouse.setText(jTable1.getValueAt(filaSeleccionada, 8).toString());
            jTextFieldTipoPantalla.setText(jTable1.getValueAt(filaSeleccionada, 9).toString());
            jTextFieldCapacidadAlmacenamiento.setText(jTable1.getValueAt(filaSeleccionada, 10).toString());

            Marca marmod = new Marca();
            compmod.setIdArticulo(Integer.parseInt(jTextFieldId.getText()));
            marmod.setId(a);
            marmod.setDescripcion(nombreMarcaMod);
            compmod.setMar(marmod);
            compmod.setNombre(jTextFieldNombre.getText());
            compmod.setCantidad(Integer.parseInt(jTextFieldCantidad.getText()));
            compmod.setPrecio(Float.parseFloat(jTextFieldPrecio.getText()));
            compmod.setColor(jTextFieldColor.getText());
            compmod.setCapmemoria(jTextFieldCapacidadMemoria.getText());
            compmod.setTipoteclado(jTextFieldTipoTeclado.getText());
            compmod.setTipomouse(jTextFieldTipoMouse.getText());
            compmod.setTipopantalla(jTextFieldTipoPantalla.getText());
            compmod.setCapalmacenamiento(Integer.parseInt(jTextFieldCapacidadAlmacenamiento.getText()));

            //Marca marmod = new Marca(Integer.parseInt(jTextFieldId.getText()), jTextFieldMarca.getText());
            int posicion = mancop.busquedaBinaria(a);
            if (!(posicion == -1)) {
                if (mancop.modificar(posicion, compmod)) {
                    JOptionPane.showMessageDialog(this, "Computador modificado exitosamente");
                    indiceFila--;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar");
            }
        }

    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonConsultarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarUnoActionPerformed

        int idBuscado = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el ID a buscar"));

        Computadores resultado = (Computadores) mancop.consultarId(idBuscado);
        if (resultado == null) {
            JOptionPane.showMessageDialog(this, "Computador no encontrado");
        } else {
            JOptionPane.showMessageDialog(this, "El Computador encontrado es:\n" + resultado.toString());
        }

    }//GEN-LAST:event_jButtonConsultarUnoActionPerformed

    private void jButtonBorrarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarUnoActionPerformed

        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int idEliminar = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 0).toString());
            model.removeRow(filaSeleccionada);
            if (mancop.borrar(idEliminar)) {
                JOptionPane.showMessageDialog(this, "Computador borrado exitosamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error al borrar");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al borrar");
        }


    }//GEN-LAST:event_jButtonBorrarUnoActionPerformed

    private void jButtonBorrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarTodosActionPerformed

        if (mancop.borrarTodo()) {
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            indiceFila = 0;
            JOptionPane.showMessageDialog(this, "Todos los computaores se borraron exitosamente");
        } else {
            JOptionPane.showMessageDialog(this, "Error al borrar todo");
        }

    }//GEN-LAST:event_jButtonBorrarTodosActionPerformed

    private void jComboBoxMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMarcaItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (jComboBoxMarca.getItemCount() > 0) {
                idMarcaTemporal = ManejadorObjetos.arregloMarcas.get(jComboBoxMarca.getSelectedIndex()).getId();
                nombreMarcaTemporal = ManejadorObjetos.arregloMarcas.get(jComboBoxMarca.getSelectedIndex()).getDescripcion();
            }
        }

    }//GEN-LAST:event_jComboBoxMarcaItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mancop.ordenarMezcla();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < CategoriaElectronicosOficina.arreglocomputadores.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getIdArticulo(), indiceFila, 0);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getMar().getDescripcion(), indiceFila, 1);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getNombre(), indiceFila, 2);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getCantidad(), indiceFila, 3);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getPrecio(), indiceFila, 4);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getColor(), indiceFila, 5);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getCapmemoria(), indiceFila, 6);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getTipoteclado(), indiceFila, 7);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getTipomouse(), indiceFila, 8);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getTipopantalla(), indiceFila, 9);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getCapalmacenamiento(), indiceFila, 10);
            indiceFila++;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mancop.quicksort();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < CategoriaElectronicosOficina.arreglocomputadores.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getIdArticulo(), indiceFila, 0);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getMar().getDescripcion(), indiceFila, 1);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getNombre(), indiceFila, 2);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getCantidad(), indiceFila, 3);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getPrecio(), indiceFila, 4);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getColor(), indiceFila, 5);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getCapmemoria(), indiceFila, 6);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getTipoteclado(), indiceFila, 7);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getTipomouse(), indiceFila, 8);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getTipopantalla(), indiceFila, 9);
            jTable1.setValueAt(CategoriaElectronicosOficina.arreglocomputadores.get(i).getCapalmacenamiento(), indiceFila, 10);
            indiceFila++;
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
//            java.util.logging.Logger.getLogger(MenuComputadorInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuComputadorInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuComputadorInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuComputadorInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuComputadorInter().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
