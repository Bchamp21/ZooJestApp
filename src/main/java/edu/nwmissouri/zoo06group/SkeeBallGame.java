/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *
 * @author Indu Chinthakuntla
 */
public class SkeeBallGame extends AdventureRides{
    int numberOfBalls;
    
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

    public int getNumberOfBalls() {
        return numberOfBalls;
    }

    public void setNumberOfBalls(int numberOfBalls) {
        this.numberOfBalls = numberOfBalls;
    }
    
    public static String goal(){
        System.out.println("You are highest scorer");
        return "";
    }

}
