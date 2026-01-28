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
    double disponible;
    String propietario;
    private String coidgoSeguridad ;
    
    
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
    
    //accede al valor 
    public String getcoidgoSeguridad(){
        return coidgoSeguridad;
    }
    
    // actualizar 
    public void setCodigoSeguridad(String nuevoCodigo){
        coidgoSeguridad = nuevoCodigo;
    }
    

    
}
