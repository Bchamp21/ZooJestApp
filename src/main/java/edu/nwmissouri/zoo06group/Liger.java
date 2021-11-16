/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo06group;

/**
 *Liger class (derived subclass of the superclass Animal)
 * @author RevanthPagilla
 */
public class Liger extends Animal {
    /**
     * Liger constructor
     * @param name - the name of this instance of an animal
     */
    
    public Liger(String name){
        super(name);
    }

    /**
     * Custom move method
     */
    @Override
    public void move() {
        System.out.println("I will climb trees ");
    }

    /**
     * Custom speak method
     */
    @Override
    public void speak() {
         System.out.printf("I'm %s. I'm an Liger! \n", this.name);
    }
    
    
}
