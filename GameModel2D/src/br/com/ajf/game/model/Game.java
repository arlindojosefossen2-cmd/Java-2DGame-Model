package br.com.ajf.game.model;

import br.com.ajf.game.gamepanel.GamePanel;
import br.com.ajf.game.scene.Scene;
import br.com.ajf.game.window.GameWindow;
import br.com.ajf.game.window.IGameWindow;

/**
 * Author A.J.F.
 * @version 1.0
 * 30 June 2025
 */
public final class Game implements GameBehaviours
{
	/** The game panel. */
	private GamePanel gamepanel;
	
	/** The game window. */
	private IGameWindow gamewindow;
	
	/**
	 * Instantiates a new game.
	 *
	 * @param title the title
	 * @param width the width
	 * @param height the height
	 * @param threadType the thread type
	 */
	public Game(String title,int width, int height,int threadType)
	{
		gamepanel = new GamePanel(width,height, threadType);
		
		gamewindow = new GameWindow(title);
	}
	
	/**
	 * Instantiates the attributes and the thread.
	 *
	 * @param threadType the thread type
	 */
	public void init(int threadType)
	{
		gamewindow.init(gamepanel, threadType);
	}
	
	/**
	 * Adds the state.
	 *
	 * @param scene the scene
	 */
	public void addScene(Scene scene)
	{
		gamepanel.setScene(scene);
	}

	/**
	 * Sets the icon.
	 *
	 * @param path the new icon
	 */
	@Override
	public void setIcon(String path)
	{
		this.gamewindow.setIcon(path);
	}
}