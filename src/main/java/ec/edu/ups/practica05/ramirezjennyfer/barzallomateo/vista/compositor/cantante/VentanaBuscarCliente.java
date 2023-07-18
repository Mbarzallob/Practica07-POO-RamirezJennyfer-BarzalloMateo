/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor.cantante;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Compositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Disco;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTETICS
 */
public class VentanaBuscarCliente extends javax.swing.JInternalFrame {

    private ControladorCompositor controladorCompositor;
    private ControladorCantante controladorCantante;

    /**
     * Creates new form VentanaBuscarDisco
     */
    public VentanaBuscarCliente(ControladorCompositor controladorCompositor, ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
        this.controladorCantante = controladorCantante;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNumComposiciones = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreCantante = new javax.swing.JTextField();
        txtApellidoCantante = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        btnCancelarSeleccion = new javax.swing.JButton();
        cbxCliente = new javax.swing.JComboBox<>();
        txtEdadCantante = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNombreArtistico = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtGeneroMusical = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNumSencillos = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNumConciertos = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNumGiras = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cbxDiscos = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel1.setText("Datos del Compositor");

        jLabel2.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel8.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel8.setText("Numero de composiciones");

        txtCodigo.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombre.setEnabled(false);

        txtApellido.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtApellido.setEnabled(false);

        txtNumComposiciones.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNumComposiciones.setEnabled(false);

        btnSalir.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel5.setText("Buscar Cliente");

        jLabel6.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel6.setText("Codigo");

        jLabel7.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel7.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel9.setText("Apellido");

        txtNombreCantante.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombreCantante.setEnabled(false);

        txtApellidoCantante.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtApellidoCantante.setEnabled(false);

        btnSeleccionar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setEnabled(false);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnCancelarSeleccion.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnCancelarSeleccion.setText("Cancelar seleccion");
        btnCancelarSeleccion.setEnabled(false);
        btnCancelarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSeleccionActionPerformed(evt);
            }
        });

        cbxCliente.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        cbxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes" }));
        cbxCliente.setEnabled(false);
        cbxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClienteActionPerformed(evt);
            }
        });

        txtEdadCantante.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtEdadCantante.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel10.setText("Edad");

        jLabel11.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel11.setText("Nacionalidad");

        txtNacionalidad.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNacionalidad.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel12.setText("Salario");

        txtSalario.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtSalario.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel13.setText("Nombre artistico");

        txtNombreArtistico.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombreArtistico.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel14.setText("Genero musical");

        txtGeneroMusical.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtGeneroMusical.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel15.setText("Numero de sencillos");

        txtNumSencillos.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNumSencillos.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel16.setText("Numero de conciertos");

        txtNumConciertos.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNumConciertos.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel17.setText("Numero de giras");

        txtNumGiras.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNumGiras.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel18.setText("Discos");

        cbxDiscos.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        cbxDiscos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Discos" }));
        cbxDiscos.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(113, 113, 113))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(txtNombre)
                                            .addComponent(txtApellido))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSeleccionar)
                                            .addComponent(btnCancelarSeleccion)))
                                    .addComponent(txtNumComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(171, 171, 171)
                                        .addComponent(btnSalir)))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel18))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSalario)
                                            .addComponent(txtNombreArtistico)
                                            .addComponent(txtGeneroMusical)
                                            .addComponent(txtNumSencillos)
                                            .addComponent(txtNumConciertos)
                                            .addComponent(txtNacionalidad)
                                            .addComponent(txtNumGiras)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbxDiscos, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(120, 120, 120)
                                        .addComponent(txtEdadCantante))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(103, 103, 103)
                                        .addComponent(txtApellidoCantante))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(103, 103, 103)
                                        .addComponent(txtNombreCantante))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(108, 108, 108)
                                        .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeleccionar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNumComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(164, 164, 164))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombreCantante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarSeleccion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtApellidoCantante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtEdadCantante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtNumSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtNumConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtNumGiras, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(cbxDiscos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrarPantalla();
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            Compositor compositor = controladorCompositor.buscarCompositor(codigo);
            if (compositor != null) {
                txtApellido.setText(compositor.getApellido());
                txtNombre.setText(compositor.getNombre());
                txtNumComposiciones.setText(String.valueOf(compositor.getNumeroDeComposiciones()));
                btnSeleccionar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, "El compositor con el codigo " + codigo + " no ha sido encontrado!");
                limpiarCamposCompositor();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha ingresado ningun codigo");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigoIngresado = Integer.parseInt(txtCodigo.getText());
            Compositor compositor = controladorCompositor.buscarCompositor(codigoIngresado);

            if (compositor != null) {
                if (compositor.getNombre().equals(txtNombre.getText()) && compositor.getApellido().equals(txtApellido.getText())) {
                    txtCodigo.setEnabled(false);
                    btnCancelarSeleccion.setEnabled(true);
                    btnSeleccionar.setEnabled(false);
                    btnBuscar.setEnabled(false);
                    cbxCliente.setEnabled(true);
                    cbxDiscos.setEnabled(true);
                    cargarDatosCombo();

                } else {
                    JOptionPane.showMessageDialog(this, "El código ha sido cambiado");
                }
            } else {
                JOptionPane.showMessageDialog(this, "El código ha sido cambiado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El código ha sido cambiado");
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnCancelarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSeleccionActionPerformed
        txtCodigo.setEnabled(true);
        btnSeleccionar.setEnabled(true);
        btnCancelarSeleccion.setEnabled(false);
        btnBuscar.setEnabled(true);
        cbxDiscos.setEnabled(false);
        cbxCliente.setEnabled(false);
    }//GEN-LAST:event_btnCancelarSeleccionActionPerformed

    private void cbxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClienteActionPerformed
        if (cbxCliente.getSelectedItem() != null) {
            Cantante cantante = (Cantante) cbxCliente.getSelectedItem();
            txtNombreCantante.setText(cantante.getNombre());
            txtApellidoCantante.setText(cantante.getApellido());
            txtEdadCantante.setText(String.valueOf(cantante.getEdad()));
            txtNacionalidad.setText(cantante.getNacionalidad());
            txtSalario.setText(String.valueOf(cantante.calcularSalario()));
            txtNombreArtistico.setText(cantante.getNombreArtistico());
            txtGeneroMusical.setText(cantante.getGeneroMusical());
            txtNumConciertos.setText(String.valueOf(cantante.getNumeroDeConciertos()));
            txtNumGiras.setText(String.valueOf(cantante.getNumeroDeGiras()));
            txtNumSencillos.setText(String.valueOf(cantante.getNumeroDeSencillos()));
        }
    }//GEN-LAST:event_cbxClienteActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrarPantalla();
    }//GEN-LAST:event_formInternalFrameClosing

    private void cerrarPantalla() {
        limpiarCamposCompositor();
        limpiarCamposCliente();
        txtCodigo.setEnabled(true);
        btnSeleccionar.setEnabled(false);
        btnCancelarSeleccion.setEnabled(false);
        btnBuscar.setEnabled(true);
        cbxCliente.setEnabled(false);
        cbxCliente.removeAllItems();
        cbxDiscos.setEnabled(false);

    }

    private void limpiarCamposCompositor() {
        txtCodigo.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        txtNumComposiciones.setText("");
    }

    private void limpiarCamposCliente() {
        txtNombreCantante.setText("");
        txtApellidoCantante.setText("");
        txtEdadCantante.setText("");
        txtNacionalidad.setText("");
        txtSalario.setText("");
        txtNombreArtistico.setText("");
        txtGeneroMusical.setText("");
        txtNumGiras.setText("");
        txtNumConciertos.setText("");
        txtNumSencillos.setText("");
        cbxDiscos.removeAllItems();

    }

    private void cargarDatosCombo() {
        DefaultComboBoxModel<Cantante> modelo = (DefaultComboBoxModel) cbxCliente.getModel();
        Compositor compositor = this.controladorCompositor.buscarCompositor(Integer.parseInt(txtCodigo.getText()));
        modelo.removeAllElements();
        List<Cantante> listaCantantes = compositor.listarCantantes();

        for (Cantante cantante : listaCantantes) {
            modelo.addElement(cantante);
        }
        Cantante cantante = (Cantante) modelo.getSelectedItem();
        txtNombreCantante.setText(cantante.getNombre());
        txtApellidoCantante.setText(cantante.getApellido());
        txtEdadCantante.setText(String.valueOf(cantante.getEdad()));
        txtNacionalidad.setText(cantante.getNacionalidad());
        txtSalario.setText(String.valueOf(cantante.calcularSalario()));
        txtNombreArtistico.setText(cantante.getNombreArtistico());
        txtGeneroMusical.setText(cantante.getGeneroMusical());
        txtNumConciertos.setText(String.valueOf(cantante.getNumeroDeConciertos()));
        txtNumGiras.setText(String.valueOf(cantante.getNumeroDeGiras()));
        txtNumSencillos.setText(String.valueOf(cantante.getNumeroDeSencillos()));
        DefaultComboBoxModel<String> modeloDisco = (DefaultComboBoxModel) cbxDiscos.getModel();
        modeloDisco.removeAllElements();
        List<Disco> listaDiscos = controladorCantante.listarDiscos(cantante);
        for(Disco disco: listaDiscos){
            modeloDisco.addElement(disco.getNombre());
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarSeleccion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JComboBox<String> cbxDiscos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoCantante;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdadCantante;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNombreCantante;
    private javax.swing.JTextField txtNumComposiciones;
    private javax.swing.JTextField txtNumConciertos;
    private javax.swing.JTextField txtNumGiras;
    private javax.swing.JTextField txtNumSencillos;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
