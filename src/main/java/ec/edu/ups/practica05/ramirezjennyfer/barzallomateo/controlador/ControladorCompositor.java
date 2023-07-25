/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao.CantanteDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao.CompositorDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.idao.ICantanteDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.idao.ICompositorDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cancion;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Compositor;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class ControladorCompositor {

    private Compositor compositor;
    private Cantante cantante;

    private ICompositorDAO compositorDAO;
    private ICantanteDAO cantanteDAO;

    public ControladorCompositor(CompositorDAO compositorDAO, CantanteDAO cantanteDAO) {
        this.compositorDAO = compositorDAO;
        this.cantanteDAO = cantanteDAO;
    }

    public void agregarCompositor(Compositor compositor) {
        this.compositor = compositor;
        compositorDAO.create(compositor);
    }

    public Compositor buscarCompositor(int codigo) {
        this.compositor = compositorDAO.read(codigo);
        return compositor;
    }

    public Compositor buscarCompositorPorCancion(String nombreCancion) {
        this.compositor = compositorDAO.buscarPorCancion(nombreCancion);
        return compositor;
    }

    public boolean actualizarCompositor(Compositor compositor) {
        Compositor compositorEncontrado = this.buscarCompositor(compositor.getCodigo());
        if (compositorEncontrado != null) {
            compositorEncontrado.setNombre(compositor.getNombre());
            compositorEncontrado.setApellido(compositor.getApellido());
            compositorEncontrado.setEdad(compositor.getEdad());
            compositorEncontrado.setNacionalidad(compositor.getNacionalidad());
            compositorEncontrado.setSalario(compositor.getSalario());
            compositorDAO.update(compositorEncontrado);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarCompositor(Compositor compositor) {
        Compositor compositorEncontrado = this.buscarCompositor(compositor.getCodigo());
        if (compositorEncontrado != null) {
            compositorDAO.delete(compositor);
            return true;
        } else {
            return false;
        }

    }

    public List<Compositor> listar() {
        return compositorDAO.findAll();
    }

    //metodo para cantante
    public void agregarCliente(Compositor compositor, Cantante cantante) {
        this.compositor = compositorDAO.read(compositor.getCodigo());
        this.cantante = cantanteDAO.read(cantante.getCodigo());

        this.compositorDAO.createCliente(this.compositor, this.cantante);
    }

    public void eliminarCliente(Compositor compositor, Cantante cantante) {
        this.compositor = compositorDAO.read(compositor.getCodigo());
        this.cantante = cantanteDAO.read(cantante.getCodigo());
        this.compositorDAO.deleteCliente(this.compositor, this.cantante.getCodigo());
    }

    public List<Cantante> listarCantantes(Compositor compositor) {

        this.compositor = compositorDAO.read(compositor.getCodigo());
            return this.compositorDAO.findAllClientes(this.compositor);
    }

    public void actualizarCliente(Compositor compositor, Cantante cantanteAnterior, Cantante cantanteNuevo) {
        this.compositor = compositorDAO.read(compositor.getCodigo());
        Cantante anterior = cantanteDAO.read(cantanteAnterior.getCodigo());
        Cantante nuevo = cantanteDAO.read(cantanteNuevo.getCodigo());
       this.compositorDAO.updateCliente(this.compositor, anterior, nuevo);
    }

    public Cantante buscarCantante(Compositor compositor, int codigo) {
        this.compositor = compositorDAO.read(compositor.getCodigo());
        return this.compositorDAO.readCliente(this.compositor, codigo);
    }

    //metodos para canciones
    public void agregarCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        this.compositor = compositorDAO.read(compositor.getCodigo());
        compositorDAO.createCancion(this.compositor, codigo, titulo, letra, tiempoEnMinutos);
    }

    public Cancion buscarCancion(Compositor compositor, int codigo) {
        this.compositor = compositorDAO.read(compositor.getCodigo());
        return compositorDAO.readCancion(this.compositor, codigo);
    }

    public boolean eliminarCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        this.compositor = compositorDAO.read(compositor.getCodigo());
        Cancion cancion = this.buscarCancion(this.compositor, codigo);
        if (cancion != null) {
            compositorDAO.deleteCancion(this.compositor, codigo, titulo, letra, tiempoEnMinutos);
            return true;
        } else {
            return false;
        }

    }

    public boolean actualizarCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        this.compositor = compositorDAO.read(compositor.getCodigo());
        Cancion cancion = this.buscarCancion(this.compositor, codigo);
        if (cancion != null) {
            compositorDAO.updateCancion(this.compositor, codigo, titulo, letra, tiempoEnMinutos);
            return true;
        } else {
            return false;
        }
    }

    public List<Cancion> listarCanciones(Compositor compositor) {
        this.compositor = compositorDAO.read(compositor.getCodigo());
        return compositorDAO.findAllCanciones(this.compositor);
    }
}
