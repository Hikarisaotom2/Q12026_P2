/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_09022026;

/**
 *
 * @author claudiacortes
 */

/*
La configuracion de la herencia, siempre se hace de lado del hijo 
*/
public class PacienteFemenino extends Paciente{
    boolean embarazo;
    String ultimoPeriodoMenstrual;
    
    PacienteFemenino(String nombre, String apellido, String tipoSangre, boolean embarazo, String ultimoPeriodoMenstrual){
        // llamando al constructor del padre, para que inicialize las propiedades o atributos 
        // No se crea un objeto nuevo del tipo del padre. 
        super(nombre,apellido,tipoSangre);
        this.embarazo = embarazo;
        this.ultimoPeriodoMenstrual = ultimoPeriodoMenstrual;  
    }
    

    public boolean isEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(boolean embarazo) {
        this.embarazo = embarazo;
    }

    public String getUltimoPeriodoMenstrual() {
        return ultimoPeriodoMenstrual;
    }

    public void setUltimoPeriodoMenstrual(String ultimoPeriodoMenstrual) {
        this.ultimoPeriodoMenstrual = ultimoPeriodoMenstrual;
    }

    @Override
    public String toString() {
        return "PacienteFemenino{ Nombre "+super.nombre+ "embarazo=" + embarazo + ", ultimoPeriodoMenstrual=" + ultimoPeriodoMenstrual + '}';
    }
    
    
    
}
