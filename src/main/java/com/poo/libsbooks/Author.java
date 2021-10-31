/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.libsbooks;

/**
 *
 * @author scherman
 */
public class Author {
    
    private String name;
    private boolean gender;     //False = Fem, True = Mas
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    
}
