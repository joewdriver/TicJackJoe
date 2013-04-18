package com.fishtank.ticjackjoe;

public class GameBoard {

	//	private int [][] Tiles =  new int[3][3];
	public int [] tiles = new int[3];
	
	//constructor
	public GameBoard() {
			
		for (int i = 0; i < tiles.length; i++) {
			tiles[i] = 0;
		}
		
	}
	
	//this function isn't really necessary since I made the tile array a public variable
	public int getTile(int coord) {
		return tiles[coord];
	}
	
	public boolean setTile(int coord, String currentPlayer) {
		if (tiles[coord] == 0) {
			
			//player 1 is X, player 2 is O... there's definitely a better way to do this
			if (currentPlayer == "X") {
				tiles[coord] = 1;
			}
			else {
				tiles[coord] = 2;
			}
			return true;
		}
		
		else {
			return false;
		}
		
	}
}
