/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_03022026;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_03022026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        1 ENUMS (tipos de dato de enumeracion)
        2) Extra: manejo de excepciones (try-catch) 
        3) Objetos Compuestos 
         */

 /*
       ENUMS
       
       son un tipo de dato que nos ayuda a crear enumarcaiones o conjuntos de datos finitos 
       
       12 ->
       7 -> 
         habiles -> Lunes-viernes
         libre - > Sabados y Domingos 
       
       Carreras Unitec -> 
       Ingenierias sistemas 
       IA
       Industrial
       energia
       meca
       Biomedica
       ....
       
       Sexo Bio 
       H
       M
       N/A 

         */
          try{
           Scanner entrada = new Scanner(System.in);
            System.out.println("Hola ingrese numeros, no letras");
            int numero = entrada.nextInt();
            }catch(Exception e){
                System.out.println("Ingrese sol numeros, ");
            }
          
        try {
       
            Dias dia = Dias.VIERNES;
//               Dias diaValidar = Dias.valueOf("Miercoles");
            Dias diaValidar = Dias.valueOf("Miercoles".toUpperCase());
            System.out.println(diaValidar);
            System.out.println(dia);
            System.out.println(dia.getSimbolo());
            System.out.println(dia.getOrdenSemana());
        } catch (Exception error) {
            System.out.println("algo salio mal, intentenlo de nuevo....");
            //            System.out.println(error);

        } finally {
            // se ejecuta luego del try o del catch 
            System.out.println("Esto es el finally");
        }
        System.out.println("Hola este es un log fuera del try catch ");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        

    }

}
