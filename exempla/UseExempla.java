 package exempla;
 
import java.awt.Graphics2D;
import java.awt.Color;
 
import br.com.ajf.game.model.Game;
import br.com.ajf.game.scene.Scene;
 
 //simple exempla of how to use this Game library
 public final class UseExempla implements Scene
 {
	final int SCREEN_WIDHT = 1024 ,SCREEN_HEIGTH = 720;
	
	 public static void main(String[] args)
	 {
		 //create a Game and define some attributs title , width, height and thread
		Game game = new Game("Game Test - RPG",SCREEN_WIDHT ,SCREEN_HEIGTH, IGameThreadManager.GAME_THREAD_TIMER_TASK);
		
		//path of the image in project
		game.setIcon("/icon/statue.png");
		//create a scene and start the attributs
		Scene menu = new UseExempla(game);
		menu.start();
		//add the scen to the game
		game.addScene(menu);
		//init the window and thread to the Game 
		game.init(IGameThreadManager.GAME_THREAD_TIMER_TASK);
	 }
	 @Override
	public void start()
	{
		
	}
	
	@Override
	public void update()
	{
		
	}
	
	@Override
	public void draw(Graphics2D graphics2d)
	{
		//draw a red text to the screen of the window
		graphics2d.setColor(Color.RED);
		graphics2d.drawString("Testing",120,120);
	}
 }