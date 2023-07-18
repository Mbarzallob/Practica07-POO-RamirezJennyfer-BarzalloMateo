/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.idao;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Disco;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public interface ICantanteDAO {
    public void create (Cantante cantante);
    public  Cantante read(int codigo);
    public void update(Cantante cantante);
    public void delete(Cantante cantante);
    public List<Cantante> findAll();
    public Cantante buscarPorDisco(String nombre);
    
    public void createDisco (Cantante cantante, int codigo, String nombre, int anioDeLanzamiento);
    public Disco readDisco(Cantante cantante, int codigo);
    public void updateDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento);
    public void deleteDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento);
    public List<Disco> findAllDisco(Cantante cantante);
    
}
