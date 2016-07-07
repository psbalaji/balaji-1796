/****************************************************************************

* Copyright (c) 2016 by Accolite.com. All rights reserved

*

* Created date :: Jul 7, 2016

*

*  @author :: Balaji P

* ***************************************************************************

*/
package com.accolite.chess;

// TODO: Auto-generated Javadoc
/**
 * The Class Game.
 */
public class Game {
	
	/** The black player. */
	Player bPlayer;
	
	/** The white player. */
	Player wPlayer;
	
	/** The board. */
	char[][] board = new char[8][8];
	
	/**
	 * Instantiates a new game.
	 */
	public Game() {
		bPlayer = new Player(false);
		wPlayer = new Player(true);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		
	}

}
