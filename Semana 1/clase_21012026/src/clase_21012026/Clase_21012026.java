/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_21012026;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_21012026 {

    /**
     * @param args the command line arguments
     */
    /*
    1) en la primera fila al centro al un +
    2) en la ultima fila en el centro hay un * 
    3) fila 1, son espacio 
    4) en la fila 2, solamente hay asteriscos 
    5) en la fila 12, se dibuja una linea completa 
    6) los asteriscos comienzan a dibujarse en la columna 1, a partir de la 4 fila 
    7) los + comienzan a dibujarse en la columna 5 y van restandose 

    Nota: los asteriscos comienzan en la columan 1, y la antepenultima pos, la diagonal izq aumenta la columna, la diagonal derecha, resta la columna \
    Nota: los + comeinzan a dibujarse en la mitad +2 y la mitad -2
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamano: ");
        int tamano = entrada.nextInt();
        int centro = tamano / 2;
        int diagionalIzquierdaStar = 1;
        int diagionalDerechaStar = tamano - 2;

        for (int i = 0; i < tamano; i++) { // filas , i me indica en que fila estoy 
            for (int j = 0; j < tamano; j++) { // columnas , j me indica en que columna estoy 
                //primera fila 
                if (i == 0 && j == centro) {
                    System.out.print("+");
                } else if (i == 0) {
                    System.out.print(" ");
                }

                // ultima fila 
                if (i == tamano - 1 && j == centro) {
                    System.out.print("*");
                } else if (i == tamano - 1) {
                    System.out.print(" ");
                }

                // primera linea 
                if (i == 1) {
                    System.out.print("*");
                }

                // antepenultima linea 
                if (i == tamano - 2) {
                    System.out.print("+");
                }

                if (i >= 2 && i <= tamano - 3) {
                    //diagonal de *
                    if (j == diagionalIzquierdaStar) {
                        System.out.print("*");

                    }else if (j == diagionalDerechaStar) {  // diagonal de + 
                        System.out.print("+");
                    }else{
                        System.out.print(" ");
                    }
                }

            }// fin del for columnas
            System.out.println("");
            diagionalIzquierdaStar++;
            diagionalDerechaStar--;

        }// fin del for filas 
    }

}
