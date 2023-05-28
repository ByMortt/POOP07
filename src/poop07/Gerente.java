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
 * Clase Gerente, que hereda de la clase Empleado.
 * Representa a un gerente en una empresa.
 */
public class Gerente extends Empleado {
    private int presupuesto;  // Presupuesto asignado al gerente

    /**
     * Constructor por defecto de la clase Gerente.
     */
    public Gerente() {
    }

    /**
     * Constructor de la clase Gerente.
     * @param presupuesto Presupuesto asignado al gerente.
     * @param nombre Nombre del gerente.
     * @param numEmpleado Número de empleado del gerente.
     * @param sueldo Sueldo del gerente.
     */
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    /**
     * Obtiene el presupuesto asignado al gerente.
     * @return Presupuesto asignado al gerente.
     */
    public int getPresupuesto() {
        return presupuesto;
    }

    /**
     * Establece el presupuesto asignado al gerente.
     * @param presupuesto Presupuesto asignado al gerente.
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    /**
     * Asigna el presupuesto del gerente basado en su sueldo.
     */
    public void asignarPresupuesto(){
        presupuesto = getSueldo() * 10;
    }

    /**
     * Devuelve una representación en forma de cadena de la información del gerente.
     * @return Cadena que representa al gerente.
     */
    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}

