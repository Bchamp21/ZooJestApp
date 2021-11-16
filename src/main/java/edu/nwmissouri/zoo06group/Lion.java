/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo06group;

/**
 *Lion class (derived subclass of the superclass Animal)
 * @author Nikhil KrishnanVenkatesh
 */
public class Lion extends Animal {

    /**
     * Aardvark constructor 
     * @param name - the name of this aardvark
     */
    public Lion(String name) {
        super(name);
    }

    
    /**
     * Custom speak method
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Aardvark!", this.name);
    }

    
    /**
     * Custom move method
     */
    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }

    }   

