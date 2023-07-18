/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.disco;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Disco;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTETICS
 */
public class VentanaEliminarDisco extends javax.swing.JInternalFrame {

    private ControladorCantante controladorCantante;

    /**
     * Creates new form VentanaEliminarDisco
     */
    public VentanaEliminarDisco(ControladorCantante controladorCantante) {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombreArtistico = new javax.swing.JTextField();
        txtGeneroMusical = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreDisco = new javax.swing.JTextField();
        txtAnioLanzamiento = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        btnCancelarSeleccion = new javax.swing.JButton();
        cbxDisco = new javax.swing.JComboBox<>();
        btnEliminarDisco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(249, 249, 159));

        jLabel2.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel8.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel8.setText("Nombre artistico:");

        jLabel10.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel10.setText("Genero musical:");

        txtCodigo.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtCodigo.setToolTipText("Ingrese el codigo del Cantante a buscar EJM (0101)");

        txtNombre.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombre.setToolTipText("Datos del Cantante");
        txtNombre.setEnabled(false);

        txtApellido.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtApellido.setToolTipText("Datos del Cantante");
        txtApellido.setEnabled(false);

        txtNombreArtistico.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombreArtistico.setToolTipText("Datos del Cantante");
        txtNombreArtistico.setEnabled(false);

