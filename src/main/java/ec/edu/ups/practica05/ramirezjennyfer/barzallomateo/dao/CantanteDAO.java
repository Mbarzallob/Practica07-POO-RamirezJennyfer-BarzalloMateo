/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.idao.ICantanteDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Disco;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class CantanteDAO implements ICantanteDAO {

    RandomAccessFile archivo;
    int conteoCantante;
    int conteoDisco;

    public CantanteDAO() {
        archivo = instanciaRAF();
        listaCantantes = new ArrayList<>();
        conteoCantante = 1;
        conteoDisco = 0;
    }

    private RandomAccessFile instanciaRAF() {
        try {
            return new RandomAccessFile("src/main/resources/archivos/cantante.data", "rw");
        } catch (FileNotFoundException e) {
            return null;
        }

    }

    private String relleno(String val, int valI) {
        if (val.length() != valI) {
            if (val.length() < valI) {
                return String.format("%-" + valI + "s", val);
            } else {
                return val.substring(0, valI);
            }
        } else {
            return val;
        }
    }

    private long tamañoArchivo() {
        try {
            return this.archivo.length();
        } catch (IOException e) {
            return 0;
        }
    }
@Override
public void create(Cantante cantante) {
    try {
        archivo.seek(this.tamañoArchivo());
        //0
        archivo.writeInt(cantante.getCodigo());
        //4
        archivo.writeUTF(this.relleno(cantante.getNombre(), 25));
        //31
        archivo.writeUTF(this.relleno(cantante.getApellido(), 25));
        //58
        archivo.writeInt(cantante.getEdad());
        //62
        archivo.writeUTF(this.relleno(cantante.getNacionalidad(), 20));
        //84
        archivo.writeDouble(cantante.getSalario());
        //92
        archivo.writeUTF(this.relleno(cantante.getNombreArtistico(), 25));
        //119
        archivo.writeUTF(this.relleno(cantante.getGeneroMusical(), 20));
        //139
        archivo.writeInt(cantante.getNumeroDeSencillos());
        //143
        archivo.writeInt(cantante.getNumeroDeConciertos());
        //147
        archivo.writeInt(cantante.getNumeroDeGiras());
        //151
        for (int i = 0; i < 10; i++) {
            int u = (int) i * 29;
            archivo.writeInt(0 + u);
            archivo.writeUTF(this.relleno("", 15 + u));
            archivo.writeInt(0 + u);
        }
        //251
        conteoCantante++;
    } catch (IOException e) {
        
    }
}

    @Override
    public Cantante read(int codigo) {
        try {
            for (int i = 0; i < conteoCantante; i++) {
                int o = (int) (i * 250);
                archivo.seek(0 + o);
                if (archivo.readInt() == codigo) {

                    int cod = archivo.readInt();
                    archivo.seek(4 + o);
                    String nombre = archivo.readUTF();
                    archivo.seek(31 + o);
                    String apellido = archivo.readUTF();
                    archivo.seek(58 + o);
                    int edad = archivo.readInt();
                    archivo.seek(62 + o);
                    String nacionalidad = archivo.readUTF();
                    archivo.seek(84 + o);
                    double salario = archivo.readDouble();
                    archivo.seek(92 + o);
                    String nombreArtistico = archivo.readUTF();
                    archivo.seek(119 + o);
                    String genero = archivo.readUTF();
                    archivo.seek(143 + o);
                    int numSencillos = archivo.readInt();
                    archivo.seek(147 + o);
                    int numConciertos = archivo.readInt();
                    archivo.seek(151 + o);
                    int numGiras = archivo.readInt();
                    Cantante cantante = new Cantante(nombreArtistico, genero, numSencillos, numConciertos, numGiras, cod, nombre, apellido, edad, nacionalidad, salario);

                    archivo.seek(161 + o);
                    for (int j = 0; j < conteoDisco; j++) {
                        int u = (int) j * 29;
                        archivo.seek(161 + o + u);
                        int codigoDisco = archivo.readInt();
                        archivo.seek(165  + o + u);
                        String nombreDisco = archivo.readUTF();
                        archivo.seek(195  + o + u);
                        int anio = archivo.readInt();
                        cantante.agregarDisco(codigoDisco, nombreDisco, anio);
                    }
                    return cantante;
                } else {
                    return null;
                }

            }
        } catch (IOException e) {
            return null;
        }
        return null;
    }
//
//    @Override
//    public void update(Cantante cantante) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void delete(Cantante cantante) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public List<Cantante> findAll() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public Cantante buscarPorDisco(String nombre) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void createDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public Disco readDisco(Cantante cantante, int codigo) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void updateDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void deleteDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public List<Disco> findAllDisco(Cantante cantante) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    private List<Cantante> listaCantantes;

    @Override
    public void update(Cantante cantante) {

        for (int i = 0; i < listaCantantes.size(); i++) {
            Cantante c = listaCantantes.get(i);
            if (c.getCodigo() == cantante.getCodigo()) {
                listaCantantes.set(i, cantante);
                break;
            }
        }
    }

    @Override
    public void delete(Cantante cantante) {

        Iterator<Cantante> it = listaCantantes.iterator();
        while (it.hasNext()) {
            Cantante c = it.next();
            if (c.getCodigo() == cantante.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cantante> findAll() {

        return listaCantantes;
    }

    @Override
    public Cantante buscarPorDisco(String valor) {
        //Se recorre la lista personas con el forEach
        for (Cantante cantante : listaCantantes) {
            //Se pregunta si la persona es de tipo Cantante

            // Se recorre la lista de discografias del cantante
            for (Disco disco : cantante.listarDiscos()) {
                if (disco.getNombre().equals(valor)) {
                    //Se retorna el cantante que tiene el disco y se imprime el nombre y el apellido
                    System.out.println(cantante.getNombre() + " " + cantante.getApellido());
                    return cantante;
                }
            }

        }
        return null;

    }

    @Override
    public void createDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        cantante.agregarDisco(codigo, nombre, anioDeLanzamiento);
    }

    @Override
    public Disco readDisco(Cantante cantante, int codigo) {
        return cantante.buscarDisco(codigo);
    }

    @Override
    public void updateDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        cantante.actualizarDisco(codigo, nombre, anioDeLanzamiento);
    }

    @Override
    public void deleteDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        cantante.eliminarDisco(codigo, nombre, anioDeLanzamiento);
    }

    @Override
    public List<Disco> findAllDisco(Cantante cantante) {
        return cantante.listarDiscos();
    }

}
