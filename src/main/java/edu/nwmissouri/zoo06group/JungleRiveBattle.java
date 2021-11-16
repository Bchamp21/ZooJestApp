/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *JungleRiveBattle class (derived subclass of the superclass WaterRide)
 * @author Revanth pagilla
 */
public class JungleRiveBattle extends WaterRide {
   
    public double distance;
    
    
     /**
     * Custom JungleRiverBattle function providing the result of game
     *
     * @return result of Game
     */
    @Override
    public String resultOfGame(){
        System.out.println("Congratulation in winning the game");
        return "You never Loose";
    }
    
    
     /**
     * Custom JungleRiverBattle function giving details of online booking
     *
     * @return Details of booked ticket
     */
    public String onlineBooking(){
        System.out.println("Please book your tickets online");
        return "Your ticket is booked";
    }
}
