import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class PowerUp extends MovingThing{
	private int speed = 30;
	
	
	
	/**
	 *Instantiates a PowerUp 
	 */
	public PowerUp(){
		
		super(200,20,20,20);
	}
	/**
	 * Instantiates a PowerUp
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 * @param s
	 * @param power
	 */
	public PowerUp(int x, int y, int w, int h, int s, String power){
		super(x,y,w,h);
		setSpeed(s);
	}
	
	/**
	 * Instantiates a PowerUp
	 * @param s
	 * @param power
	 */
	public PowerUp(int s, int power){
		setSpeed(s);
		
	}
	
	
	public void setSpeed(int s) {
		// TODO Auto-generated method stub
		speed = s;
	}

	
	
	
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public void move(String direction) {
		// TODO Auto-generated method stub
		setY(getY() + speed);
		
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.setColor(Color.RED);
		window.fillRect(getX(), getY(), 20, 20);
		
	}
	
}
