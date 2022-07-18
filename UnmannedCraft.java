package com.manuel.spaceships;

/**
 * Representación de una nave no tripulada
 * @author Manuel Cervantes
 */
public class UnmannedCraft extends Spaceships{

    public int maxDistance; // Atributo de la clase UnmannedCraft.

    public UnmannedCraft(int maxDistance, String name, String country, String fuel) { // Contructor de la clase UnmannedCraft.
        super(name, country, fuel);
        this.maxDistance = maxDistance;
    }
    
    @Override
    public String description(){ // Método de la clase UnmanedCraft para describir la nave.
        return "The " + this.name + " is a Unmmaned spacecraft. It was build in " + this.country + ". It uses " + this.fuel + " as fuel and can travel a maximum distance of " + this.maxDistance + " miles.";
    }

    @Override
    public String launching() { // Método de la clase UnmanedCraft para lanzar la nave al espacio.
    return this.name + " is attached to the shuttler. Starting ignition in 3, 2, 1... ¡Launching!";
    }
    
    
}
