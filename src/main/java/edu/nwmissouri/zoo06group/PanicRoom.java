/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *
 * @author Indu Chinthakuntla
 */
public class PanicRoom extends AdventureRides {
    int numberOfRooms;
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

    
    public static boolean darkRoom(){
        System.out.println("Enter the dark room");
        return true;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
