/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_26012026;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_26012026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clases y objetos
        // TipoDeDato nombreVariable = valorInical;
        /* int numero = 1;
      
       char caracter;
       
        String cadena;
        
        //variables por referencia 
       Humano p = new Humano();
       
       Humano q = p;
       p.nombre = "Juan"; // p es un objeto, nombre es la propiedad dentro de la clase humano 
       numero = 1;
       double alturaP= p.getAltura();
      
 
       
       q.nombre = "Pedro";
        System.out.println("Por referencia ");
       System.out.println( p.nombre );
       System.out.println( q.nombre );
        System.out.println(numero);
       
       String p1 = "juan";
       String q2 = p1;
       
       p1 = "Juan";
       q2 = "Pedro";
        System.out.println("Por valor");
        System.out.println(p1);
        System.out.println(q2);
       
             

         */

 /*
       UTILIDAD DE LAS CLASES Y OBJETOS
       
       clase: para crear nuevos tipos de datos. 
       
       CLASE != OBJETO 
       
       CLASE: plano : describir los elementos que van a pertener a un objeto 
       Objeto: Casa : se rea a partir de una clase 
       Notas importantes: 
       1) Desde el momento que se crea una clase, esta vacia o no , YA ES UN TIPO DE DATO VALIDO EN JAVA
       2) el proceso para crear un objeto a partir de una clase se llama instanciacion
       
       -> Nosotros / Humanos 
       
       // descripcion-> crear una clase 
       
       // Atributos/ Propiedades 
        -cabeza
       -ojos
       -piernas
       -piel
       -sangre 
       -huesos
       -pelo 
       
       //  Metodos -> Acciones
       -hablar
       -respirar
       -moverse
       -molestar
       .......
       
       
       /*
       mivariablebonitadificildeleer
       camelCase -> miVariableBonitaDificilDeLeer
       snake_case-> mi_variable_bonita_dificil_de_leer
       PascalCase -> MiVariableBonitaDificilDeLeer
       kebab-case ->mi-variable-bonita-dificil-de-leer && no aplica en java 
       
         */
 /*
       Mini RNP
       ->  registrar una persona 
       -> registrar una defuncion 
       -> listar personas 
       -> buscar personas 
       -> eliminar personas 
       -> actualizar datos de una persona
       
       CRUD 
       
       Create
       Read
       Update
       Delete
       
         */
 
        CuentaBancaria sozaBac = new CuentaBancaria(5000, "Maria Jose");
        CuentaBancaria macheBac = new CuentaBancaria(5000, "Maria Jose", "2026");

        macheBac.realizarRetiro("2026");
        
        System.out.println(macheBac.toString());
        System.out.println(macheBac);

    }

}
