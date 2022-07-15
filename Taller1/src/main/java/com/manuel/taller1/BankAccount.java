/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manuel.taller1;

/**
 * Representación de una Cuenta Bancaria, podemos establecer su ID y activarla o desactivarla.
 * @author Manuel Cervantes Obeso
 */
public class BankAccount {
    
    // Atributos de BankAccount
    
    private int accountNumber;
    protected boolean activated;
    
    // Constructor de la clase BankAccount

    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    
    // Métodos de BankAccount
    public void setActivated(boolean actived){ // Método para cambiar el estado del booleano.
        this.activated = actived;
    }
    
    public boolean getActivated(){ // Método para verificar el estado del booleano.
        return this.activated;
    }
}
