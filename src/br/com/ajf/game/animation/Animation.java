package br.com.ajf.game.animation;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import br.com.ajf.game.util.ImageLoader;

/**
 * Author A.J.F.
 * @version 1.0
 * 17 June 2025
 */
public final class Animation implements IAnimation
{
	
	/** The index. */
	private int index;
	
	/** The interval. */
	private int interval;
	
	/** The counter. */
	private int counter;
	
	/** The images. */
	private BufferedImage[] images;

	/** The looping. */
	private boolean looping = true;
	
	/**
	 * Instantiates a new animation.
	 *
	 * @param path the path
	 * @param numberOfFrames the number of frames
	 * @param interval the interval
	 * @param tilesize the tile size
	 * @param scale the scale
	 */
	public Animation(final String path,final int numberOfFrames,final int interval,final int tilesize,final float scale)
	{
		this.interval = interval;
		this.images = new BufferedImage[numberOfFrames];
		ImageLoader imageLoader = new ImageLoader();
		
		final BufferedImage aux = imageLoader.getScaledImage(path, scale);
		
		for(int col = 0;col < images.length;col++)
		{
			images[col] = aux.getSubimage(col *tilesize,0,tilesize, tilesize);	
		}
	}
	
	/**
	 * Instantiates a new animation.
	 *
	 * @param path the path
	 * @param numberOfFrames the number of frames
	 * @param interval the interval
	 * @param tilesize the tile size
	 * @param scale the scale
	 * @param looping the looping
	 */
	public Animation(final String path,final int numberOfFrames,final int interval,final int tilesize,final float scale,final boolean looping)
	{
		this.interval = interval;
		this.images = new BufferedImage[numberOfFrames];
		ImageLoader imageLoader = new ImageLoader();
		
		final BufferedImage aux = imageLoader.getScaledImage(path, scale);
		
		for(int col = 0;col < images.length;col++)
		{
			images[col] = aux.getSubimage(col *tilesize,0,tilesize, tilesize);	
		}
		
		this.looping = looping;
	}
	
	/**
	 * Instantiates a new animation.
	 *
	 * @param path the path
	 * @param numberOfFrames the number of frames
	 * @param interval the interval
	 * @param width the width of the scaled frame 
	 * @param height the height of the scaled frame
	 * @param scale the scale
	 */
	public Animation(final String path,final int numberOfFrames,final int interval,final int width,final int height,final float scale)
	{
		this.interval = interval;
		this.images = new BufferedImage[numberOfFrames];
		ImageLoader imageLoader = new ImageLoader();
		
		final BufferedImage aux = imageLoader.getScaledImage(path, scale);
		
		for(int col = 0;col < images.length;col++)
		{
			images[col] = aux.getSubimage(col *width,0,width, height);	
		}
	}
	
	/**
	 * Update.
	 */
	@Override
	public void update()
	{
		
		if(!looping && index == images.length - 1)
				return;
		
		counter++;
		
		if(counter >= interval)
		{
			index++;
			counter =0;
			
			if(index >= images.length)
			{
				index = 0;
			}
		}
	}

	/**
	 * Draw.
	 *
	 * @param graphics2d the graphics 2 d
	 * @param xPos the x position to the animation
	 * @param yPos the y position to the animation
	 */
	@Override
	public void draw(final Graphics2D graphics2d,final int xPos,final int yPos)
	{
		graphics2d.drawImage(this.images[this.index], xPos, yPos, null);
	}

	/**
	 * Checks if is finished.
	 *
	 * @return true, if is finished
	 */
	@Override
	public boolean isFinished()
	{
		return index == images.length - 1;
	}

	/**
	 * Reset.
	 */
	@Override
	public void reset()
	{
		index = 0;
	}

	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	@Override
	public int getIndex()
	{
		return index;
	}
}