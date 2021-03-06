//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      
      Robot robo = new Robot();
      robo.head(window);
      robo.upperBody(window);
      robo.lowerBody(window);
      //call head method
      
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);

      window.setColor(Color.GREEN);
      window.fillOval(345, 120, 20, 20);
      window.fillOval(435, 120, 20, 20);
		//add more code here
      window.setColor(Color.BLACK);
      window.fillOval(390, 150, 20, 10);
	
      window.setColor(Color.RED);
      window.drawArc(350, 150, 100, 40, 180, 180);
   }

   public void upperBody( Graphics window )
   {

		window.setColor(Color.BLUE);
		window.fillRect(340, 220, 120, 75);
		window.setColor(Color.BLACK);
		window.drawLine(340, 220, 250, 180);
		window.drawLine(460, 220, 550, 180);
   }

   public void lowerBody( Graphics window )
   {

		window.setColor(Color.GRAY);
		window.fillRect(340, 315, 120, 75);
		window.setColor(Color.YELLOW);
		window.drawRect(340, 315, 120, 75);
		window.setColor(Color.BLACK);
		window.drawLine(340, 390, 240, 475);
		window.drawLine(460, 390, 560, 475);

   }
}