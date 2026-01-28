package clase_26012026;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author claudiacortes
 */
public class Humano {
    
    //Atributos/propiedades
    // variables globales
    
    /*
    // controles de acceso
    // public y private 
    public: la informacion es de bajo peligro y cualquier parte del programa p[uede acceder a ella, 
    por defecto se utiliza esta configuracion 
    private: la informacion es delicada o sensible, no queremos compartirla con nadie mas mas que la clase misma 
    
    */
    public double altura;
    public String nombre;
    public String tipoSangre;
    private String contrasenas;
    
    //Metodos
    // constructor 
    //no se deberia utilizar la palabra static
    
    public void saludar2(){
        contrasenas = "holamundo";
        
    }
    //setters / getters 
    // metodos cuya finalidad es acceder al valor o retornar el valor de una variable 
    // el getter me regresa el valor de una v ariable, y el setter actualiza el valor de una variable 
    
    public double getAltura (){
        return altura;
    }
    
    public void setAltura(double nuevoValor){
        altura = nuevoValor;
    }
    
    
}
