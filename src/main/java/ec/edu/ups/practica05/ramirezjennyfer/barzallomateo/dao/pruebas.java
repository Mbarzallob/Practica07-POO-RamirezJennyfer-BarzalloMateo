/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;

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
        Cantante cantante = new Cantante("verga", "s", 1, 2, 2, "federico proaño", "no se pana", 19, "ec", 2);
//        c.agregarCantante(cantante);
    c.actualizarCantante(cantante);
        System.out.println(c.buscarCantante(2).getCodigo());
        System.out.println(c.buscarCantante(2).getNombre());
        System.out.println(c.buscarCantante(2).getApellido());
        System.out.println(c.buscarCantante(2).getEdad());
        System.out.println(c.buscarCantante(2).getNacionalidad());
        System.out.println(c.buscarCantante(2).getSalario());
        System.out.println(c.buscarCantante(2).getNombreArtistico());
        System.out.println(c.buscarCantante(2).getGeneroMusical());
        System.out.println(c.buscarCantante(2).getNumeroDeConciertos());
        System.out.println(c.buscarCantante(2).getNumeroDeGiras());
        System.out.println(c.buscarCantante(2).getNumeroDeSencillos());

    }

}
