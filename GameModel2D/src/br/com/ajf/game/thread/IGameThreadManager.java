
package br.com.ajf.game.thread;


/**
 * The Interface IGameThreadManager.
 *
 * Author A.J.F
 */
@FunctionalInterface
public interface IGameThreadManager
{
	
	/** The Constant GAME_THREAD_RUNNABLE. */
	public static final int GAME_THREAD_RUNNABLE = 0;

	/** The Constant GAME_THREAD_TIMER_TASK. */
	public static final int GAME_THREAD_TIMER_TASK = 1;

	/** The Constant GAME_THREAD_DEFAULT. */
	public static final int GAME_THREAD_DEFAULT = 0;

	/**
	 * Start.
	 *
	 * @param threadtype type of the thread
	 */
	void start(int threadtype);
}