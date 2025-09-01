package br.com.ajf.game.input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import br.com.ajf.game.input.container.GameInputContainer;

/**
 * The Class GameInput.
 *
 * Author A.J.F
 */
public final class GameInput
{
	/** The key adapter. */
	private final KeyAdapter keyAdapter;
	
	/**
	 * Instantiates a new game input.
	 */
	public GameInput()
	{
		keyAdapter = new KeyAdapter()
		{
			@Override
			public void keyPressed(final KeyEvent e)
			{
				GameInputContainer.keys(e.getKeyCode(),true);
				GameInputContainer.keyTyped[e.getKeyCode()] = true;
			}
			
			@Override
			public void keyReleased(final KeyEvent e)
			{
				GameInputContainer.keys(e.getKeyCode(),false);
			}
		};
	}

	/**
	 * Gets the key adapter.
	 *
	 * @return the key adapter
	 */
	public KeyAdapter getKeyAdapter()
	{
		return keyAdapter;
	}
}