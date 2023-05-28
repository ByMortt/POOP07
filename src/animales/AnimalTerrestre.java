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
 * Clase AnimalTerrestre.
 * Representa a un animal terrestre que hereda de la clase Animal.
 */
public class AnimalTerrestre extends Animal {
    private int numPatas;  // Número de patas del animal terrestre

    /**
     * Constructor por defecto de la clase AnimalTerrestre.
     */
    public AnimalTerrestre() {
    }

    /**
     * Constructor de la clase AnimalTerrestre.
     * @param nombre Nombre del animal terrestre.
     * @param lugarOrigen Lugar de origen del animal terrestre.
     * @param color Color del animal terrestre.
     * @param numPatas Número de patas del animal terrestre.
     */
    public AnimalTerrestre(String nombre, String lugarOrigen, String color,int numPatas) {
        super(nombre, lugarOrigen, color);
        this.numPatas = numPatas;
    }
    
    /**
     * Realiza la acción de correr por parte del animal terrestre.
     */
    public void Correr(){
        System.out.println("Corriendo...");
    }
    
    /**
     * Realiza la acción de comer por parte del animal terrestre.
     * Se sobreescribe el método Comer de la clase Animal.
     */
    @Override
    public void Comer(){
        System.out.println("Comiendo niam niam");
    }

    /**
     * Devuelve una representación en forma de cadena de la información del animal terrestre.
     * @return Cadena que representa al animal terrestre.
     */
    @Override
    public String toString() {
        return super.toString()+"AnimalTerrestre{" + "numPatas=" + numPatas + '}';
    }
}

