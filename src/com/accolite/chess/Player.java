/****************************************************************************

* Copyright (c) 2016 by Accolite.com. All rights reserved

*

* Created date :: Jul 7, 2016

*

*  @author :: Balaji P

* ***************************************************************************

*/
package com.accolite.chess;

import java.awt.Color;

// TODO: Auto-generated Javadoc
/**
 * The Class Player.
 */
public class Player {
	
	/** The king. */
	King king;
	
	/** The queen. */
	Queen queen;
	
	/** The l bishop. */
	LeftBishop lBishop;
	
	/** The r bishop. */
	RightBishop rBishop;
	
	/** The l knight. */
	LeftKnight lKnight;
	
	/** The r knight. */
	RightKnight rKnight;
	
	/** The r rook. */
	RightRook rRook;
	
	/** The l rook. */
	LeftRook lRook;
	
	/** The pawns. */
	Pawn[] pawns;
	
	/** The color. */
	boolean color;//false for black and true for white
	
	/**
	 * Instantiates a new player.
	 *
	 * @param color the color
	 */
	public Player(boolean color){
		this.color = color;
		king = new King(color);
		queen = new Queen();
		lBishop = new LeftBishop();
		rBishop = new RightBishop();
		lKnight = new LeftKnight();
		rKnight = new RightKnight();
		lRook = new LeftRook();
		rRook = new RightRook();
		pawns = new Pawn[8];
		
	}
	
	/**
	 * Checks if is check mate.
	 *
	 * @return true, if is check mate
	 */
	public static boolean isCheckMate(){
		return true;
	}
	
	/**
	 * Move.
	 *
	 * @param currentPos the current pos
	 * @param newPos the new pos
	 * @return true, if successful
	 */
	public boolean move(String currentPos, String newPos){
		return true;
	}
}
