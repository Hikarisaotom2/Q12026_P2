/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_17022026;

/**
 *
 * @author claudiacortes
 */
public class DocenteJefeCarerra extends Docente {
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
     
}
