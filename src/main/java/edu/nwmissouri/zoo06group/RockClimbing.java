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

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String resultOfGame(){
        System.out.println("You won the game");
        return "You never Loose";
    }
    
    @Override
    public  String onlineBooking(){
         System.out.println("Welcome to adventure rides");
    return "Your ticket is booked";
    }
    
    
    public static double climb(){
       double a=0;
       System.out.println("You reached maximum height");
        return a;
    }
    
    
    
     
    
}
