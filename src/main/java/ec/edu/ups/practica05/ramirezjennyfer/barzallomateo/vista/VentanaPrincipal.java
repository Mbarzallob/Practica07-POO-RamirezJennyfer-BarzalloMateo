/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao.CantanteDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao.CompositorDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cancion.VentanaActualizarCancion;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cancion.VentanaBuscarCancion;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cancion.VentanaCrearCancion;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cancion.VentanaEliminarCancion;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cancion.VentanaListarCancion;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cantante.VentanaActualizarCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cantante.VentanaCrearCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cantante.VentanaBuscarCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cantante.VentanaEliminarCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cantante.VentanaListarCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor.VentanaActualizarCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor.VentanaBuscarCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor.VentanaCrearCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor.VentanaEliminarCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor.VentanaListarCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor.cantante.VentanaActualizarCliente;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor.cantante.VentanaBuscarCliente;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor.cantante.VentanaCrearCliente;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor.cantante.VentanaEliminarCliente;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor.cantante.VentanaListarCliente;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.disco.VentanaActualizarDisco;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.disco.VentanaBuscarDisco;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.disco.VentanaCrearDisco;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.disco.VentanaEliminarDisco;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.disco.VentanaListarDisco;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author SOPORTETICS
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaCrearCantante ventanaCrearCantante;
    private VentanaBuscarCantante ventanaBuscarCantante;
    private VentanaActualizarCantante ventanaActualizarCantante;
    private VentanaEliminarCantante ventanaEliminarCantante;
    private VentanaListarCantante ventanaListarCantante;

    private VentanaCrearCompositor ventanaCrearCompositor;
    private VentanaBuscarCompositor ventanaBuscarCompositor;
    private VentanaActualizarCompositor ventanaActualizarCompositor;
    private VentanaEliminarCompositor ventanaEliminarCompositor;
    private VentanaListarCompositor ventanaListarCompositor;

    private VentanaCrearDisco ventanaCrearDisco;
    private VentanaBuscarDisco ventanaBuscarDisco;
    private VentanaActualizarDisco ventanaActualizarDisco;
    private VentanaEliminarDisco ventanaEliminarDisco;
    private VentanaListarDisco ventanaListarDisco;

    private VentanaCrearCancion ventanaCrearCancion;
    private VentanaBuscarCancion ventanaBuscarCancion;
    private VentanaActualizarCancion ventanaActualizarCancion;
    private VentanaEliminarCancion ventanaEliminarCancion;
    private VentanaListarCancion ventanaListarCancion;
    
    private VentanaCrearCliente ventanaCrearCliente;
    private VentanaBuscarCliente ventanaBuscarCliente;
    private VentanaActualizarCliente ventanaActualizarCliente;
    private VentanaEliminarCliente ventanaEliminarCliente;
    private VentanaListarCliente ventanaListarCliente;

    private ControladorCantante controladorCantante;
    private ControladorCompositor controladorCompositor;

    private CantanteDAO cantanteDAO;
    private CompositorDAO compositorDAO;
    
    private Locale localizacion;
    private ResourceBundle mensajes;
   
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        cantanteDAO = new CantanteDAO();
        controladorCantante = new ControladorCantante(cantanteDAO);
        compositorDAO = new CompositorDAO();
        controladorCompositor = new ControladorCompositor(compositorDAO, cantanteDAO);
        localizacion = Locale.getDefault();                
        //cambiarIdioma();

    }
    
    /*public void cambiarIdioma () {
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        
        
        if(ventanaCrearCantante != null){
            //ventanaCrearCantante.cambiarIdioma(localizacion);
        }
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        itemMenuCrearCantante = new javax.swing.JMenuItem();
        itemMenuVerCantante = new javax.swing.JMenuItem();
        menuItemActualizarCantante = new javax.swing.JMenuItem();
        itemMenuEliminarCantante = new javax.swing.JMenuItem();
        menuItemListarCantante = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemMenuRegistrarDisco = new javax.swing.JMenuItem();
        menuItemBuscarDisco = new javax.swing.JMenuItem();
        menuItemActualizarDisco = new javax.swing.JMenuItem();
        menuItemEliminarDisco = new javax.swing.JMenuItem();
        menuItemListarDisco = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        menuItemRegistrarCompositor = new javax.swing.JMenuItem();
        menuItemBuscarCompositor = new javax.swing.JMenuItem();
        menuItemActualizarCompositor = new javax.swing.JMenuItem();
        menuItemEliminarCompositor = new javax.swing.JMenuItem();
        menuItemListarCompositor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemRegistrarCancion = new javax.swing.JMenuItem();
        menuItemBuscarCancion = new javax.swing.JMenuItem();
        menuItemActualizarCancion = new javax.swing.JMenuItem();
        menuItemEliminarCancion = new javax.swing.JMenuItem();
        menuItemListarCancion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuItemIngresarCliente = new javax.swing.JMenuItem();
        menuItemBuscarCliente = new javax.swing.JMenuItem();
        menuItemActualizarCliente = new javax.swing.JMenuItem();
        menuItemEliminarCliente = new javax.swing.JMenuItem();
        menuItemListarCliente = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        menuItemEspanol = new javax.swing.JMenuItem();
        menuItemEnglish = new javax.swing.JMenuItem();
        menuItemFrancais = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );

        desktopPane.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cantante");

        itemMenuCrearCantante.setMnemonic('o');
        itemMenuCrearCantante.setText("Registrar cantante");
        itemMenuCrearCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCrearCantanteActionPerformed(evt);
            }
        });
        fileMenu.add(itemMenuCrearCantante);

        itemMenuVerCantante.setMnemonic('s');
        itemMenuVerCantante.setText("Buscar cantante");
        itemMenuVerCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVerCantanteActionPerformed(evt);
            }
        });
        fileMenu.add(itemMenuVerCantante);

        menuItemActualizarCantante.setMnemonic('a');
        menuItemActualizarCantante.setText("Actualizar cantante");
        menuItemActualizarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCantanteActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemActualizarCantante);

        itemMenuEliminarCantante.setMnemonic('x');
        itemMenuEliminarCantante.setText("Eliminar cantante");
        itemMenuEliminarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuEliminarCantanteActionPerformed(evt);
            }
        });
        fileMenu.add(itemMenuEliminarCantante);

        menuItemListarCantante.setText("Listar cantante");
        menuItemListarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCantanteActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemListarCantante);

        jMenu1.setText("Disco");

        itemMenuRegistrarDisco.setText("Registrar disco");
        itemMenuRegistrarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuRegistrarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuRegistrarDisco);

        menuItemBuscarDisco.setText("Buscar disco");
        menuItemBuscarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemBuscarDisco);

        menuItemActualizarDisco.setText("Actualizar disco");
        menuItemActualizarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemActualizarDisco);

        menuItemEliminarDisco.setText("Eliminar disco");
        menuItemEliminarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemEliminarDisco);

        menuItemListarDisco.setText("Listar disco");
        menuItemListarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemListarDisco);

        fileMenu.add(jMenu1);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Compositor");

        menuItemRegistrarCompositor.setMnemonic('t');
        menuItemRegistrarCompositor.setText("Registrar compositor");
        menuItemRegistrarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemRegistrarCompositor);

        menuItemBuscarCompositor.setMnemonic('y');
        menuItemBuscarCompositor.setText("Buscar compositor");
        menuItemBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemBuscarCompositor);

        menuItemActualizarCompositor.setMnemonic('p');
        menuItemActualizarCompositor.setText("Actualizar compositor");
        menuItemActualizarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemActualizarCompositor);

        menuItemEliminarCompositor.setMnemonic('d');
        menuItemEliminarCompositor.setText("Eliminar compositor");
        menuItemEliminarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemEliminarCompositor);

        menuItemListarCompositor.setText("Listar compositores");
        menuItemListarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemListarCompositor);

        jMenu2.setText("Cancion");

        menuItemRegistrarCancion.setText("Registrar cancion");
        menuItemRegistrarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemRegistrarCancion);

        menuItemBuscarCancion.setText("Buscar cancion");
        menuItemBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemBuscarCancion);

        menuItemActualizarCancion.setText("Actualizar cancion");
        menuItemActualizarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemActualizarCancion);

        menuItemEliminarCancion.setText("Eliminar cancion");
        menuItemEliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemEliminarCancion);

        menuItemListarCancion.setText("Listar cancion");
        menuItemListarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemListarCancion);

        editMenu.add(jMenu2);

        jMenu3.setText("Cantante");

        menuItemIngresarCliente.setText("Ingresar cliente");
        menuItemIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIngresarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemIngresarCliente);

        menuItemBuscarCliente.setText("Buscar cliente");
        menuItemBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemBuscarCliente);

        menuItemActualizarCliente.setText("Actualizar cliente");
        menuItemActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemActualizarCliente);

        menuItemEliminarCliente.setText("Eliminar cliente");
        menuItemEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemEliminarCliente);

        menuItemListarCliente.setText("Listar clientes");
        menuItemListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemListarCliente);

        editMenu.add(jMenu3);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Idioma");

        menuItemEspanol.setMnemonic('c');
        menuItemEspanol.setText("Español");
        menuItemEspanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspanolActionPerformed(evt);
            }
        });
        helpMenu.add(menuItemEspanol);

        menuItemEnglish.setMnemonic('a');
        menuItemEnglish.setText("English");
        menuItemEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEnglishActionPerformed(evt);
            }
        });
        helpMenu.add(menuItemEnglish);

        menuItemFrancais.setMnemonic('a');
        menuItemFrancais.setText("Francais");
        menuItemFrancais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFrancaisActionPerformed(evt);
            }
        });
        helpMenu.add(menuItemFrancais);

        menuBar.add(helpMenu);

        jMenu4.setText("Opciones");

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemSalir);

        menuBar.add(jMenu4);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuEliminarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuEliminarCantanteActionPerformed
        if (ventanaEliminarCantante == null) {
            ventanaEliminarCantante = new VentanaEliminarCantante(controladorCantante);
            desktopPane.add(ventanaEliminarCantante);
        }
        ventanaEliminarCantante.setVisible(true);
    }//GEN-LAST:event_itemMenuEliminarCantanteActionPerformed

    private void itemMenuCrearCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCrearCantanteActionPerformed
        if (ventanaCrearCantante == null) {
            ventanaCrearCantante = new VentanaCrearCantante(controladorCantante);
            desktopPane.add(ventanaCrearCantante);
        }
        ventanaCrearCantante.setVisible(true);
    }//GEN-LAST:event_itemMenuCrearCantanteActionPerformed

    private void itemMenuVerCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVerCantanteActionPerformed
        if (ventanaBuscarCantante == null) {
            ventanaBuscarCantante = new VentanaBuscarCantante(controladorCantante);
            desktopPane.add(ventanaBuscarCantante);
        }
        ventanaBuscarCantante.setVisible(true);
    }//GEN-LAST:event_itemMenuVerCantanteActionPerformed

    private void menuItemActualizarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCantanteActionPerformed
        if (ventanaActualizarCantante == null) {
            ventanaActualizarCantante = new VentanaActualizarCantante(controladorCantante);
            desktopPane.add(ventanaActualizarCantante);
        }
        ventanaActualizarCantante.setVisible(true);
    }//GEN-LAST:event_menuItemActualizarCantanteActionPerformed

    private void menuItemListarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCantanteActionPerformed
        if (ventanaListarCantante == null) {
            ventanaListarCantante = new VentanaListarCantante(controladorCantante);
            desktopPane.add(ventanaListarCantante);
        }
        ventanaListarCantante.setVisible(true);
    }//GEN-LAST:event_menuItemListarCantanteActionPerformed

    private void menuItemRegistrarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarCompositorActionPerformed
        if (ventanaCrearCompositor == null) {
            ventanaCrearCompositor = new VentanaCrearCompositor(controladorCompositor);
            desktopPane.add(ventanaCrearCompositor);
        }
        ventanaCrearCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemRegistrarCompositorActionPerformed

    private void menuItemBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarCompositorActionPerformed
        if (ventanaBuscarCompositor == null) {
            ventanaBuscarCompositor = new VentanaBuscarCompositor(controladorCompositor);
            desktopPane.add(ventanaBuscarCompositor);
        }
        ventanaBuscarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarCompositorActionPerformed

    private void menuItemActualizarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCompositorActionPerformed
        if (ventanaActualizarCompositor == null) {
            ventanaActualizarCompositor = new VentanaActualizarCompositor(controladorCompositor);
            desktopPane.add(ventanaActualizarCompositor);
        }
        ventanaActualizarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemActualizarCompositorActionPerformed

    private void menuItemEliminarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCompositorActionPerformed
        if (ventanaEliminarCompositor == null) {
            ventanaEliminarCompositor = new VentanaEliminarCompositor(controladorCompositor);
            desktopPane.add(ventanaEliminarCompositor);
        }
        ventanaEliminarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarCompositorActionPerformed

    private void menuItemListarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCompositorActionPerformed
        if (ventanaListarCompositor == null) {
            ventanaListarCompositor = new VentanaListarCompositor(controladorCompositor);
            desktopPane.add(ventanaListarCompositor);
        }
        ventanaListarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemListarCompositorActionPerformed

    private void itemMenuRegistrarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuRegistrarDiscoActionPerformed
        if (ventanaCrearDisco == null) {
            ventanaCrearDisco = new VentanaCrearDisco(controladorCantante);
            desktopPane.add(ventanaCrearDisco);
        }
        ventanaCrearDisco.setVisible(true);
    }//GEN-LAST:event_itemMenuRegistrarDiscoActionPerformed

    private void menuItemBuscarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarDiscoActionPerformed
        if (ventanaBuscarDisco == null) {
            ventanaBuscarDisco = new VentanaBuscarDisco(controladorCantante);
            desktopPane.add(ventanaBuscarDisco);
        }
        ventanaBuscarDisco.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarDiscoActionPerformed

    private void menuItemActualizarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarDiscoActionPerformed
        if (ventanaActualizarDisco == null) {
            ventanaActualizarDisco = new VentanaActualizarDisco(controladorCantante);
            desktopPane.add(ventanaActualizarDisco);
        }
        ventanaActualizarDisco.setVisible(true);
    }//GEN-LAST:event_menuItemActualizarDiscoActionPerformed

    private void menuItemEliminarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarDiscoActionPerformed
        if (ventanaEliminarDisco == null) {
            ventanaEliminarDisco = new VentanaEliminarDisco(controladorCantante);
            desktopPane.add(ventanaEliminarDisco);
        }
        ventanaEliminarDisco.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarDiscoActionPerformed

    private void menuItemListarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarDiscoActionPerformed

        if (ventanaListarDisco == null) {
            ventanaListarDisco = new VentanaListarDisco(controladorCantante);
            desktopPane.add(ventanaListarDisco);
        }
        ventanaListarDisco.setVisible(true);
    }//GEN-LAST:event_menuItemListarDiscoActionPerformed

    private void menuItemRegistrarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarCancionActionPerformed
        if (ventanaCrearCancion == null) {
            ventanaCrearCancion = new VentanaCrearCancion(controladorCompositor);
            desktopPane.add(ventanaCrearCancion);
        }
        ventanaCrearCancion.setVisible(true);
    }//GEN-LAST:event_menuItemRegistrarCancionActionPerformed

    private void menuItemBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarCancionActionPerformed
        if (ventanaBuscarCancion == null) {
            ventanaBuscarCancion = new VentanaBuscarCancion(controladorCompositor);
            desktopPane.add(ventanaBuscarCancion);
        }
        ventanaBuscarCancion.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarCancionActionPerformed

    private void menuItemActualizarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCancionActionPerformed
        if (ventanaActualizarCancion == null) {
            ventanaActualizarCancion = new VentanaActualizarCancion(controladorCompositor);
            desktopPane.add(ventanaActualizarCancion);
        }
        ventanaActualizarCancion.setVisible(true);
    }//GEN-LAST:event_menuItemActualizarCancionActionPerformed

    private void menuItemEliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCancionActionPerformed
        if (ventanaEliminarCancion == null) {
            ventanaEliminarCancion = new VentanaEliminarCancion(controladorCompositor);
            desktopPane.add(ventanaEliminarCancion);
        }
        ventanaEliminarCancion.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarCancionActionPerformed

    private void menuItemListarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCancionActionPerformed
        if (ventanaListarCancion == null) {
            ventanaListarCancion = new VentanaListarCancion(controladorCompositor);
            desktopPane.add(ventanaListarCancion);
        }
        ventanaListarCancion.setVisible(true);
    }//GEN-LAST:event_menuItemListarCancionActionPerformed

    private void menuItemIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIngresarClienteActionPerformed
        if (ventanaCrearCliente == null) {
            ventanaCrearCliente = new VentanaCrearCliente(controladorCantante, controladorCompositor);
            desktopPane.add(ventanaCrearCliente);
        }
        ventanaCrearCliente.setVisible(true);
    }//GEN-LAST:event_menuItemIngresarClienteActionPerformed

    private void menuItemBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarClienteActionPerformed
        if (ventanaBuscarCliente == null) {
            ventanaBuscarCliente = new VentanaBuscarCliente(controladorCompositor, controladorCantante);
            desktopPane.add(ventanaBuscarCliente);
        }
        ventanaBuscarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarClienteActionPerformed

    private void menuItemActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarClienteActionPerformed
         if (ventanaActualizarCliente == null) {
            ventanaActualizarCliente = new VentanaActualizarCliente(controladorCantante, controladorCompositor);
            desktopPane.add(ventanaActualizarCliente);
        }
        ventanaActualizarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemActualizarClienteActionPerformed

    private void menuItemEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarClienteActionPerformed
        if (ventanaEliminarCliente == null) {
            ventanaEliminarCliente = new VentanaEliminarCliente(controladorCantante, controladorCompositor);
            desktopPane.add(ventanaEliminarCliente);
        }
        ventanaEliminarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarClienteActionPerformed

    private void menuItemListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarClienteActionPerformed
       if (ventanaListarCliente == null) {
            ventanaListarCliente = new VentanaListarCliente(controladorCompositor);
            desktopPane.add(ventanaListarCliente);
        }
        ventanaListarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemListarClienteActionPerformed

    private void menuItemEspanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEspanolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemEspanolActionPerformed

    private void menuItemEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEnglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemEnglishActionPerformed

    private void menuItemFrancaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFrancaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemFrancaisActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem itemMenuCrearCantante;
    private javax.swing.JMenuItem itemMenuEliminarCantante;
    private javax.swing.JMenuItem itemMenuRegistrarDisco;
    private javax.swing.JMenuItem itemMenuVerCantante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemActualizarCancion;
    private javax.swing.JMenuItem menuItemActualizarCantante;
    private javax.swing.JMenuItem menuItemActualizarCliente;
    private javax.swing.JMenuItem menuItemActualizarCompositor;
    private javax.swing.JMenuItem menuItemActualizarDisco;
    private javax.swing.JMenuItem menuItemBuscarCancion;
    private javax.swing.JMenuItem menuItemBuscarCliente;
    private javax.swing.JMenuItem menuItemBuscarCompositor;
    private javax.swing.JMenuItem menuItemBuscarDisco;
    private javax.swing.JMenuItem menuItemEliminarCancion;
    private javax.swing.JMenuItem menuItemEliminarCliente;
    private javax.swing.JMenuItem menuItemEliminarCompositor;
    private javax.swing.JMenuItem menuItemEliminarDisco;
    private javax.swing.JMenuItem menuItemEnglish;
    private javax.swing.JMenuItem menuItemEspanol;
    private javax.swing.JMenuItem menuItemFrancais;
    private javax.swing.JMenuItem menuItemIngresarCliente;
    private javax.swing.JMenuItem menuItemListarCancion;
    private javax.swing.JMenuItem menuItemListarCantante;
    private javax.swing.JMenuItem menuItemListarCliente;
    private javax.swing.JMenuItem menuItemListarCompositor;
    private javax.swing.JMenuItem menuItemListarDisco;
    private javax.swing.JMenuItem menuItemRegistrarCancion;
    private javax.swing.JMenuItem menuItemRegistrarCompositor;
    private javax.swing.JMenuItem menuItemSalir;
    // End of variables declaration//GEN-END:variables
}