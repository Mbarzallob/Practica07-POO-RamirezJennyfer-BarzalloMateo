/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao.CantanteDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao.CompositorDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Compositor;

/**
 *
 * @author casa
 */
public class mainpruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CantanteDAO cc = new CantanteDAO();
        ControladorCantante c = new ControladorCantante(cc);
        CompositorDAO ccc= new CompositorDAO();
        ControladorCompositor cccc = new ControladorCompositor(ccc, cc);
        Compositor compositor = new Compositor(1, "MateoAmor", "Barzooo", 0, "Ec", 0);
        cccc.actualizarCompositor(compositor);
        System.out.println(cccc.buscarCompositor(1).getNombre());
    }
    
}
