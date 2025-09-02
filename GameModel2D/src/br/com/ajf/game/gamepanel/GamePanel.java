package br.com.ajf.game.gamepanel;

import br.com.ajf.game.input.container.GameInputContainer;
import br.com.ajf.game.input.container.GameMouseContainer;
import br.com.ajf.game.scene.Scene;

/**
 * 
 * Author A.J.F.
 * @version 1.0
 * 27 June 2025
 */
public final class GamePanel
{
	/** The game panel manager. */
	private IGamePanelManager gamepanelManager;

	/**
	 * Instantiates a new game panel.
	 *
	 * @param width the size of the screen
	 * @param height the size of the screen
	 * @param threadtype type of the thread
	 */
	public GamePanel(final int width,final int height,final int threadtype)
	{
		this.gamepanelManager = new GamePanelManager(width, height,this,threadtype);
		this.gamepanelManager.createJPanelAndAddProperties();
	}	
	
	/**
	 * this method update the state.
	 */
	public void update()
	{
		this.gamepanelManager.update();
	}
	
	/**
	 * Draw.
	 */
	public void draw()
	{
		this.gamepanelManager.drawToBufferedImage();
		this.gamepanelManager.drawToScreen();
	}

	/**
	 * this method reset the inputs if the window focus lost.
	 */
	public void reset()
	{
		GameMouseContainer.mouseButtonLeft =false;
		GameMouseContainer.mouseButtonLeftClicked =false;
		GameMouseContainer.mouseButtonRight=false;
		GameMouseContainer.mouseButtonRightClicked=false;
		
		GameInputContainer.reset();
	}
	
	/**
	 * this method start all the states in the list and the thread.
	 *
	 * @param threadtype type of the thread
	 */
	public void start(final int threadtype)
	{	
		this.gamepanelManager.start(threadtype);
	}

	/**
	 * Sets the scene.
	 *
	 * @param scene the new scene
	 */
	public void setScene(Scene scene)
	{
		gamepanelManager.setScene(scene);
	}
	
	/**
	 * Gets the game panel manager.
	 *
	 * @return the game panel manager
	 */
	public IGamePanelManager getGamepanelManager()
	{
		return gamepanelManager;
	}
}