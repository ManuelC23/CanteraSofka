package com.manuel.spaceships;

/**
 * Representación de una nave de Turistas Espciales
 * @author Manuel Cervantes
 */
public class TouristCraft extends Spaceships {

    public int maxPassengers; // Atributos de la clase TouristCraft
    public String destination;

    public TouristCraft(int maxPassengers, String destination, String name, String country, String fuel) { // Constructor de la clase TouristCraft
        super(name, country, fuel);
        this.maxPassengers = maxPassengers;
        this.destination = destination;
    }
    
    public int flightNumber() { // Método para generar un número de vuelo aleatorio para las instancias de TouristCraft.
        int min=9000;
        int max=9999;
        int flightNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
        return flightNumber;
    }
    
    @Override
    public String launching() { // Método de la clase TouristCraft que lanza la nave al espacio.
        return "Welcome to Flight SF" + this.flightNumber()  + " to " + this.destination + ". Please fasten your seat belts and prepare for launch. \nShuttler attached succesfully. \nStarting ignition in 3, 2, 1... \n¡Launching!";
    }

    @Override
    public String description() { // Método de la clase TouristCraft que describe el tipo de nave.
        return "The " + this.name + " is a tourist spacecraft. It was build in " + this.country + ". It uses " + this.fuel + " as fuel and can carry up to " + this.maxPassengers + " passengers."; 
    }


    
  
    
}
