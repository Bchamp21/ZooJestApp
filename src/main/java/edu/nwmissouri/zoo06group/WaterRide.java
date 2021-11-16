/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *WaterRide class (derived subclass of the superclass AbstractGame)
 * @author Nikhil KrishnanVenkatesh
 */
public class WaterRide extends AbstractGame {
    
    private int players;
    private double priceOfTicket;
    private String ticketType;
    
    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public double getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(double priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
    
    /**
     * Custom WaterRide function providing result of game
     *
     * @return result of game
     */
     @Override
    public String resultOfGame(){
       System.out.println("Welcome to Water rides");
        return "You never Loose";
    }
    
    
    /**
     * Custom WaterRide function giving details of online booking
     *
     * @return Details of booked ticket
     */
    public String onlineBooking(){
        System.out.println("Please book your tickets online");
        return "Your ticket is booked";
    }
  
    /**
     * Custom run method
     *
     * 
     */
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
