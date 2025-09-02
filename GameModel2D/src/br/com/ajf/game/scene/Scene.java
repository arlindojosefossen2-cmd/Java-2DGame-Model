package br.com.ajf.game.scene;

import java.awt.Graphics2D;


/**
 * Author A.J.F
 *
 */
public interface Scene
{
	
	/**
	 * method that start the fields and Object of the State.
	 */
	void start();
	
	/**
	 * method that update the fields and Object of the State.
	 */
	void update();
	
	/**
	 * Draw.
	 *
	 * @param graphics2d method that draw the fields and Object of the State
	 */
	void draw(Graphics2D graphics2d);
	
}