/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_04022026;

/**
 *
 * @author claudiacortes
 */
 /*
        Objetos compuestos: Son objetos donde como minimo uno de sus atributos/ propiedades es un objeto  
*/

public class Estacionamiento {
    private Carro [][] estacionamiento;
    

    public Estacionamiento() {
    }
   
    public Estacionamiento(int tamano) {
     estacionamiento = new Carro[tamano][tamano];
    }
    
    public void imprimirEstacionamiento(){
        for (int i = 0; i < this.estacionamiento.length; i++) {
            for (int j = 0; j < this.estacionamiento.length; j++) {
                if(this.estacionamiento[i][j]==null){
                    System.out.print(" - ");
                }else{
                    System.out.print(" "+this.estacionamiento[i][j].representacion()+" ");
                }
                
            }
            System.out.println("");
        }
    }
    
    public int getTamanoParqueo(){
        return this.estacionamiento.length;
    }
    
    public boolean puedeEstacionarse(int x, int y){
        // este metodo me va a ayudar a saber si una posicion esta disponible o no
        if(estacionamiento[x][y] == null){
            System.out.println("La posicion esta vacia, se puede estacionar");
            return true;
        }else{
            System.out.println("La psoicion esta ocupada");
            return false;
        }
    }
    
    public void agregarCarro(Carro estacionar){
        int x = estacionar.getX();
        int y = estacionar.getY();
        this.estacionamiento[x][y] = estacionar;
    }
    
    public void sacarCarro(){
        
    }
     
}