        txtGeneroMusical.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtGeneroMusical.setToolTipText("Datos del Cantante");
        txtGeneroMusical.setEnabled(false);
        txtGeneroMusical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroMusicalActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 204, 204));
        btnSalir.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(204, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel6.setText("Codigo");

        jLabel7.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel7.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel9.setText("Ano de lanzamiento:");

        txtNombreDisco.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombreDisco.setToolTipText("Datos del Disco del Cantante");
        txtNombreDisco.setEnabled(false);

        txtAnioLanzamiento.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtAnioLanzamiento.setToolTipText("Datos del Disco del Cantante");
        txtAnioLanzamiento.setEnabled(false);

        btnSeleccionar.setBackground(new java.awt.Color(255, 153, 51));
        btnSeleccionar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setEnabled(false);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnCancelarSeleccion.setBackground(new java.awt.Color(255, 153, 51));
        btnCancelarSeleccion.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnCancelarSeleccion.setText("Cancelar seleccion");
        btnCancelarSeleccion.setEnabled(false);
        btnCancelarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSeleccionActionPerformed(evt);
            }
        });

        cbxDisco.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        cbxDisco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Discos" }));
        cbxDisco.setToolTipText("Codigos de los Discos del Cantante ");
        cbxDisco.setEnabled(false);
        cbxDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDiscoActionPerformed(evt);
            }
        });

        btnEliminarDisco.setBackground(new java.awt.Color(204, 255, 204));
        btnEliminarDisco.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnEliminarDisco.setText("Eliminar disco");
        btnEliminarDisco.setEnabled(false);
        btnEliminarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDiscoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel1.setText("Datos del cantante");

        jLabel5.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel5.setText("Eliminar disco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addGap(190, 190, 190))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                                    .addComponent(txtCodigo))
                                                .addGap(13, 13, 13)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btnCancelarSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombreDisco, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxDisco, javax.swing.GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE)
                    .addComponent(txtAnioLanzamiento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminarDisco)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(387, 387, 387))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelarSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(56, 56, 56)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbxDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtAnioLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(btnEliminarDisco)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Cantante cantante = controladorCantante.buscarCantante(codigo);
            if (cantante != null) {
                txtApellido.setText(cantante.getApellido());
                txtGeneroMusical.setText(cantante.getGeneroMusical());
                txtNombre.setText(cantante.getNombre());
                txtNombreArtistico.setText(cantante.getNombreArtistico());
                btnSeleccionar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, "El cantante con el codigo " + codigo + " no ha sido encontrado!");
                limpiarCamposCantante();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha ingresado ningun codigo");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigoIngresado = Integer.parseInt(txtCodigo.getText());
            Cantante cantante = controladorCantante.buscarCantante(codigoIngresado);

            if (cantante != null) {
                if (cantante.getNombre().equals(txtNombre.getText()) && cantante.getApellido().equals(txtApellido.getText())) {
                    txtCodigo.setEnabled(false);
                    btnCancelarSeleccion.setEnabled(true);
                    btnSeleccionar.setEnabled(false);
                    btnBuscar.setEnabled(false);
                    cbxDisco.setEnabled(true);
                    btnEliminarDisco.setEnabled(true);
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
        btnEliminarDisco.setEnabled(false);
        cbxDisco.setEnabled(false);
    }//GEN-LAST:event_btnCancelarSeleccionActionPerformed

    private void cbxDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDiscoActionPerformed
        if (cbxDisco.getSelectedItem() != null) {
            Disco disco = (Disco) cbxDisco.getSelectedItem();
            txtAnioLanzamiento.setText(String.valueOf(disco.getAnioDeLanzamiento()));
            txtNombreDisco.setText(disco.getNombre());
        }
    }//GEN-LAST:event_cbxDiscoActionPerformed

    private void btnEliminarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDiscoActionPerformed

        Cantante cantante = controladorCantante.buscarCantante(Integer.parseInt(txtCodigo.getText()));
        DefaultComboBoxModel<Disco> modelo = (DefaultComboBoxModel) cbxDisco.getModel();
        Disco disco = (Disco) modelo.getSelectedItem();
        int codigo = disco.getCodigo();
        String nombreDisco = txtNombreDisco.getText();
        int anioLanza = Integer.parseInt(txtAnioLanzamiento.getText());
        if (controladorCantante.eliminarDisco(cantante, codigo, nombreDisco, anioLanza)) {
            JOptionPane.showMessageDialog(this, "El disco con el codigo " + codigo + " ha sido eliminado exitosamente!");

            txtCodigo.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnCancelarSeleccion.setEnabled(false);
            limpiarCamposCantante();
            limpiarCamposDisco();
        } else {
            JOptionPane.showMessageDialog(this, "El disco no se ha podido eliminar");
        }

    }//GEN-LAST:event_btnEliminarDiscoActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrarPantalla();
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtGeneroMusicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroMusicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroMusicalActionPerformed

    private void cerrarPantalla() {
        limpiarCamposCantante();
        limpiarCamposDisco();
        txtCodigo.setEnabled(true);
        btnSeleccionar.setEnabled(false);
        btnCancelarSeleccion.setEnabled(false);
        btnBuscar.setEnabled(true);
        cbxDisco.setEnabled(false);
        cbxDisco.removeAllItems();

    }

    private void limpiarCamposCantante() {
        txtCodigo.setText("");
        txtApellido.setText("");
        txtGeneroMusical.setText("");
        txtNombre.setText("");
        txtNombreArtistico.setText("");
    }

    private void limpiarCamposDisco() {
        txtNombreDisco.setText("");
        txtAnioLanzamiento.setText("");
        cbxDisco.removeAllItems();
        btnEliminarDisco.setEnabled(false);
    }

    private void cargarDatosCombo() {
        DefaultComboBoxModel<Disco> modelo = (DefaultComboBoxModel) cbxDisco.getModel();
        Cantante cantante = this.controladorCantante.buscarCantante(Integer.parseInt(txtCodigo.getText()));
        modelo.removeAllElements();
        List<Disco> listaDiscos = cantante.listarDiscos();

        for (Disco disco : listaDiscos) {
            modelo.addElement(disco);
        }
        Disco disco = (Disco) modelo.getSelectedItem();
        txtNombreDisco.setText(disco.getNombre());
        txtAnioLanzamiento.setText(String.valueOf(disco.getAnioDeLanzamiento()));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarSeleccion;
    private javax.swing.JButton btnEliminarDisco;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cbxDisco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAnioLanzamiento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNombreDisco;
    // End of variables declaration//GEN-END:variables
}
