/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor.cantante;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Compositor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SOPORTETICS
 */
public class VentanaActualizarCliente extends javax.swing.JInternalFrame {

    private ControladorCompositor controladorCompositor;
    private ControladorCantante controladorCantante;

    /**
     * Creates new form VentanaCrearClientec
     */
    public VentanaActualizarCliente(ControladorCantante controladorCantante, ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCantante = controladorCantante;
        this.controladorCompositor = controladorCompositor;
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
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCompositor = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCantante = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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

        tblCompositor.setBackground(new java.awt.Color(255, 204, 102));
        tblCompositor.setFont(new java.awt.Font("Hug Me Tight", 0, 14)); // NOI18N
        tblCompositor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "Numero de composiciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCompositor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCompositorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCompositor);

        tblCantante.setBackground(new java.awt.Color(255, 204, 102));
        tblCantante.setFont(new java.awt.Font("Hug Me Tight", 0, 14)); // NOI18N
        tblCantante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "Nombre artistico", "Genero Musical", "# de sencillos", "# de conciertos", "# de giras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblCantante);

        btnSalir.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel1.setText("Seleccione el cliente a actualizar");

        jLabel2.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel2.setText("Seleccione el nuevo cliente");

        tblClientes.setBackground(new java.awt.Color(255, 204, 102));
        tblClientes.setFont(new java.awt.Font("Hug Me Tight", 0, 14)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "Nombre artistico", "Genero Musical", "# de sencillos", "# de conciertos", "# de giras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblClientes);

        jLabel3.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel3.setText("Compositores");

        jLabel4.setText("(Seleccione el compositor deseado, el cliente viejo y el cliente que lo reemplazara)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(625, 625, 625)
                        .addComponent(btnActualizar)
                        .addGap(75, 75, 75)
                        .addComponent(btnSalir)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        if (comprobarSeleccion()) {
            Compositor compositor = cargarCompositorSeleccionado();
            Cantante cantanteNuevo = cargarCantanteSeleccionado();
            Cantante cantanteViejo = cargarClienteSeleccionado();
            Cantante validacion = controladorCompositor.buscarCantante(compositor, cantanteNuevo.getCodigo());
            if (validacion == null) {
                controladorCompositor.actualizarCliente(compositor, cantanteViejo, cantanteNuevo);
                JOptionPane.showMessageDialog(this, "Se ha actualizado el cliente");
            } else {
                JOptionPane.showMessageDialog(this, "El cantante ya es cliente del compositor");
            }

        } else {
            if (tblCompositor.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun compositor");
            } else if (tblCantante.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun cantante");
            } else if (tblClientes.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun cliente");
            } else {
                JOptionPane.showMessageDialog(this, "No se ha ingresado el cantante");
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        salir();
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarCantante();
        cargarCompositor();
    }//GEN-LAST:event_formInternalFrameActivated

    private void tblCompositorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCompositorMouseClicked
        cargarClientes();
    }//GEN-LAST:event_tblCompositorMouseClicked

    private void cargarCompositor() {
        DefaultTableModel modelo = (DefaultTableModel) tblCompositor.getModel();
        modelo.setNumRows(0);
        List<Compositor> listaCompositors = controladorCompositor.listar();
        for (Compositor compositor : listaCompositors) {
            String codigo = String.valueOf(compositor.getCodigo());
            String nombre = compositor.getNombre();
            String edad = String.valueOf(compositor.getEdad());
            String nacionalidad = compositor.getNacionalidad();
            String apellido = compositor.getApellido();
            String salario = String.valueOf(compositor.getSalario());
            String numComposiciones = String.valueOf(compositor.getNumeroDeComposiciones());
            Object[] rowData = {codigo, nombre, apellido, edad, nacionalidad, salario, numComposiciones};
            modelo.addRow(rowData);

        }
        tblCompositor.setModel(modelo);
    }

    private void cargarClientes() {
        int fila = tblCompositor.getSelectedRow();
        int codigoC = Integer.parseInt(tblCompositor.getValueAt(fila, 0).toString());
        Compositor compositor = controladorCompositor.buscarCompositor(codigoC);
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        List<Cantante> listaCantante = controladorCompositor.listarCantantes(compositor);
        for (Cantante cantante : listaCantante) {
            String codigo = String.valueOf(cantante.getCodigo());
            String nombre = cantante.getNombre();
            String apellido = cantante.getApellido();
            String edad = String.valueOf(cantante.getEdad());
            String nacionalidad = cantante.getNacionalidad();
            String salario = String.valueOf(cantante.calcularSalario());
            String nombreArtistico = cantante.getNombreArtistico();
            String generoMusical = cantante.getGeneroMusical();
            String numSencillos = String.valueOf(cantante.getNumeroDeSencillos());
            String numConciertos = String.valueOf(cantante.getNumeroDeConciertos());
            String numGiras = String.valueOf(cantante.getNumeroDeGiras());
            Object[] rowData = {codigo, nombre, apellido, edad, nacionalidad, salario, nombreArtistico, generoMusical, numSencillos, numConciertos, numGiras};
            modelo.addRow(rowData);
        }
        tblClientes.setModel(modelo);
    }

    private void cargarCantante() {
        DefaultTableModel modelo = (DefaultTableModel) tblCantante.getModel();
        modelo.setNumRows(0);
        List<Cantante> listaCantante = controladorCantante.listar();
        for (Cantante cantante : listaCantante) {
            String codigo = String.valueOf(cantante.getCodigo());
            String nombre = cantante.getNombre();
            String apellido = cantante.getApellido();
            String edad = String.valueOf(cantante.getEdad());
            String nacionalidad = cantante.getNacionalidad();
            String salario = String.valueOf(cantante.calcularSalario());
            String nombreArtistico = cantante.getNombreArtistico();
            String generoMusical = cantante.getGeneroMusical();
            String numSencillos = String.valueOf(cantante.getNumeroDeSencillos());
            String numConciertos = String.valueOf(cantante.getNumeroDeConciertos());
            String numGiras = String.valueOf(cantante.getNumeroDeGiras());
            Object[] rowData = {codigo, nombre, apellido, edad, nacionalidad, salario, nombreArtistico, generoMusical, numSencillos, numConciertos, numGiras};
            modelo.addRow(rowData);
        }
        tblCantante.setModel(modelo);
    }

    private void salir() {
        DefaultTableModel modeloCantante = (DefaultTableModel) tblCantante.getModel();
        modeloCantante.setNumRows(0);
        tblCantante.setModel(modeloCantante);
        DefaultTableModel modeloCompositor = (DefaultTableModel) tblCompositor.getModel();
        modeloCompositor.setNumRows(0);
        tblCompositor.setModel(modeloCompositor);
        DefaultTableModel modeloClientes = (DefaultTableModel) tblClientes.getModel();
        modeloClientes.setNumRows(0);
        tblClientes.setModel(modeloClientes);
    }

    private Cantante cargarCantanteSeleccionado() {
        int fila = tblCantante.getSelectedRow();
        int codigo = Integer.parseInt(tblCantante.getValueAt(fila, 0).toString());
        Cantante cantante = controladorCantante.buscarCantante(codigo);
        return cantante;

    }

    private Cantante cargarClienteSeleccionado() {
        int fila = tblClientes.getSelectedRow();
        int codigo = Integer.parseInt(tblClientes.getValueAt(fila, 0).toString());
        Cantante cantante = controladorCantante.buscarCantante(codigo);
        return cantante;
    }

    private Compositor cargarCompositorSeleccionado() {
        int fila = tblCompositor.getSelectedRow();
        int codigo = Integer.parseInt(tblCompositor.getValueAt(fila, 0).toString());
        Compositor compositor = controladorCompositor.buscarCompositor(codigo);
        return compositor;

    }

    private boolean comprobarSeleccion() {
        if (tblCompositor.getSelectedRow() == -1 || tblCantante.getSelectedRow() == -1 || tblClientes.getSelectedRow() == -1) {

            return false;
        } else {
            return true;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblCantante;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblCompositor;
    // End of variables declaration//GEN-END:variables
}
