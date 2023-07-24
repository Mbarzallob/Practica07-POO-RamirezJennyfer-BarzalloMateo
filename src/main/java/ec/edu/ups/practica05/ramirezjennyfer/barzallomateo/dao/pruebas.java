/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
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
        CantanteDAO cc = new CantanteDAO();
        ControladorCantante c = new ControladorCantante(cc);
        Cantante cantante = new Cantante("verga", "s", 5, 3, 1, "mateo", "barzallo", 19, "ec", 250);
//        c.ingresarDisco(cantante, 0, "un verano si", 0);
        System.out.println(c.buscarDisco(cantante, 0).getNombre());
        System.out.println(c.buscarDisco(cantante, 0).getAnioDeLanzamiento());
//        c.agregarCantante(cantante);
//        c.agregarCantante(cantante);
//        c.agregarCantante(cantante);
//        c.eliminarCantante(cantante);
//        List<Cantante> lista = c.listar();
//        for (Cantante cantante1 : lista) {
//            System.out.println(cantante.getNombre());
////        }
//        

    }
    
}
