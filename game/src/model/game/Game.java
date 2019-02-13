package model.game;

public class Game {
    private int payloadPosTarget;
    private int boardWidth=6;
    private int boardHeight=6;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    public Cell[][] board;
    public Game(Player player1, Player player2) {
    	currentPlayer=player1;
    	player2=this.player2;    	
    	
    }
    public Game()
    {

}
}
