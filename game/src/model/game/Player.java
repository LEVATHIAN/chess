package model.game;

import java.util.ArrayList;

import model.pieces.Piece;

public class Player {
	private final String name;
	private int payloadPos;
	private int sideKilled;
	private final ArrayList<Piece> deadCharacters;
	public Player(String name, int payloadPos, int sideKilled, ArrayList<Piece> deadCharacters) {
		super();
		this.name = name;
		this.payloadPos = payloadPos;
		this.sideKilled = sideKilled;
		this.deadCharacters = deadCharacters;
	}

}
