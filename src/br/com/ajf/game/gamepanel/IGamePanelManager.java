package br.com.ajf.game.gamepanel;

import javax.swing.JPanel;

import br.com.ajf.game.scene.Scene;

/**
 * The Interface IGamePanelManager.
 *
 * Author A.J.F
 */
public interface IGamePanelManager
{
	
	/**
	 * Creates the J panel and add properties.
	 */
	void createJPanelAndAddProperties();
	
	/**
	 * this method draw the state to the imageScreen.
	 */
	 void drawToBufferedImage();
	
	/**
	 * this method draw the imageScreen to the window.
	 */
	 void drawToScreen();
	
	/**
	 * Gets the canvas.
	 *
	 * @return the canvas
	 */
	 JPanel getCanvas();

	/**
	 * this method update the state.
	 */
	 void update();

	/**
	 * this method start the state.
	 *
	 * @param threadtype the thread type
	 */
	 void start(int threadtype);


	/**
	 * Sets the scene.
	 *
	 * @param scene the new scene
	 */
	void setScene(Scene scene);
}