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
import controladorDB.ManejadorComputadorDB;
import controladorDB.ManejadorMarcasDB;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.AbstractTableModel;
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
    ManejadorComputadorDB mancopDB;
    ManejadorMarcasDB manmarDB;
    Integer idMarcaTemporal = null;
    String nombreMarcaTemporal = " ";
    DefaultTableModel model;
    int indiceFila = 0;
    String[] dato = new String[10];
    JFileChooser fileChooser = new JFileChooser();
    ImageIcon image = null;
    File archivo = null;
    String ruta = "E:\\daniel\\Descargas\\graySquare.jpeg";
    JLabel labelImagen = new JLabel("", new ImageIcon(ruta), JLabel.CENTER);

    /**
     * Creates new form MenuComputadorInter
     */
    //String capmemoria, String tipoteclado, String tipomouse, String tipopantalla, int capalmacenamiento, int idMarca, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen, Marca mar
    public MenuComputadorInter() {
        initComponents();
        this.setLocationRelativeTo(null);
        manObjetos = new ManejadorObjetos();
        manmarDB = new ManejadorMarcasDB();
        mancate = new CategoriaElectronicosOficina();
        mancop = new ManejadorComputadores();
        mancopDB = new ManejadorComputadorDB();
        model = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 11:
                        return ImageIcon.class;
                    default:
                        return String.class;
                }
            }
        };;
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
        model.addColumn("Imagen");

        jTable1.setModel(model);
        jTable1.getColumnModel().getColumn(0).setMinWidth(30);
        jTable1.getColumnModel().getColumn(11).setMinWidth(150);
        model.insertRow(indiceFila, dato);
        inicializarComboBox();
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        fileChooser.addChoosableFileFilter(imageFilter);
        panelImagen.setPreferredSize(new Dimension(132, 132));
        panelImagen.add(labelImagen, BorderLayout.CENTER);
        jTable1.setRowHeight(150);
        jTable1.setRowMargin(5);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.jpg")).getImage());
        ImageIcon ilogo = new ImageIcon(getClass().getResource("/imagenes/icono.jpg"));
        ImageIcon logo = new ImageIcon(ilogo.getImage().getScaledInstance(jlogo.getWidth(), jlogo.getHeight(), Image.SCALE_DEFAULT));
        jlogo.setIcon(logo);
    }

