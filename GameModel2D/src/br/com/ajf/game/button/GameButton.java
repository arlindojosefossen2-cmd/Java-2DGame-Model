package br.com.ajf.game.button;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import br.com.ajf.game.input.container.GameMouseContainer;
import br.com.ajf.game.util.FontLoader;


/**
 * The Class GameButton.
 * Author A.J.F.
 * @version 1.0
 * 17 June 2025

 */
public final class GameButton implements IGameButton
{
	
	/** The rect. */
	private Rectangle rect ;
	
	/** The mousein. */
	private boolean mousein;
	
	/** The i button clicked. */
	private IButtonClicked iButtonClicked;
	
	/** The font. */
	Font font ;
	
	/** The text. */
	private String text;
	
	/**  the size of the font to draw the text on button */
	private float size ;
	
	
	/**
	 * Instantiates a new game button.
	 *
	 * @param text the text
	 * @param xPos the x position
	 * @param yPos the y position
	 * @param width the width
	 * @param height the height
	 * @param fontSize the font size
	 * @param iButtonClicked the i button clicked
	 */
	public GameButton(String text,int xPos,int yPos,int width,int height,float fontSize,IButtonClicked iButtonClicked)
	{
		this.text = text;
		this.rect = new Rectangle(xPos,yPos,width,height);
		this.size  = fontSize;
		this.iButtonClicked = iButtonClicked;
	}

	
	/**
	 * Instantiates a new game button.
	 *
	 * @param text the text
	 * @param xPos the x position
	 * @param yPos the y position
	 * @param width the width
	 * @param height the height
	 * @param fontSize the font size
	 * @param fontPath the font path
	 * @param iButtonClicked the i button clicked
	 */
	public GameButton(String text,int xPos,int yPos,int width,int height,float fontSize,String fontPath,IButtonClicked iButtonClicked)
	{
		this.text = text;
		this.rect = new Rectangle(xPos,yPos,width,height);
		this.size = fontSize;
		this.iButtonClicked = iButtonClicked;
		FontLoader loader = new FontLoader();
		this.font = loader.getFont(fontPath);
	}
	
	/**
	 * Update.
	 */
	@Override
	public void update()
	{
		if(rect.contains(GameMouseContainer.mouseXPosition,GameMouseContainer.mouseYPosition))
		{
			mousein = true;
		}
		else
		{
			mousein = false;
		}
		if(mousein)
		{
			if(GameMouseContainer.mouseButtonLeft)
			{
				this.iButtonClicked.onClicked();
			}
		}	
	}

	/**
	 * Draw.
	 *
	 * @param graphics2d the graphics 2 d
	 */
	@Override
	public void draw(Graphics2D graphics2d)
	{

		if(font != null)
			graphics2d.setFont(font.deriveFont(size).deriveFont(Font.BOLD));
		else
			graphics2d.setFont(graphics2d.getFont().deriveFont(size).deriveFont(Font.BOLD));
		
		final FontMetrics fontMetrics = graphics2d.getFontMetrics();
		
		graphics2d.setStroke(new BasicStroke(3F));		
		graphics2d.setColor(Color.DARK_GRAY);
		graphics2d.drawRoundRect(rect.x-3, rect.y-3, rect.width+4, rect.height+4, 5, 5);
		
		if(mousein)
		{
			graphics2d.setColor(Color.LIGHT_GRAY);		
		}
		else
		{
			graphics2d.setColor(Color.GRAY);
		}
		
		graphics2d.fillRoundRect(rect.x, rect.y, rect.width, rect.height, 5, 5);
		
		graphics2d.setColor(Color.BLACK);		
		final int yPos = rect.y+(rect.height/2+((int)fontMetrics.getStringBounds(text, graphics2d).getHeight())/2-4);
		final int xPos = rect.x-(-rect.width/2+( (int)fontMetrics.getStringBounds(text, graphics2d).getWidth())/2);
		graphics2d.drawString(text, xPos, yPos);	
	}
}