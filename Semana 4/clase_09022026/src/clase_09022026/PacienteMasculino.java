/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_09022026;

/**
 *
 * @author claudiacortes
 */
public class PacienteMasculino extends Paciente{
    private String ultimarevProstata;

    public PacienteMasculino(String ultimarevProstata, String nombre, String apellido, String tipoSangre) {
        super(nombre, apellido, tipoSangre);
        this.ultimarevProstata = ultimarevProstata;
    }

    public String getUltimarevProstata() {
        return ultimarevProstata;
    }

    public void setUltimarevProstata(String ultimarevProstata) {
        this.ultimarevProstata = ultimarevProstata;
    }

    @Override
    public String toString() {
        return "PacienteMasculino{ nombre " +super.nombre+ "ultimarevProstata=" + ultimarevProstata + '}';
    }
    
    
    
    
}
