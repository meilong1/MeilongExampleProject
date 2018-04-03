//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
		setSpeed(5);
   }


   //add the other Paddle constructors
   public Paddle(int x, int y){
	   super(x, y);
	   setSpeed(5);
   }
   
   public Paddle(int x, int y, int s){
	   super(x, y);
	   setSpeed(s);
   }
   
   public Paddle(int x, int y, int w, int h, int s){
	   super(x, y, w, h);
	   setSpeed(s);
   }
   
   public Paddle(int x, int y, int w, int h, Color col, int s){
	   super(x, y, w, h, col);
	   setSpeed(s);
   }

   public void setSpeed(int s){
	   speed = s;
   }
   
   public int getSpeed(){
	   return speed;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   
	   Color temp = getColor();
	   draw(window, Color.WHITE);
	   setY(getY() - getSpeed());
	   draw(window, temp);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   Color temp = getColor();
	   draw(window, Color.WHITE);
	   setY(getY() + getSpeed());
	   draw(window, temp);

   }


   public String toString(){
	   return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getSpeed();
   }
}