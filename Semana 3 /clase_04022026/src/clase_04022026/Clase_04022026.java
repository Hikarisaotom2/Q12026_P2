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
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        boolean seguir = true;
        System.out.println("Ingrese el tamaño del estacionamiento: ");
        int tamano = leer.nextInt();
        Estacionamiento parqueoUnitec = new Estacionamiento(tamano);
        System.out.println("Creando carros");
        ArrayList<Carro> carros = crearCarros();
        //parquear los carros 
        System.out.println("Estacionando carros");
        for (int i = 0; i < carros.size(); i++) {
            estacionarVehiculoRandom(parqueoUnitec,carros.get(i));
        }
        
       parqueoUnitec.imprimirEstacionamiento();

        do {
            System.out.println();
            System.out.println(" Menu");
            System.out.println("1.Nuevo carro ");
            System.out.println("2. ingresar carro");
            System.out.println("3. Sacar");
            System.out.println("4.ver");
            System.out.println("5. Salir");
            System.out.print("Ingrese el numero de la opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {

                    break;
                }
                default: {
                    System.out.println("Opcion no valida");
                    seguir = false;
                }

            }
        } while (seguir);

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
