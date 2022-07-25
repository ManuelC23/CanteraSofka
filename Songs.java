/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manuel.songlibrary;

/**
 *
 * @author Manuel
 */
public class Songs {
    
    private String title;
    private String genre;
    private String ID;
    private double length;
    private int date;
    private String cover;
    private String description;

    /*
    Constructor de la Clase Songs
    */
    
    public Songs(String title, String genre, String ID, double length, int date, String cover, String description) {
        this.title = title;
        this.genre = genre;
        this.ID = ID;
        this.length = length;
        this.date = date;
        this.cover = cover;
        this.description = description;
    }
    
    /**
     * Método para filtrar canciones según su género
     * @param genre
     */
    
    public void filterGenre (String genre){
        if (genre.equals(this.genre)){
            System.out.println("- " + this.title); 
            
        }
    }
    
    /**
     * Método para filtrar canciones según su año
     */
    
    public void filterYear (int year){
        if (year == this.date){
            System.out.println("- " + this.title); 
 
        }
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    private void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    private void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    private void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    private void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the date
     */
    public int getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    private void setDate(int date) {
        this.date = date;
    }

    /**
     * @return the cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover the cover to set
     */
    private void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    private void setDescription(String description) {
        this.description = description;
    }
 
    
 
    
   
    
    
    
    
}
