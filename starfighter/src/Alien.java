//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	/**
	 * Instantiates a new Alien.
	 */
	public Alien()
	{
		
		this(0,0,30,30,0);
	}

	/**Instantiates a new Alien.
	 * @param x
	 * @param y
	 */
	public Alien(int x, int y)
	{
		
		this(x,y,30,30,0);
	}

	/**
	 * Instantiates a new Alien.
	 * @param x
	 * @param y
	 * @param s
	 */
	public Alien(int x, int y, int s)
	{
		
		this(x,y,30,30,s);
	}

	/**
	 * Instantiates a new Alien.
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 * @param s
	 */
	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
//			URL url = getClass().getResource("/images/alien.jpg");
//			image = ImageIO.read(url);
			image = ImageIO.read(new File("C:\\Users\\zhangm0123\\Desktop\\MeilongExampleProject\\starfighter\\src\\alien.JPG"));
		}
		catch(Exception e)
		{
			
			System.out.println("Alien error");
		}
	}

	
	public void setSpeed(int s)
	{
		
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   
	   if(direction.toLowerCase().equals("up")){
			setY(getY() - getSpeed());
		}else if(direction.toLowerCase().equals("down")){
			setY(getY() + getSpeed());
		}else if(direction.toLowerCase().equals("right")){
			setX(getX() + getSpeed());
		}else if(direction.toLowerCase().equals("left")){
			setX(getX() - getSpeed());
		}
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}
