/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_11022026;

/**
 *
 * @author claudiacortes
 */
public class Docente {
    protected String Nombre;
    protected String apellido;
    protected String DNI;
    protected int numeroTalentoHumano;
    protected String carreraImparte;

    public Docente(String Nombre, String apellido, String DNI, int numeroTalentoHumano, String carreraImparte) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.numeroTalentoHumano = numeroTalentoHumano;
        this.carreraImparte = carreraImparte;
    }
    
    //Generar Boleta Pago
    
    public void generarBoletaPago(){
        //No sabemos que poner aqui.......
        System.out.println("No tenemos boleta de pago");
        
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getNumeroTalentoHumano() {
        return numeroTalentoHumano;
    }

    public void setNumeroTalentoHumano(int numeroTalentoHumano) {
        this.numeroTalentoHumano = numeroTalentoHumano;
    }

    public String getCarreraImparte() {
        return carreraImparte;
    }

    public void setCarreraImparte(String carreraImparte) {
        this.carreraImparte = carreraImparte;
    }

    @Override
    public String toString() {
        return "Docente{" + "Nombre=" + Nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", numeroTalentoHumano=" + numeroTalentoHumano + ", carreraImparte=" + carreraImparte + '}';
    }
    
    
}
