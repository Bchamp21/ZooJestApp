package edu.nwmissouri.zoo06group;

/**
 *AbstractGame class (abstract class for Game App)
 * @author Bhuvan Chandra Sarakam
 */
public abstract class AbstractGame implements Runnable {
    private int players;
    private String ticketType;

    public AbstractGame(int players, String ticketType) {
        this.players = players;
        this.ticketType = ticketType;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
    
    /**
     * Custom Abstract function function providing the result of game
     *
     * @return result of Game
     */
    public String resultOfGame(){
        return "You Won !";
    }
}
