package edu.nwmissouri.zoo06group;

/**
 *
 * @author Bhuvan Chandra Sarakam
 */
public abstract class AbstractGame implements Runnable {
    private int players;
    private String ticketType;

    public AbstractGame(int players, String ticketType) {
        this.players = players;
        this.ticketType = ticketType;
    }
    
    
    public String resultOfGame(){
        return "You Won !";
    }
}
