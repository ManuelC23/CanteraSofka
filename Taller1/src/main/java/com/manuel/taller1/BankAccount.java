/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manuel.taller1;

/**
 *
 * @author Manuel
 */
public class BankAccount {
    
    // Atributos de BankAccount
    
    private int accountNumber;
    protected boolean activated;
    
    // Constructor

    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    
    // Métodos de BankAccount
    public void setActivated(boolean actived){
        this.activated = actived;
    }
    
    public boolean getActivated(){
        return this.activated;
    }
}
