/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao.CantanteDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.idao.ICantanteDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Disco;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class ControladorCantante {

    private Cantante cantante;
    private ICantanteDAO cantanteDAO;

    public ControladorCantante(CantanteDAO cantanteDAO) {
        this.cantanteDAO = cantanteDAO;
    }

    public void agregarCantante(Cantante cantante) {
        this.cantante = cantante;
        cantanteDAO.create(cantante);
    }

    public Cantante buscarCantante(int codigo) {
        this.cantante = cantanteDAO.read(codigo);
        return cantante;
    }

    public Cantante buscarCantantePorDisco(String nombreDisco) {
        this.cantante = cantanteDAO.buscarPorDisco(nombreDisco);
        return cantante;
    }

    public boolean actualizarCantante(Cantante cantante) {
        Cantante cantanteEncontrado = this.buscarCantante(cantante.getCodigo());
        if (cantanteEncontrado != null) {
            cantanteEncontrado.setApellido(cantante.getApellido());
            cantanteEncontrado.setNombre(cantante.getNombre());
            cantanteEncontrado.setEdad(cantante.getEdad());
            cantanteEncontrado.setGeneroMusical(cantante.getGeneroMusical());
            cantanteEncontrado.setNacionalidad(cantante.getNacionalidad());
            cantanteEncontrado.setNombreArtistico(cantante.getNombreArtistico());
            cantanteEncontrado.setNumeroDeConciertos(cantante.getNumeroDeConciertos());
            cantanteEncontrado.setNumeroDeGiras(cantante.getNumeroDeGiras());
            cantanteEncontrado.setNumeroDeSencillos(cantante.getNumeroDeSencillos());
            cantanteEncontrado.setSalario(cantante.getSalario());
            cantanteDAO.update(cantanteEncontrado);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarCantante(Cantante cantante) {
        Cantante cantanteEncontrado = this.buscarCantante(cantante.getCodigo());
        if (cantanteEncontrado != null) {
            cantanteDAO.delete(cantante);
            return true;
        } else {
            return false;
        }

    }

    public List<Cantante> listar() {
        return cantanteDAO.findAll();
    }

    public void ingresarDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        this.cantante = cantante;

        cantanteDAO.createDisco(this.cantante, codigo, nombre, anioDeLanzamiento);
        cantanteDAO.update(this.cantante);
    }

    public Disco buscarDisco(Cantante cantante, int codigo) {
        this.cantante = cantante;
        return cantanteDAO.readDisco(this.cantante, codigo);
    }

    public boolean eliminarDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        this.cantante = cantante;
        Disco disco = this.buscarDisco(this.cantante, codigo);
        if (disco != null) {
            cantanteDAO.deleteDisco(this.cantante, codigo, nombre, anioDeLanzamiento);
            cantanteDAO.update(this.cantante);
            return true;
        } else {
            return false;
        }
    }

    public boolean actualizarDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        this.cantante = cantante;
        Disco disco = this.buscarDisco(cantante, codigo);
        if (disco != null) {
            cantanteDAO.updateDisco(this.cantante, codigo, nombre, anioDeLanzamiento);
            cantanteDAO.update(this.cantante);
            return true;
        } else {
            return false;
        }
    }

    public List<Disco> listarDiscos(Cantante cantante) {
        this.cantante = cantante;
        return cantanteDAO.findAllDisco(this.cantante);
    }
}
