package br.com.ajf.game.window;

import br.com.ajf.game.gamepanel.GamePanel;

/**
 * Author A.J.F.
 * @version 1.0
 * 30 June 2025
 */
public sealed interface IGameWindow permits GameWindow
{
	
	/**
	 * Instantiates the window attributes.
	 *
	 * @param gamepanel the game panel
	 * @param threadtype the thread type
	 */
	void init(final GamePanel gamepanel,final int threadtype);
	
	/**
	 * Sets the icon.
	 *
	 * @param path the new icon
	 */
	void setIcon(String path);
}