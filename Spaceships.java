package com.manuel.spaceships;

/**
 * Representación de atributos base de una nave espacial
 * @author Manuel Cervantes
 */

public abstract class Spaceships {
    
    // Atributos de la clase Spaceships
    
    public String name;     
    public String country;
    public String fuel;

    // Constructor de la clase Spaceships

    public Spaceships(String name, String country, String fuel) {
        this.name = name;
        this.country = country;
        this.fuel = fuel;
    }
    
   
    
    // Métodos de la clase Spaceship
    
    public String getName() {
        return name;
    }
  
    public String getCountry() {
        return country;
    }
    
    
    public String getFuel() {
        return fuel;
    }
    
    // Métodos abstractos de la clase Spaceship
    
    public abstract String launching();
    public abstract String description();

    
}
