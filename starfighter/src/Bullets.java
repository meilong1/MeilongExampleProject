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

public class Bullets
{
	private List<Ammo> ammo;

	/**
	 * Instantiates Bullets.
	 */
	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	/**
	 * Adds an ammo to Bullets.
	 * @param al
	 */
	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	/**
	 * Draw all ammo in Bullets.
	 * @param window
	 */
	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < ammo.size(); i++){
			ammo.get(i).draw(window);
		}
	}

	/**
	 * Move all ammo in Bullets.
	 */
	public void moveEmAll()
	{
		for(int i = 0; i < ammo.size(); i++){
			ammo.get(i).move("UP");
		}
	}

	/**
	 * Remove ammo that is above the screen.
	 */
	public void cleanEmUp()
	{
		
		
		for(int i = 0; i < ammo.size(); i++){
			if(ammo.get(i).getY() < 0){
				ammo.remove(i);
			}
		}
	}
	public void remove(Ammo am){
		ammo.remove(am);
	}
	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}
