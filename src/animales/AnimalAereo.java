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
 * Clase AnimalAereo.
 * Representa a un animal aéreo que hereda de la clase Animal.
 */
public class AnimalAereo extends Animal {
    private int numAlas;  // Número de alas del animal aéreo

    /**
     * Constructor por defecto de la clase AnimalAereo.
     */
    public AnimalAereo() {
    }

    /**
     * Constructor de la clase AnimalAereo.
     * @param nombre Nombre del animal aéreo.
     * @param lugarOrigen Lugar de origen del animal aéreo.
     * @param color Color del animal aéreo.
     * @param numAlas Número de alas del animal aéreo.
     */
    public AnimalAereo(String nombre, String lugarOrigen, String color, int numAlas) {
        super(nombre, lugarOrigen, color);
        this.numAlas = numAlas;
    }

    /**
     * Obtiene el número de alas del animal aéreo.
     * @return Número de alas del animal aéreo.
     */
    public int getNumAlas() {
        return numAlas;
    }

    /**
     * Establece el número de alas del animal aéreo.
     * @param numAlas Número de alas del animal aéreo.
     */
    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }
    
    /**
     * Realiza la acción de volar por parte del animal aéreo.
     */
    public void Volar(){
        System.out.println("Volando...");
    }
    
    /**
     * Realiza la acción de comer por parte del animal aéreo.
     * Se sobreescribe el método Comer de la clase Animal.
     */
    @Override
    public void Comer(){
        System.out.println("Comiendo pienso");
    }

    /**
     * Devuelve una representación en forma de cadena de la información del animal aéreo.
     * @return Cadena que representa al animal aéreo.
     */
    @Override
    public String toString() {
        return super.toString()+"AnimalAereo{" + "numAlas=" + numAlas + '}';
    }
}

