package br.com.ajf.game.thread;

import br.com.ajf.game.gamepanel.GamePanel;

/**
 * The Class GameThreadManager.
 *
 * Author A.J.F
 */
public final class GameThreadManager implements IGameThreadManager
{	
    
    /** The game thread. */
    private GameThread gameThread ;
    
    /** The thread timer. */
    private GameThreadTaskTimer threadTimer;

	/**
	 * Instantiates a new game thread manager.
	 *
	 * @param gamepanel the game that do
	 * @param threadtype the type of the thread
	 */
	public GameThreadManager(GamePanel gamepanel,int threadtype)
	{
		switch(threadtype)
		{
			case 0:
				this.gameThread = new GameThread(gamepanel);
				break;
				
			case 1:
				this.threadTimer = new GameThreadTaskTimer(gamepanel);
				break;
				
			default:
				this.gameThread = new GameThread(gamepanel);
				break;
					
		}
	}

	
	/**
	 * Start.
	 *
	 * @param threadtype the thread type
	 */
	@Override
	public void start(int threadtype)
	{
		switch(threadtype)
		{
			case 0:
				this.gameThread.start();
				break;
				
			case 1:
				this.threadTimer.start();
				break;
				
			default:
				this.gameThread.start();
				break;		
		}
	}
}