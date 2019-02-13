package model.pieces;

import model.game.Game;
import model.game.Player;
public class Piece extends Game implements Movable{


	private final String name;
	private final Player owner;
	private final Game game;
	public int posI;
	public int posJ;
    
	public Piece(Player player, Game game, String name) {
	this.owner=player;
	this.game=game;
	this.name=name;
		
	}

	public void Right() {
		
	}

	public void Left() {
		
	}

	public void Up() {
		
	}

	public void Down() {
		
	}
	

}
