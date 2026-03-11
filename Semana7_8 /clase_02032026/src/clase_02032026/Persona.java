/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_02032026;

/**
 *
 * @author claudiacortes
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String tipo;

    public Persona(String nombre, String apellido, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
    }
    
    
   public Persona(String nombre) {
        this.nombre = nombre;
    }
   
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

 

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Override
    public String toString() {
        return nombre ;
    }
    
}
