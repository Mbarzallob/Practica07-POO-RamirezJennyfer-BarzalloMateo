/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao.CantanteDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao.CompositorDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
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
        Cantante cantante = new Cantante("hola", "no", 0, 0, 1, "", "", 0, "", 0);
        c.actualizarDisco(cantante, 2, "no", 21);
        System.out.println(c.buscarDisco(cantante,2).getNombre());
    }
    
}
