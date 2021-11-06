/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *
 * @author Nikhil KrishnanVenkatesh
 */
public class WaterRide extends AbstractGame {
    
    private int players;
    private double priceOfTicket;
    private String ticketType;
    
    @Override
    public String resultOfGame(){
        return "You never Loose";
    }
    
    public String onlineBooking(){
    return "Your ticket is booked";
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
