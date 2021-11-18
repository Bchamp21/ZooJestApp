/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo06group;

/**
 * RelayHorse class extends from parent class Animal
 *
 * @author BUHVAN CHANDRA SARAKAM S544899
 */
public class RelayHorse extends Animal {
    
    /**
     * RelayHorse constructor
     * @param name - the name of this RelayHorse
     */
    public RelayHorse(String name){
        super(name);
    }
    
    /**
     * Custom speak method
     */
    @Override
    public void speak() {
        System.out.printf("I'm an RelayHorse!\n", this.name);
    }
    
    
    /**
     * Custom move method
     */
    @Override
    public void move() {
        System.out.println("When I move, I Run, Run, Run.");
    }

    /**
     * Custom profess method
     */
    void profess() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     /**
     * Custom RelayHorse function 
     *
     * @param first double input
     * @param second int input
     * @return double sum 
     */
    double getRelayHorseAddition(double first, int second) {
        return first+second;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
