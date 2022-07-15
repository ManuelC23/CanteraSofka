/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manuel.taller1;

/**
 * Representación de una nómina salarial con algunos de sus atributos
 * @author Manuel Cervantes Obeso
 */
public class Payroll {

    // Atributos de la Clase Payroll

    public int ID;
    public int workedDays;
    private int Salary;

    // Constructor de la clase Payroll

    public Payroll(int ID, int workedDays, int Salary) {
        this.ID = ID;
        this.workedDays = workedDays;
        this.Salary = Salary;
    }

    // Métodos de la clase Payroll

    private void editSalary(int newSalary){
        this.Salary = newSalary;
    }

    public int getSalary() {
        return this.Salary;
    }
    
}
