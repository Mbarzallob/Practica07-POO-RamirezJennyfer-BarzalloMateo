/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.idao.ICompositorDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cancion;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Compositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Disco;
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
                    for (int j = 0; j < 10; j++) {
                        int codCantante = archivo.readInt();
                        if (codCantante != 0) {
                            String nombreCantante = archivo.readUTF();
                            String apellidoCantante = archivo.readUTF();
                            int edadCantante = archivo.readInt();
                            String nacionalidadCantante = archivo.readUTF();
                            double salarioCantante = archivo.readDouble();
                            String nombreArtistico = archivo.readUTF();
                            String genero = archivo.readUTF();
                            int numConciertos = archivo.readInt();
                            int numGiras = archivo.readInt();
                            Cantante cantante = new Cantante(nombreArtistico, genero, numConciertos, numGiras, codCantante, nombreCantante, apellidoCantante, edadCantante, nacionalidadCantante, salarioCantante);

                            for (int k = 0; k < 10; k++) {

                                int codigoDisco = archivo.readInt();
                                if (codigoDisco != 0) {
                                    String nombreDisco = archivo.readUTF();
                                    int anio = archivo.readInt();
                                    cantante.agregarDisco(codigoDisco, nombreDisco, anio);
                                } else {
                                    break;
                                }

                            }
                            compositor.agregarCliente(cantante);
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

    @Override
    public void update(Compositor compositor) {
        try {
            /*
            Esta línea utiliza el método seek del objeto archivo para posicionar el puntero de 
            lectura/escritura al final del archivo, listo para añadir nuevos datos
             */
            archivo.seek(0);
            for (int a = 0; a < this.tamañoArchivo(); a += 4982) {
                archivo.seek(a);
                if (archivo.readInt() == compositor.getCodigo()) {
                    archivo.seek(a);
                    archivo.writeInt(compositor.getCodigo());

                    archivo.writeUTF(this.rellenoCadena(compositor.getNombre(), 25));

                    archivo.writeUTF(this.rellenoCadena(compositor.getApellido(), 25));

                    archivo.writeInt(compositor.getEdad());

                    archivo.writeUTF(this.rellenoCadena(compositor.getNacionalidad(), 20));

                    archivo.writeDouble(compositor.getSalario());

                    //92
                    if (compositor.listarCanciones() != null) {
                        for (Cancion cancion : compositor.listarCanciones()) {
                            archivo.writeInt(cancion.getCodigo());
                            archivo.writeUTF(this.rellenoCadena(cancion.getTitulo(), 15));
                            archivo.writeUTF(this.rellenoCadena(cancion.getLetra(), 50));
                            archivo.writeDouble(cancion.getTiempoEnMinutos());
                        }
                    } else {
                        for (int i = 0; i < 10; i++) {
                            archivo.writeInt(0);
                            archivo.writeUTF(this.rellenoCadena("", 15));
                            archivo.writeUTF(this.rellenoCadena("", 50));
                            archivo.writeDouble(0);
                        }
                    }
                    if (compositor.listarCantantes() != null) {
                        for (Cantante cantante : compositor.listarCantantes()) {
                            archivo.writeInt(cantante.getCodigo());

                            archivo.writeUTF(this.rellenoCadena(cantante.getNombre(), 25));
                            archivo.writeUTF(this.rellenoCadena(cantante.getApellido(), 25));
                            archivo.writeInt(cantante.getEdad());

                            archivo.writeUTF(this.rellenoCadena(cantante.getNacionalidad(), 20));

                            archivo.writeDouble(cantante.getSalario());

                            archivo.writeUTF(this.rellenoCadena(cantante.getNombreArtistico(), 25));

                            archivo.writeUTF(this.rellenoCadena(cantante.getGeneroMusical(), 20));

                            archivo.writeInt(cantante.getNumeroDeConciertos());

                            archivo.writeInt(cantante.getNumeroDeGiras());
                            if (cantante.listarDiscos() != null) {
                                for (Disco disco : cantante.listarDiscos()) {
                                    archivo.writeInt(disco.getCodigo());
                                    archivo.writeUTF(this.rellenoCadena(disco.getNombre(), 15));
                                    archivo.writeInt(disco.getAnioDeLanzamiento());
                                }
                            } else {
                                for (int j = 0; j < 10; j++) {
                                    archivo.writeInt(0);
                                    archivo.writeUTF(this.rellenoCadena("", 15));
                                    archivo.writeInt(0);
                                }
                            }
                        }
                    } else {
                        for (int i = 0; i < 10; i++) {
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
                    }
                }
            }
        } catch (IOException e) {

        }
    }

    @Override
    public void delete(Compositor compositor) {
        try {
            /*
            Esta línea utiliza el método seek del objeto archivo para posicionar el puntero de 
            lectura/escritura al final del archivo, listo para añadir nuevos datos
             */
            archivo.seek(0);
            for (int a = 0; a < this.tamañoArchivo(); a += 4982) {
                archivo.seek(a);
                if (archivo.readInt() == compositor.getCodigo()) {
                    archivo.seek(a);
                    archivo.writeInt(0);

                    archivo.writeUTF(this.rellenoCadena("", 25));

                    archivo.writeUTF(this.rellenoCadena("", 25));

                    archivo.writeInt(0);

                    archivo.writeUTF(this.rellenoCadena("", 20));

                    archivo.writeDouble(0);

                    //92
                    for (int i = 0; i < 10; i++) {
                        archivo.writeInt(0);
                        archivo.writeUTF(this.rellenoCadena("", 15));
                        archivo.writeUTF(this.rellenoCadena("", 50));
                        archivo.writeDouble(0);

                    }

                    for (int i = 0; i < 10; i++) {
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
                }
            }
        } catch (IOException e) {

        }
    }

    @Override
    public List<Compositor> findAll() {
        try {
            List<Compositor> lista = new ArrayList<>();
            archivo.seek(0);
            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
                archivo.seek(i);
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
                for (int j = 0; j < 10; j++) {
                    int codCantante = archivo.readInt();
                    if (codCantante != 0) {
                        String nombreCantante = archivo.readUTF();
                        String apellidoCantante = archivo.readUTF();
                        int edadCantante = archivo.readInt();
                        String nacionalidadCantante = archivo.readUTF();
                        double salarioCantante = archivo.readDouble();
                        String nombreArtistico = archivo.readUTF();
                        String genero = archivo.readUTF();
                        int numConciertos = archivo.readInt();
                        int numGiras = archivo.readInt();
                        Cantante cantante = new Cantante(nombreArtistico, genero, numConciertos, numGiras, codCantante, nombreCantante, apellidoCantante, edadCantante, nacionalidadCantante, salarioCantante);

                        for (int k = 0; k < 10; k++) {

                            int codigoDisco = archivo.readInt();
                            if (codigoDisco != 0) {
                                String nombreDisco = archivo.readUTF();
                                int anio = archivo.readInt();
                                cantante.agregarDisco(codigoDisco, nombreDisco, anio);
                            } else {
                                break;
                            }

                        }
                        compositor.agregarCliente(cantante);
                    }
                }
                lista.add(compositor);

            }
            return lista;
        } catch (IOException e) {
            return null;
        }

    }

    //
    //
    //
    //
    //
    //
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
        try {
            archivo.seek(0);
            if (compositor.getNumeroDeComposiciones() == 10) {
                return;
            }
            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
                archivo.seek(i);
                if (archivo.readInt() == compositor.getCodigo()) {
                    archivo.seek(i + 92 + (compositor.getNumeroDeComposiciones() * 81));
                    archivo.writeInt(codigo);
                    archivo.writeUTF(this.rellenoCadena(titulo, 15));
                    archivo.writeUTF(this.rellenoCadena(letra, 50));
                    archivo.writeDouble(tiempoEnMinutos);
                }
            }
        } catch (IOException e) {

        }
    }

    @Override
    public Cancion readCancion(Compositor compositor, int codigo) {
        try {
            archivo.seek(0);

            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
                archivo.seek(i);
                if (archivo.readInt() == compositor.getCodigo()) {
                    for (int j = 0; j < 10; j++) {

                        archivo.seek(i + 92 + (j * 81));
                        if (archivo.readInt() == codigo) {
                            archivo.seek(i + 92 + (j * 81));
                            int codigoC = archivo.readInt();
                            String titulo = archivo.readUTF();
                            String letra = archivo.readUTF();
                            double duracion = archivo.readDouble();
                            return new Cancion(codigoC, titulo, letra, duracion);
                        }
                    }
                }
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public void updateCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        try {
            archivo.seek(0);

            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
                archivo.seek(i);
                if (archivo.readInt() == compositor.getCodigo()) {
                    for (int j = 0; j < 10; j++) {

                        archivo.seek(i + 92 + (j * 81));
                        if (archivo.readInt() == codigo) {
                            archivo.seek(i + 92 + (j * 81));
                            archivo.writeInt(codigo);
                            archivo.writeUTF(this.rellenoCadena(titulo, 15));
                            archivo.writeUTF(this.rellenoCadena(letra, 50));
                            archivo.writeDouble(tiempoEnMinutos);
                            return;
                        }
                    }
                }
            }

        } catch (IOException e) {

        }
    }

    @Override
    public void deleteCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        try {
            archivo.seek(0);

            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
                archivo.seek(i);
                if (archivo.readInt() == compositor.getCodigo()) {
                    for (int j = 0; j < 10; j++) {

                        archivo.seek(i + 92 + (j * 81));
                        if (archivo.readInt() == codigo) {
                            archivo.seek(i + 92 + (j * 81));
                            archivo.writeInt(0);
                            archivo.writeUTF(this.rellenoCadena("", 15));
                            archivo.writeUTF(this.rellenoCadena("", 50));
                            archivo.writeDouble(0);
                            return;
                        }
                    }
                }
            }

        } catch (IOException e) {

        }
    }

    @Override
    public List<Cancion> findAllCanciones(Compositor compositor) {
        try {
            List<Cancion> lista = new ArrayList<>();
            archivo.seek(0);

            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
                archivo.seek(i);
                if (archivo.readInt() == compositor.getCodigo()) {
                    for (int j = 0; j < 10; j++) {

                        archivo.seek(i + 92 + (j * 81));
                        int codigoC = archivo.readInt();
                        if (codigoC != 0) {
                            String titulo = archivo.readUTF();
                            String letra = archivo.readUTF();
                            double duracion = archivo.readDouble();
                            lista.add(new Cancion(codigoC, titulo, letra, duracion));
                        }
                    }
                }
            }
            return lista;

        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public void createCliente(Compositor compositor, Cantante cantante) {
        try {
            archivo.seek(0);
            if (compositor.getNumeroDeClientes() == 10) {
                return;
            }
            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
                archivo.seek(i);
                if (archivo.readInt() == compositor.getCodigo()) {
                    archivo.seek(i + 902 + (compositor.getNumeroDeClientes() * 399));
                    archivo.writeInt(cantante.getCodigo());

                    archivo.writeUTF(this.rellenoCadena(cantante.getNombre(), 25));
                    archivo.writeUTF(this.rellenoCadena(cantante.getApellido(), 25));
                    archivo.writeInt(cantante.getEdad());

                    archivo.writeUTF(this.rellenoCadena(cantante.getNacionalidad(), 20));

                    archivo.writeDouble(cantante.getSalario());

                    archivo.writeUTF(this.rellenoCadena(cantante.getNombreArtistico(), 25));

                    archivo.writeUTF(this.rellenoCadena(cantante.getGeneroMusical(), 20));

                    archivo.writeInt(cantante.getNumeroDeConciertos());

                    archivo.writeInt(cantante.getNumeroDeGiras());
                    //149
                    if (cantante.listarDiscos() != null) {
                        for (Disco disco : cantante.listarDiscos()) {
                            archivo.writeInt(disco.getCodigo());
                            archivo.writeUTF(this.rellenoCadena(disco.getNombre(), 15));
                            archivo.writeInt(disco.getAnioDeLanzamiento());
                        }
                    } else {
                        for (int j = 0; j < 10; j++) {
                            archivo.writeInt(0);
                            archivo.writeUTF(this.rellenoCadena("", 15));
                            archivo.writeInt(0);
                        }
                    }
                }
            }
        } catch (IOException e) {

        }
    }

    @Override
    public Cantante readCliente(Compositor compositor, int codigo) {
        try {
            archivo.seek(0);

            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
                archivo.seek(i);
                if (archivo.readInt() == compositor.getCodigo()) {
                    for (int j = 0; j < 10; j++) {

                        archivo.seek(i + 902 + (j * 399));
                        if (archivo.readInt() == codigo) {
                            archivo.seek(i + 902 + (j * 399));
                            int cod = archivo.readInt();
                            String nombre = archivo.readUTF();
                            String apellido = archivo.readUTF();
                            int edad = archivo.readInt();
                            String nacionalidad = archivo.readUTF();
                            double salario = archivo.readDouble();
                            String nombreArtistico = archivo.readUTF();
                            String genero = archivo.readUTF();
                            int numConciertos = archivo.readInt();
                            int numGiras = archivo.readInt();
                            Cantante cantante = new Cantante(nombreArtistico, genero, numConciertos, numGiras, cod, nombre, apellido, edad, nacionalidad, salario);

                            for (int k = 0; k < 10; k++) {

                                int codigoDisco = archivo.readInt();
                                if (codigoDisco != 0) {
                                    String nombreDisco = archivo.readUTF();
                                    int anio = archivo.readInt();
                                    cantante.agregarDisco(codigoDisco, nombreDisco, anio);
                                }

                            }
                            return cantante;
                        }
                    }

                }
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public void updateCliente(Compositor compositor, Cantante anterior, Cantante nuevo) {
        try {
            archivo.seek(0);

            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
                archivo.seek(i);
                if (archivo.readInt() == compositor.getCodigo()) {
                    for (int j = 0; j < 10; j++) {

                        archivo.seek(i + 902 + (j * 399));
                        if (archivo.readInt() == anterior.getCodigo()) {
                            archivo.seek(i + 902 + (j * 399));
                            archivo.writeInt(nuevo.getCodigo());

                            archivo.writeUTF(this.rellenoCadena(nuevo.getNombre(), 25));
                            archivo.writeUTF(this.rellenoCadena(nuevo.getApellido(), 25));
                            archivo.writeInt(nuevo.getEdad());

                            archivo.writeUTF(this.rellenoCadena(nuevo.getNacionalidad(), 20));

                            archivo.writeDouble(nuevo.getSalario());

                            archivo.writeUTF(this.rellenoCadena(nuevo.getNombreArtistico(), 25));

                            archivo.writeUTF(this.rellenoCadena(nuevo.getGeneroMusical(), 20));

                            archivo.writeInt(nuevo.getNumeroDeConciertos());

                            archivo.writeInt(nuevo.getNumeroDeGiras());
                            //149
                            if (nuevo.listarDiscos() != null) {
                                for (Disco disco : nuevo.listarDiscos()) {
                                    archivo.writeInt(disco.getCodigo());
                                    archivo.writeUTF(this.rellenoCadena(disco.getNombre(), 15));
                                    archivo.writeInt(disco.getAnioDeLanzamiento());
                                }
                            } else {
                                for (int k = 0; k < 10; k++) {
                                    archivo.writeInt(0);
                                    archivo.writeUTF(this.rellenoCadena("", 15));
                                    archivo.writeInt(0);
                                }
                            }

                        }
                    }

                }
            }
        } catch (IOException e) {
        }
    }

    @Override
    public void deleteCliente(Compositor compositor, Cantante cantante) {
        try {
            archivo.seek(0);

            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
                archivo.seek(i);
                if (archivo.readInt() == compositor.getCodigo()) {
                    for (int j = 0; j < 10; j++) {

                        archivo.seek(i + 902 + (j * 399));
                        if (archivo.readInt() == cantante.getCodigo()) {
                            archivo.seek(i + 902 + (j * 399));
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
                            //149

                            for (int k = 0; k < 10; k++) {
                                archivo.writeInt(0);
                                archivo.writeUTF(this.rellenoCadena("", 15));
                                archivo.writeInt(0);
                            }

                        }
                    }

                }
            }
        } catch (IOException e) {
        }
    }

    @Override
    public List<Cantante> findAllClientes(Compositor compositor) {
        try {
            List<Cantante> lista = new ArrayList<>();
            archivo.seek(0);

            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
                archivo.seek(i);
                if (archivo.readInt() == compositor.getCodigo()) {
                    for (int j = 0; j < 10; j++) {

                        archivo.seek(i + 902 + (j * 399));
                        int cod = archivo.readInt();
                        String nombre = archivo.readUTF();
                        String apellido = archivo.readUTF();
                        int edad = archivo.readInt();
                        String nacionalidad = archivo.readUTF();
                        double salario = archivo.readDouble();
                        String nombreArtistico = archivo.readUTF();
                        String genero = archivo.readUTF();
                        int numConciertos = archivo.readInt();
                        int numGiras = archivo.readInt();
                        Cantante cantante = new Cantante(nombreArtistico, genero, numConciertos, numGiras, cod, nombre, apellido, edad, nacionalidad, salario);

                        for (int k = 0; k < 10; k++) {

                            int codigoDisco = archivo.readInt();
                            if (codigoDisco != 0) {
                                String nombreDisco = archivo.readUTF();
                                int anio = archivo.readInt();
                                cantante.agregarDisco(codigoDisco, nombreDisco, anio);
                            }

                        }
                        lista.add(cantante);

                    }

                }
            }
            return lista;
        } catch (IOException e) {
            return null;
        }
    }

}
