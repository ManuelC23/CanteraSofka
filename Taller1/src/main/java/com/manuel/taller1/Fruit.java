/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manuel.taller1;

import java.util.ArrayList;

/**
 * Representación de una Fruta en la cual especificamos su peso promedio y color.
 * @author Manuel Cervantes Obeso
 */
public class Fruit {
    
    // Atributos de la Clase Fruit
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;
    
    // Constructor de la Clase Fruit

    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }
    
    // Métodos de la Clase Fruit
    
    public void setColor (String colorName){ // Método para establecer el color de la fruta.
        this.colors.add(colorName);
    }
    
    public ArrayList<String> getColors(){ // Método que devuelve el color de la fruta.
        return this.colors;
    } 
}
