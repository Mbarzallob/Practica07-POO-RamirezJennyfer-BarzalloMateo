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

    public CantanteDAO() {
        archivo = instanciaRAF();
        listaCantantes = new ArrayList<>();

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
            archivo.writeInt(cantante.getCodigo());

            archivo.writeUTF(this.relleno(cantante.getNombre(), 25));
            archivo.writeUTF(this.relleno(cantante.getApellido(), 25));
            archivo.writeInt(cantante.getEdad());

            archivo.writeUTF(this.relleno(cantante.getNacionalidad(), 20));

            archivo.writeDouble(cantante.getSalario());

            archivo.writeUTF(this.relleno(cantante.getNombreArtistico(), 25));

            archivo.writeUTF(this.relleno(cantante.getGeneroMusical(), 20));

            archivo.writeInt(cantante.getNumeroDeConciertos());

            archivo.writeInt(cantante.getNumeroDeGiras());
            //149
            for (int i = 0; i < 10; i++) {
                archivo.writeInt(0);
                archivo.writeUTF(this.relleno("", 15));
                archivo.writeInt(0);
            }

        } catch (IOException e) {
        }
    }

    @Override
    public Cantante read(int codigo) {
        try {
            archivo.seek(0);

            for (int i = 0; i < this.tamañoArchivo(); i += 399) {
                archivo.seek(i);
                if (archivo.readInt() == codigo) {
                    archivo.seek(i);
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

                    for (int j = 0; j < 10; j++) {

                        int codigoDisco = archivo.readInt();
                        if (codigoDisco != 0) {
                            String nombreDisco = archivo.readUTF();
                            int anio = archivo.readInt();
                            cantante.agregarDisco(codigoDisco, nombreDisco, anio);
                        } else {
                            return cantante;
                        }

                    }
                    return cantante;
                }

            }
        } catch (IOException e) {
            return null;
        }
        return null;
    }

    @Override
    public void update(Cantante cantante) {
        try {
            archivo.seek(0);
            for (int i = 0; i < this.tamañoArchivo(); i += 399) {
                archivo.seek(i);
                if (archivo.readInt() == cantante.getCodigo()) {
                    archivo.seek(i);
                    archivo.writeInt(cantante.getCodigo());

                    archivo.writeUTF(this.relleno(cantante.getNombre(), 25));

                    archivo.writeUTF(this.relleno(cantante.getApellido(), 25));

                    archivo.writeInt(cantante.getEdad());

                    archivo.writeUTF(this.relleno(cantante.getNacionalidad(), 20));

                    archivo.writeDouble(cantante.getSalario());

                    archivo.writeUTF(this.relleno(cantante.getNombreArtistico(), 25));

                    archivo.writeUTF(this.relleno(cantante.getGeneroMusical(), 20));

                    archivo.writeInt(cantante.getNumeroDeConciertos());

                    archivo.writeInt(cantante.getNumeroDeGiras());
                    if (cantante.listarDiscos() != null) {
                        for (Disco disco : cantante.listarDiscos()) {
                            archivo.writeInt(disco.getCodigo());
                            archivo.writeUTF(this.relleno(disco.getNombre(), 15));
                            archivo.writeInt(disco.getAnioDeLanzamiento());
                        }
                    } else {
                        for (int j = 0; j < 10; j++) {
                            archivo.writeInt(0);
                            archivo.writeUTF(this.relleno("", 15));
                            archivo.writeInt(0);
                        }
                    }
                }
            }

        } catch (IOException e) {
        }
    }

    @Override
    public void delete(Cantante cantante) {
        try {
            archivo.seek(0);
            for (int i = 0; i < this.tamañoArchivo(); i += 399) {
                archivo.seek(i);
                if (archivo.readInt() == cantante.getCodigo()) {
                    archivo.seek(i);
                    archivo.writeInt(0);

                    archivo.writeUTF(this.relleno("", 25));

                    archivo.writeUTF(this.relleno("", 25));

                    archivo.writeInt(0);

                    archivo.writeUTF(this.relleno("", 20));

                    archivo.writeDouble(0);

                    archivo.writeUTF(this.relleno("", 25));

                    archivo.writeUTF(this.relleno("", 20));

                    archivo.writeInt(0);

                    archivo.writeInt(0);

                    for (int j = 0; j < 10; j++) {
                        archivo.writeInt(0);
                        archivo.writeUTF(this.relleno("", 15));
                        archivo.writeInt(0);
                    }

                }
            }

        } catch (IOException e) {
        }
    }

    @Override
    public List<Cantante> findAll() {
        try {
            archivo.seek(0);
            List<Cantante> lista = new ArrayList<>();
            for (int i = 0; i < this.tamañoArchivo(); i += 399) {

                archivo.seek(i);
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

                for (int j = 0; j < 10; j++) {

                    int codigoDisco = archivo.readInt();
                    if (codigoDisco != 0) {
                        String nombreDisco = archivo.readUTF();
                        int anio = archivo.readInt();
                        cantante.agregarDisco(codigoDisco, nombreDisco, anio);
                    } else {
                        break;
                    }

                }
                lista.add(cantante);

            }
            return lista;
        } catch (IOException e) {
            return null;
        }

    }

    //
