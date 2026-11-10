
package proyectofinal;


public class AdminForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminForm.class.getName());


    public AdminForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoOpBilletes = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        clientes = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        ciudad = new javax.swing.JLabel();
        numCuenta = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtCuenta = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        txtBuscarId = new javax.swing.JTextField();
        btnBuscarNombre = new javax.swing.JButton();
        btnBuscarId = new javax.swing.JButton();
        btnListarTodos = new javax.swing.JButton();
        cajeros = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDiez = new javax.swing.JTextField();
        txtVeinte = new javax.swing.JTextField();
        txtCincuenta = new javax.swing.JTextField();
        txtCien = new javax.swing.JTextField();
        btnAgregarCajero = new javax.swing.JButton();
        btnEditarCajero = new javax.swing.JButton();
        btnEliminarCajero = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtIdCajero = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCajeros = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        operaciones = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCuentaOp = new javax.swing.JTextField();
        txtCantidadOp = new javax.swing.JTextField();
        btnConsignarAdmin = new javax.swing.JButton();
        btnRetirarAdmin = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtIdOpCajero = new javax.swing.JTextField();
        rbDiezOp = new javax.swing.JRadioButton();
        rbVeinteOp = new javax.swing.JRadioButton();
        rbCincuentaOp = new javax.swing.JRadioButton();
        rbCienOp = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        txtCantidadBilletesOp = new javax.swing.JTextField();
        btnAgregarBilletesOp = new javax.swing.JButton();
        btnQuitarBilletesOp = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaResultados = new javax.swing.JTextArea();
        ver = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblTotalClientes = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPromedioDinero = new javax.swing.JLabel();
        btnActualizarEstadisticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel1.setText("ADMINISTRADOR");

        clientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombre.addActionListener(this::txtNombreActionPerformed);

        btnGuardar.setText("Agregar");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        nombre.setText("Nombre:");

        apellido.setText("Apellido:");

        telefono.setText("Teléfono:");

        ciudad.setText("Ciudad:");

        numCuenta.setText("N° Cuenta:");

        saldo.setText("Saldo:");

        txtApellido.addActionListener(this::txtApellidoActionPerformed);

        txtTelefono.addActionListener(this::txtTelefonoActionPerformed);

        txtCiudad.addActionListener(this::txtCiudadActionPerformed);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Teléfono", "Ciudad", "N° Cuenta", "Saldo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Buscar por Nombre:");

        jLabel3.setText("Buscar por ID:");

        txtBuscarNombre.addActionListener(this::txtBuscarNombreActionPerformed);

        txtBuscarId.addActionListener(this::txtBuscarIdActionPerformed);

        btnBuscarNombre.setText("Buscar");

        btnBuscarId.setText("Buscar");

        btnListarTodos.setText("Listar Todos");
        btnListarTodos.addActionListener(this::btnListarTodosActionPerformed);

        javax.swing.GroupLayout clientesLayout = new javax.swing.GroupLayout(clientes);
        clientes.setLayout(clientesLayout);
        clientesLayout.setHorizontalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar))
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addComponent(saldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addComponent(numCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCuenta))
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar))
                    .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(clientesLayout.createSequentialGroup()
                            .addComponent(ciudad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCiudad))
                        .addGroup(clientesLayout.createSequentialGroup()
                            .addComponent(telefono)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefono))
                        .addGroup(clientesLayout.createSequentialGroup()
                            .addComponent(apellido)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtApellido))
                        .addGroup(clientesLayout.createSequentialGroup()
                            .addComponent(nombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(clientesLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarId, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(txtBuscarNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarId, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientesLayout.createSequentialGroup()
                                .addComponent(btnListarTodos)
                                .addGap(114, 114, 114))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientesLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        clientesLayout.setVerticalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarNombre))
                .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnBuscarId))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ciudad)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numCuenta)
                            .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saldo)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnEditar)))
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarTodos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes", clientes);

        cajeros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Cantidad de billetes de 10:");

        jLabel7.setText("Cantidad de billetes de 20:");

        jLabel8.setText("Cantidad de billetes de 50:");

        jLabel9.setText("Cantidad de billetes de 100:");

        txtCien.addActionListener(this::txtCienActionPerformed);

        btnAgregarCajero.setText("Agregar Cajero");
        btnAgregarCajero.addActionListener(this::btnAgregarCajeroActionPerformed);

        btnEditarCajero.setText(" Editar Cajero");
        btnEditarCajero.addActionListener(this::btnEditarCajeroActionPerformed);

        btnEliminarCajero.setText("Eliminar Cajero");
        btnEliminarCajero.addActionListener(this::btnEliminarCajeroActionPerformed);

        jLabel11.setText("ID del Cajero:");

        txtIdCajero.setEditable(false);

        tblCajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Billetes de 10", "Billetes de 20", "Billetes de 50", "Billetes de 100", "Estado"
            }
        ));
        tblCajeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCajerosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCajeros);

        javax.swing.GroupLayout cajerosLayout = new javax.swing.GroupLayout(cajeros);
        cajeros.setLayout(cajerosLayout);
        cajerosLayout.setHorizontalGroup(
            cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cajerosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cajerosLayout.createSequentialGroup()
                        .addComponent(btnEditarCajero)
                        .addGap(51, 51, 51)
                        .addComponent(btnEliminarCajero)
                        .addGap(125, 125, 125))
                    .addGroup(cajerosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(cajerosLayout.createSequentialGroup()
                .addGroup(cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cajerosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(cajerosLayout.createSequentialGroup()
                                .addGroup(cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregarCajero)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiez, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCincuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(78, 78, 78)
                        .addGroup(cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVeinte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cajerosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        cajerosLayout.setVerticalGroup(
            cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cajerosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVeinte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCincuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(cajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCajero)
                    .addComponent(btnEditarCajero)
                    .addComponent(btnEliminarCajero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Cajeros", cajeros);

        operaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consignar y retirar dinero a los clientes"));

        jLabel4.setText("N° de Cuenta del Cliente:");

        jLabel5.setText("Cantidad de Dinero:");

        btnConsignarAdmin.setText("Consignar");
        btnConsignarAdmin.addActionListener(this::btnConsignarAdminActionPerformed);

        btnRetirarAdmin.setText("Retirar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtCuentaOp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConsignarAdmin)
                            .addComponent(jLabel5))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidadOp, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetirarAdmin)
                                .addGap(58, 58, 58))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCuentaOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidadOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsignarAdmin)
                    .addComponent(btnRetirarAdmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar y quitar billetes de los cajeros."));

        jLabel14.setText("ID del Cajero:");

        txtIdOpCajero.addActionListener(this::txtIdOpCajeroActionPerformed);

        grupoOpBilletes.add(rbDiezOp);
        rbDiezOp.setText("Billetes de 10.000");
        rbDiezOp.addActionListener(this::rbDiezOpActionPerformed);

        grupoOpBilletes.add(rbVeinteOp);
        rbVeinteOp.setText("Billetes de 20.000");
        rbVeinteOp.addActionListener(this::rbVeinteOpActionPerformed);

        grupoOpBilletes.add(rbCincuentaOp);
        rbCincuentaOp.setText("Billetes de 50.000");
        rbCincuentaOp.addActionListener(this::rbCincuentaOpActionPerformed);

        grupoOpBilletes.add(rbCienOp);
        rbCienOp.setText("Billetes de 100.000");
        rbCienOp.addActionListener(this::rbCienOpActionPerformed);

        jLabel15.setText("Cantidad de billetes:");

        btnAgregarBilletesOp.setText("Añadir Billetes");
        btnAgregarBilletesOp.addActionListener(this::btnAgregarBilletesOpActionPerformed);

        btnQuitarBilletesOp.setText("Quitar Billetes");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdOpCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbCincuentaOp)
                            .addComponent(rbDiezOp))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbVeinteOp)
                            .addComponent(rbCienOp)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidadBilletesOp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAgregarBilletesOp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuitarBilletesOp)
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtIdOpCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDiezOp)
                    .addComponent(rbVeinteOp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCincuentaOp)
                    .addComponent(rbCienOp))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCantidadBilletesOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarBilletesOp)
                    .addComponent(btnQuitarBilletesOp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtAreaResultados.setColumns(20);
        txtAreaResultados.setRows(5);
        jScrollPane2.setViewportView(txtAreaResultados);

        javax.swing.GroupLayout operacionesLayout = new javax.swing.GroupLayout(operaciones);
        operaciones.setLayout(operacionesLayout);
        operacionesLayout.setHorizontalGroup(
            operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        operacionesLayout.setVerticalGroup(
            operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operacionesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(operacionesLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178))
        );

        jTabbedPane1.addTab("Operaciones Admin", operaciones);

        ver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadisticas del Banco"));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setText("Número Total de Clientes:");

        lblTotalClientes.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTotalClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalClientes.setText("--");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel12.setText("Dinero Promedio en Cuentas:");

        lblPromedioDinero.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPromedioDinero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPromedioDinero.setText("$0.00");

        btnActualizarEstadisticas.setText("Actualizar Estadísticas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 54, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblTotalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel12)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPromedioDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(btnActualizarEstadisticas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalClientes)
                    .addComponent(lblPromedioDinero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnActualizarEstadisticas)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout verLayout = new javax.swing.GroupLayout(ver);
        ver.setLayout(verLayout);
        verLayout.setHorizontalGroup(
            verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        verLayout.setVerticalGroup(
            verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ver", ver);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreActionPerformed

    private void txtBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarIdActionPerformed

    private void btnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarTodosActionPerformed

    private void btnConsignarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsignarAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsignarAdminActionPerformed

    private void txtCienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCienActionPerformed

    private void btnEliminarCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCajeroActionPerformed

    private void btnEditarCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCajeroActionPerformed

    private void btnAgregarCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCajeroActionPerformed
        // TODO add your handling code here:
        // Capturamos los billetes iniciales de las cajas de texto
    int nDiez = Integer.parseInt(txtDiez.getText());
    int nVeinte = Integer.parseInt(txtVeinte.getText());
    int nCincuenta = Integer.parseInt(txtCincuenta.getText());
    int nCien = Integer.parseInt(txtCien.getText());

    // Lógica simulada de guardado (Luego aquí irá el INSERT a MySQL)
    javax.swing.JOptionPane.showMessageDialog(this, "Cajero agregado exitosamente con stock inicial.");
    // Limpiar campos o actualizar tabla...

    }//GEN-LAST:event_btnAgregarCajeroActionPerformed

    private void tblCajerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCajerosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCajerosMouseClicked

    private void rbCincuentaOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCincuentaOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCincuentaOpActionPerformed

    private void rbCienOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCienOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCienOpActionPerformed

    private void rbDiezOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDiezOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDiezOpActionPerformed

    private void rbVeinteOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVeinteOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbVeinteOpActionPerformed

    private void txtIdOpCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdOpCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdOpCajeroActionPerformed

    private void btnAgregarBilletesOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBilletesOpActionPerformed
        // TODO add your handling code here:
        int idCajero = Integer.parseInt(txtIdOpCajero.getText());
    int cantidad = Integer.parseInt(txtCantidadBilletesOp.getText());

    // Verificamos cuál botón de radio está seleccionado para saber qué billete modificar
    if (rbDiezOp.isSelected()) {
        // Lógica para sumar billetes de 10k al cajero idCajero
        javax.swing.JOptionPane.showMessageDialog(this, "Se añadieron " + cantidad + " billetes de $10.000 al cajero " + idCajero);
    } else if (rbVeinteOp.isSelected()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Se añadieron " + cantidad + " billetes de $20.000 al cajero " + idCajero);
    } // ... (Igual para 50k y 100k)

    }//GEN-LAST:event_btnAgregarBilletesOpActionPerformed

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new AdminForm().setVisible(true));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JButton btnActualizarEstadisticas;
    private javax.swing.JButton btnAgregarBilletesOp;
    private javax.swing.JButton btnAgregarCajero;
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JButton btnBuscarNombre;
    private javax.swing.JButton btnConsignarAdmin;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarCajero;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarCajero;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListarTodos;
    private javax.swing.JButton btnQuitarBilletesOp;
    private javax.swing.JButton btnRetirarAdmin;
    private javax.swing.JPanel cajeros;
    private javax.swing.JLabel ciudad;
    private javax.swing.JPanel clientes;
    private javax.swing.ButtonGroup grupoOpBilletes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblPromedioDinero;
    private javax.swing.JLabel lblTotalClientes;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numCuenta;
    private javax.swing.JPanel operaciones;
    private javax.swing.JRadioButton rbCienOp;
    private javax.swing.JRadioButton rbCincuentaOp;
    private javax.swing.JRadioButton rbDiezOp;
    private javax.swing.JRadioButton rbVeinteOp;
    private javax.swing.JLabel saldo;
    private javax.swing.JTable tblCajeros;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtAreaResultados;
    private javax.swing.JTextField txtBuscarId;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtCantidadBilletesOp;
    private javax.swing.JTextField txtCantidadOp;
    private javax.swing.JTextField txtCien;
    private javax.swing.JTextField txtCincuenta;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtCuentaOp;
    private javax.swing.JTextField txtDiez;
    private javax.swing.JTextField txtIdCajero;
    private javax.swing.JTextField txtIdOpCajero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtVeinte;
    private javax.swing.JPanel ver;
    // End of variables declaration//GEN-END:variables
}
