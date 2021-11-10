/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *
 * @author Srilekha Janagam
 */
public class RockClimbing extends AdventureRides {
     private double length;
     private int players;
     private String ticketType;
     /**
      * getter Length method
      * @return length
      */

    public double getLength() {
        return length;
    }
    /**
     * setter length method
     * @param length 
     */

    public void setLength(double length) {
        this.length = length;
    }
    /**
     * getter Players method
     * @return players
     */

    public int getPlayers() {
        return players;
    }
    /**
     * setter Players method
     * @param players 
     */

    public void setPlayers(int players) {
        this.players = players;
    }
     /**
      * run method
      */
  
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * resultOfGame method
     * @return You never Loose
     */
    @Override
    public String resultOfGame(){
        System.out.println("You won the game");
        return "You never Loose";
    }
    /**
     * onlineBooking method
     * @return Your ticket is booked
     */
    @Override
    public  String onlineBooking(){
         System.out.println("Welcome to adventure rides");
    return "Your ticket is booked";
    }
    /**
     * climb method
     * @return a
     */
    
    public static double climb(){
       double a=0;
       System.out.println("You reached maximum height");
        return a;
    }
    
    
    
     
    
}
