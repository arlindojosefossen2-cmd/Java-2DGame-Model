package br.com.ajf.game.util;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * The Class ImageLoader.
 *
 * Author A.J.F
 * @version 1.0
 */
public final class ImageLoader
{
	
	/**
	 * Instantiates a new image loader.
	 */
	public ImageLoader()	{	}
	
	/**
	 * Gets the image.
	 *
	 * @param path way of the image resource
	 * @return a BufferedImage or null
	 * method used to load images
	 */
	public BufferedImage getImage(String path)
	{
		BufferedImage img = null;
		
			try
			{
				img = ImageIO.read(ImageLoader.class.getResourceAsStream(path));
			} 
			catch (IOException err)
			{
				err.printStackTrace();
			}	
			
		return img;
	}

	/**
	 * Gets the scaled image.
	 *
	 * @param path way of the image resource
	 * @param scale is the scale of the image
	 * @return a BufferedImage or null
	 * method used to load scaled images
	 */
	public BufferedImage getScaledImage(final String path,final float scale)
	{
		BufferedImage aux  = null;
		
			try
			{
				final BufferedImage img = ImageIO.read(ImageLoader.class.getResourceAsStream(path));
				
				final int width = (int) (img.getWidth()*scale);
				final int height = (int) (img.getHeight()*scale);
				
				aux = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
				
				final Graphics2D g2d = aux.createGraphics();
				g2d.drawImage(img, 0, 0, width, height, null);
				g2d.dispose();					
			}
			catch (IOException err)
			{
				err.printStackTrace();
			}
	
		return aux;
	}
}