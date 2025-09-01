package br.com.ajf.game.gameobject;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Author A.J.F.
 * @version 1.0
 * 17 June 2025
 */
public final class GameObject implements IGameObject
{
	
	/** The components. */
	private List<IComponent> components = new ArrayList<>();
	
	/**
	 * Instantiates a new game object.
	 */
	public GameObject()
	{
		
	}

	/**
	 * Adds the component.
	 *
	 * @param <T> the generic type
	 * @param component the component
	 */
	@Override
	public <T extends IComponent> void addComponent(T component)
	{
		component.setGameObject(this);
		this.components.add(component);
	}

	/**
	 * Removes the component by class.
	 *
	 * @param <T> the generic type
	 * @param componentClass the component class
	 */
	@Override
	public <T extends IComponent> void removeComponentByClass(Class<T> componentClass)
	{
		for (int index = 0; index < this.components.size(); index++)
		{
			if(componentClass.isAssignableFrom(this.components.get(index).getClass()))
			{
				this.components.remove(index);
			}
		}
	}

	/**
	 * Gets the component by class.
	 *
	 * @param <T> the generic type
	 * @param componentClass the component class
	 * @return the component by class
	 */
	@Override
	public <T extends IComponent> T getComponentByClass(Class<T> componentClass)
	{
		for (int index = 0; index < this.components.size(); index++)
		{
			if(componentClass.isAssignableFrom(this.components.get(index).getClass()))
			{
				return componentClass.cast(components.get(index));
			}		
		}
		return null;
	}

	/**
	 * Gets the components.
	 *
	 * @return the components
	 */
	@Override
	public List<IComponent> getComponents()
	{
		return components;
	}
}