//    public void inicializarComboBox() {
//        for (int i = 0; i < manObjetos.arregloMarcas.size(); i++) {
//            jComboBoxMarca.addItem(manObjetos.arregloMarcas.get(i).getDescripcion());
//        }
//    }
    public void inicializarComboBox() {
        manmarDB.consultarTodos();
        for (int i = 0; i < manObjetos.arregloMarcas.size(); i++) {
            jComboBoxMarca.addItem(manObjetos.arregloMarcas.get(i).getDescripcion());
        }
    }

    public void limpiar() {
        jTextFieldId.setText("");
        jTextFieldNombre.setText("");
        jTextFieldCantidad.setText("");
        jTextFieldPrecio.setText("");
        jTextFieldColor.setText("");
        jTextFieldCapacidadMemoria.setText("");
        jTextFieldTipoTeclado.setText("");
        jTextFieldTipoMouse.setText("");
        jTextFieldTipoPantalla.setText("");
        jTextFieldCapacidadAlmacenamiento.setText("");
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
        jLabelTipMouse = new javax.swing.JLabel();
        jLabelTipTeclado = new javax.swing.JLabel();
        jLabelCapMemoria = new javax.swing.JLabel();
        jLabelTipPantalla = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldColor = new javax.swing.JTextField();
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
        jButtonOrdenarNombreAsc = new javax.swing.JButton();
        jButtonOrdenarPrecioAsc = new javax.swing.JButton();
        jButtonOrdenarNombreDesc = new javax.swing.JButton();
        jButtonOrdenarPrecioDesc = new javax.swing.JButton();
        jButtonOrdenarID = new javax.swing.JButton();
        panelImagen = new javax.swing.JPanel();
        botonFileChooserExaminar = new javax.swing.JButton();
        jlogo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setTitle("Computadores");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI Historic", 3, 36)); // NOI18N
        jLabelTitulo.setText("Computador");

        jLabelId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelId.setText("Id");

        jComboBoxMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMarcaItemStateChanged(evt);
            }
        });

        jLabelMarca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMarca.setText("Marca");

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNombre.setText("Nombre");

        jLabelCantidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCantidad.setText("Cantidad");

        jLabelPrecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPrecio.setText("Precio");

        jLabelColor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelColor.setText("Color");

        jLabelTipMouse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTipMouse.setText("Tipo Mouse");

        jLabelTipTeclado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTipTeclado.setText("Tipo Teclado");

        jLabelCapMemoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCapMemoria.setText("Capacidad Memoria");

        jLabelTipPantalla.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        jLabelCapacidadAlmacenamiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        jLabelMensaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMensaje.setText("Estado");

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

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

        jButtonOrdenarID.setText("Ordenar ID");
        jButtonOrdenarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarIDActionPerformed(evt);
            }
        });

        panelImagen.setBackground(new java.awt.Color(204, 204, 204));
        panelImagen.setLayout(new java.awt.BorderLayout());

        botonFileChooserExaminar.setText("Examinar...");
        botonFileChooserExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFileChooserExaminarActionPerformed(evt);
            }
        });

        jlogo.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabelId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelMarca)
                                            .addComponent(jLabelNombre)
                                            .addComponent(jLabelCantidad)
                                            .addComponent(jLabelPrecio)
                                            .addComponent(jLabelColor))
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jComboBoxMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextFieldNombre)
                                                .addComponent(jTextFieldCantidad)
                                                .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelTipMouse)
                                            .addComponent(jLabelTipTeclado))
                                        .addGap(107, 107, 107)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldTipoTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldTipoMouse, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelTipPantalla)
                                            .addComponent(jLabelCapMemoria)
                                            .addComponent(jLabelCapacidadAlmacenamiento))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldTipoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldCapacidadMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldCapacidadAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonFileChooserExaminar)
                                        .addGap(63, 63, 63))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonOrdenarNombreDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonOrdenarNombreAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonOrdenarPrecioDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonOrdenarPrecioAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addComponent(jButtonOrdenarID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonConsultarTodo)
                            .addComponent(jButtonConsultarUno, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonBorrarUno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBorrarTodos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonModificar))))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButtonInsertar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonConsultarUno)
                                        .addGap(14, 14, 14)
                                        .addComponent(jButtonConsultarTodo)
                                        .addGap(14, 14, 14)
                                        .addComponent(jButtonBorrarUno)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(jLabelId)))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabelNombre)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelMarca)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelCantidad)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelPrecio))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelColor))
                                        .addGap(24, 24, 24)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButtonOrdenarNombreAsc)
                                            .addComponent(jButtonOrdenarPrecioAsc))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButtonOrdenarNombreDesc)
                                            .addComponent(jButtonOrdenarPrecioDesc)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jButtonOrdenarID))
                                    .addComponent(jButtonBorrarTodos)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldTipoMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelTipMouse))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelTipTeclado)
                                            .addComponent(jTextFieldTipoTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextFieldCapacidadMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelCapMemoria))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jTextFieldTipoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelTipPantalla)))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextFieldCapacidadAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelCapacidadAlmacenamiento)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(botonFileChooserExaminar)))))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 482, Short.MAX_VALUE)))
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarTodoActionPerformed

        //mancop.consultarTodos();
        mancopDB.consultarTodos();
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
            jTable1.setValueAt(new ImageIcon(CategoriaElectronicosOficina.arreglocomputadores.get(i).getImagen()), indiceFila, 11);
            indiceFila++;
        }

    }//GEN-LAST:event_jButtonConsultarTodoActionPerformed

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        Computadores comp = new Computadores();

        try {
            if (!ValidaEnteros.validaEnteros(jTextFieldId.getText())) {
                throw new ValidaEnteros();
            }
            if (!ValidaCantidad.validaCantidad(jTextFieldCantidad.getText())) {
                throw new ValidaCantidad();
            }
            if (!ValidaFlotantes.validaFlotantes(jTextFieldPrecio.getText())) {
                throw new ValidaFlotantes();
            }
            if (!ValidaMemoria.validaMemoria(jTextFieldCapacidadMemoria.getText())) {
                throw new ValidaMemoria();
            }
            if (!ValidaCapacidadAlmacenamiento.validaCapacidadAlmacenamiento(jTextFieldCapacidadAlmacenamiento.getText())) {
                throw new ValidaCapacidadAlmacenamiento();
            }
        } catch (ValidaEnteros e) {
            jLabelMensaje.setText("El id que ingreso no es valido");
            jTextFieldId.setText("");
            return;
        } catch (ValidaCantidad e) {
            jLabelMensaje.setText("La cantidad que ingreso no es valida");
            jTextFieldCantidad.setText("");
            return;
        } catch (ValidaFlotantes e) {
            jLabelMensaje.setText("El precio que ingreso no es valido");
            jTextFieldPrecio.setText("");
            return;
        } catch (ValidaMemoria e) {
            jLabelMensaje.setText("La capacidad de memoria que ingreso no es valida");
            jTextFieldCapacidadMemoria.setText("");
            return;
        } catch (ValidaCapacidadAlmacenamiento e) {
            jLabelMensaje.setText("La capacidad de almacenamiento que ingreso no es valida");
            jTextFieldCapacidadAlmacenamiento.setText("");
            return;
        }

        Marca mar = new Marca();
        comp.setIdArticulo(Integer.parseInt(jTextFieldId.getText()));
        mar.setId(idMarcaTemporal);
        mar.setDescripcion(nombreMarcaTemporal);
        comp.setMar(mar);
        comp.setNombre(jTextFieldNombre.getText());
        comp.setCantidad(Integer.parseInt(jTextFieldCantidad.getText()));
        comp.setPrecio(Float.parseFloat(jTextFieldPrecio.getText()));
        comp.setColor(jTextFieldColor.getText());
        comp.setImagen(ruta);
        comp.setCapmemoria(jTextFieldCapacidadMemoria.getText());
        comp.setTipoteclado(jTextFieldTipoTeclado.getText());
        comp.setTipomouse(jTextFieldTipoMouse.getText());
        comp.setTipopantalla(jTextFieldTipoPantalla.getText());
        comp.setCapalmacenamiento(Integer.parseInt(jTextFieldCapacidadAlmacenamiento.getText()));

        if (mancopDB.insertar(comp)) {
            jLabelMensaje.setText("El articulo " + jTextFieldNombre.getText() + " se insertó correctamente");
            model.insertRow(indiceFila, dato);
            jTable1.setValueAt(jTextFieldId.getText(), indiceFila, 0);
            jTable1.setValueAt(nombreMarcaTemporal, indiceFila, 1);
            jTable1.setValueAt(jTextFieldNombre.getText(), indiceFila, 2);
            jTable1.setValueAt(jTextFieldCantidad.getText(), indiceFila, 3);
            jTable1.setValueAt(jTextFieldPrecio.getText(), indiceFila, 4);
            jTable1.setValueAt(jTextFieldColor.getText(), indiceFila, 5);
            jTable1.setValueAt(jTextFieldCapacidadMemoria.getText(), indiceFila, 6);
            jTable1.setValueAt(jTextFieldTipoTeclado.getText(), indiceFila, 7);
            jTable1.setValueAt(jTextFieldTipoMouse.getText(), indiceFila, 8);
            jTable1.setValueAt(jTextFieldTipoPantalla.getText(), indiceFila, 9);
            jTable1.setValueAt(jTextFieldCapacidadAlmacenamiento.getText(), indiceFila, 10);
            jTable1.setValueAt(ruta, indiceFila, 11);
            jTable1.setValueAt(new ImageIcon(ruta), indiceFila, 11);
            ruta = "E:\\daniel\\Descargas\\graySquare.jpeg";
            image = new ImageIcon(ruta);
            labelImagen.setIcon(image);
            indiceFila++;
            //((AbstractTableModel) jTable1.getModel()).fireTableDataChanged();
            //model.fireTableDataChanged();
            //System.out.println(jTable1.getValueAt(0, 0).toString());
            mancop.consultarTodos();
        } else {
            jLabelMensaje.setText("Computador no insertado");
//        }
//
//        if (mancopDB.insertar(comp)) {
//            System.out.println("inserto BD");
//        } else {
//            System.out.println("no BD");
        }

        limpiar();
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
            String img = jTable1.getValueAt(filaSeleccionada, 11).toString();

            try {
                if (!ValidaCantidad.validaCantidad(jTextFieldCantidad.getText())) {
                    throw new ValidaCantidad();
                }
                if (!ValidaFlotantes.validaFlotantes(jTextFieldPrecio.getText())) {
                    throw new ValidaFlotantes();
                }
                if (!ValidaMemoria.validaMemoria(jTextFieldCapacidadMemoria.getText())) {
                    throw new ValidaMemoria();
                }
                if (!ValidaCapacidadAlmacenamiento.validaCapacidadAlmacenamiento(jTextFieldCapacidadAlmacenamiento.getText())) {
                    throw new ValidaCapacidadAlmacenamiento();
                }
            } catch (ValidaCantidad e) {
                jLabelMensaje.setText("La cantidad que ingreso no es valida");
                jTextFieldCantidad.setText("");
                return;
            } catch (ValidaFlotantes e) {
                jLabelMensaje.setText("El precio que ingreso no es valido");
                jTextFieldPrecio.setText("");
                return;
            } catch (ValidaMemoria e) {
                jLabelMensaje.setText("La capacidad de memoria que ingreso no es valida");
                jTextFieldCapacidadMemoria.setText("");
                return;
            } catch (ValidaCapacidadAlmacenamiento e) {
                jLabelMensaje.setText("La capacidad de almacenamiento que ingreso no es valida");
                jTextFieldCapacidadAlmacenamiento.setText("");
                return;
            }
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
            if (ruta.equals("E:\\daniel\\Descargas\\graySquare.jpeg")) {
                compmod.setImagen(img);
            } else {
                compmod.setImagen(ruta);
                ruta = "E:\\daniel\\Descargas\\graySquare.jpeg";
                image = new ImageIcon(ruta);
                labelImagen.setIcon(image);
            }

            //Marca marmod = new Marca(Integer.parseInt(jTextFieldId.getText()), jTextFieldMarca.getText());
