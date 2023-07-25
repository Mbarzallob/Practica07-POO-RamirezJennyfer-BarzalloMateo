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

//    @Override
//    public void create(Compositor compositor) {
//        try {
//            /*
//            Esta línea utiliza el método seek del objeto archivo para posicionar el puntero de 
//            lectura/escritura al final del archivo, listo para añadir nuevos datos
//             */
//            archivo.seek(this.tamañoArchivo());
//
//            archivo.writeInt(compositor.getCodigo());
//
//            archivo.writeUTF(this.rellenoCadena(compositor.getNombre(), 25));
//
//            archivo.writeUTF(this.rellenoCadena(compositor.getApellido(), 25));
//
//            archivo.writeInt(compositor.getEdad());
//
//            archivo.writeUTF(this.rellenoCadena(compositor.getNacionalidad(), 20));
//
//            archivo.writeDouble(compositor.getSalario());
//
//            //92
//            for (int i = 0; i < 10; i++) {
//                archivo.writeInt(0);
//                archivo.writeUTF(this.rellenoCadena("", 15));
//                archivo.writeUTF(this.rellenoCadena("", 50));
//                archivo.writeDouble(0);
//            }
//
//            for (int i = 0; i < 10; i++) {
//                archivo.writeInt(0);
//
//                archivo.writeUTF(this.rellenoCadena("", 25));
//                archivo.writeUTF(this.rellenoCadena("", 25));
//                archivo.writeInt(0);
//
//                archivo.writeUTF(this.rellenoCadena("", 20));
//
//                archivo.writeDouble(0);
//
//                archivo.writeUTF(this.rellenoCadena("", 25));
//
//                archivo.writeUTF(this.rellenoCadena("", 20));
//
//                archivo.writeInt(0);
//
//                archivo.writeInt(0);
//
//                for (int j = 0; j < 10; j++) {
//                    archivo.writeInt(0);
//                    archivo.writeUTF(this.rellenoCadena("", 15));
//                    archivo.writeInt(0);
//                }
//            }
//        } catch (IOException e) {
//
//        }
//    }
//
//    @Override
//    public Compositor read(int codigo) {
//        try {
//            archivo.seek(0);
//            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
//                archivo.seek(i);
//                if (archivo.readInt() == codigo) {
//                    archivo.seek(i);
//                    int cod = archivo.readInt();
//                    String nombre = archivo.readUTF();
//                    String apellido = archivo.readUTF();
//                    int edad = archivo.readInt();
//                    String nacionalidad = archivo.readUTF();
//                    double salario = archivo.readDouble();
//                    Compositor compositor = new Compositor(cod, nombre, apellido, edad, nacionalidad, salario);
//                    for (int j = 0; j < 10; j++) {
//                        int codigoCancion = archivo.readInt();
//                        if (codigoCancion != 0) {
//                            String titulo = archivo.readUTF();
//                            String letra = archivo.readUTF();
//                            double duracion = archivo.readDouble();
//                            compositor.agregarCancion(codigoCancion, titulo, letra, duracion);
//                        } else {
//                            return compositor;
//                        }
//
//                    }
//                    for (int j = 0; j < 10; j++) {
//                        int codCantante = archivo.readInt();
//                        if (codCantante != 0) {
//                            String nombreCantante = archivo.readUTF();
//                            String apellidoCantante = archivo.readUTF();
//                            int edadCantante = archivo.readInt();
//                            String nacionalidadCantante = archivo.readUTF();
//                            double salarioCantante = archivo.readDouble();
//                            String nombreArtistico = archivo.readUTF();
//                            String genero = archivo.readUTF();
//                            int numConciertos = archivo.readInt();
//                            int numGiras = archivo.readInt();
//                            Cantante cantante = new Cantante(nombreArtistico, genero, numConciertos, numGiras, codCantante, nombreCantante, apellidoCantante, edadCantante, nacionalidadCantante, salarioCantante);
//
//                            for (int k = 0; k < 10; k++) {
//
//                                int codigoDisco = archivo.readInt();
//                                if (codigoDisco != 0) {
//                                    String nombreDisco = archivo.readUTF();
//                                    int anio = archivo.readInt();
//                                    cantante.agregarDisco(codigoDisco, nombreDisco, anio);
//                                } else {
//                                    break;
//                                }
//
//                            }
//                            compositor.agregarCliente(cantante);
//                        }
//                    }
//                    return compositor;
//                }
//
//            }
//        } catch (IOException e) {
//            return null;
//        }
//        return null;
//    }
//
//    @Override
//    public void update(Compositor compositor) {
//        try {
//            /*
//            Esta línea utiliza el método seek del objeto archivo para posicionar el puntero de 
//            lectura/escritura al final del archivo, listo para añadir nuevos datos
//             */
//            archivo.seek(0);
//            for (int a = 0; a < this.tamañoArchivo(); a += 4982) {
//                archivo.seek(a);
//                if (archivo.readInt() == compositor.getCodigo()) {
//                    archivo.seek(a);
//                    archivo.writeInt(compositor.getCodigo());
//
//                    archivo.writeUTF(this.rellenoCadena(compositor.getNombre(), 25));
//
//                    archivo.writeUTF(this.rellenoCadena(compositor.getApellido(), 25));
//
//                    archivo.writeInt(compositor.getEdad());
//
//                    archivo.writeUTF(this.rellenoCadena(compositor.getNacionalidad(), 20));
//
//                    archivo.writeDouble(compositor.getSalario());
//
//                    //92
//                    if (compositor.listarCanciones() != null) {
//                        for (Cancion cancion : compositor.listarCanciones()) {
//                            archivo.writeInt(cancion.getCodigo());
//                            archivo.writeUTF(this.rellenoCadena(cancion.getTitulo(), 15));
//                            archivo.writeUTF(this.rellenoCadena(cancion.getLetra(), 50));
//                            archivo.writeDouble(cancion.getTiempoEnMinutos());
//                        }
//                    } else {
//                        for (int i = 0; i < 10; i++) {
//                            archivo.writeInt(0);
//                            archivo.writeUTF(this.rellenoCadena("", 15));
//                            archivo.writeUTF(this.rellenoCadena("", 50));
//                            archivo.writeDouble(0);
//                        }
//                    }
//                    if (compositor.listarCantantes() != null) {
//                        for (Cantante cantante : compositor.listarCantantes()) {
//                            archivo.writeInt(cantante.getCodigo());
//
//                            archivo.writeUTF(this.rellenoCadena(cantante.getNombre(), 25));
//                            archivo.writeUTF(this.rellenoCadena(cantante.getApellido(), 25));
//                            archivo.writeInt(cantante.getEdad());
//
//                            archivo.writeUTF(this.rellenoCadena(cantante.getNacionalidad(), 20));
//
//                            archivo.writeDouble(cantante.getSalario());
//
//                            archivo.writeUTF(this.rellenoCadena(cantante.getNombreArtistico(), 25));
//
//                            archivo.writeUTF(this.rellenoCadena(cantante.getGeneroMusical(), 20));
//
//                            archivo.writeInt(cantante.getNumeroDeConciertos());
//
//                            archivo.writeInt(cantante.getNumeroDeGiras());
//                            if (cantante.listarDiscos() != null) {
//                                for (Disco disco : cantante.listarDiscos()) {
//                                    archivo.writeInt(disco.getCodigo());
//                                    archivo.writeUTF(this.rellenoCadena(disco.getNombre(), 15));
//                                    archivo.writeInt(disco.getAnioDeLanzamiento());
//                                }
//                            } else {
//                                for (int j = 0; j < 10; j++) {
//                                    archivo.writeInt(0);
//                                    archivo.writeUTF(this.rellenoCadena("", 15));
//                                    archivo.writeInt(0);
//                                }
//                            }
//                        }
//                    } else {
//                        for (int i = 0; i < 10; i++) {
//                            archivo.writeInt(0);
//
//                            archivo.writeUTF(this.rellenoCadena("", 25));
//                            archivo.writeUTF(this.rellenoCadena("", 25));
//                            archivo.writeInt(0);
//
//                            archivo.writeUTF(this.rellenoCadena("", 20));
//
//                            archivo.writeDouble(0);
//
//                            archivo.writeUTF(this.rellenoCadena("", 25));
//
//                            archivo.writeUTF(this.rellenoCadena("", 20));
//
//                            archivo.writeInt(0);
//
//                            archivo.writeInt(0);
//
//                            for (int j = 0; j < 10; j++) {
//                                archivo.writeInt(0);
//                                archivo.writeUTF(this.rellenoCadena("", 15));
//                                archivo.writeInt(0);
//                            }
//                        }
//                    }
//                }
//            }
//        } catch (IOException e) {
//
//        }
//    }
//
//    @Override
//    public void delete(Compositor compositor) {
//        try {
//            /*
//            Esta línea utiliza el método seek del objeto archivo para posicionar el puntero de 
//            lectura/escritura al final del archivo, listo para añadir nuevos datos
//             */
//            archivo.seek(0);
//            for (int a = 0; a < this.tamañoArchivo(); a += 4982) {
//                archivo.seek(a);
//                if (archivo.readInt() == compositor.getCodigo()) {
//                    archivo.seek(a);
//                    archivo.writeInt(0);
//
//                    archivo.writeUTF(this.rellenoCadena("", 25));
//
//                    archivo.writeUTF(this.rellenoCadena("", 25));
//
//                    archivo.writeInt(0);
//
//                    archivo.writeUTF(this.rellenoCadena("", 20));
//
//                    archivo.writeDouble(0);
//
//                    //92
//                    for (int i = 0; i < 10; i++) {
//                        archivo.writeInt(0);
//                        archivo.writeUTF(this.rellenoCadena("", 15));
//                        archivo.writeUTF(this.rellenoCadena("", 50));
//                        archivo.writeDouble(0);
//
//                    }
//
//                    for (int i = 0; i < 10; i++) {
//                        archivo.writeInt(0);
//
//                        archivo.writeUTF(this.rellenoCadena("", 25));
//                        archivo.writeUTF(this.rellenoCadena("", 25));
//                        archivo.writeInt(0);
//
//                        archivo.writeUTF(this.rellenoCadena("", 20));
//
//                        archivo.writeDouble(0);
//
//                        archivo.writeUTF(this.rellenoCadena("", 25));
//
//                        archivo.writeUTF(this.rellenoCadena("", 20));
//
//                        archivo.writeInt(0);
//
//                        archivo.writeInt(0);
//
//                        for (int j = 0; j < 10; j++) {
//                            archivo.writeInt(0);
//                            archivo.writeUTF(this.rellenoCadena("", 15));
//                            archivo.writeInt(0);
//                        }
//
//                    }
//                }
//            }
//        } catch (IOException e) {
//
//        }
//    }
//
//    @Override
//    public List<Compositor> findAll() {
//        try {
//            List<Compositor> lista = new ArrayList<>();
//            archivo.seek(0);
//            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
//                archivo.seek(i);
//                int cod = archivo.readInt();
//                String nombre = archivo.readUTF();
//                String apellido = archivo.readUTF();
//                int edad = archivo.readInt();
//                String nacionalidad = archivo.readUTF();
//                double salario = archivo.readDouble();
//                System.out.println("1");
//                Compositor compositor = new Compositor(cod, nombre, apellido, edad, nacionalidad, salario);
//                for (int j = 0; j < 10; j++) {
//                    System.out.println("22");
//                    int codigoCancion = archivo.readInt();
//                    if (codigoCancion != 0) {
//                        String titulo = archivo.readUTF();
//                        String letra = archivo.readUTF();
//                        double duracion = archivo.readDouble();
//                        System.out.println("2");
//                        compositor.agregarCancion(codigoCancion, titulo, letra, duracion);
//                    }
//
//                }
//
//                for (int j = 0; j < 10; j++) {
//                    int codCantante = archivo.readInt();
//                    System.out.println("33");
//                    if (codCantante != 0) {
//                        String nombreCantante = archivo.readUTF();
//                        String apellidoCantante = archivo.readUTF();
//                        int edadCantante = archivo.readInt();
//                        String nacionalidadCantante = archivo.readUTF();
//                        double salarioCantante = archivo.readDouble();
//                        String nombreArtistico = archivo.readUTF();
//                        String genero = archivo.readUTF();
//                        int numConciertos = archivo.readInt();
//                        int numGiras = archivo.readInt();
//                        System.out.println("3");
//                        Cantante cantante = new Cantante(nombreArtistico, genero, numConciertos, numGiras, codCantante, nombreCantante, apellidoCantante, edadCantante, nacionalidadCantante, salarioCantante);
//
//                        for (int k = 0; k < 10; k++) {
//
//                            int codigoDisco = archivo.readInt();
//                            if (codigoDisco != 0) {
//                                String nombreDisco = archivo.readUTF();
//                                int anio = archivo.readInt();
//                                System.out.println("4");
//                                cantante.agregarDisco(codigoDisco, nombreDisco, anio);
//                            }
//
//                        }
//                        compositor.agregarCliente(cantante);
//                    }
//                }
//
//                System.out.println("soso");
//                lista.add(compositor);
//
//            }
//            System.out.println("nono");
//            return lista;
//        } catch (IOException e) {
//            System.out.println(e);
//            return null;
//        }
//
//    }
//
//    //
//    //
//    //
//    //
//    //
//    //
//    @Override
//    public Compositor buscarPorCancion(String valor) {
//        //Se recorre la lista de personas con el forEach
//        for (Compositor compositor : listaCompositores) {
//            //Se pregunta si la persona es de tipo Compositor
//
//            //se recorre la lista de cancionesTop100Bilboard
//            for (Cancion cancion : compositor.listarCanciones()) {
//                //Se pregunta si el titulo es igual al que se ingreso como parametro
//                if (cancion.getTitulo().equals(valor)) {
//                    //Se retorna el compositor y se imprime el nombre y el apellido del compositor
//                    System.out.println(compositor.getNombre() + " " + compositor.getApellido());
//                    return compositor;
//                }
//
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void createCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
//        try {
//            archivo.seek(0);
//            if (compositor.getNumeroDeComposiciones() == 10) {
//                return;
//            }
//            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
//                archivo.seek(i);
//                if (archivo.readInt() == compositor.getCodigo()) {
//                    archivo.seek(i + 92 + (compositor.getNumeroDeComposiciones() * 81));
//                    archivo.writeInt(codigo);
//                    archivo.writeUTF(this.rellenoCadena(titulo, 15));
//                    archivo.writeUTF(this.rellenoCadena(letra, 50));
//                    archivo.writeDouble(tiempoEnMinutos);
//                }
//            }
//        } catch (IOException e) {
//
//        }
//    }
//
//    @Override
//    public Cancion readCancion(Compositor compositor, int codigo) {
//        try {
//            archivo.seek(0);
//
//            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
//                archivo.seek(i);
//                if (archivo.readInt() == compositor.getCodigo()) {
//                    for (int j = 0; j < 10; j++) {
//
//                        archivo.seek(i + 92 + (j * 81));
//                        if (archivo.readInt() == codigo) {
//                            archivo.seek(i + 92 + (j * 81));
//                            int codigoC = archivo.readInt();
//                            String titulo = archivo.readUTF();
//                            String letra = archivo.readUTF();
//                            double duracion = archivo.readDouble();
//                            return new Cancion(codigoC, titulo, letra, duracion);
//                        }
//                    }
//                }
//            }
//            return null;
//        } catch (IOException e) {
//            return null;
//        }
//    }
//
//    @Override
//    public void updateCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
//        try {
//            archivo.seek(0);
//
//            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
//                archivo.seek(i);
//                if (archivo.readInt() == compositor.getCodigo()) {
//                    for (int j = 0; j < 10; j++) {
//
//                        archivo.seek(i + 92 + (j * 81));
//                        if (archivo.readInt() == codigo) {
//                            archivo.seek(i + 92 + (j * 81));
//                            archivo.writeInt(codigo);
//                            archivo.writeUTF(this.rellenoCadena(titulo, 15));
//                            archivo.writeUTF(this.rellenoCadena(letra, 50));
//                            archivo.writeDouble(tiempoEnMinutos);
//                            return;
//                        }
//                    }
//                }
//            }
//
//        } catch (IOException e) {
//
//        }
//    }
//
//    @Override
//    public void deleteCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
//        try {
//            archivo.seek(0);
//
//            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
//                archivo.seek(i);
//                if (archivo.readInt() == compositor.getCodigo()) {
//                    for (int j = 0; j < 10; j++) {
//
//                        archivo.seek(i + 92 + (j * 81));
//                        if (archivo.readInt() == codigo) {
//                            archivo.seek(i + 92 + (j * 81));
//                            archivo.writeInt(0);
//                            archivo.writeUTF(this.rellenoCadena("", 15));
//                            archivo.writeUTF(this.rellenoCadena("", 50));
//                            archivo.writeDouble(0);
//                            return;
//                        }
//                    }
//                }
//            }
//
//        } catch (IOException e) {
//
//        }
//    }
//
//    @Override
//    public List<Cancion> findAllCanciones(Compositor compositor) {
//        try {
//            List<Cancion> lista = new ArrayList<>();
//            archivo.seek(0);
//
//            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
//                archivo.seek(i);
//                if (archivo.readInt() == compositor.getCodigo()) {
//                    for (int j = 0; j < 10; j++) {
//
//                        archivo.seek(i + 92 + (j * 81));
//                        int codigoC = archivo.readInt();
//                        if (codigoC != 0) {
//                            String titulo = archivo.readUTF();
//                            String letra = archivo.readUTF();
//                            double duracion = archivo.readDouble();
//                            lista.add(new Cancion(codigoC, titulo, letra, duracion));
//                        }
//                    }
//                }
//            }
//            return lista;
//
//        } catch (IOException e) {
//            return null;
//        }
//    }
//
//    @Override
//    public void createCliente(Compositor compositor, Cantante cantante) {
//        try {
//            archivo.seek(0);
//            if (compositor.getNumeroDeClientes() == 10) {
//                return;
//            }
//            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
//                archivo.seek(i);
//                if (archivo.readInt() == compositor.getCodigo()) {
//                    archivo.seek(i + 902 + (compositor.getNumeroDeClientes() * 399));
//                    archivo.writeInt(cantante.getCodigo());
//
//                    archivo.writeUTF(this.rellenoCadena(cantante.getNombre(), 25));
//                    archivo.writeUTF(this.rellenoCadena(cantante.getApellido(), 25));
//                    archivo.writeInt(cantante.getEdad());
//
//                    archivo.writeUTF(this.rellenoCadena(cantante.getNacionalidad(), 20));
//
//                    archivo.writeDouble(cantante.getSalario());
//
//                    archivo.writeUTF(this.rellenoCadena(cantante.getNombreArtistico(), 25));
//
//                    archivo.writeUTF(this.rellenoCadena(cantante.getGeneroMusical(), 20));
//
//                    archivo.writeInt(cantante.getNumeroDeConciertos());
//
//                    archivo.writeInt(cantante.getNumeroDeGiras());
//                    //149
//                    if (cantante.listarDiscos() != null) {
//                        for (Disco disco : cantante.listarDiscos()) {
//                            archivo.writeInt(disco.getCodigo());
//                            archivo.writeUTF(this.rellenoCadena(disco.getNombre(), 15));
//                            archivo.writeInt(disco.getAnioDeLanzamiento());
//                        }
//                    } else {
//                        for (int j = 0; j < 10; j++) {
//                            archivo.writeInt(0);
//                            archivo.writeUTF(this.rellenoCadena("", 15));
//                            archivo.writeInt(0);
//                        }
//                    }
//                }
//            }
//        } catch (IOException e) {
//
//        }
//    }
//
//    @Override
//    public Cantante readCliente(Compositor compositor, int codigo) {
//        try {
//            archivo.seek(0);
//
//            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
//                archivo.seek(i);
//                if (archivo.readInt() == compositor.getCodigo()) {
//                    for (int j = 0; j < 10; j++) {
//
//                        archivo.seek(i + 902 + (j * 399));
//                        if (archivo.readInt() == codigo) {
//                            archivo.seek(i + 902 + (j * 399));
//                            int cod = archivo.readInt();
//                            String nombre = archivo.readUTF();
//                            String apellido = archivo.readUTF();
//                            int edad = archivo.readInt();
//                            String nacionalidad = archivo.readUTF();
//                            double salario = archivo.readDouble();
//                            String nombreArtistico = archivo.readUTF();
//                            String genero = archivo.readUTF();
//                            int numConciertos = archivo.readInt();
//                            int numGiras = archivo.readInt();
//                            Cantante cantante = new Cantante(nombreArtistico, genero, numConciertos, numGiras, cod, nombre, apellido, edad, nacionalidad, salario);
//
//                            for (int k = 0; k < 10; k++) {
//
//                                int codigoDisco = archivo.readInt();
//                                if (codigoDisco != 0) {
//                                    String nombreDisco = archivo.readUTF();
//                                    int anio = archivo.readInt();
//                                    cantante.agregarDisco(codigoDisco, nombreDisco, anio);
//                                }
//
//                            }
//                            return cantante;
//                        }
//                    }
//
//                }
//            }
//            return null;
//        } catch (IOException e) {
//            return null;
//        }
//    }
//
//    @Override
//    public void updateCliente(Compositor compositor, Cantante anterior, Cantante nuevo) {
//        try {
//            archivo.seek(0);
//
//            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
//                archivo.seek(i);
//                if (archivo.readInt() == compositor.getCodigo()) {
//                    for (int j = 0; j < 10; j++) {
//
//                        archivo.seek(i + 902 + (j * 399));
//                        if (archivo.readInt() == anterior.getCodigo()) {
//                            archivo.seek(i + 902 + (j * 399));
//                            archivo.writeInt(nuevo.getCodigo());
//
//                            archivo.writeUTF(this.rellenoCadena(nuevo.getNombre(), 25));
//                            archivo.writeUTF(this.rellenoCadena(nuevo.getApellido(), 25));
//                            archivo.writeInt(nuevo.getEdad());
//
//                            archivo.writeUTF(this.rellenoCadena(nuevo.getNacionalidad(), 20));
//
//                            archivo.writeDouble(nuevo.getSalario());
//
//                            archivo.writeUTF(this.rellenoCadena(nuevo.getNombreArtistico(), 25));
//
//                            archivo.writeUTF(this.rellenoCadena(nuevo.getGeneroMusical(), 20));
//
//                            archivo.writeInt(nuevo.getNumeroDeConciertos());
//
//                            archivo.writeInt(nuevo.getNumeroDeGiras());
//                            //149
//                            if (nuevo.listarDiscos() != null) {
//                                for (Disco disco : nuevo.listarDiscos()) {
//                                    archivo.writeInt(disco.getCodigo());
//                                    archivo.writeUTF(this.rellenoCadena(disco.getNombre(), 15));
//                                    archivo.writeInt(disco.getAnioDeLanzamiento());
//                                }
//                            } else {
//                                for (int k = 0; k < 10; k++) {
//                                    archivo.writeInt(0);
//                                    archivo.writeUTF(this.rellenoCadena("", 15));
//                                    archivo.writeInt(0);
//                                }
//                            }
//
//                        }
//                    }
//
//                }
//            }
//        } catch (IOException e) {
//        }
//    }
//
//    @Override
//    public void deleteCliente(Compositor compositor, Cantante cantante) {
//        try {
//            archivo.seek(0);
//
//            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
//                archivo.seek(i);
//                if (archivo.readInt() == compositor.getCodigo()) {
//                    for (int j = 0; j < 10; j++) {
//
//                        archivo.seek(i + 902 + (j * 399));
//                        if (archivo.readInt() == cantante.getCodigo()) {
//                            archivo.seek(i + 902 + (j * 399));
//                            archivo.writeInt(0);
//
//                            archivo.writeUTF(this.rellenoCadena("", 25));
//                            archivo.writeUTF(this.rellenoCadena("", 25));
//                            archivo.writeInt(0);
//
//                            archivo.writeUTF(this.rellenoCadena("", 20));
//
//                            archivo.writeDouble(0);
//
//                            archivo.writeUTF(this.rellenoCadena("", 25));
//
//                            archivo.writeUTF(this.rellenoCadena("", 20));
//
//                            archivo.writeInt(0);
//
//                            archivo.writeInt(0);
//                            //149
//
//                            for (int k = 0; k < 10; k++) {
//                                archivo.writeInt(0);
//                                archivo.writeUTF(this.rellenoCadena("", 15));
//                                archivo.writeInt(0);
//                            }
//
//                        }
//                    }
//
//                }
//            }
//        } catch (IOException e) {
//        }
//    }
//
//    @Override
//    public List<Cantante> findAllClientes(Compositor compositor) {
//        try {
//            List<Cantante> lista = new ArrayList<>();
//            archivo.seek(0);
//
//            for (int i = 0; i < this.tamañoArchivo(); i += 4892) {
//                archivo.seek(i);
//                if (archivo.readInt() == compositor.getCodigo()) {
//                    for (int j = 0; j < 10; j++) {
//
//                        archivo.seek(i + 902 + (j * 399));
//                        int cod = archivo.readInt();
//                        String nombre = archivo.readUTF();
//                        String apellido = archivo.readUTF();
//                        int edad = archivo.readInt();
//                        String nacionalidad = archivo.readUTF();
//                        double salario = archivo.readDouble();
//                        String nombreArtistico = archivo.readUTF();
//                        String genero = archivo.readUTF();
//                        int numConciertos = archivo.readInt();
//                        int numGiras = archivo.readInt();
//                        Cantante cantante = new Cantante(nombreArtistico, genero, numConciertos, numGiras, cod, nombre, apellido, edad, nacionalidad, salario);
//
//                        for (int k = 0; k < 10; k++) {
//
//                            int codigoDisco = archivo.readInt();
//                            if (codigoDisco != 0) {
//                                String nombreDisco = archivo.readUTF();
//                                int anio = archivo.readInt();
//                                cantante.agregarDisco(codigoDisco, nombreDisco, anio);
//                            }
//
//                        }
//                        lista.add(cantante);
//
//                    }
//
//                }
//            }
//            return lista;
//        } catch (IOException e) {
//            return null;
//        }
//    }
@Override
    public void create(Compositor obj) {
        try{
            archivo.seek(archivo.length());
            
            //codigo 4 byte pos 0
            archivo.writeInt(obj.getCodigo());
            
            //nombre 27 byte pos 4
            archivo.writeUTF(this.rellenoCadena(obj.getNombre(), 25));
            
            //apeliido 27 byte pos 31
            archivo.writeUTF(this.rellenoCadena(obj.getApellido(), 25));
            
            //edad 4 bity pos 58
            archivo.writeInt(obj.getEdad());
            
            //salario 8 byte pos 62
            archivo.writeDouble(obj.getSalario());

            //nacionalidada 22 byte pos 70
            archivo.writeUTF(this.rellenoCadena(obj.getNacionalidad(), 20));
            
            //numero de composiciones 4 byte pos 92            
            archivo.writeInt(obj.getNumeroDeComposiciones());
            
            //peso del compositor sin agregaciones 96

            //composicion de la lista cancion (4 , 20, 50, 8) 82 10 max => 820 || pos 96
            archivo.writeUTF(this.rellenoCadena("", 818));
            
            //agregacion de cantante, 498 10 max => 4980 pos 916
            archivo.writeUTF(this.rellenoCadena("", 4978));
            
            //peso final del compositor 5896
            
        }catch(IOException iOException){
            
        }
    }

    @Override
    public Compositor read(int codigo) {
        long cont = 0;
        while (cont < this.tamañoArchivo()) {
            try {
                archivo.seek(cont);

                int codigoLista = archivo.readInt();
                if (codigoLista == codigo) {
                    
                    String nombre = archivo.readUTF().trim();

                    String apellido = archivo.readUTF().trim();

                    int edad = archivo.readInt();

                    double salario = archivo.readDouble();

                    String nacionalidad = archivo.readUTF().trim();
                    int numeroComposiciones = archivo.readInt();
                    
                    //numero de sensillos se calcula en base de la lista
                    Compositor compositor = new Compositor(numeroComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);
                    long conDisco = cont + 96;

                    while (conDisco < (cont + 916)) {
                        try {
                            archivo.seek(conDisco);
                            int codigoDisco = archivo.readInt();
                            String tirulo = archivo.readUTF();
                            String letra = archivo.readUTF();
                            double duracionEnMinutos = archivo.readDouble();
                            compositor.agregarCancion(codigoDisco, tirulo, letra, duracionEnMinutos);
                        } catch (IOException iOException) {
                        }finally{
                            conDisco += 82;
                        }
                    }
                    
                    long conCliente = (cont + 916);
                    while (conCliente < (cont + 5896)) {
                        try {
                            archivo.seek(conCliente);
                            
                            int codigoCliente = archivo.readInt();
                            
                            String nombreCliente = archivo.readUTF().trim();

                            String apellidoCliente = archivo.readUTF().trim();

                            int edadCliente = archivo.readInt();

                            double salarioCliente = archivo.readDouble();

                            String nacionalidadCliiente = archivo.readUTF();

                            String nombreArtistico = archivo.readUTF().trim();

                            String generoMusical =archivo.readUTF().trim();

                            int numeroDeConciertos = archivo.readInt();

                            int numeroDeGiras = archivo.readInt();
                            
                            compositor.agregarCliente(new Cantante(nombreArtistico, generoMusical, numeroDeConciertos, numeroDeGiras, codigoCliente, nombreCliente, apellidoCliente, edadCliente, nacionalidadCliiente, salarioCliente));
                        
                        } catch (IOException iOException) {
                        }finally{
                            conCliente += 498;
                        }
                    }
                    
                    return compositor;
                            
                }
            } catch (IOException iOException) {
                
            }
            finally{
                cont += 5896;
            }
        }

        return null;
    }

    @Override
    public void update(Compositor obj) {
        long cont = 0;
        while (cont < this.tamañoArchivo()) {
            try {
                archivo.seek(cont);

                int codigoLista = archivo.readInt();
                if (codigoLista == obj.getCodigo()) {

                    //nombre 27 byte pos 4
                    archivo.writeUTF(this.rellenoCadena(obj.getNombre(), 25));

                    //apeliido 27 byte pos 31
                    archivo.writeUTF(this.rellenoCadena(obj.getApellido(), 25));

                    //edad 4 bity pos 58
                    archivo.writeInt(obj.getEdad());

                    //salario 8 byte pos 62
                    archivo.writeDouble(obj.getSalario());

                    //nacionalidada 22 byte pos 70
                    archivo.writeUTF(this.rellenoCadena(obj.getNacionalidad(), 20));

                    //numero de composiciones 4 byte pos 92            
                    archivo.writeInt(obj.getNumeroDeComposiciones());
                    return;
                    
                }
            } catch (IOException iOException) {
            } finally {
                cont += 5896;
            }
        }
    }

    @Override
    public void delete(Compositor obj) {
        long cont = 0;
        while (cont < this.tamañoArchivo()) {
            try {
                listaCompositorRAF.seek(cont);

                int codigoLista = listaCompositorRAF.readInt();
                if (codigoLista == obj.getCodigo()) {
                    listaCompositorRAF.seek(cont);
                    listaCompositorRAF.writeUTF(this.rellenarBite("", 5894));
                    return;
                }
            } catch (IOException iOException) {

            } finally {
                cont += 5896;
            }
        }
    }

    @Override
    public List<Compositor> findAll() {
        List<Compositor> listaCompositorFindAll = new ArrayList<>();
        long cont = 0;
        
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);

                int codigo = listaCompositorRAF.readInt();

                String nombre = listaCompositorRAF.readUTF().trim();

                String apellido = listaCompositorRAF.readUTF().trim();

                int edad = listaCompositorRAF.readInt();

                double salario = listaCompositorRAF.readDouble();

                Nacionalidad nacionalidad = Nacionalidad.valueOf((listaCompositorRAF.readUTF().replaceAll("\\s", "")));
                
                int numeroDeComposiciones = listaCompositorRAF.readInt();
                
                //falta el while de canciones
                
                //falta el while de compositores
                
                listaCompositorFindAll.add(new Compositor(numeroDeComposiciones, codigo, nombre, apellido, edad, salario, nacionalidad));
                
                
            } catch (IOException iOException) {}
              catch (Exception exception) {
            } finally {
                cont += 5896;
            }
        }

        return listaCompositorFindAll;
    }
    
    @Override
    public void createCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        long cont = 0;
        while (cont < this.length()) {
             try {
                 listaCompositorRAF.seek(cont);

                 if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                     
                     if (compositor.sizeCancionesTop100Billaboar() == 10) {
                         return;
                     }

                     long posicionCancion = cont + 96 + (compositor.sizeCancionesTop100Billaboar() * 82);
                     listaCompositorRAF.seek(posicionCancion);

                     // Código del disco (4 bytes) en posición 96
                     listaCompositorRAF.writeInt(codigo);

                     // titulo de la cancion (20 bytes) en posición 100
                     listaCompositorRAF.writeUTF(rellenarBite(titulo, 18));
                     
                     //letra de la cancion (50 bytes) posicion 120
                     listaCompositorRAF.writeUTF(rellenarBite(letra, 48));

                     // tiempo en minutos (8  bytes) poscicion 170
                     listaCompositorRAF.writeDouble(tiempoEnMinutos);
                     
                     return;
                 }
             } catch (IOException iOException) {

             } finally {
                 cont += 5896;
             }
         }
    }

    @Override
    public Cancion readCancion(Compositor compositor, int codigo) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);
                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conDisco = cont + 96;

                    while (conDisco < (cont + 916)) {

                        try {
                            listaCompositorRAF.seek(conDisco);
                            int codigoDis = listaCompositorRAF.readInt();
                            
                            if (codigoDis == codigo) {
                                String titulo = listaCompositorRAF.readUTF();
                                
                                String letra = listaCompositorRAF.readUTF();
                                
                                double tiempoEnMinutos = listaCompositorRAF.readDouble();
                                return new Cancion(codigoDis, titulo, letra, tiempoEnMinutos);
                            }
                        } catch (IOException iOException) {
                        } finally {
                            conDisco += 82;
                        }

                    }
                }
            } catch (IOException iOException) {

            } finally {
                cont += 5896;
            }
        }
        return null;
    }

    @Override
    public void updateCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);
                
                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conDisco = cont + 96;

                    while (conDisco < (cont + 916)) {

                        try {
                            listaCompositorRAF.seek(conDisco);
                            int codigoDis = listaCompositorRAF.readInt();

                            if (codigoDis == codigo) {
                                
                                listaCompositorRAF.writeUTF(rellenarBite(titulo, 18));

                                //letra de la cancion (50 bytes) posicion 120
                                listaCompositorRAF.writeUTF(rellenarBite(letra, 48));

                                // tiempo en minutos (8  bytes) poscicion 170
                                listaCompositorRAF.writeDouble(tiempoEnMinutos);
                            }
                        } catch (IOException iOException) {
                        } finally {
                            conDisco += 82;
                        }

                    }
                }
            } catch (IOException iOException) {

            } finally {
                cont += 5896;
            }
        }
    }

    @Override
    public void deleteCancion(Compositor compositor, int codigo) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);

                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conDisco = cont + 96;

                    while (conDisco < (cont + 916)) {

                        try {
                            listaCompositorRAF.seek(conDisco);
                            int codigoDos = listaCompositorRAF.readInt();
                            if (codigoDos == codigo) {
                                listaCompositorRAF.seek(conDisco);
                                listaCompositorRAF.writeUTF(this.rellenarBite("", 80));
                                return;
                            }
                        } catch (IOException iOException) {
                        } finally {
                            conDisco += 82;
                        }

                    }
                }
            } catch (IOException iOException) {

            } finally {
                cont += 5896;
            }
        }
    }

    @Override
    public List<Cancion> findAllCanciones(Compositor compositor) {
        List<Cancion> listaCancion = new ArrayList<>();

        long cont = 0;
        while (cont < this.length()) {
            try{
            listaCompositorRAF.seek(cont);

            if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                long cont2 = cont + 96;
                while (cont2 < (cont + 916)) {
                    try {
                        listaCompositorRAF.seek(cont2);
                        int codigo = listaCompositorRAF.readInt();
                        String titulo = listaCompositorRAF.readUTF();
                        String letra = listaCompositorRAF.readUTF();
                        double tiempoEnMinutos = listaCompositorRAF.readDouble();
                        listaCancion.add(new Cancion(codigo, titulo, letra, tiempoEnMinutos));
                        
                    } catch (IOException iOException) {
                    } finally {
                        cont2 += 82;
                    }
                }
                return listaCancion;
            }
            }catch(IOException iOException){}
             finally{
                cont += 5896;
            }
        }return listaCancion;
    }

    @Override
    public void createCilente(Compositor compositor, Cantante obj) {
        long cont = 0;
        while (cont < this.length()) {
             try {
                 listaCompositorRAF.seek(cont);

                 if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                     
                     if (compositor.sizeCliente() == 10) {
                         return;
                     }

                     long posicionCancion = cont + 916 + (compositor.sizeCliente() * 498);
                     
                     listaCompositorRAF.seek(posicionCancion);
                     
                     listaCompositorRAF.writeInt(obj.getCodigo());

                     listaCompositorRAF.writeUTF(this.rellenarBite(obj.getNombre(), 25));

                     listaCompositorRAF.writeUTF(this.rellenarBite(obj.getApellido(), 25));

                     listaCompositorRAF.writeInt(obj.getEdad());

                     listaCompositorRAF.writeDouble(obj.getSalario());

                     listaCompositorRAF.writeUTF(this.rellenarBite(String.valueOf(obj.getNacionalidad()), 20));

                     listaCompositorRAF.writeUTF(rellenarBite(obj.getNombreArtistico(), 25));

                     listaCompositorRAF.writeUTF(this.rellenarBite(String.valueOf(obj.getGeneroMusical()), 15));

                     listaCompositorRAF.writeInt(obj.getNumeroDeConciertos());

                     listaCompositorRAF.writeInt(obj.getNumeroDeGiras());

                     listaCompositorRAF.writeInt(obj.getNumeroDeSensillos());
                     
                     for (Disco disco : obj.listarDiscografia()) {
                         try{
                             listaCompositorRAF.writeInt(disco.getCodigo());
                             listaCompositorRAF.writeUTF(rellenarBite(disco.getNombre(), 25));
                             listaCompositorRAF.writeInt(disco.getAnioDeLanzamiento());
                         }catch(IOException iOException){}
                         
                     }
                     
                     return;
                 }
             } catch (IOException iOException) {

             } finally {
                 cont += 5896;
             }
         }
    }

    @Override
    public Cantante readCliente(Compositor compositor, int codigo) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);
                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conCliente = cont + 916;

                    while (conCliente < (cont + 5896)) {

                        try {
                            listaCompositorRAF.seek(conCliente);

                            int codigoLista = listaCompositorRAF.readInt();
                            if (codigoLista == codigo) {

                                String nombre = listaCompositorRAF.readUTF().trim();

                                String apellido = listaCompositorRAF.readUTF().trim();

                                int edad = listaCompositorRAF.readInt();

                                double salario = listaCompositorRAF.readDouble();

                                Nacionalidad nacionalidad = Nacionalidad.valueOf((listaCompositorRAF.readUTF().replaceAll("\\s", "")));

                                String nombreArtistico = listaCompositorRAF.readUTF();

                                GeneroMusical generoMusical = GeneroMusical.valueOf(listaCompositorRAF.readUTF().trim().replaceAll("\\s", ""));

                                int numeroDeConciertos = listaCompositorRAF.readInt();

                                int numeroDeGiras = listaCompositorRAF.readInt();

                                //numero de sensillos se calcula en base de la lista
                                Cantante cantante = new Cantante(nombreArtistico, generoMusical, numeroDeConciertos, numeroDeGiras, codigoLista, nombre, apellido, edad, salario, nacionalidad);
                                
                                long cont2 = conCliente + 148;
                                while (cont2 < (conCliente + 350)) {
                                    try {
                                        listaCompositorRAF.seek(cont2);
                                        int codigoDisco = listaCompositorRAF.readInt();
                                        String nombreDisco = listaCompositorRAF.readUTF().strip();
                                        int anioDeLanzamiento = listaCompositorRAF.readInt();
                                        cantante.agregarDisco(new Disco(codigoDisco, nombreDisco, anioDeLanzamiento));

                                    } catch (IOException iOException) {
                                    } finally {
                                        cont2 += 35;
                                    }
                                }
                                return cantante;
                            }

                        } catch (IOException iOException) {}
                          finally {
                            conCliente += 498;
                        }
                    }
                }
            } catch (IOException iOException) {}
              finally {
                cont += 5896;
            }
        }
        return null;
    }

    @Override
    public void updateCliente(Compositor compositor, Cantante obj) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);
                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conCliente = cont + 916;

                    while (conCliente < (cont + 5896)) {

                        try {
                            listaCompositorRAF.seek(conCliente);

                            int codigoLista = listaCompositorRAF.readInt();
                            if (codigoLista == obj.getCodigo()) {

                                listaCompositorRAF.writeUTF(this.rellenarBite(obj.getNombre(), 25));

                                listaCompositorRAF.writeUTF(this.rellenarBite(obj.getApellido(), 25));

                                listaCompositorRAF.writeInt(obj.getEdad());

                                listaCompositorRAF.writeDouble(obj.getSalario());

                                listaCompositorRAF.writeUTF(this.rellenarBite(String.valueOf(obj.getNacionalidad()), 20));

                                listaCompositorRAF.writeUTF(rellenarBite(obj.getNombreArtistico(), 25));

                                listaCompositorRAF.writeUTF(this.rellenarBite(String.valueOf(obj.getGeneroMusical()), 15));

                                listaCompositorRAF.writeInt(obj.getNumeroDeConciertos());

                                listaCompositorRAF.writeInt(obj.getNumeroDeGiras());

                                listaCompositorRAF.writeInt(obj.getNumeroDeSensillos());

                            }

                        } catch (IOException iOException) {
                            System.out.println("EXCEPCION DOS");
                        } finally {
                            conCliente += 498;
                        }

                    }
                }
            } catch (IOException iOException) {
            } finally {
                cont += 5896;
            }
        }
        
    }

    @Override
    public void deleteCliente(Compositor compositor, int codigo) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);
                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conCliente = cont + 916;

                    while (conCliente < (cont + 5896)) {

                        try {
                            listaCompositorRAF.seek(conCliente);

                            int codigoLista = listaCompositorRAF.readInt();
                            if (codigoLista == codigo) {
                                listaCompositorRAF.seek(conCliente);
                                listaCompositorRAF.writeUTF(this.rellenarBite("", 496));
                            }

                        } catch (IOException iOException) {
                        } finally {
                            conCliente += 498;
                        }

                    }
                }
            } catch (IOException iOException) {
                System.out.println("EXCEPCION UNO");
            } finally {
                cont += 5896;
            }
        }
    }

    @Override
    public List<Cantante> findAllCliente(Compositor compositor) {
        List<Cantante> listaFindAllCliente = new ArrayList<>();
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);
                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conCliente = cont + 916;

                    while (conCliente < (cont + 5896)) {

                        try {
                            listaCompositorRAF.seek(conCliente);

                            int codigoLista = listaCompositorRAF.readInt();

                            String nombre = listaCompositorRAF.readUTF().trim();

                            String apellido = listaCompositorRAF.readUTF().trim();

                            int edad = listaCompositorRAF.readInt();

                            double salario = listaCompositorRAF.readDouble();

                            Nacionalidad nacionalidad = Nacionalidad.valueOf((listaCompositorRAF.readUTF().replaceAll("\\s", "")));

                            String nombreArtistico = listaCompositorRAF.readUTF().trim();

                            GeneroMusical generoMusical = GeneroMusical.valueOf(listaCompositorRAF.readUTF().trim().replaceAll("\\s", ""));

                            int numeroDeConciertos = listaCompositorRAF.readInt();

                            int numeroDeGiras = listaCompositorRAF.readInt();
                            
                            Cantante cantante = new Cantante(nombreArtistico, generoMusical, numeroDeConciertos, numeroDeGiras, codigoLista, nombre, apellido, edad, salario, nacionalidad);
                            
                            long cont2 = conCliente + 148;
                            while (cont2 < (conCliente + 498)) {
                                try {
                                    listaCompositorRAF.seek(cont2);
                                    int codigoDisco = listaCompositorRAF.readInt();
                                    String nombreDisco = listaCompositorRAF.readUTF().strip();
                                    int anioDeLanzamiento = listaCompositorRAF.readInt();
                                    cantante.agregarDisco(new Disco(codigoDisco, nombreDisco, anioDeLanzamiento));

                                } catch (IOException iOException) {
                                } finally {
                                    cont2 += 35;
                                }
                            }
                            
                            listaFindAllCliente.add(cantante);

                        } catch (IOException iOException) {
                        } finally {
                            conCliente += 498;
                        }

                    }
                }
            } catch (IOException iOException) {
            } finally {
                cont += 5896;
            }
        }
        return listaFindAllCliente;
    }
}
