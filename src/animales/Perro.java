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
 * Clase Perro.
 * Representa a un perro que es un tipo de animal terrestre.
 * Hereda de la clase AnimalTerrestre.
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;  // Color del collar del perro

    /**
     * Constructor por defecto de la clase Perro.
     */
    public Perro() {
    }

    /**
     * Constructor de la clase Perro.
     * @param nombre Nombre del perro.
     * @param lugarOrigen Lugar de origen del perro.
     * @param color Color del perro.
     * @param numPatas Número de patas del perro.
     * @param colorCollar Color del collar del perro.
     */
    public Perro(String nombre, String lugarOrigen, String color, int numPatas, String colorCollar) {
        super(nombre, lugarOrigen, color, numPatas);
        this.colorCollar = colorCollar;
    }

    /**
     * Devuelve el color del collar del perro.
     * @return Color del collar del perro.
     */
    public String getColorCollar() {
        return colorCollar;
    }

    /**
     * Establece el color del collar del perro.
     * @param colorCollar Color del collar del perro.
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Realiza la acción de hacer trucos por parte del perro.
     */
    public void hacerTrucos(){
        System.out.println("Da la patita");
    }

    /**
     * Devuelve una representación en forma de cadena de la información del perro.
     * @return Cadena que representa al perro.
     */
    @Override
    public String toString() {
        return super.toString()+"Perro{" + "colorCollar=" + colorCollar + '}';
    }
}

