//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setPos(100, 150);
		setHeight(10);
		setWidth(10);
		setColor(Color.BLACK);

	}
	public Block(int x, int y){
		setX(x);
		setY(y);
	}
	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int width, int height){
		setX(x);
		setY(y);
		//setPos(x, y);
		setWidth(width);
		setHeight(height);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, int width, int height, Color color){
		//setX(x);
		//setY(y);
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
		setColor(color);
	}
	
	

   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;

   }
   public void setX(int userX){
	   xPos = userX;
   }
   public void setY(int userY){
	   yPos = userY;
   }
   public void setWidth(int userWidth){
	   width = userWidth;
   }
   public void setHeight(int userHeight){
	   height = userHeight;
   }
 
   
   

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		Block testBlock = (Block)obj;
		if(getX() == testBlock.getX() && getY() == testBlock.getY() && getHeight() == testBlock.getHeight() && getWidth() == testBlock.getWidth() && getColor().equals(testBlock.getColor())){
			return true;
		}



		return false;
	}   

   //add the other get methods
	  public int getX(){
		   return xPos;
	   }
	   public int getY(){
		   return yPos;
	   }
	   public int getWidth(){
		   return width;
	   }
	   public int getHeight(){
		   return height;
	   }
	   public Color getColor(){
		   return color;
	   }    

   //add a toString() method  - x , y , width, height, color
	   public String toString(){
		   String output = xPos + " " + yPos + " " + width + " " + height + " " + color;
		   return output;
	   }

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		setX(x);
		setY(y);
	}

	
	
}