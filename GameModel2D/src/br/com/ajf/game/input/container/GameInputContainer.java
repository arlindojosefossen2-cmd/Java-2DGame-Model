package br.com.ajf.game.input.container;

/**
 * Author A.J.F.
 * @version 1.0
 * 27 June 2025
 */
public final class GameInputContainer
{
	
	/** The keys. */
	public static boolean[] keys = new boolean[128];
	
	/** The key typed. */
	public static boolean[] keyTyped = new boolean[128];
	
//	/** boolean static field that check if UP arrow is pressed. */
//	public static boolean upKeyPressed;
//	
//	/** boolean static field that check if DOWN arrow is pressed. */
//	public static boolean downKeyPressed;
//	
//	/** boolean static field that check if LEFT arrow is pressed. */
//	public static boolean leftKeyPressed;
//	
//	/** boolean static field that check if RIGHT arrow is pressed. */
//	public static boolean rightKeyPressed;
//	
//	/** boolean static field that check if A is pressed. */
//	public static boolean aKeyPressed;
//	
//	/** boolean static field that check if W is pressed. */
//	public static boolean wKeyPressed;
//	
//	/** boolean static field that check if S is pressed. */
//	public static boolean sKeyPressed;
//	
//	/** boolean static field that check if D is pressed. */
//	public static boolean dKeyPressed;
//	
//	/** The i key pressed. */
//	public static boolean iKeyPressed;
//	
//	/** The p key pressed. */
//	public static boolean pKeyPressed;
//	
//	/** The enter key pressed. */
//	public static boolean enterKeyPressed;
//	
//	/** The space key pressed. */
//	public static boolean spaceKeyPressed;
//	
//	/** The key pressed. */
//	public static boolean fKeyPressed;
	
	/**
	 * Instantiates a new game input container.
	 */
	private GameInputContainer()
	{
		
	}
	
	/**
	 * Keys.
	 *
	 * @param keycode the key code
	 * @param ispressed the button is pressed
	 */
	public static void keys(final int keycode,final boolean ispressed)
	{
		keys[keycode] = ispressed;
//		switch(keycode)
//		{
//			case KeyEvent.VK_UP:
//				
//				upKeyPressed = ispressed;
//				break;
//			case KeyEvent.VK_DOWN:
//						
//				downKeyPressed = ispressed;
//				break;
//			case KeyEvent.VK_RIGHT:
//				
//				rightKeyPressed = ispressed;
//				break;
//			case KeyEvent.VK_LEFT:
//				
//				leftKeyPressed = ispressed;
//				break;
//			case KeyEvent.VK_W:
//							
//				wKeyPressed = ispressed;
//				break;
//			case KeyEvent.VK_A:
//				
//				aKeyPressed = ispressed;
//				break;
//			case KeyEvent.VK_S:
//				
//				sKeyPressed = ispressed;
//				break;
//			case KeyEvent.VK_D:
//				
//				dKeyPressed = ispressed;
//				break;
//			case KeyEvent.VK_I:
//				
//				iKeyPressed = ispressed;
//				break;
//				
//			case KeyEvent.VK_P:
//				
//				pKeyPressed = ispressed;
//				break;
//				
//			case KeyEvent.VK_ENTER:
//				
//				enterKeyPressed = ispressed;
//				break;
//				
//			case KeyEvent.VK_SPACE:
//				
//				spaceKeyPressed = ispressed;
//				break;
//			case KeyEvent.VK_F:
//				
//				fKeyPressed = ispressed;
//				break;
//		}
	}		
	/**
	 * Reset.
	 */
	public static void reset()
	{
		
		for(int i =0;i < keys.length;i++)
			keys[i] = false;
		
		for(int i =0;i < keyTyped.length;i++)
			keyTyped[i] = false;
		
//		aKeyPressed = false;
//		dKeyPressed = false;
//		downKeyPressed = false;
//		leftKeyPressed = false;
//		rightKeyPressed = false;
//		sKeyPressed = false;
//		upKeyPressed = false;
//		wKeyPressed = false;
//		iKeyPressed = false;
//		pKeyPressed = false;
//		fKeyPressed = false;
//		enterKeyPressed = false;
//		spaceKeyPressed = false;
	}
}