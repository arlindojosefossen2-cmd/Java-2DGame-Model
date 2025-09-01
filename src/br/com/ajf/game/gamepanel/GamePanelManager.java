package br.com.ajf.game.gamepanel;

import javax.swing.JPanel;

import br.com.ajf.game.render.GameRender;
import br.com.ajf.game.scene.Scene;
import br.com.ajf.game.thread.GameThreadManager;
import br.com.ajf.game.thread.IGameThreadManager;

/**
 * Author A.J.F.
 * @version 1.0
 * 27 June 2025
 */
public final class GamePanelManager implements IGamePanelManager
{
    
    /** The game render. */
    private GameRender gamerender;
	
	/** The game thread manager. */
	private IGameThreadManager gameThreadManager;

    /**
     * Instantiates a new game panel manager.
     *
     * @param width the size of the screen
     * @param height the size of the screen
     * @param gamepanel the game panel
     * @param threadtype the thread type
     */
	public GamePanelManager(final int width,final int height, GamePanel gamepanel, int threadtype)
	{
		gamerender = new GameRender(width, height);
		this.gameThreadManager = new GameThreadManager(gamepanel,threadtype);	
	}
    
	/**
	 * this method create a JPanel and add properties.
	 */
	@Override
	public void createJPanelAndAddProperties()
	{
		gamerender.createJPanelAndAddProperties();
	}
	
	/**
	 * this method draw the state to the imageScreen.
	 */
	@Override
	public void drawToBufferedImage()
	{
		gamerender.drawToBufferedImage();
	}
	
	/**
	 * this method draw the imageScreen to the window.
	 */
	@Override
	public void drawToScreen()
	{
		gamerender.drawToScreen();
	}
	
	/**
	 * Sets the scene manager.
	 */
	@Override
	public void setScene(Scene scene)
	{
		gamerender.setScene(scene);
	}
	
	/**
	 * Gets the canvas.
	 *
	 * @return the canvas
	 */
	@Override
	public JPanel getCanvas()
	{
		return gamerender.getCanvas();
	}

	/**
	 * this method update the state.
	 */
	@Override
	public void update()
	{
		gamerender.update();
	}

	/**
	 * this method start the state.
	 *
	 * @param threadtype the thread type
	 */
	@Override
	public void start(int threadtype)
	{
		gameThreadManager.start(threadtype);
	}
}