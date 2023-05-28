/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author poo08alu03
 */
/**
 * Clase Ballena.
 * Representa a una ballena que es un tipo de animal acuático.
 * Hereda de la clase AnimalAcuatico.
 */
public class Ballena extends AnimalAcuatico {
    private int largo;  // Largo de la ballena

    /**
     * Constructor por defecto de la clase Ballena.
     */
    public Ballena() {
    }

    /**
     * Constructor de la clase Ballena.
     * @param nombre Nombre de la ballena.
     * @param lugarOrigen Lugar de origen de la ballena.
     * @param color Color de la ballena.
     * @param numeroAletas Número de aletas de la ballena.
     * @param largo Largo de la ballena.
     */
    public Ballena(String nombre, String lugarOrigen, String color, int numeroAletas, int largo) {
        super(nombre, lugarOrigen, color, numeroAletas);
        this.largo = largo;
    }

    /**
     * Devuelve el largo de la ballena.
     * @return Largo de la ballena.
     */
    public int getLargo() {
        return largo;
    }

    /**
     * Establece el largo de la ballena.
     * @param largo Largo de la ballena.
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    /**
     * Realiza la acción de pelear con Pinocho por parte de la ballena.
     */
    public void pelearConPinocho(){
        System.out.println("Agarrándose a guamasos con Pinocho");
    }

    /**
     * Devuelve una representación en forma de cadena de la información de la ballena.
     * @return Cadena que representa a la ballena.
     */
    @Override
    public String toString() {
        return super.toString()+"Ballena{" + "largo=" + largo + '}';
    }
}

