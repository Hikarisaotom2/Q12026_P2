/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_09022026;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_09022026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Una hijo se puede considerar de dos tipos de dato: 
        1) su propio tipo de dato 
        2) del tipo de dato del padre
        */
       
       /*
       CRUD DE HOSPITAL 
       -> crear pacientes 
       -> Femenino 
       -> Masculino 
       Nota: dependiendo del tipo de paciente,podemos preguntar diferentes preguntas.
       -> Ver pacientes 
          -> Todos los pacientes 
          -> Pacientes femeninos 
          -> Pacientes masculinos 
       -> Actualizar  
       Nota: eL [ROGRAMA, SOLAMENTE DEBE PREGUNTAR A QUE PACIENTE DESEA ACTUALIZAR ,
       EL PROGRAMA AUTOMATICAMENTE DEBE RECONOCER SI ESE PACIENTE ES DEL TIPO MASCULINO O FEMENINO 
       Dependiendo de eso, se mostrara un submenu distinto.
        si se detecta que el paciente es del tipo masculino, deben aparecer las opciones para actualizar las propiedades masculinas
       -> Eliminar un paciente de la lista 
       -> Busqueda de pacientes por nombre y apellido. 
         -> si se encontro: 
            mostrar datos del paciente (en ficha tecnica)
           -> sino se encontro, mostrar un mensaje de paciente no encontrado 
       
       */       
       PacienteFemenino claudia = new PacienteFemenino("Claudia","Cortes","O+",false,"Enero");
       
       
       PacienteMasculino pedro = new PacienteMasculino("Pedro","Perez","o+","Diciembre");
       
       Paciente claudiaPaciente = new PacienteFemenino("Claudia","Cortes","O+",false,"Enero");
       Paciente pedroPaciente = new PacienteMasculino("Pedro","Perez","o+","Diciembre");
       // ESTA LISTA PUEDE CONTENER 3 TIPOS DE OBJETOS: Paciente Femeninos, Pacientes Masculinos, Pacientes 
       
       ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
       
       pacientes.add(pedroPaciente);
       pacientes.add(claudiaPaciente);
       pacientes.add(claudia);
       pacientes.add(pedro);
        System.out.println("-> Lista de todos los pacientes");
       imprimirPacientes(pacientes);
        System.out.println("");
        System.out.println("->Lista de los pacientes femeninos");
        imprimirPacientesFemenino(pacientes);
        System.out.println("");
        System.out.println("->Lista de los pacientes masculinos");
        imprimirPacientesMasculinos(pacientes);
    }
    public static void actualizarDatosPaciente(ArrayList<Paciente> pacientes){
        imprimirPacientes(pacientes);
        Scanner entrada = new Scanner(System.in);
        int pos = entrada.nextInt();
        Paciente pacienteActualizar = pacientes.get(pos);
        
        if(pacienteActualizar instanceof PacienteFemenino){
            System.out.println("Es una mujer");
            // debemos recordarle al objeto, el tipo de dato con el que se instancio 
            /*
            Casteo: conversion de datos explicita
            (Tipo de dato al que queremos convertir)Variable que contiene el objeto
            */
            
            PacienteFemenino pacienteMujer = (PacienteFemenino)pacienteActualizar;
            // actualizar la informacion que sea necesaria
            pacienteMujer.setEmbarazo(true);
            
//           Ejemplo de casteo: ((PacienteFemenino) pacienteActualizar).getUltimoPeriodoMenstrual();
            
        }else if(pacienteActualizar instanceof PacienteMasculino){
            System.out.println("Es un hombre");
            
        }else{
            System.out.println("Es un paciente regular");
        }
        
    }
    public static void imprimirPacientes(ArrayList<Paciente> pacientes){
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(pacientes.get(i));
        }
        
    }// fin del metodo
    
      public static void imprimirPacientesFemenino(ArrayList<Paciente> pacientes){
        for (int i = 0; i < pacientes.size(); i++) {
         if(pacientes.get(i) instanceof PacienteFemenino){
             /* preguntando al objeto en la posicion i dentro del arreglo 
             de pacientes si es una instancia de la clase pacienteFemenino*/
             System.out.println(pacientes.get(i));
             
         }
        }
        
    }// fin del metodo 
      
     public static void imprimirPacientesMasculinos(ArrayList<Paciente> pacientes){
        for (int i = 0; i < pacientes.size(); i++) {
         if(pacientes.get(i) instanceof PacienteMasculino){
             /* preguntando al objeto en la posicion i dentro del arreglo 
             de pacientes si es una instancia de la clase pacienteFemenino*/
             System.out.println(pacientes.get(i));
         }
        }
        
    }// fin del metodo 
    
}
