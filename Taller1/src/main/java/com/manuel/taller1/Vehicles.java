/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manuel.taller1;

/**
 * Representación de Vehículos, con algunas de sus características principales. Los atributos brand
 * y model nos permiten conocer quién y cuando fue construido el vehículo, el atributo numberOfTires
 * nos permite conocer qué tipo de vehículo estamos utilizando y el atributo traveledDistance nos
 * indica cuántos Km ha recorrido el vehículo.
 * @author Manuel
 */
public class Vehicles {
    
    // Atributos de la clase Vehicles
    
    public String brand;
    public int model;
    protected int numberOfTires;
    private int traveledDistance;
    
    // Constructor de la clase Vehicles

    public Vehicles(String brand, int model, int numberOfTires) {
        this.brand = brand;
        this.model = model;
        this.numberOfTires = numberOfTires;
    }
    
    // Métodos de la clase Vehicles
    
    private void setDistance(int distance){ // Método para introducir cuántos Km ha recorrido el vehículo.
        this.traveledDistance = distance;
    }
    
    public int getDistance(){ // Método para conocer cuántos Km ha recorrido el vehículo.
        return this.traveledDistance;
    }

}
