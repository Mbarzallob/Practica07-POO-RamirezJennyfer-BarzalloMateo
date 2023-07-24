/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Compositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Disco;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CantanteDAO ccc = new CantanteDAO();
        ControladorCantante co = new ControladorCantante(ccc);
        Cantante cantante = new Cantante("BArzo", "Latin", 5, 3, 1, "mateo", "barzallo", 18, "Ecuatoriano", 250);
        co.agregarCantante(cantante);
//        c.actualizarDisco(cantante, 0, "nono", 2029);
//        c.ingresarDisco(cantante, 1, "un veranopepe", 0);
//        c.ingresarDisco(cantante, 2, "un verano si", 0);
//        System.out.println(c.buscarDisco(cantante, 2).getNombre());

//        List<Disco> lista = c.listarDiscos(cantante);
//        System.out.println(lista.size());
//        for (Disco disco : lista) {
//            System.out.println(disco.getNombre());
//        }
//        System.out.println(c.buscarDisco(cantante, 0).getNombre());
//        System.out.println(c.buscarDisco(cantante, 0).getAnioDeLanzamiento());
//        c.agregarCantante(cantante);
//        c.agregarCantante(cantante);
//        c.eliminarCantante(cantante);
        List<Cantante> lista = co.listar();
        for (Cantante cantante1 : lista) {
            System.out.println(cantante1.getNombre());
//        }
//        
//        CompositorDAO cc = new CompositorDAO();
//        ControladorCompositor c = new ControladorCompositor(cc, ccc);
//        Compositor compositor = new Compositor( 1, "camila", "ramirez", 18, "ecuatoriaa", 18);
//        c.agregarCompositor(compositor);
    }
    }
}
