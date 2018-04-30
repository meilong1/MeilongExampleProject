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
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangm0123
 *
 */


public class AlienHorde
{
	
	private List<Alien> aliens;

	/**Instantiate list of Aliens.
	 * @param size
	 */
	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
	}

	/**
	 * 
	 * Adds an alien to the horde.
	 * @param al
	 */
	public void add(Alien al)
	{
		aliens.add(al);
	}

	/**
	 * Draws each alien within the horde.
	 * 
	 * @param window
	 */
	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < aliens.size(); i++){
			aliens.get(i).draw(window);
		}
	}
	
	/**
	 * Moves each alien within the horde.
	 * 
	 */
	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size(); i++){
			aliens.get(i).move("RIGHT");
		}
	}
	/**
	 * @return horde
	 */
	public List<Alien> getList(){
		return aliens;
	}
	/**
	 * Remove the aliens that have been hit by bullets.
	 * @param shots
	 */
	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int j = 0; j < shots.size(); j++){
			for(int i = 0; i < aliens.size(); i++){
			
				if((Math.abs(aliens.get(i).getX() - shots.get(j).getX()) < 20) || (Math.abs(aliens.get(i).getY() - shots.get(j).getY()) < 20)){
					aliens.remove(i);
				}
			}
		}
	}

	/**
	 * Remove an alien from the horde.
	 * @param al
	 */
	public void remove(Alien al){
		aliens.remove(al);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "";
	}
}
