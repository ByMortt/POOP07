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
 * Clase Animal.
 * Representa a un animal genérico.
 */
public class Animal {
    private String nombre;       // Nombre del animal
    private String lugarOrigen;  // Lugar de origen del animal
    private String color;        // Color del animal

    /**
     * Constructor por defecto de la clase Animal.
     */
    public Animal() {
    }

    /**
     * Constructor de la clase Animal.
     * @param nombre Nombre del animal.
     * @param lugarOrigen Lugar de origen del animal.
     * @param color Color del animal.
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    /**
     * Obtiene el nombre del animal.
     * @return Nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del animal.
     * @param nombre Nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el lugar de origen del animal.
     * @return Lugar de origen del animal.
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * Establece el lugar de origen del animal.
     * @param lugarOrigen Lugar de origen del animal.
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * Obtiene el color del animal.
     * @return Color del animal.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del animal.
     * @param color Color del animal.
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Emite un sonido por parte del animal.
     * @param sonido Sonido emitido por el animal.
     */
    public void Sonido(String sonido){
        System.out.println(sonido);
    }
    
    /**
     * Realiza la acción de comer por parte del animal.
     */
    public void Comer(){
        System.out.println("Comiendo");
    }

    /**
     * Devuelve una representación en forma de cadena de la información del animal.
     * @return Cadena que representa al animal.
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
}

