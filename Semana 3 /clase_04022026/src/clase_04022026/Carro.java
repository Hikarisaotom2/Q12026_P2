/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_04022026;

/**
 *
 * @author claudiacortes
 */
public class Carro {
   private String tipo;
   private String color;
   private double saldo;
   private boolean pagado;
   private int x;
   private int y;
   private int id;

    public Carro() {
    }

    public Carro(String tipo, String color, double saldo, boolean pagado,int id) {
        this.tipo = tipo;
        this.color = color;
        this.saldo = saldo;
        this.pagado = pagado;
        this.x = -1;
        this.y = -1;
        this.id = id;
    }
   
   public boolean pagar(){
       if(!this.pagado&& this.saldo>0 ){
           return true;
       }else{
           return false;
       }
   }
   
   public String representacion(){
       return this.tipo.charAt(0)+"";
   }
   
   public void cambiarCoordenadasCarro(int fila, int columna){
       this.x = fila;
       this.y= columna;
   }
   
   public void retirarCarro(){
       this.x = -1;
       this.y = -1;
   }

    @Override
    public String toString() {
        
        return "Carro{" + "tipo=" + tipo + ", color=" + color + ", saldo=" + saldo + ", pagado=" + pagado + ", x=" + x + ", y=" + y + ", id=" + id + '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   

}
