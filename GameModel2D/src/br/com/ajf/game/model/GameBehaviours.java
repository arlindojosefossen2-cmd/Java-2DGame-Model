package br.com.ajf.game.model;

import br.com.ajf.game.scene.Scene;

/** 
 * Author A.J.F.
 * @version 1.0
 * 30 June 2025
 */
public sealed interface GameBehaviours permits Game
{
 	/**
 	 * Instantiates the attributes and thread.
 	 *
 	 * @param threadType the thread type
 	 */
 	void init(int threadType);
	 
	/**
	 * Adds the state.
	 *
	 * @param scene the scene
	 */
	 void addScene(Scene scene);
	 
	 /**
 	 * Sets the icon.
 	 *
 	 * @param path the new icon
 	 */
 	void setIcon(String path);
}