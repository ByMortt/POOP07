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
 * Clase AnimalAcuatico.
 * Representa a un animal acuático que hereda de la clase Animal.
 */
public class AnimalAcuatico extends Animal {
    private int numeroAletas;  // Número de aletas del animal acuático

    /**
     * Constructor por defecto de la clase AnimalAcuatico.
     */
    public AnimalAcuatico() {
    }

    /**
     * Constructor de la clase AnimalAcuatico.
     * @param nombre Nombre del animal acuático.
     * @param lugarOrigen Lugar de origen del animal acuático.
     * @param color Color del animal acuático.
     * @param numeroAletas Número de aletas del animal acuático.
     */
    public AnimalAcuatico(String nombre, String lugarOrigen, String color, int numeroAletas) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }

    /**
     * Obtiene el número de aletas del animal acuático.
     * @return Número de aletas del animal acuático.
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }

    /**
     * Establece el número de aletas del animal acuático.
     * @param numeroAletas Número de aletas del animal acuático.
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    
    /**
     * Realiza la acción de nadar por parte del animal acuático.
     */
    public void Nadar(){
        System.out.println("Nadando...");
    }
    
    /**
     * Realiza la acción de comer por parte del animal acuático.
     * Se sobreescribe el método Comer de la clase Animal.
     */
    @Override
    public void Comer(){
        System.out.println("Comiendo plancton");
    }

    /**
     * Devuelve una representación en forma de cadena de la información del animal acuático.
     * @return Cadena que representa al animal acuático.
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalAcuatico{" + "numeroAletas=" + numeroAletas + '}';
    }
}

