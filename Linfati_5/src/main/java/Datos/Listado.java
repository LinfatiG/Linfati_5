/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gilio
 */
public class Listado {

    private ArrayList<Cancion> cancion = new ArrayList();
    Scanner teclado = new Scanner(System.in);
    
    
    /*
     Añade una nueva canción a un archivo de texto
     Al ser un método void, no retorna ningún tipo de valor
     */

    public void añadirCancion() {
        System.out.println("Inrese el nombre de la canción");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el albúm al que pertenece la canción");
        String album = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento de la canción");
        int anoLanzamiento = teclado.nextInt();
        System.out.println("Ingrese el intérprete principal de la canción");
        String interprete = teclado.nextLine();
        System.out.println("Ingrese la letra de la canción");
        String letra = teclado.nextLine();
        int codigo = generarCodigo();
        Cancion cancion = new Cancion(nombre, album, anoLanzamiento, letra, interprete, codigo);
        cancion.add(cancion);

    }

    /*
    Genera un código de valor incremental para cada canción basado en el largo del arraylist
    @return codigo con el valor incremental de cada canción según el largo del arraylsit
     */
    public int generarCodigo() {
        int codigo = cancion.size() + 1;
        return codigo;
    }
    /*
     Quita una canción del arraylist
     */
    public void quitarCancion() {
        System.out.println("Ingrese el código de la canción que desea eliminar");
        int borrar = val();
        cancion.remove(borrar);
        
    }
    
    /*
    Método que valida que solo se igresen caracteres numéricos
     */
            
    public int val() {
        int num = 0;
        boolean error;

        do {

            try {
                error = false;
                Scanner teclado = new Scanner(System.in);
                num = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El caracter ingresado no es numerico, intente de nuevo");
                error = true;
            }

        } while (error);

        return num;
    }
}
