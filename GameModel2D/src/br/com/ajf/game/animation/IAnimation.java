package br.com.ajf.game.animation;

import java.awt.Graphics2D;

/**
 * Author A.J.F.
 * @version 1.0
 * 17 June 2025
 */
public interface IAnimation
{
	/**
	 * Update.
	 */
	void update();
	
	/**
	 * Draw.
	 *
	 * @param graphics2d the graphics 2 d
	 * @param xPos the x position to the animation
	 * @param yPos the y position to the animation
	 */
	void draw(Graphics2D graphics2d,int xPos,int yPos);
	
	/**
	 * Checks if is finished.
	 *
	 * @return true, if is finished
	 */
	boolean isFinished();
	
	/**
	 * Reset.
	 */
	void reset();
	
	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	int getIndex();
}