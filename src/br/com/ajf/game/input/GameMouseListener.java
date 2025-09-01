package br.com.ajf.game.input;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import br.com.ajf.game.input.container.GameMouseContainer;

/**
 * The Class GameMouse.
 * 
 * Author A.J.F
 */
public final class GameMouseListener
{
	
	/** The adapter. */
	private final MouseAdapter adapter;
	/**
	 * Instantiates a new game mouse.
	 */
	public GameMouseListener()
	{
		adapter = new MouseAdapter()
		{
			@Override
			public void mouseClicked(final MouseEvent e)
			{
				switch(e.getButton())
				{
					case MouseEvent.BUTTON1:
						GameMouseContainer.mouseButtonLeftClicked = true;
						break;
						
					case MouseEvent.BUTTON3:
						GameMouseContainer.mouseButtonRightClicked = true;
						break;
				}
			}
			
			@Override
			public void mousePressed(final MouseEvent e)
			{
			GameMouseContainer.mouse(e.getButton(),true);
			}

			@Override
			public void mouseReleased(final MouseEvent e)
			{
				GameMouseContainer.mouse(e.getButton(),false);
			}
			
			@Override
			public void mouseMoved(MouseEvent e)
			{
				GameMouseContainer.mouseXPosition = e.getX();
				GameMouseContainer.mouseYPosition = e.getY();			
			}
		};
	}
	
	/**
	 * Gets the adapter.
	 *
	 * @return the adapter
	 */
	public MouseAdapter getAdapter()
	{
		return adapter;
	}
}