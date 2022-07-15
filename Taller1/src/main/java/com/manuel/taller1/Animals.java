/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manuel.taller1;

/**
 * Representación de las características básicas de un animal.
 * @author Manuel Cervantes Obeso
 */
public class Animals {
    
    // Atributos de Animals
    
    public String name;
    public String habitat;
    public int legs;
    private boolean wild; // Nos indica si el animal es salvaje o doméstico.
    private boolean endangered; // Nos indica si el animal está o no en peligro de extinción.
    
    // Constructor de Animals

    public Animals(String name, String habitat, int legs) {
        this.name = name;
        this.habitat = habitat;
        this.legs = legs;
    }
    
    // Métodos de Animals
    
    private void setWild(boolean state){ // Método para establecer si un animal es salvaje.
        this.wild=state;
    }
    
    public String getWild(){ // Método para conocer si el animal es o no salvaje.
        if(this.wild){
            return "The " + name + " is a Wild animal.";
        } else {
            return "The " + name + " is a domestic animal.";
        }
    }
    
    private void setEndangered(boolean state){ // Método para establecer si un animal está en peligro de extinción.
        this.endangered=state;
    }
    
    public String getEndangered(){ // Método para conocer el estado de conservación del animal.
        if (this.endangered){
            return "The "+name+" is an endangered animal.";
        } else {
            return "The " + name + "is not endangered.";
        }
    }
    
}