package edu.nwmissouri.zoo06group;

/**
 *
 * @author Bhuvan Chandra Sarakam
 */
public abstract class AbstractGame implements Runnable {
    int players;
    String ticketType;
    
    public String resultOfGame(){
        return "You Won !";
    }
}
