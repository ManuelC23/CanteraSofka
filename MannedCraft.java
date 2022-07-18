package com.manuel.spaceships;

/**
 * Representación de una nave tripulada.
 * @author Manuel Cervantes
 */
public class MannedCraft extends Spaceships {

    public int maxPassengers; // Atributo de la clase MannedCraft

    public MannedCraft(int maxPassengers, String name, String country, String fuel) { // Constructor de la clase MannedCraft
        super(name, country, fuel);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String launching() { // Método de la clase MannedCraft que lanza la nave al espacio.
        return "Passengers on board, seat belts fasten. Shuttler attached succesfully. Starting ignition in 3, 2, 1... \n¡Launching!"; 
    }

    @Override
    public String description() { // Método de la clase MannedCraft que describe el tipo de nave.
        return "The " + this.name + " is a Manned spacecraft. It was build in " + this.country + ". It uses " + this.fuel + " as fuel and can carry up to " + this.maxPassengers + " passengers."; 
    }

    
    
}
