//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	
	/**
	 * Instantiates an Ammo.
	 */
	public Ammo()
	{
		this(400,500,0);
	}

	/**
	 * Instantiates an Ammo.
	 * @param x
	 * @param y
	 */
	public Ammo(int x, int y)
	{
		this(x,y,0);
	}

	/**
	 * Instantiates an Ammo.
	 * @param x
	 * @param y
	 * @param s
	 */
	public Ammo(int x, int y, int s)
	{
		super(x,y);
		setSpeed(s);
		
	}
	/**
	 * Instantiates an Ammo.
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 * @param s
	 */
	public Ammo(int x, int y, int w, int h, int s){
		super(x, y, w, h);
		setSpeed(s);
	}
	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
		//window.fillRect(getX(), getY(), getWidth(), getHeight());
		window.fillOval(getX(), getY(), getWidth(), getHeight());
	}
	
	
	public void move( String direction )
	{
		
		setY(getY() - speed);
			
		
		
	}

	public String toString()
	{
		return "";
	}

	
}
