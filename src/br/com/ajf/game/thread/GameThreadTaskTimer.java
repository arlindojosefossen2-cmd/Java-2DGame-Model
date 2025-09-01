package br.com.ajf.game.thread;

import java.util.Timer;
import java.util.TimerTask;

import br.com.ajf.game.gamepanel.GamePanel;


/**
 * The Class GameThreadTaskTimer.
 *
 * Author A.J.F
 */
public final class GameThreadTaskTimer
{	
	
	/** The timer. */
	private final Timer timer;
	
	/** The timer task. */
	private final TimerTask timerTask;
	
	/**
	 * Instantiates a new game thread task timer.
	 *
	 * @param gamepanel Constructor that start the field
	 */
	public GameThreadTaskTimer(final GamePanel gamepanel)
	{
		this.timer = new Timer();
		this.timerTask = new TimerTask()
		{
			
			@Override
			public void run()
			{
				gamepanel.update();
				gamepanel.draw();
			}
		};
	}

	/**
	 * method that start the thread.
	 */
	public void start()
	{
		this.timer.schedule(this.timerTask, 1, 20);
	}
}