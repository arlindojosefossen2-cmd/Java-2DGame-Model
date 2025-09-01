package br.com.ajf.game.gameobject;


/**
 * Author A.J.F.
 * @version 1.0
 * 17 June 2025
 */
public interface IComponent
{
	
	/**
	 * Update.
	 */
	void update();
	
	/**
	 * Sets the game object.
	 *
	 * @param gameobject the new game object
	 */
	void setGameObject(IGameObject gameobject);
}