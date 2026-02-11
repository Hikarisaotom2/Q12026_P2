/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_09022026;

/**
 *
 * @author claudiacortes
 */
public class Paciente {
    
    /*
    public: cualquiera puede acceder a esta propiedad 
    private: solamente la clase puede acceder a esa informacion 
    protected: solamente la clase y sus hijos puede acceder a la informacion 
    */
     protected  String nombre; 
     protected String apellido;
     protected String tipoSangre;

    public Paciente(String nombre, String apellido, String tipoSangre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoSangre = tipoSangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", apellido=" + apellido + ", tipoSangre=" + tipoSangre + '}';
    }
    
}
