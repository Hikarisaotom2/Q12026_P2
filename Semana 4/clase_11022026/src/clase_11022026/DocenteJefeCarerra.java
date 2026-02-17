/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_11022026;

/**
 *
 * @author claudiacortes
 */
public class DocenteJefeCarerra extends Docente{
    private double sueldoMensual;
    private double bonificacionMensual;

    public DocenteJefeCarerra(double sueldoMensual, double bonificacionMensual, String Nombre, String apellido, String DNI, int numeroTalentoHumano, String carreraImparte) {
        super(Nombre, apellido, DNI, numeroTalentoHumano, carreraImparte);
        this.sueldoMensual = sueldoMensual;
        this.bonificacionMensual = bonificacionMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public double getBonificacionMensual() {
        return bonificacionMensual;
    }

    public void setBonificacionMensual(double bonificacionMensual) {
        this.bonificacionMensual = bonificacionMensual;
    }
    
    
        @Override 
    public void generarBoletaPago(){
        System.out.println("BOLETA DE PAGO");
        System.out.println("-> sueldo neto "+this.sueldoMensual);
        System.out.println("Deducciones......");
        double rap = 0.01*this.sueldoMensual;
        System.out.println("RAP lps. "+ rap);
        double isr = 0;
        if(this.sueldoMensual>2000){
            isr = this.sueldoMensual*0.15;
        }
        
        System.out.println("Seguro Social: lps 600");
            System.out.println("ISR: lps "+isr);
        System.out.println("Total deducciones: "+rap+600+isr);
        System.out.println("SUELDO TOTAL: "+ (this.sueldoMensual-600-rap-isr));
        
    }
    
}
