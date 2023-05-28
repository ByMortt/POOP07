/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop07;

/**
 *
 * @author poo08alu03
 */
/**
 * Clase Empleado.
 * Representa a un empleado en una empresa.
 */
public class Empleado {
    private String nombre;       // Nombre del empleado
    private int numEmpleado;     // Número de empleado
    private int sueldo;          // Sueldo del empleado

    /**
     * Constructor por defecto de la clase Empleado.
     */
    public Empleado() {
    }

    /**
     * Constructor de la clase Empleado.
     * @param nombre Nombre del empleado.
     * @param numEmpleado Número de empleado.
     * @param sueldo Sueldo del empleado.
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return Nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de empleado.
     * @return Número de empleado.
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Establece el nombre del empleado.
     * @param nombre Nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el número de empleado.
     * @param numEmpleado Número de empleado.
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    
    /**
     * Obtiene el sueldo del empleado.
     * @return Sueldo del empleado.
     */
    public int getSueldo(){
        return sueldo;
    }
    
    /**
     * Establece el sueldo del empleado.
     * @param sueldo Sueldo del empleado.
     */
    public void setSueldo(int sueldo){
        this.sueldo=sueldo;
    }
    
    /**
     * Aumenta el sueldo del empleado en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento del sueldo.
     */
    public void aumentarSueldo(int porcentaje){
        sueldo += sueldo * porcentaje / 100;
    }
    
    /**
     * Realiza el trabajo asignado al empleado.
     */
    public void trabajar(){
        System.out.println("Trabajando");
    }

    /**
     * Devuelve una representación en forma de cadena de la información del empleado.
     * @return Cadena que representa al empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
}

