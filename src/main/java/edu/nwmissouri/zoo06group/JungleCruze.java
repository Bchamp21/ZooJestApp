/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *
 * @author Himaja Reddy Maddi
 */
public class JungleCruze extends WaterRide{
    
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
     /**
     * Custom JungleCruze function providing the result of game
     *
     * @return result of Game
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
    public static int speed(){
        System.out.println("The speed of the game should be 12mph");
        return 0;
    }
}
