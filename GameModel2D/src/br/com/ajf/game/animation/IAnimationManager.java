package br.com.ajf.game.animation;

import java.awt.Graphics2D;

/**
 * 
 * Author A.J.F.
 * @version 1.0
 * 21 June 2025
 */
public sealed interface IAnimationManager permits AnimationManager
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
	 * Adds the animation.
	 *
	 * @param animation the animation
	 */
	void addAnimation(IAnimation animation);
	/**
	 * Sets the animation by index.
	 *
	 * @param index the new animation by index
	 */
	void setAnimationByIndex(int index);
	
	/**
	 * Checks if is finished.
	 *
	 * @param index the index
	 * @return true, if is finished
	 */
	boolean isFinished(int index);
	
	/**
	 * Reset.
	 *
	 * @param index the index
	 */
	void reset(int index);
	
	/**
	 * Gets the index.
	 *
	 * @param index the index
	 * @return the index
	 */
	int getIndex(int index);
	
	/**
	 * Clear.
	 */
	void clear();
}