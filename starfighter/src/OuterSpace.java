//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
    private AlienHorde horde = new AlienHorde(4);
	public Bullets shots = new Bullets();
	int tick = 0;
	int moveTimer = 0;
	int powerTimer = 0;
	private boolean[] keys;
	private BufferedImage back;
	private AllPower powerups = new AllPower();
	private PowerUp pu = new PowerUp();
	Random r = new Random();
	boolean powerup = false;
	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		
		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(400,500,70,70,2);
		PowerUp pu = new PowerUp();
		int alienXPos = -200;
		int alienYPos = -500;
		int rows = 6;
		int columns = 4;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				Alien alien = new Alien(alienXPos,alienYPos,1);
				horde.add(alien);
				alienYPos += 75;
			}
			
			alienXPos += 100;
			alienYPos = 0;
		}
		
		//bullet = new Ammo(400,500,3);
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
	   
   }

	public void paint( Graphics window )
	{
		
		
		
		tick++;
		moveTimer++;
		powerTimer++;
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		horde.drawEmAll(graphToBack);
		//pu.draw(graphToBack);
		//bullet.draw(graphToBack);
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true){
			ship.move("RIGHT");
		}
		if(keys[2] == true){
			ship.move("UP");
		}
		if(keys[3] == true){
			ship.move("DOWN");
		}
		
		if(keys[4] == true){
			if(powerup && tick > 200){
				Ammo a = new Ammo(ship.getX() + 33, ship.getY(), 30,30, 3);
				shots.add(a);
				for(int i = 0; i < 10; i++){
					ship.draw(graphToBack);
					ship.move("DOWN");
				}
				
				tick = 0;
			}else{
				if(!powerup && tick > 50){
					Ammo a = new Ammo(ship.getX() + 33, ship.getY(),10,10,3);
					shots.add(a);
					tick = 0;
				}
			}
			
				
				
		}
			
		

		shots.moveEmAll();
		shots.drawEmAll(graphToBack);
		//add code to move Ship, Alien, etc.
		graphToBack.setColor(Color.WHITE);
		try{
			for(Alien x : horde.getList()){
				if(moveTimer > 100 && moveTimer < 150){
					x.move("RIGHT");
					
					
				}
				if(moveTimer > 250 && moveTimer < 300){
					x.move("DOWN");
				}
				if(moveTimer > 400 && moveTimer < 420){
					x.move("RIGHT");
				}
				if(moveTimer > 500){
					moveTimer = 0;
				}
			}
		}catch(Exception e){
			
		}
		
//		if(ifPower > 80){
//			pu.draw(graphToBack);
//		}
//		pu.move("DOWN");
		
		//for(int i = 0; i < 2; i++){
			
		//}
		if(powerup){
			
		}else{
			pu.draw(graphToBack);
			if(powerTimer > 200){
				pu.move("DOWN");
				pu.draw(graphToBack);
				powerTimer = 0;
			}
		}
		
		
		
		
		

		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		try{
			for(Ammo am : shots.getList()){
				for(Alien al : horde.getList()){
					if(Math.abs(am.getX() - al.getX()) < 50 && Math.abs(am.getY() - al.getY()) < 50){
						if(powerup){
							horde.remove(al);
						}else{
							shots.remove(am);
							horde.remove(al);
						}
						//shots.cleanEmUp();
						//horde.removeDeadOnes(shots.getList());
						
					}
				}
			}
		}catch(Exception e){
			
		}
		
		if(Math.abs(pu.getX() - ship.getX()) < 50 && Math.abs(pu.getY() - ship.getY()) < 50){
			powerup = true;
			
		}

		twoDGraph.drawImage(back, null, 0, 0);
		
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			
			keys[4] = true;
				
			
			
		}
		//repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		//repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
    	  System.out.println("oops");
      }
  	}
}

