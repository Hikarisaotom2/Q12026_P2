/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_17022026;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_17022026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              /*
          polimorfismo sin herencia

        3) por uso de interfaces:
        -> las interfaces NO SON CLASES
           -> todos sus metodos son abstractos.....


        */
         ArrayList<Docente> maestros = new ArrayList<Docente>();
                      
       DocentePlanta juan = new DocentePlanta (20500,"Juan","Perez","080119701234",1313,"Economia");
       DocenteHora maria = new DocenteHora(7000,4,"Maria","Garcia","080119604567",00123,"Derecho");
       DocenteJefeCarerra reynodBocanegra = new DocenteJefeCarerra(50700,1000,"Reynod","Bocanegra","0801197200123",1616,"Ing.Sistemas");
        System.out.println("Boleta pago Docente planta");
//       juan.generarBoletaPago();
//
//       
//        
//        System.out.println("\n Boleta pago Docente Hora");
//       maria.generarBoletaPago();
//       System.out.println("\n Boleta pago Docente Jefe carrera");
//       reynodBocanegra.generarBoletaPago();
    }
    
}
