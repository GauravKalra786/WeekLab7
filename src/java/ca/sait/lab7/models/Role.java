/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sait.lab7.models;

import java.io.Serializable;

public class Role {
    
    
    private int Id;
    
    private String name;
    
    public Role(){
        
    }
    
    public Role(int id , String name){
        this.Id=Id;
        
       this.name=name;
       
       
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
