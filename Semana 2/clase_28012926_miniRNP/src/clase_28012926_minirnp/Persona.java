/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_28012926_minirnp;

/**
 *
 * @author claudiacortes
 */
public class Persona {
    // Propiedades
    private String dni;
    private String nombre;
    private char SexoBio;
    private int edad;
    
    //Constructor 
    public Persona(String dni, String nombre, char SexoBio, int edad) {    
        this.dni = dni;
        this.nombre = nombre;
        this.SexoBio = SexoBio;
        this.edad = edad;
    }

    public Persona(String dni, String nombre, char SexoBio) {
        this.dni = dni;
        this.nombre = nombre;
        this.SexoBio = SexoBio;
    }
    
    

    // Metodos
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexoBio() {
        return SexoBio;
    }

    public void setSexoBio(char SexoBio) {
        this.SexoBio = SexoBio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", SexoBio=" + SexoBio + ", edad=" + edad + '}';
    }
    
}
