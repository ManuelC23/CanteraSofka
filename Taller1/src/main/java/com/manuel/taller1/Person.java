/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manuel.taller1;

import java.util.Date;

/**
 *
 * @author Manuel
 */
public class Person {
    
    // Atributos de la Clase Person
    
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    
    // Constructor

    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    
    //  Métodos de la Clase Person
    
    public void setName(String name){ // Método para establecer/cambiar el Nombre.
        this.name = name;
    }
    
    public String getName(){ // Método para saber cuál es el nombre.
        return this.name;
    }
}



