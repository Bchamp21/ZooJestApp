package edu.nwmissouri.zoo06group;


/**
 *
 * @author Bhuvan Chandra Sarakam
 */
public class AdventureRides extends AbstractGame {
    
    int players;
    double priceOfTicket;
    String ticketType;
    
    @Override
    public String resultOfGame(){
        return "You never Loose";
    }
    
    public  String onlineBooking(){
         System.out.println("Welcome to adventure rides");
    return "Your ticket is booked";
    }

    @Override
    public void run() {
       
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
