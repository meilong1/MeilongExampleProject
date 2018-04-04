//© A+ Computer Science  -  www.apluscompsci.com
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
import java.util.Random;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rightscore;
	private int leftscore;
	private Wall up, down, left, right;
	Random rand = new Random();

	public Pong()
	{
		
		ball = new Ball(600,200,10,10,Color.BLUE,3,2);


		leftPaddle = new Paddle(50,200,20,95,Color.RED,7);
		rightPaddle = new Paddle(730,200,20,95,Color.RED,7);
		
		up = new Wall(0,0,800,10,Color.GRAY);
		down = new Wall(0,551,800,10,Color.GRAY);
		left = new Wall(0,10,10,541,Color.GRAY);
		right = new Wall(774,10,10,541,Color.GRAY);
		
		rightscore = 0;
		leftscore = 0;

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		Graphics2D twoDGraph = (Graphics2D)window;


		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		up.draw(graphToBack);
		down.draw(graphToBack);
		left.draw(graphToBack);
		right.draw(graphToBack);

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("SCOREBOARD",350,80);

		

		if (ball.didCollideLeft(left) || ball.didCollideRight(right))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			
			if (ball.didCollideLeft(left)){
				rightscore = rightscore + 1;
			}
			if (ball.didCollideRight(right)){
				leftscore = leftscore + 1;
			}
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Left: " + (leftscore-1), 350, 100);
			graphToBack.drawString("Right: " + (rightscore-1), 350, 120);
			graphToBack.setColor(Color.BLUE);
			graphToBack.drawString("Left: " + leftscore, 350, 100);
			graphToBack.drawString("Right: " + rightscore, 350, 120);
			
			ball.draw(graphToBack,Color.WHITE);
			ball.setX(400);
			ball.setY(300);
			ball.setColor(Color.BLUE);
			int dir = rand.nextInt(2);
			if (dir == 0){
				ball.setXSpeed(-(int)(Math.random() * 3 + 2));
			}
			else{
				ball.setXSpeed((int)(Math.random() * 3 + 2));
			}
			int ranspeed = (int)(Math.random() * 3);
			int direction = rand.nextInt(2);
			if (ranspeed == 0){
				if (direction == 0){
					ball.setYSpeed(-(ranspeed+1));
				}
				else{
					ball.setYSpeed((ranspeed+1));
				}
			}
			else{
				if (direction == 0){
					ball.setYSpeed(-ranspeed);
				}
				else{
					ball.setYSpeed(ranspeed);
				}
			}
		}

		if (ball.didCollideLeft(leftPaddle)|| ball.didCollideRight(rightPaddle)){
			ball.setXSpeed(-ball.getXSpeed());
			
			
		}
		if (ball.didCollideTop(up) || ball.didCollideBottom(down)){
			ball.setYSpeed(-ball.getYSpeed());
			
		}
		else if (ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle)){
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
			
			
		}
		else if (ball.didCollideTop(rightPaddle) || ball.didCollideBottom(rightPaddle)){
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
			
		}

		if(keys[0] == true)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}