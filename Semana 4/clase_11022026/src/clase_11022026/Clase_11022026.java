package clase_11022026;

/**
 *
 * @author claudiacortes
 */
public class Clase_11022026 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        SISTEMAS DE RRHH UNITEC 
        -> Docentes 
            -> nombre 
            -> apellido 
            -> DNI
            -> numeroTalentoHumano 
            ->carreraDondeImparte
           
        tipos de maestros: 
        1. Docente de planta 
            -> Se le paga una cantidad fija mensual
            -> se le calcula deducciones. 
                -> aportaciones al RAP (1% de su sueldo)
                -> seguro social , lps 600 
        
        2. Docente hora clase 
            -> se le paga por la cantida de clases que imparte al mes .     
                su sueldo se calcula como: sueldoClase * cantidad de clases. 
            -> No se le realizan deducciones de ningun tipo 
        
        3. Docente administrativo (Jefe de carrera)
             -> Se le paga una cantidad fija mensual
             -> este docente aplica a bonificaciones mensuales 
         -> se le calcula deducciones. 
                -> aportaciones al RAP (1% de su sueldo)
                -> se le deduce ISR si su sueldo es superior a lps 20K  (15%)
                -> seguro social , lps 600
        
        
        
        */
       /*
        Polimorfismo: 
            NOTA: el polimorfismo no es algo que dependa de la herencia
        
          polimorfismo con herencia 
        1) sobreescritura simple 
            -> la manera mas simple de crear polimorfismo. 
            -> la manera mas flexible , con menos configuraciones 
            -> es la manera menos segura de implementar polimorfismo. 
        Caracteristicas: 
        1) los hijos dedicen si quieren o no implementar el polimorfismo
        si no lo implementan, se llama al codigo del padre
        
        2) clases abstractas  
        
          polimorfismo sin herencia 
        3) por uso de interfaces 

        */
       
       //double sueldoMensual, String Nombre, String apellido, String DNI, int numeroTalentoHumano, String carreraImparte
       
       DocentePlanta juan = new DocentePlanta (20500,"Juan","Perez","080119701234",1313,"Economia");
       DocenteHora maria = new DocenteHora(7000,4,"Maria","Garcia","080119604567",00123,"Derecho");
       DocenteJefeCarerra reynodBocanegra = new DocenteJefeCarerra(50700,1000,"Reynod","Bocanegra","0801197200123",1616,"Ing.Sistemas");
        System.out.println("Boleta pago Docente planta");
       juan.generarBoletaPago();
        
        System.out.println("\n Boleta pago Docente Hora");
       maria.generarBoletaPago();
       System.out.println("\n Boleta pago Docente Jefe carrera");
       reynodBocanegra.generarBoletaPago();
       
       
    }
    
}
