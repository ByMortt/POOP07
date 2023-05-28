/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop07;

import animales.Animal;
import animales.AnimalAcuatico;
import animales.AnimalAereo;
import animales.AnimalTerrestre;
import animales.Ballena;
import animales.Pajaro;
import animales.Perro;

/**
 *
 * @author poo08alu03
 */
public class POOP07 {

    public static void main(String[] args) {
        
        // Crear instancia de Empleado
        Empleado empleado = new Empleado("Roberto", 122233, 25000);
        System.out.println(empleado);
        
        // Crear instancia de Gerente
        Gerente gerente = new Gerente(0, "Ramon", 112231, 50000);
        System.out.println(gerente);
        
        System.out.println("·······IS-A (es un)·······");
        if (gerente instanceof Gerente) {
            System.out.println("Es instancia de Gerente");
        }
        if (gerente instanceof Empleado) {
            System.out.println("Es instancia de Empleado");
        }
        if (gerente instanceof Object) {
            System.out.println("Es instancia de Object");
        }
        
        System.out.println("*******************************");
        
        // Crear instancia de Animal
        Animal animal = new Animal("Pepe", "Amazonas", "cafe");
        System.out.println(animal);
        
        // Crear instancia de AnimalAcuatico
        AnimalAcuatico aqua = new AnimalAcuatico("Nemo", "Pacifico", "Naranja", 3);
        System.out.println(aqua);
        
        // Crear instancia de AnimalAereo
        AnimalAereo aguila = new AnimalAereo("George", "USA", "Negro", 2);
        System.out.println(aguila);
        
        // Crear instancia de AnimalTerrestre
        AnimalTerrestre cangu = new AnimalTerrestre("Carmelo", "Australia", "Cafe", 2);
        System.out.println(cangu);   
        
        // Crear instancia de Ballena
        Ballena mobidick = new Ballena("Mobi", "Oceano Pacifico", "Gris", 2, 20);
        System.out.println(mobidick);
        
        // Crear instancia de Pajaro
        Pajaro pajaro = new Pajaro("Piolin", "casa de la abuela", "amarillo", 2, "pequenios");
        System.out.println(pajaro);
        
        // Crear instancia de Perro
        Perro perro = new Perro("Dino", "Calle pa", "blanco", 4, "cafe");
        System.out.println(perro);
    }    
}
