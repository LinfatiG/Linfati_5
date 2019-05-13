/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import GestorArchivo.Gestor;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gilio
 */
public class Menu {

    public void salirMenu() {
        System.out.println("Ha decidodo cerrar el programa");
        System.exit(0);
    }

    public void menu() throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione la opcion a realizar.");
        System.out.println();
        System.out.println("1.- Mostrar canción.");
        System.out.println("2.- Añadir canción.");
        System.out.println("3.- Quitar canción.");

        int opcn = val();
        seleccion(opcn);
    }

    public void seleccion(int opcn) throws IOException {
        Gestor g = new Gestor();
        Listado l = new Listado();

        switch (opcn) {

            case 1:
                g.leerArchivo();
                menu();
                break;

            case 2:
                l.añadirCancion();
                menu();
                break;

            case 3:
                l.quitarCancion();
                break;

            case 4:
                salirMenu();

            default:
                menu();
                break;
        }

    }

    public int val() { // Valida que se ingresen caracteres numericos
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
