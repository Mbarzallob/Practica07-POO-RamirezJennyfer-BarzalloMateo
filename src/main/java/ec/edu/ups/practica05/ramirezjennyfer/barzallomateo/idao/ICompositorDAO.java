/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.idao;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cancion;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Compositor;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public interface ICompositorDAO {
    public void create(Compositor compositor);
    public Compositor read(int codigo);
    public void update(Compositor compositor);
    public void delete(Compositor compositor);
    public List<Compositor> findAll();
    public Compositor buscarPorCancion(String nombre);
    
    public void createCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos);
    public Cancion readCancion(Compositor compositor, int codigo);
    public void updateCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos);
    public void deleteCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos);
    public List<Cancion> findAllCanciones(Compositor compositor);
}
