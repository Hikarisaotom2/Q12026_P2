/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_22012026;

/**
 *
 * @author claudiacortes
 */
public class Clase_22012026 {

    /**
     * @param args the command line arguments
     */
        /*
        recorrer un array 
        
        crear un metodo que va a recorrer un arreglo de tamano n , y va a imprimir sus elementos en orden
        
        -> Recursión -> 
        Ciclo 
        Partes:
        1)recursiva : genera la recursion y mantiene el ciclo vivo
        2)caso base : es el que ayuda a saber cuando termina el ciclo 
        */
        
    public static void main(String[] args) {
        int [] arreglo =  {1,2,3};
        ImprimirArregloRecursivo(arreglo,0);
    }
    
   public static void imprimirArreglo(int[] arreglo){
       for (int i = 0; i < arreglo.length; i++) {
           System.out.println(arreglo[i]);
       }// fin del for 
       /*
       1) como termina el ciclo? que hace que termine?
       i < arreglo.length , cuando llegamos al ultimo elemento dle arreglo, i== arreglo.length-1
       2) dentro del ciclo imprimimos cada elemento 
       */
   }// fin del metodo 
   
   public static void ImprimirArregloRecursivo(int[] arreglo, int i){
       if(i==arreglo.length){//caso base 
           System.out.println("Saliendo de la recursión...");
       }else{//caso recursivo 
//           i = i+1; i++;
            System.out.println(arreglo[i]);
           i+=1;
           ImprimirArregloRecursivo(arreglo,i);
       }
   }// fin de la recusion 
    
   
   /*
   Stack - Pila 
   1)agregamos cosas de abajo hacia arriba 
   2)nos vamos a enfocar en una cosa a la vez , nos enfocamos en lo que esta al tope de la pila 
   3)siempre que veamos un llamado a un metodo, vamos a escribir en la pila
   4)siempre que un metodo termine (retorne) , lo borramos o sacamos de la pila
   
   
   */
}
