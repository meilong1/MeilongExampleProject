import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class AllPower {
	private List<PowerUp> powerups;
	/**
	 *Instantiates a list of powerups. 
	 */
	public AllPower()
	{
		powerups = new ArrayList<PowerUp>();
	}

	/**
	 * Add a powerup to the list of powerups.
	 * @param pu
	 */
	public void add(PowerUp pu)
	{
		powerups.add(pu);
	}

	//post - draw each PowerUp
	/**
	 * Draw all powerups within the list.
	 * @param window
	 */
	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < powerups.size(); i++){
			powerups.get(i).draw(window);
		}
	}

	/**
	 * Move all powerups within the list.
	 */
	public void moveEmAll()
	{
		for(int i = 0; i < powerups.size(); i++){
			powerups.get(i).move("DOWN");
		}
	}
	/**
	 * Remove a powerup from the list when it gets below the screen.
	 */
	public void cleanEmUp()
	{
		
		
		for(int i = 0; i < powerups.size(); i++){
			if(powerups.get(i).getY() < 0){
				powerups.remove(i);
			}
		}
	}
	/**
	 * Remove a powerup from the list.
	 * @param pu
	 */
	public void remove(PowerUp pu){
		powerups.remove(pu);
	}
	/**
	 * 
	 * @return the list of powerups.
	 */
	public List<PowerUp> getList()
	{
		return powerups;
	}

	public String toString()
	{
		return "";
	}
}
