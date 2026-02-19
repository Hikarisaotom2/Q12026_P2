/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_17022026;

/**
 *
 * @author claudiacortes
 */
public class DocenteHora extends Docente {
    /*
    Docente hora clase 
            -> se le paga por la cantida de clases que imparte al mes .     
                su sueldo se calcula como: sueldoClase * cantidad de clases. 
            -> No se le realizan deducciones de ningun tipo 
    */
    private double sueldoPorClase;
    private int cantidadclases;

    public DocenteHora(double sueldoPorClase, int cantidadclases, String Nombre, String apellido, String DNI, int numeroTalentoHumano, String carreraImparte) {
        super(Nombre, apellido, DNI, numeroTalentoHumano, carreraImparte);
        this.sueldoPorClase = sueldoPorClase;
        this.cantidadclases = cantidadclases;
    }

    public double getSueldoPorClase() {
        return sueldoPorClase;
    }

    public void setSueldoPorClase(double sueldoPorClase) {
        this.sueldoPorClase = sueldoPorClase;
    }

    public int getCantidadclases() {
        return cantidadclases;
    }

    public void setCantidadclases(int cantidadclases) {
        this.cantidadclases = cantidadclases;
    }
    
    @Override 
     public  void calcularBoletapago(){
         System.out.println("Metodo de pago para docente por hora");
     }
    

    
}
