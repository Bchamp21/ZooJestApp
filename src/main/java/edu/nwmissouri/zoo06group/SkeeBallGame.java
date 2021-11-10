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
    
    /**
     * Custom SkeeBallGame function providing result of game
     *
     * @return result of game
     */
     @Override
    public String resultOfGame(){
        System.out.println("You won the game");
        return "You never Loose";
    }
    /**
     * Custom SkeeBallGame function providing details of online booking
     *
     * @return details of tickets
     */
    @Override
    public  String onlineBooking(){
         System.out.println("Welcome to adventure rides");
    return "Your ticket is booked";
    }
    /**
     * Custom SkeeBallGame function getting number of balls
     *
     * @return number of balls
     */
    public int getNumberOfBalls() {
        return numberOfBalls;
    }
    /**
     * Custom SkeeBallGame function setting values for balls
     *
     */
    public void setNumberOfBalls(int numberOfBalls) {
        this.numberOfBalls = numberOfBalls;
    }
    /**
     * Custom SkeeBallGame function gives information about goal
     *
     * @return goal of game
     */
    
    public static String goal(){
        System.out.println("You are highest scorer");
        return "";
    }

}
