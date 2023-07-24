/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.idao.ICompositorDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cancion;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Compositor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class CompositorDAO implements ICompositorDAO {

    RandomAccessFile archivo;
    List<Compositor> listaCompositores;

    public CompositorDAO() {
        archivo = instanciaRAF();
        listaCompositores = new ArrayList<>();
    }

    private RandomAccessFile instanciaRAF() {
        try {
            return new RandomAccessFile("src/main/resources/archivos/compositor.data", "rw");
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    private String rellenoCadena(String val, int valI) {
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
    public void create(Compositor compositor) {
        try {
            /*
            Esta línea utiliza el método seek del objeto archivo para posicionar el puntero de 
            lectura/escritura al final del archivo, listo para añadir nuevos datos
             */
            archivo.seek(this.tamañoArchivo());

            archivo.writeInt(compositor.getCodigo());

            archivo.writeUTF(this.rellenoCadena(compositor.getNombre(), 25));

            archivo.writeUTF(this.rellenoCadena(compositor.getApellido(), 25));

            archivo.writeInt(compositor.getEdad());

            archivo.writeUTF(this.rellenoCadena(compositor.getNacionalidad(), 20));

            archivo.writeDouble(compositor.getSalario());

            //92
            for (int i = 0; i < 10; i++) {
                archivo.writeInt(0);
                archivo.writeUTF(this.rellenoCadena("", 15));
                archivo.writeUTF(this.rellenoCadena("", 50));
                archivo.writeDouble(0);
            }

            for (int i = 0; i < 10; i++) {
                archivo.seek(this.tamañoArchivo());
                archivo.writeInt(0);

                archivo.writeUTF(this.rellenoCadena("", 25));
                archivo.writeUTF(this.rellenoCadena("", 25));
                archivo.writeInt(0);

                archivo.writeUTF(this.rellenoCadena("", 20));

                archivo.writeDouble(0);

                archivo.writeUTF(this.rellenoCadena("", 25));

                archivo.writeUTF(this.rellenoCadena("", 20));

                archivo.writeInt(0);

                archivo.writeInt(0);

                for (int j = 0; j < 10; j++) {
                    archivo.writeInt(0);
                    archivo.writeUTF(this.rellenoCadena("", 15));
                    archivo.writeInt(0);
                }
            }
        } catch (IOException e) {

        }
    }

    @Override
    public Compositor read(int codigo) {
        try {
            archivo.seek(0);
            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
                archivo.seek(i);
                if (archivo.readInt() == codigo) {
                    archivo.seek(i);
                    int cod = archivo.readInt();
                    String nombre = archivo.readUTF();
                    String apellido = archivo.readUTF();
                    int edad = archivo.readInt();
                    String nacionalidad = archivo.readUTF();
                    double salario = archivo.readDouble();
                    Compositor compositor = new Compositor(cod, nombre, apellido, edad, nacionalidad, salario);
                    for (int j = 0; j < 10; j++) {
                        int codigoCancion = archivo.readInt();
                        if (codigoCancion != 0) {
                            String titulo = archivo.readUTF();
                            String letra = archivo.readUTF();
                            double duracion = archivo.readDouble();
                            compositor.agregarCancion(codigoCancion, titulo, letra, duracion);
                        }

                    }
                    
                }
            }
        } catch (IOException e) {

        }
    }

    /*
    @Override
    public Compositor read(int codigo) {
        try {
            archivoo.seek(0);
        for (int i = 0; i < this.tamañoArchivo(); i += 399) {
                archivoo.seek(i);
                if (archivoo.readInt() == codigo) {
                    archivoo.seek(i);
                    int cod = archivoo.readInt();
                    String nombree = archivoo.readUTF();
                    String apellidoo = archivoo.readUTF();
                    int edadd = archivoo.readInt();
                    String nacionalidadd = archivoo.readUTF();
                    double salarioo = archivoo.readDouble();
                    int numeroDeComposicioness = archivoo.readInt();
                    Compositor compositor = new Compositor(numeroDeComposicioness, cod, nombree, apellidoo, edadd, nacionalidadd, salarioo);
                    
                    for (int j = 0; j < 10; j++) {
                        int codigoDisco = archivoo.readInt();
                        if (codigoDisco != 0) {
                            String nombreDisco = archivoo.readUTF();
                            int anio = archivoo.readInt();
                            compositor.agregarDisco(codigoDisco, nombreDisco, anio);
                        } else {
                            return compositor;
                        }

                    }
                    return compositor;
                }

            }
        } catch (IOException e) {
            return null;
        }
        return null;
    }
     */
 /*   
    @Override
    public void create(Compositor compositor) {
        listaCompositores.add(compositor);
    }

    @Override
    public Compositor read(int codigo) {

        for (Compositor compositor : listaCompositores) {
            if (compositor.getCodigo() == codigo) {
                return compositor;
            }
        }
        return null;
    }

    @Override
    public void update(Compositor compositor) {

        for (int i = 0; i < listaCompositores.size(); i++) {
            Compositor c = listaCompositores.get(i);
            if (c.getCodigo() == compositor.getCodigo()) {
                listaCompositores.set(i, compositor);
                break;
            }
        }
    }

    @Override
    public void delete(Compositor compositor) {

        Iterator<Compositor> it = listaCompositores.iterator();
        while (it.hasNext()) {
            Compositor c = it.next();
            if (c.getCodigo() == compositor.getCodigo()) {
                it.remove();
                break;
            }
        }
    }
     */
    @Override
    public List<Compositor> findAll() {
        return listaCompositores;
    }

    @Override
    public Compositor buscarPorCancion(String valor) {
        //Se recorre la lista de personas con el forEach
        for (Compositor compositor : listaCompositores) {
            //Se pregunta si la persona es de tipo Compositor

            //se recorre la lista de cancionesTop100Bilboard
            for (Cancion cancion : compositor.listarCanciones()) {
                //Se pregunta si el titulo es igual al que se ingreso como parametro
                if (cancion.getTitulo().equals(valor)) {
                    //Se retorna el compositor y se imprime el nombre y el apellido del compositor
                    System.out.println(compositor.getNombre() + " " + compositor.getApellido());
                    return compositor;
                }

            }
        }
        return null;
    }

    @Override
    public void createCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        compositor.agregarCancion(codigo, titulo, letra, tiempoEnMinutos);
    }

    @Override
    public Cancion readCancion(Compositor compositor, int codigo) {
        return compositor.buscarCancion(codigo);
    }

    @Override
    public void updateCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        compositor.actualizarCancion(codigo, titulo, letra, tiempoEnMinutos);
    }

    @Override
    public void deleteCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        compositor.eliminarCancion(codigo, titulo, letra, tiempoEnMinutos);
    }

    @Override
    public List<Cancion> findAllCanciones(Compositor compositor) {
        return compositor.listarCanciones();
    }

    @Override
    public void update(Compositor compositor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Compositor compositor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
