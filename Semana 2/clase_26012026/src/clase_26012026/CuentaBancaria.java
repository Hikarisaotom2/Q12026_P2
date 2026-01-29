/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_26012026;

/**
 *
 * @author claudiacortes
 */
public class CuentaBancaria {
    public double disponible;
    public String propietario;
    private String coidgoSeguridad ;
    
    
    /*Constructor
    es un metodo comun y corriente
    nos ayuda a dar valores inciiales al momento de la instanciacion
    
    ** el constructor que no asigna valores inciiales se llama constructor vacio, por defecto es el constructor que nos ofrece java
    notas importantes: 
    1) SIEMPRE el constructor se llama igual que la clase 
    2) al constructor no se le debe poner tipo de retorno 
    */
    CuentaBancaria(double disponible, String propietario,String coidgoSeguridad){
        //le damos un valor inicial a las propiedades. 
       this.disponible = disponible;
       this.propietario = propietario;
       this.coidgoSeguridad = coidgoSeguridad;
    }
    
    CuentaBancaria(double disponible, String propietario){
        //le damos un valor inicial a las propiedades. 
       this.disponible = disponible;
       this.propietario = propietario;
    }
    
    
    public void realizarRetiro(String codigoIngresado){
        if (coidgoSeguridad.equals(codigoIngresado)){
            System.out.println("Se puede realizar el retiro"); 
        }else{
            System.out.println("Pin incorrecto");
        }
    }
    
    //controles para variables 
        /*
    
    Valores de solo lectura : es una variable a la que le podemos ver el valor, pero no modificarla , solo tienen getters
    valores de solo escritura : es una variable a la que no le podemos ver el valor pero la podemos modificar , solo tienen setters
    Valores ocultos : no se puede leer ni actualizar , no tienen ni setters ni getters
    */
    
    //PINES DE SEGURIDAD
    
    //accede al valor 
//    public String getcoidgoSeguridad(){
//        return coidgoSeguridad;
//    }
//    
//    // actualizar 
//    public void setCodigoSeguridad(String nuevoCodigo){
//        coidgoSeguridad = nuevoCodigo;
//    }
//
    
// Sobrecarga de metodos. 
    
    void holaMundo(int numero, String valor){ 
        for (int i = 0; i < 10; i++) {
            
        }
    }
    
    void holaMundo(String edad, int valor ){
        System.out.println("");
    }

    @Override
    public String toString() {
        return propietario+" - ( lps. " + disponible+")" ;
    }
    
    
    
}
