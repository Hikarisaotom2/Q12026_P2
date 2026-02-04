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
    private String dni; // valor de solo lectura 
    private String nombre;
    private char sexoBio;
    private int edad;
    
    //Constructor 
    
    public Persona(String dni, String nombre, char SexoBio, int edad) {    
        this.dni = dni;
        this.nombre = nombre;
        this.sexoBio = SexoBio;
        this.edad = edad;
    }

    public Persona(String dni, String nombre, char SexoBio) {
        this.dni = dni;
        this.nombre = nombre;
        this.sexoBio = SexoBio;
        this.edad = 0;
    }    

    // Metodos
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexoBio() {
        return sexoBio;
    }

    public void setSexoBio(char sexoBio) {
        this.sexoBio = sexoBio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return dni+"- "+nombre +"("+sexoBio+") "+ edad;
    }
    
}
