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
 * Clase Pajaro.
 * Representa a un pájaro que es un tipo de animal aéreo.
 * Hereda de la clase AnimalAereo.
 */
public class Pajaro extends AnimalAereo {
    private String tipoPies;  // Tipo de pies del pájaro

    /**
     * Constructor por defecto de la clase Pajaro.
     */
    public Pajaro() {
    }

    /**
     * Constructor de la clase Pajaro.
     * @param nombre Nombre del pájaro.
     * @param lugarOrigen Lugar de origen del pájaro.
     * @param color Color del pájaro.
     * @param numAlas Número de alas del pájaro.
     * @param tipoPies Tipo de pies del pájaro.
     */
    public Pajaro(String nombre, String lugarOrigen, String color, int numAlas, String tipoPies) {
        super(nombre, lugarOrigen, color, numAlas);
        this.tipoPies = tipoPies;
    }

    /**
     * Devuelve el tipo de pies del pájaro.
     * @return Tipo de pies del pájaro.
     */
    public String getTipoPies() {
        return tipoPies;
    }

    /**
     * Establece el tipo de pies del pájaro.
     * @param tipoPies Tipo de pies del pájaro.
     */
    public void setTipoPies(String tipoPies) {
        this.tipoPies = tipoPies;
    }
    
    /**
     * Realiza la acción de recolectar ramas por parte del pájaro.
     */
    public void recolectarRamas(){
        System.out.println("Recolectando ramitas para el nido");
    }

    /**
     * Devuelve una representación en forma de cadena de la información del pájaro.
     * @return Cadena que representa al pájaro.
     */
    @Override
    public String toString() {
        return super.toString()+"Pajaro{" + "tipoPies=" + tipoPies + '}';
    }
}

