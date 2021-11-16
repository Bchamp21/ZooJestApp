/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *RollerCoaster class (derived subclass of the superclass AdventureRides)
 * @author Nikhil Krishnan Venkatesh
 */
public class RollerCoaster extends AdventureRides{
    private int wheels;
    private int players;
    private String ticketType;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
    
    
      /**
     * Custom RollerCoaster function providing result of game
     *
     * @return result of game
     */
   @Override
    public String resultOfGame(){
        System.out.println("You won the game");
        return "You never Loose";
    }
    
    /**
     * Custom RollerCoaster function giving details of online booking
     *
     * @return Details of booked ticket
     */
    @Override
    public  String onlineBooking(){
         System.out.println("Welcome to adventure rides");
    return "Your ticket is booked";
    }
    
    /**
     * Custom RollerCoaster function giving details of number of rotations
     *
     * @return Details of rotations
     */
    public static int rotations(){
        System.out.println("You successfully stayed alive");
    return 0;
    }

   
    
}
