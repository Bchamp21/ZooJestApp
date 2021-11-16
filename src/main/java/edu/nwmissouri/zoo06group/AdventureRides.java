package edu.nwmissouri.zoo06group;


/**
 *AdventureRides class (derived subclass of the superclass AbstractGame)
 * @author Bhuvan Chandra Sarakam
 */
public class AdventureRides extends AbstractGame {
    
    
    private double priceOfTicket;
    
    
    /**
     * Custom AdventureRides function providing the result of game
     *
     * @return result of Game
     */
    @Override
    public String resultOfGame(){
        return "You never Loose";
    }
    
    
     /**
     * Custom AdventureRides function giving details of online booking
     *
     * @return Details of booked ticket
     */
    public  String onlineBooking(){
         System.out.println("Welcome to adventure rides");
    return "Your ticket is booked";
    }

    /**
     * Custom AdventureRides function
     *
     * 
     */
    @Override
    public void run() {
       
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
