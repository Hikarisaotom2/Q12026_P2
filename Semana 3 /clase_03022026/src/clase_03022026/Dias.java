/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package clase_03022026;

/**
 *
 * @author claudiacortes
 */

/*
Los enums se parecen a las clases pero NO SON CLASES.

*/


public enum Dias {
    LUNES("L", 1), 
    MARTES("M",2),
    MIERCOLES("MM",3),
    JUEVES("J",4),
    VIERNES("V",5);
    
    private  String simbolo;
    private int ordenEnSemana;


    
    private Dias(String simbolo, int ordenEnSemana){
        this.ordenEnSemana = ordenEnSemana;
        this.simbolo = simbolo;
    }
    
    public String getSimbolo(){
        return this.simbolo;
    }
   public int getOrdenSemana(){
       return this.ordenEnSemana;
   } 
    
}
