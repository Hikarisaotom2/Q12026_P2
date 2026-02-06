/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_04022026;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_04022026 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Carro> carrosParqueados = new ArrayList<Carro>();
    public static ArrayList<Carro> carrosSinParquear = new ArrayList<Carro>();;
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        boolean seguir = true;
        System.out.println("Ingrese el tamaño del estacionamiento: ");
        int tamano = leer.nextInt();
        Estacionamiento parqueoUnitec = new Estacionamiento(tamano);
        
        System.out.println("Creando carros");
        carrosParqueados = crearCarros();
        //parquear los carros 
        System.out.println("Estacionando carros");
        for (int i = 0; i < carrosParqueados.size(); i++) {
            estacionarVehiculoRandom(parqueoUnitec,carrosParqueados.get(i));
        }
        
       parqueoUnitec.imprimirEstacionamiento();

        do {
            System.out.println();
            System.out.println(" Menu");
            System.out.println("1.Nuevo carro ");
            System.out.println("2.ingresar carro");
            System.out.println("3. Sacar");
            System.out.println("4.ver");
            System.out.println("5. Salir");
            System.out.print("Ingrese el numero de la opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1: {
                    //crear auto 
                    Carro nuevoCarro = crearAuto();
                    carrosSinParquear.add(nuevoCarro);
                    break;
                }
                case 2: {
                    //Ingresar un nuevo vehiculo 
                    ingresarVehiculo(parqueoUnitec);
                    break;
                }
                case 3: {
                    // Sacar 
                    // TODO: completar esta parte 
                    
                    break;
                }
                case 4: {
                    parqueoUnitec.imprimirEstacionamiento();
                    break;
                }
                default: {
                    System.out.println("Opcion no valida");
                    seguir = false;
                }

            }
        } while (seguir);
        /*
        Ejercicio de practica: 
        lista de compras (Clase compras)
        que va a tener productos (Clase Producto)
        los productos pueden ser: 
        Lacteos (Simbolo L)
        Vegetales (Simbolo v)
        Frutas (Simbolo F)
        Otros (Simbolo X)
        cada producto tiene un tipo, nombre, precio 
        
        los productos se pueden ir agregando a la lista de compras,
        cada lista de compras va a poder mostrar un ttoal de la factura 
        (suma del precio de todos los productos)
        Extra: imprimir la factura en la consola 
        Simbolo Nombre ..... Precio 
        X jUGUETE............ 20.0 
        F Manzana ............30.50
        V zanahoria ...........55.5
        Total..................106.00
        
        */

    }
    public static void ingresarVehiculo( Estacionamiento parqueo){
        for (int i = 0; i < carrosSinParquear.size(); i++) {
            System.out.println(i+" "+carrosSinParquear.get(i));
        }
       
        Scanner entrada = new Scanner(System.in);
          Random ran = new Random();
          
        System.out.println("Ingrese la posicion del vehiculo que desea parquear: ");
        // TODO: buscar vehiculo por id en lugar de usar su posicion 
        int pos = entrada.nextInt();
        int sizeEstacioinamiento = parqueo.getTamanoParqueo();
        Carro estacionar = carrosSinParquear.get(pos);
        
        //eliminarlo de la lista de vehiculos sin parqueo
        carrosSinParquear.remove(pos);
        carrosParqueados.add(estacionar);
    
         while (true) {
            int x = ran.nextInt(0, sizeEstacioinamiento);
            int y = ran.nextInt(0, sizeEstacioinamiento);
            boolean puedoEstacionar = parqueo.puedeEstacionarse(x, y);
              
            if (puedoEstacionar) {
//                vehiculos.get(pos).cambiarCoordenadasCarro(x, y);
//                parqueo.agregarCarro(vehiculos.get(pos));
                estacionar.cambiarCoordenadasCarro(x, y);
                parqueo.agregarCarro(estacionar);

                //estacionar el auto
                break;
            } else {
                continue;
            }
        }// fin del while 
        
        
        
    }
    public static Carro crearAuto(){
        Random r = new Random();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el tipo de carro");
        String tipo = entrada.next();
        System.out.println("Ingrese el color");
        String color  = entrada.next();
        System.out.println("Ingrese el saldo");
        double saldo = entrada.nextDouble();
        boolean pagado = r.nextBoolean();
        //Nota: asegurarse que este id sea unico 
        int id = r.nextInt(20,100);
        return new Carro(tipo,color,saldo,pagado, id);
        
    }
    public static ArrayList<Carro> crearCarros() {
        Random ran = new Random();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ArrayList<Carro> nuevosAutos = new ArrayList<Carro>();
        int cantidadAutos = ran.nextInt(5, 15);
        // los atributos (tipo, color, saldo, pagado y id son aleatorios 
        // los ids son unicos 

        // generar los x ids unicos
        while (ids.size() < cantidadAutos) {
            int nuevoId = ran.nextInt(20, 100);
            if (ids.contains(nuevoId)) { //el id ya existe 
                continue;
            } else {
                // el id no existe y lo vamos a agregar a la lista de ids generados
                ids.add(nuevoId);
            }
        }// despues de este while voy a tener una lista de ids unicos 

        for (int i = 0; i < cantidadAutos; i++) {
            int tipo = ran.nextInt(0, 3);
            int color = ran.nextInt(0, 3);
            double saldo = ran.nextDouble(500.99);
            boolean pagado = ran.nextBoolean();
            int id = ids.get(i);
            String tipoCarro = "";
            switch (tipo) {
                case 0 -> {
                    tipoCarro = "Sedan";
                }

                case 1 -> {
                    tipoCarro = "XUV";
                }
                case 2 -> {
                    tipoCarro = "Pickup";
                }
                default -> {
                    tipoCarro = "Otro";
                }
            }// fin del switch 

            String colorCarro = "";
            switch (tipo) {
                case 0 -> {
                    colorCarro = "Rojo";
                }

                case 1 -> {
                    colorCarro = "Verde";
                }
                case 2 -> {
                    colorCarro = "Negro";
                }
                default -> {
                    colorCarro = "Plateado";
                }
            }// fin del switch 

            Carro nuevoCarro = new Carro(tipoCarro, colorCarro, saldo, pagado, id);
            nuevosAutos.add(nuevoCarro);
        }// fin del for 
        return nuevosAutos;
    }// fin del metodo para crear carro 

    public static void estacionarVehiculoRandom(Estacionamiento parqueo, Carro parquear) {
        Random ran = new Random();
        int sizeEstacioinamiento = parqueo.getTamanoParqueo();
        while (true) {
            int x = ran.nextInt(0, sizeEstacioinamiento);
            int y = ran.nextInt(0, sizeEstacioinamiento);
            boolean puedoEstacionar = parqueo.puedeEstacionarse(x, y);
              
            if (puedoEstacionar) {
                parquear.cambiarCoordenadasCarro(x, y);
                parqueo.agregarCarro(parquear);
                //estacionar el auto
                break;
            } else {
                continue;
            }
        }// fin del while 

    }// fin del metodo
}
