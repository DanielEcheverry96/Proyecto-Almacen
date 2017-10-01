/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaGUI;

import controlador.ManejadorObjetos;
import controlador.ManejadorRaquetas;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CategoriaDeportivos;
import modelo.Marca;
import modelo.Raquetas;

/**
 *
 * @author danie
 */
public class MenuRaquetasInter extends javax.swing.JFrame {

    /**
     * Creates new form MenuRaquetasInter
     */
    ManejadorObjetos manobj;
    ManejadorRaquetas manraq;
    Integer idMarcaTemporal = null;
    String nombreMarcaTemporal = "";
    DefaultTableModel model;
    int indiceFila = 0;
    String[] dato = new String[11];
    
    public MenuRaquetasInter() {
        initComponents();
        manobj = new ManejadorObjetos();
        manraq = new ManejadorRaquetas();
        model = new DefaultTableModel();
        model.addColumn("Id");       
        model.addColumn("Id Marca");       
        model.addColumn("Nombre Marca");
        model.addColumn("Nombre");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        model.addColumn("Color");
        model.addColumn("Tipo Marco");
        model.addColumn("Longitud");
        model.addColumn("Ancho");
        model.addColumn("Peso");
        jTable1.setModel(model);
        model.insertRow(indiceFila, dato);
        inicializarComboBox();
    }
    
