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
 * The Class King.
 */
public class King implements Chessman {
	
	/** The current pos. */
	String currentPos;
	
	/** The is alive. */
	boolean isAlive;
	/*
	 * If the color is false then player is black
	 * If color is true then player is white
	 */
	public King(boolean color){
		if(color == false){
			currentPos = new String("h5");
		}
		else{
			currentPos = new String("a5");
		}
	}
	
	/* (non-Javadoc)
	 * @see com.accolite.chess.Chessman#move(java.lang.String)
	 */
	@Override
	public boolean move(String newPos) {
		// TODO Auto-generated method stub
		return false;
	}

}
