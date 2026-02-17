/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_11022026;

/**
 *
 * @author claudiacortes
 */
public class DocentePlanta extends Docente{
    private double sueldoMensual;
    
 /*
     Docente de planta 
            -> Se le paga una cantidad fija mensual
            -> se le calcula deducciones. 
                -> aportaciones al RAP (1% de su sueldo)
                -> seguro social , lps 600 
    */   

    public DocentePlanta(double sueldoMensual, String Nombre, String apellido, String DNI, int numeroTalentoHumano, String carreraImparte) {
        super(Nombre, apellido, DNI, numeroTalentoHumano, carreraImparte);
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    /*
    para aplicar polimorfismo debemos crear una nueva version del metodo, utlizando la estrctura que esta definida en el padre
    
    */
    
    @Override
    public void generarBoletaPago(){
        System.out.println("BOLETA DE PAGO");
        System.out.println("-> sueldo neto "+this.sueldoMensual);
        System.out.println("Deducciones......");
        double rap = 0.01*this.sueldoMensual;
        System.out.println("RAP lps. "+ rap);
        System.out.println("Seguro Social: lps 600");
        System.out.println("Total deducciones: "+rap+600);
        System.out.println("SUELDO TOTAL: "+ (this.sueldoMensual-600-rap));
        
    }
    
    
    @Override
    public String toString() {
        return "DocentePlanta{" + "sueldoMensual=" + sueldoMensual + '}';
    }
     
    
}
