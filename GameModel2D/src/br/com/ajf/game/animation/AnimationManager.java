package br.com.ajf.game.animation;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Author A.J.F.
 * @version 1.0
 * 21 June 2025
 */
public final class AnimationManager implements IAnimationManager
{
	
	/** The animations. */
	private List<IAnimation> animations = new ArrayList<IAnimation>();
	
	/** The index. */
	private int index;	
	
	/**
	 * Instantiates a new animation manager.
	 */
	public AnimationManager()
	{
		
	}

	/**
	 * Update.
	 */
	@Override
	public void update()
	{
		this.animations.get(index).update();
	}

	/**
	 * Draw.
	 *
	 * @param graphics2d the graphics 2 d
	 * @param xPos the x position to the animation
	 * @param yPos the y position to the animation
	 */
	@Override
	public void draw(Graphics2D graphics2d, int xPos, int yPos)
	{
		this.animations.get(this.index).draw(graphics2d, xPos, yPos);
	}

	/**
	 * Adds the animation.
	 *
	 * @param animation the animation
	 */
	@Override
	public void addAnimation(IAnimation animation)
	{
		this.animations.add(animation);
	}

	/**
	 * Sets the animation by index.
	 *
	 * @param index the new animation by index
	 */
	@Override
	public void setAnimationByIndex(int index)
	{
		this.index = index;
	}

	/**
	 * Checks if is finished.
	 *
	 * @param index the index
	 * @return true, if is finished
	 */
	@Override
	public boolean isFinished(int index)
	{
		
		return animations.get(index).isFinished();
	}

	/**
	 * Reset.
	 *
	 * @param index the index
	 */
	@Override
	public void reset(int index)
	{
		animations.get(index).reset();
	}

	/**
	 * Gets the index.
	 *
	 * @param index the index
	 * @return the index
	 */
	@Override
	public int getIndex(int index)
	{
		return animations.get(index).getIndex();
	}

	/**
	 * Clear.
	 */
	@Override
	public void clear()
	{
		animations.clear();
	}
}