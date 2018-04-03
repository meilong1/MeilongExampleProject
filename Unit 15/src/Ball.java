//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		setXSpeed(3);
		setYSpeed(1);
		setColor(Color.BLUE);
	}

	//add the other Ball constructors
	public Ball(int x, int y){
		super(x, y);
		setXSpeed(3);
		setYSpeed(1);
		setColor(Color.BLUE);
	}
	
	public Ball(int x, int y, int w, int h){
		super(x, y, w, h);
		setXSpeed(3);
		setYSpeed(1);
		setColor(Color.BLUE);
	}
	
	
	public Ball(int x, int y, int w, int h, Color color){
		super(x, y, w, h, color);
		setXSpeed(3);
		setYSpeed(1);
		setColor(Color.BLUE);
	}
	public Ball(int x, int y, int w, int h, Color color, int userXSpeed, int userYSpeed){
		super(x, y, w, h, color);
		setXSpeed(userXSpeed);
		setYSpeed(userYSpeed);
		setColor(Color.BLUE);
	}
   //add the set methods
	public void setXSpeed(int xS){
		xSpeed = xS;
	}
	public void setYSpeed(int yS){
		ySpeed = yS;
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location

	   Color temp = getColor();
	   draw(window, Color.WHITE);
	   setPos(getX() + xSpeed, getY() + ySpeed);
     
      draw(window, temp);
   }
   
	public boolean equals(Object obj)
	{
		Ball newBall = (Ball)obj;
		if(super.equals(newBall) && this.getXSpeed() == newBall.getXSpeed() && this.getYSpeed() == newBall.getYSpeed()){
			return true;
		}

		return false;
	}   

   //add the get methods
	public int getXSpeed(){
		return xSpeed;
	}
	public int getYSpeed(){
		return ySpeed;
	}

   //add a toString() method
	public String toString(){
		return super.toString() + " " + getXSpeed() + " " + getYSpeed();
		
	}

@Override
public boolean didCollideLeft(Object obj) {
	// TODO Auto-generated method stub
	Wall temp = (Wall)obj;
	
	return this.getX() <= temp.getLeft();
}

@Override
public boolean didCollideRight(Object obj) {
	// TODO Auto-generated method stub
	Wall temp = (Wall)obj;
	return this.getX() >= temp.getRight();
}

@Override
public boolean didCollideTop(Object obj) {
	// TODO Auto-generated method stub
	Wall temp = (Wall)obj;
	return this.getY() <= temp.getTop();
	
}

@Override
public boolean didCollideBottom(Object obj) {
	// TODO Auto-generated method stub
	Wall temp = (Wall)obj;
	return this.getY() + 9 >= temp.getTop();
}
}