    public void inicializarComboBox(){
        for(int i=0;i<manobj.arregloMarcas.size();i++){
           jComboBoxMarca.addItem(manobj.arregloMarcas.get(i).toString());
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

        jButtonConsultarUno = new javax.swing.JButton();
        jButtonConsultarTodo = new javax.swing.JButton();
        jLabelLongitud = new javax.swing.JLabel();
        jButtonBorrarUno = new javax.swing.JButton();
        jLabelAncho = new javax.swing.JLabel();
        jButtonBorrarTodos = new javax.swing.JButton();
        jLabelPeso = new javax.swing.JLabel();
        jButtonInsertar = new javax.swing.JButton();
        jTextFieldId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelMensaje = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldUrl = new javax.swing.JTextField();
        jTextFieldMarco = new javax.swing.JTextField();
        jTextFieldLongitud = new javax.swing.JTextField();
        jTextFieldAncho = new javax.swing.JTextField();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelUrl = new javax.swing.JLabel();
        jLabelColor = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jTextFieldColor = new javax.swing.JTextField();
        jLabelMarco = new javax.swing.JLabel();

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

        jLabelLongitud.setText("Longitud");

        jButtonBorrarUno.setText("Borrar Uno");
        jButtonBorrarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarUnoActionPerformed(evt);
            }
        });

        jLabelAncho.setText("Ancho");

        jButtonBorrarTodos.setText("Borrar Todos");
        jButtonBorrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarTodosActionPerformed(evt);
            }
        });

        jLabelPeso.setText("Peso");

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

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

        jComboBoxMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMarcaItemStateChanged(evt);
            }
        });
        jComboBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaActionPerformed(evt);
            }
        });

        jLabelMensaje.setText("Estado");

        jTextFieldMarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcoActionPerformed(evt);
            }
        });

        jLabelTitulo.setText("Raquetas");

        jLabelId.setText("ID");

        jLabelMarca.setText("Marca");

        jLabelCantidad.setText("Cantidad");

        jLabelNombre.setText("Nombre");

        jLabelPrecio.setText("Precio");

        jLabelUrl.setText("Url");

        jLabelColor.setText("Color");

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jLabelMarco.setText("Tipo Marco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(jLabelMarco)
                                    .addComponent(jLabelLongitud)
                                    .addComponent(jLabelAncho)
                                    .addComponent(jLabelPeso))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldAncho, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLongitud, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMarco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldUrl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(jButtonConsultarTodo)
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
                                    .addComponent(jLabelMarco)
                                    .addComponent(jTextFieldMarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelLongitud)
                                    .addComponent(jTextFieldLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelAncho)
                                    .addComponent(jTextFieldAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelPeso)
                                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarTodoActionPerformed
        manraq.consultarTodos();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        indiceFila = 0;

        for (int i = 0; i < CategoriaDeportivos.arregloraquetas.size(); i++) {
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(CategoriaDeportivos.arregloraquetas.get(i).getIdArticulo(), indiceFila, 0);
            jTable1.setValueAt(CategoriaDeportivos.arregloraquetas.get(i).getMar().getId(), indiceFila, 1);
            jTable1.setValueAt(CategoriaDeportivos.arregloraquetas.get(i).getMar().getDescripcion(), indiceFila, 2);
            jTable1.setValueAt(CategoriaDeportivos.arregloraquetas.get(i).getNombre(), indiceFila, 3);
            jTable1.setValueAt(CategoriaDeportivos.arregloraquetas.get(i).getCantidad(), indiceFila, 4);
            jTable1.setValueAt(CategoriaDeportivos.arregloraquetas.get(i).getPrecio(), indiceFila, 5);
            jTable1.setValueAt(CategoriaDeportivos.arregloraquetas.get(i).getColor(), indiceFila, 6);
            jTable1.setValueAt(CategoriaDeportivos.arregloraquetas.get(i).getTipomarco(), indiceFila, 7);
            jTable1.setValueAt(CategoriaDeportivos.arregloraquetas.get(i).getLongitud(), indiceFila, 8);
            jTable1.setValueAt(CategoriaDeportivos.arregloraquetas.get(i).getAncho(), indiceFila, 9);
            jTable1.setValueAt(CategoriaDeportivos.arregloraquetas.get(i).getPeso(), indiceFila, 10);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonConsultarTodoActionPerformed

    private void jTextFieldMarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarcoActionPerformed

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
       Raquetas raque = new Raquetas();
       Marca mar = new Marca();
       raque.setIdArticulo(Integer.parseInt(jTextFieldId.getText()));
       mar.setId(idMarcaTemporal);
       mar.setDescripcion(nombreMarcaTemporal);
       raque.setMar(mar);
       raque.setNombre(jTextFieldNombre.getText());
       raque.setCantidad(Integer.parseInt(jTextFieldCantidad.getText()));
       raque.setPrecio(Float.parseFloat(jTextFieldPrecio.getText()));
       raque.setColor(jTextFieldColor.getText());
       raque.setTipomarco(jTextFieldMarco.getText());
       raque.setLongitud(Integer.parseInt(jTextFieldLongitud.getText()));
       raque.setAncho(Float.parseFloat(jTextFieldAncho.getText()));
       raque.setPeso(Float.parseFloat(jTextFieldPeso.getText()));
       
        if (manraq.insertar(raque)) {
            jLabelMensaje.setText("El articulo " + jTextFieldNombre.getText() + " se insertó correctamente");
            //JOptionPane.showMessageDialog(this, "El articulo " + jTextFieldNombre.getText() + " se insertó correctamente");
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(jTextFieldId.getText(), indiceFila, 0);
            jTable1.setValueAt(idMarcaTemporal, indiceFila, 1);
            jTable1.setValueAt(nombreMarcaTemporal, indiceFila, 2);
            jTable1.setValueAt(jTextFieldNombre.getText(), indiceFila, 3);
            jTable1.setValueAt(jTextFieldCantidad.getText(), indiceFila, 4);
            jTable1.setValueAt(Float.parseFloat(jTextFieldPrecio.getText()), indiceFila, 5);
            jTable1.setValueAt(jTextFieldColor.getText(), indiceFila, 6);
            jTable1.setValueAt(jTextFieldMarco.getText(), indiceFila, 7);
            jTable1.setValueAt(Integer.parseInt(jTextFieldLongitud.getText()), indiceFila, 8);
            jTable1.setValueAt(Float.parseFloat(jTextFieldAncho.getText()), indiceFila, 9);
            jTable1.setValueAt(Float.parseFloat(jTextFieldPeso.getText()), indiceFila, 10); 
            indiceFila++;
            manraq.consultarTodos();
        }
        else{
            jLabelMensaje.setText("Error al insertar");
            //JOptionPane.showMessageDialog(this, "Error al insertar");
        }
       
        
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        System.out.println(filaSeleccionada);
        
            if (filaSeleccionada >= 0) {
            
            Raquetas raqmod = new Raquetas();
            int a = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 0).toString());
            jTextFieldId.setText(jTable1.getValueAt(filaSeleccionada, 0).toString());
            int idMarcaMod = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 1).toString());
            String nombreMarcaMod = jTable1.getValueAt(filaSeleccionada, 2).toString();
            jTextFieldNombre.setText(jTable1.getValueAt(filaSeleccionada, 3).toString());
            jTextFieldCantidad.setText(jTable1.getValueAt(filaSeleccionada, 4).toString());
            jTextFieldPrecio.setText(jTable1.getValueAt(filaSeleccionada, 5).toString());
            jTextFieldColor.setText(jTable1.getValueAt(filaSeleccionada, 6).toString());
            jTextFieldMarco.setText(jTable1.getValueAt(filaSeleccionada, 7).toString());
            jTextFieldLongitud.setText(jTable1.getValueAt(filaSeleccionada, 8).toString());
            jTextFieldAncho.setText(jTable1.getValueAt(filaSeleccionada, 9).toString());
            jTextFieldPeso.setText(jTable1.getValueAt(filaSeleccionada, 10).toString());
            
            Marca marmod = new Marca();
            raqmod.setIdArticulo(Integer.parseInt(jTextFieldId.getText()));
            marmod.setId(idMarcaMod);
            marmod.setDescripcion(nombreMarcaMod);
            raqmod.setMar(marmod);
            raqmod.setNombre(jTextFieldNombre.getText());
            raqmod.setCantidad(Integer.parseInt(jTextFieldCantidad.getText()));
            raqmod.setPrecio(Float.parseFloat(jTextFieldPrecio.getText()));
            raqmod.setColor(jTextFieldColor.getText());
            raqmod.setTipomarco(jTextFieldMarco.getText());
            raqmod.setLongitud(Integer.parseInt(jTextFieldLongitud.getText()));
            raqmod.setAncho(Float.parseFloat(jTextFieldAncho.getText()));
            raqmod.setPeso(Float.parseFloat(jTextFieldPeso.getText()));
            
            //Marca marmod = new Marca(Integer.parseInt(jTextFieldId.getText()), jTextFieldMarca.getText());
            int posicion = manraq.busquedaBinaria(a);
                    if (!(posicion==-1)) {
                    if (manraq.modificar(posicion, raqmod)) {
                        JOptionPane.showMessageDialog(this, "Marca modificada exitosamente");
                        indiceFila--;
                    }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Error al modificar");
                    }
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonConsultarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarUnoActionPerformed
        int idBuscado = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el ID a buscar"));
            
        Raquetas resultado = (Raquetas) manraq.consultarId(idBuscado);
        if (resultado == null) {
            JOptionPane.showMessageDialog(this, "Raqueta no encontrada");
        }
        else{
            JOptionPane.showMessageDialog(this, "La raqueta encontrada es:\n" + resultado.toString());
        }
    }//GEN-LAST:event_jButtonConsultarUnoActionPerformed

    private void jButtonBorrarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarUnoActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int idEliminar = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 0).toString());
            model.removeRow(filaSeleccionada);
            if (manraq.borrar(idEliminar)) {
                    JOptionPane.showMessageDialog(this, "Raqueta borrada exitosamente");    
                    }
            else {
            JOptionPane.showMessageDialog(this, "Error al borrar");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al borrar");
        }
        
    }//GEN-LAST:event_jButtonBorrarUnoActionPerformed

    private void jButtonBorrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarTodosActionPerformed
        if (manraq.borrarTodo()) {
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            indiceFila = 0;
            JOptionPane.showMessageDialog(this, "Todos las raquetas se borraron exitosamente");
        } else {
            JOptionPane.showMessageDialog(this, "Error al borrar todo");
        }       
    }//GEN-LAST:event_jButtonBorrarTodosActionPerformed

    private void jComboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaActionPerformed

        
    }//GEN-LAST:event_jComboBoxMarcaActionPerformed

    private void jComboBoxMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMarcaItemStateChanged
            if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (jComboBoxMarca.getItemCount() > 0) {
                idMarcaTemporal = ManejadorObjetos.arregloMarcas.get(jComboBoxMarca.getSelectedIndex()).getId();
                nombreMarcaTemporal = ManejadorObjetos.arregloMarcas.get(jComboBoxMarca.getSelectedIndex()).getDescripcion();
            }
        }
    }//GEN-LAST:event_jComboBoxMarcaItemStateChanged

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
//            java.util.logging.Logger.getLogger(MenuRaquetasInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuRaquetasInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuRaquetasInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuRaquetasInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuRaquetasInter().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrarTodos;
    private javax.swing.JButton jButtonBorrarUno;
    private javax.swing.JButton jButtonConsultarTodo;
    private javax.swing.JButton jButtonConsultarUno;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JLabel jLabelAncho;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLongitud;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelMarco;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUrl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAncho;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLongitud;
    private javax.swing.JTextField jTextFieldMarco;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldUrl;
    // End of variables declaration//GEN-END:variables
}
