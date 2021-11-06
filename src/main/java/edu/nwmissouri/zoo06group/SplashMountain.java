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
   
    @Override
    public String resultOfGame(){
        System.out.println("Congratulation in winning the game");
        return "You never Loose";
    }
    
    public String onlineBooking(){
        System.out.println("Please book your tickets online");
        return "Your ticket is booked";
    }
    public static String speed(){
        System.out.println("You won the game reached the maximum speed of the game");
        return "";
    }
}
