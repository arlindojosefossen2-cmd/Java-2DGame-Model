package br.com.ajf.game.input.container;

import java.awt.event.MouseEvent;

/**
 * Author A.J.F.
 * @version 1.0
 * 27 June 2025
 */
public final class GameMouseContainer
{
	/** boolean static field that check if the left button of the mouse is pressed. */
	public static boolean mouseButtonLeft;
	
	/**  boolean static field that check if the right button of the mouse is pressed. */
	public static boolean mouseButtonRight;
	
	/**  boolean static field that check if the right button of the mouse is clicked. */
	public static boolean  mouseButtonLeftClicked;
	
	/**  boolean static field that check if the left button of the mouse is clicked. */
	public static boolean mouseButtonRightClicked;
	
	/** integer value of the x position of the cursor on screen. */
	public static int mouseXPosition;
	
	/** integer value of the y position of the cursor on screen. */
	public static int mouseYPosition;

	/**
	 * Instantiates a new game mouse container.
	 */
	private GameMouseContainer()
	{
		
	}
	
	/**
	 * Mouse.
	 * @param button the button
	 * @param b the b
	 */
	public static void mouse(final int button,final boolean b)
	{
		switch(button)
		{
			case MouseEvent.BUTTON1:
				mouseButtonLeft = b;
				break;
				
			case MouseEvent.BUTTON3:
				mouseButtonRight = b;
				break;
		}
	}
}