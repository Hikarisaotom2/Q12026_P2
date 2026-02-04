/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_28012926_minirnp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_28012926_miniRNP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*
        CRUD 
        1 crear una persona  LISTO 
        3 listar a las personas  LISTO
        4 actualizar los datos de la persona  LISTO 
        
        2 eliminar  una persona de la lista 
        5 buscar a una persona (DNI o por nombre)
         -> metodo que retorne un booleano / o un int dependiendo de si se encontro o no una persona dentro del arreglo. 
            si se encuentra la persona indiquemos en que posicion se encuentra 
            caso contrario mostremos un mensaje diciendo que la persona no se encuentra registrada 
        */
      ArrayList <Persona> personas = new ArrayList<Persona>();
      System.out.println("CREANDO PERSONAS");
      Persona nuevaPersona = crearPersona();
      
      // crear personas 
      Persona  claudia = new Persona("0801","Claudia Cortes",'F');
      Persona  juan = new Persona("08016","Juan Perez",'M');
       personas.add(nuevaPersona);
       personas.add(claudia);
       personas.add(juan);
       
       //Listando a las peronas creadas 
       listarPersonas(personas);
       
        System.out.println("ACTUALIZANDO PERSONAS");
       //Actualizando datos de una persona 
       actualizarDatos(personas);
       
       // volviendo a listar los valores para comprobar que se actualizaron
        System.out.println("VALORES ACTUALIZADOS");
        listarPersonas(personas);
      
    }// fin del main 
    /*
    Los metodos pueden retornar y 
    recibir como parametros cualquier cosa que sea un tipo de dato valido en java
    */
    public static Persona crearPersona(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el DNI");    
        String dni = entrada.nextLine();
        System.out.println("Ingrese el nombre ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el sexo biologico ");
        char sexoBio = entrada.nextLine().charAt(0);
        
        Persona  nuevaPersona = new Persona(dni,nombre,sexoBio);
        
        return nuevaPersona;
    }// fin del metodo 
    
    public static void listarPersonas(ArrayList<Persona> personas){
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(i+") "+personas.get(i));
        }
    }// fin del metodo 
    
    public static void  actualizarDatos(ArrayList<Persona> personas){
        listarPersonas(personas);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la posciion de la persona que desea actualizar: ");
        int pos = entrada.nextInt();
        entrada.nextLine();
        
        Persona personaActualizar = personas.get(pos);
        // Comentario de mejora: implementar un submenu para actualizar datos
        // submenu -> 1. actualizar nombre, 2- > actualizar sexobio, 3 => actualizar edad 
        
        // solictando los nuevos datos 
         System.out.println("Ingrese el nombre ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el sexo biologico ");
        char sexoBio = entrada.nextLine().charAt(0);
        System.out.println("Ingrese lanueva edad de la persona ");
        int edad = entrada.nextInt();
        
        // actualizar a la persona seleccionada
        personaActualizar.setEdad(edad);
        personaActualizar.setNombre(nombre);
        personaActualizar.setSexoBio(sexoBio);
       
    }
    
    
    /*
    1) comenzar con una letra 
    2) en el cuerpo de la variable nosostros pdoemos agregar letras, numeros, simbolos 
    3) el unico simbolo permitido es el _ 
    */
    
    int 9hola = 9;
    
}// fin de la clase
