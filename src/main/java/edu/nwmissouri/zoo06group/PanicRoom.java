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
    /**
     * Custom PanicRoom function providing result of game
     *
     * @return result of game
     */
     @Override
    public String resultOfGame(){
        System.out.println("You won the game");
        return "You never Loose";
    }
    /**
     * Custom PaniRoom function providing details of tickets
     *
     * @return ticket details
     */
    @Override
    public  String onlineBooking(){
         System.out.println("Welcome to adventure rides");
    return "Your ticket is booked";
    }
    /**
     * Custom PaniRoom function providing darkRoom method
     *
     * @return result of dark room
     */
     public static boolean darkRoom(){
     System.out.println("Enter the dark room");
     return true;
    }
     /**
     * Custom PaniRoom function getting values from room
     *
     * @return number of rooms
     */
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    /**
     * Custom PaniRoom Setting number of rooms
     *
     */
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