//        @Override
//        public Cantante buscarPorDisco(String nombre) {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }
    //
    @Override
    public void createDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        try {
            archivo.seek(0);
            if (cantante.getNumeroDeSencillos() == 10) {
                return;
            }
            for (int i = 0; i < this.tamañoArchivo(); i += 399) {
                archivo.seek(i);
                if (archivo.readInt() == cantante.getCodigo()) {
                    archivo.seek(i + 149 + (cantante.getNumeroDeSencillos() * 25));
                    archivo.writeInt(codigo);
                    archivo.writeUTF(this.relleno(nombre, 15));
                    archivo.writeInt(anioDeLanzamiento);
                    break;
                }
            }

        } catch (IOException e) {

        }
    }

    @Override
    public Disco readDisco(Cantante cantante, int codigo) {
        try {
            archivo.seek(0);

            for (int i = 0; i < this.tamañoArchivo(); i += 399) {
                archivo.seek(i);
                if (archivo.readInt() == cantante.getCodigo()) {
                    for (int j = 0; j < 10; j++) {
                        archivo.seek(i + 149 + (j * 25));
                        if (archivo.readInt() == codigo) {
                            archivo.seek(i + 149 + (j * 25));
                            int codigon = archivo.readInt();
                            String nombre = archivo.readUTF();
                            int anio = archivo.readInt();
                            return new Disco(codigon, nombre, anio);
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
    public void updateDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        try {
            archivo.seek(0);

            for (int i = 0; i < this.tamañoArchivo(); i += 399) {
                archivo.seek(i);
                if (archivo.readInt() == cantante.getCodigo()) {
                    for (int j = 0; j < 10; j++) {
                        archivo.seek(i + 149 + (j * 25));
                        if (archivo.readInt() == codigo) {

                            archivo.writeUTF(this.relleno(nombre, 15));
                            archivo.writeInt(anioDeLanzamiento);
                            return;
                        }

                    }
                }
            }

        } catch (IOException e) {

        }
    }

    @Override
    public void deleteDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        try {
            archivo.seek(0);

            for (int i = 0; i < this.tamañoArchivo(); i += 399) {
                archivo.seek(i);
                if (archivo.readInt() == cantante.getCodigo()) {
                    for (int j = 0; j < 10; j++) {
                        archivo.seek(i + 149 + (j * 25));
                        if (archivo.readInt() == codigo) {
                            archivo.seek(i + 149 + (j * 25));
                            archivo.writeInt(0);
                            archivo.writeUTF(this.relleno("", 15));
                            archivo.writeInt(0);
                            return;
                        }
                    }
                }
            }

        } catch (IOException e) {
        }
    }

    @Override
    public List<Disco> findAllDisco(Cantante cantante) {
        try {
            List<Disco> lista = new ArrayList<>();
            archivo.seek(0);
            for (int i = 0; i < this.tamañoArchivo(); i += 399) {
                archivo.seek(i);
                if (archivo.readInt() == cantante.getCodigo()) {
                    for (int j = 0; j < 10; j++) {
                        archivo.seek(i + 149 + (j * 25));
                        int codigo = archivo.readInt();
                        if (codigo != 0) {
                            String nombre = archivo.readUTF();
                            int anio = archivo.readInt();
                            lista.add(new Disco(codigo, nombre, anio));
                        }
                    }
                }
            }
            return lista;

        } catch (IOException e) {
            return null;
        }

    }

    private List<Cantante> listaCantantes;

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

}
