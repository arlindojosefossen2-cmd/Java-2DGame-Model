package br.com.ajf.game.thread;

import br.com.ajf.game.gamepanel.GamePanel;

/**
 * The Class GameThread.
 *
 * Author A.J.F
 */
public final class GameThread implements Runnable
{
	/** The game panel. */
	private final GamePanel gamepanel;
	
	/** The thread. */
	private final Thread thread;
	
	/** The running. */
	public boolean running;
	
	/**
	 * Instantiates a new game thread.
	 *
	 * @param gamePanel Constructor that start the field
	 */
	public GameThread(GamePanel gamePanel)
	{
		this.gamepanel = gamePanel;
		this.thread = new Thread(this);
	}
	
	/**
	 * Run.
	 *
	 * @see java.lang.Runnable#run()
	 * method that run the thread
	 */
	@Override
	public void run()
	{
		final float FPS = 60F;
		final double drawInterval = 1_000_000_000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
//        long timer = 0;
//        int drawCount = 0;
		
		while(this.running)
		{
			 currentTime = System.nanoTime();
	         delta += (currentTime - lastTime) / drawInterval;
//	         timer += (currentTime - lastTime);
	         lastTime = currentTime;

	         if (delta >= 1) 
	         {    
	        	 this.gamepanel.update();
	        	 this.gamepanel.draw();

	             delta--;
//	             drawCount++;
	         }

//	         if (timer >= 1_000_000_000) 
//	         {
//	        	 System.out.println(drawCount);
//	        	 drawCount = 0;
//	        	 timer = 0;
//	         }
		}
		
		try
		{
			this.thread.join();
		} 
		catch (InterruptedException err)
		{
			err.printStackTrace();
		}
	}
	
	/**
	 * method that start the thread.
	 */
	public void start()
	{
		this.running = true;
		this.thread.start();
	}
}