//            int posicion = mancop.busquedaBinaria(a);
//            if (!(posicion == -1)) {
//                if (mancop.modificar(posicion, compmod)) {
//                    JOptionPane.showMessageDialog(this, "Computador modificado exitosamente");
//                    indiceFila--;
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Error al modificar");
//            }
            if (mancopDB.modificar(a, compmod)) {
                JOptionPane.showMessageDialog(this, "computador modificado exitosamente");
                indiceFila--;
                mancopDB.consultarTodos();

            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar");
            }
        }

        limpiar();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonConsultarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarUnoActionPerformed

//        int idBuscado = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el ID a buscar"));
//
//        Computadores resultado = (Computadores) mancop.consultarId(idBuscado);
//        if (resultado == null) {
//            JOptionPane.showMessageDialog(this, "Computador no encontrado");
//        } else {
//            JOptionPane.showMessageDialog(this, "El Computador encontrado es:\n" + resultado.toString());
//        }
          try {
            int idBuscado = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el ID a buscar"));
            Computadores resultado = (Computadores) mancopDB.consultarId(idBuscado);
            JOptionPane.showMessageDialog(this, "El computador encontrado es:\n" + resultado.toString());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Computador no encontrado");

        }

    }//GEN-LAST:event_jButtonConsultarUnoActionPerformed

    private void jButtonBorrarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarUnoActionPerformed

        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int idEliminar = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 0).toString());
            model.removeRow(filaSeleccionada);
            if (mancopDB.borrar(idEliminar)) {
                JOptionPane.showMessageDialog(this, "Computador borrado exitosamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error al borrar");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al borrar");
        }


    }//GEN-LAST:event_jButtonBorrarUnoActionPerformed

    private void jButtonBorrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarTodosActionPerformed

        if (mancopDB.borrarTodo()) {
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

    private void jButtonOrdenarNombreAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarNombreAscActionPerformed
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
            jTable1.setValueAt(new ImageIcon(CategoriaElectronicosOficina.arreglocomputadores.get(i).getImagen()), indiceFila, 11);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonOrdenarNombreAscActionPerformed

    private void jButtonOrdenarPrecioAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPrecioAscActionPerformed
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
            jTable1.setValueAt(new ImageIcon(CategoriaElectronicosOficina.arreglocomputadores.get(i).getImagen()), indiceFila, 11);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonOrdenarPrecioAscActionPerformed

    private void jButtonOrdenarNombreDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarNombreDescActionPerformed
        mancop.ordenarMezclaDesc();
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
            jTable1.setValueAt(new ImageIcon(CategoriaElectronicosOficina.arreglocomputadores.get(i).getImagen()), indiceFila, 11);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonOrdenarNombreDescActionPerformed

    private void jButtonOrdenarPrecioDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPrecioDescActionPerformed
        mancop.quicksortDesc();

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
            jTable1.setValueAt(new ImageIcon(CategoriaElectronicosOficina.arreglocomputadores.get(i).getImagen()), indiceFila, 11);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonOrdenarPrecioDescActionPerformed

    private void jButtonOrdenarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarIDActionPerformed
        mancop.sort();

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
            jTable1.setValueAt(new ImageIcon(CategoriaElectronicosOficina.arreglocomputadores.get(i).getImagen()), indiceFila, 11);
            indiceFila++;
        }
    }//GEN-LAST:event_jButtonOrdenarIDActionPerformed

    private void botonFileChooserExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFileChooserExaminarActionPerformed
        fileChooser.showDialog(this, "Choose"); //
        archivo = fileChooser.getSelectedFile();
        ruta = archivo.getAbsolutePath();
        image = new ImageIcon(ruta);
        labelImagen.setIcon(image);
    }//GEN-LAST:event_botonFileChooserExaminarActionPerformed

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
    private javax.swing.JButton botonFileChooserExaminar;
    private javax.swing.JButton jButtonBorrarTodos;
    private javax.swing.JButton jButtonBorrarUno;
    private javax.swing.JButton jButtonConsultarTodo;
    private javax.swing.JButton jButtonConsultarUno;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonOrdenarID;
    private javax.swing.JButton jButtonOrdenarNombreAsc;
    private javax.swing.JButton jButtonOrdenarNombreDesc;
    private javax.swing.JButton jButtonOrdenarPrecioAsc;
    private javax.swing.JButton jButtonOrdenarPrecioDesc;
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
    private javax.swing.JLabel jlogo;
    private javax.swing.JPanel panelImagen;
    // End of variables declaration//GEN-END:variables
}
