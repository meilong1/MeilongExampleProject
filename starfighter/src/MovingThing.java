//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Moveable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int speed;
	/**
	 * Instantiates a MovingThing.
	 */
	public MovingThing()
	{
		this(10,10,20,20);
	}

	/**
	 * Instantiates a MovingThing.
	 * @param x
	 * @param y
	 */
	public MovingThing(int x, int y)
	{
		this(x,y,10,10);
	}

	/**
	 * Instantiates a MovingThing.
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 */
	public MovingThing(int x, int y, int w, int h)
	{
		//setPos(x - w / 2, y - w / 2);
		setPos(x,y);
		setWidth(w);
		setHeight(h);
	}

	
	public void setPos( int x, int y)
	{
		setX(x);
		setY(y);
	}

	public void setX(int x)
	{
		xPos = x;
	}

	public void setY(int y)
	{
		yPos = y;
	}

	public int getX()
	{
		return xPos;   //finish this method
	}

	public int getY()
	{
		return yPos;  //finish this method
	}

	public void setWidth(int w)
	{
		width = w;		//add code here
	}

	public void setHeight(int h)
	{
		height = h;		//add code here
	}

	public int getWidth()
	{
		return width;  //finish this method
	}

	public int getHeight()
	{
		return height;  //finish this method
	}
 
	
	/**Move the MovingThing.
	 * @param direction
	 */
	public abstract void move(String direction);
	/**
	 * Draw the MovingThing.
	 * @param window
	 */
	public abstract void draw(Graphics window);

	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight();
	}
}