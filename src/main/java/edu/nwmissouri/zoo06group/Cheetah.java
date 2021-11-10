/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo06group;



/**
 *
 * @author Srilekha Janagam
 */
public class Cheetah extends Animal {

    /**
     * Cheetah constructor 
     * @param name - the name of this Cheetah
     */
    public Cheetah(String name) {
        super(name);
    }
    /**
     * speak method
     */

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Cheetah!", this.name);
    }
/**
 * move method
 */
    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");;//To change body of generated methods, choose Tools | Templates.
    }
    
    
}

