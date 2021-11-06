/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *
 * @author Nikhil Krishnan Venkatesh
 */
public class RollerCoaster {
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
    
    
     @Override
    public String resultOfGame(){
        return "You never Loose";
    }
    
    public String onlineBooking(){
    return "Your ticket is booked";
    }
    
    public int rotations(){
    return "Gives the count of the rotations";
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
