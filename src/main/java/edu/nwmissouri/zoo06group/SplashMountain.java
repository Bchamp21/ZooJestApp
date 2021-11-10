/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *
 * @author Himaja Reddy Maddi
 */
public class SplashMountain extends WaterRide{
    public int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
   
    /**
     * Custom SplashMountain function providing result of game
     *
     * @return result of game
     */
    @Override
    public String resultOfGame(){
        System.out.println("Congratulation in winning the game");
        return "You never Loose";
    }
    
   /**
     * Custom JungleCruze function giving details of online booking
     *
     * @return Details of booked ticket
     */
    public String onlineBooking(){
        System.out.println("Please book your tickets online");
        return "Your ticket is booked";
    }
    
     /**
     * Custom JungleCruze function providing speed of game
     *
     * @return speed of game
     */
    public static String speed(){
        System.out.println("You won the game reached the maximum speed of the game");
        return "";
    }
}
