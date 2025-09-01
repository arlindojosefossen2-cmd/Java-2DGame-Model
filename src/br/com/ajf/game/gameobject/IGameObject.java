package br.com.ajf.game.gameobject;

import java.util.List;

/**
 * Author A.J.F.
 * @version 1.0
 * 17 June 2025
 */
public interface IGameObject
{
	 
 	/**
 	 * Adds the component.
 	 *
 	 * @param <T> the generic type
 	 * @param component the component
 	 */
 	<T extends IComponent> void addComponent(T component);
	 
 	/**
 	 * Removes the component by class.
 	 *
 	 * @param <T> the generic type
 	 * @param componentClass the component class
 	 */
 	<T extends IComponent> void removeComponentByClass(Class<T> componentClass);
	 
 	/**
 	 * Gets the component by class.
 	 *
 	 * @param <T> the generic type
 	 * @param componentclass the componentclass
 	 * @return the component by class
 	 */
 	<T extends IComponent> T getComponentByClass(Class<T> componentclass);
 	
	
	/**
	 * Gets the components.
	 *
	 * @return the components
	 */
	List<IComponent> getComponents();
}