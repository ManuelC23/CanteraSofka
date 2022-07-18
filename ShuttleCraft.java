package com.manuel.spaceships;

/**
 * Representación de una nave lanzadera.
 * @author Manuel Cervantes
 */
public class ShuttleCraft extends Spaceships {   
    
    public int maxWeight; // Atributo de la clase ShuttleCraft

    public ShuttleCraft(int maxWeight, String name, String country, String fuel) { // Constructor de la clase ShuttleCraft
        super(name, country, fuel);
        this.maxWeight = maxWeight;
    }

    @Override
    public String description() { // Método de la clase ShuttleCraft que describe el tipo de nave.
        return "The " + this.name + " is a Shuttler. It was build in " + this.country + ". It uses " + this.fuel + " as fuel and supports a maximum weight of " + this.maxWeight + " tons.";
    }

    @Override
    public String launching() { // Método de la clase ShuttleCraft, como está es una lanzadera, no lanza la nave al espacio ya que no tienen ninguna nave anclada.
        return "This spacecraft is a Shuttler, so it doesn't needs a Shuttler platform."; 
    }
}
