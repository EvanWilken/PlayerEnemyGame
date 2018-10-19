//Evan Wilken
//Oct. 17th 2018
//holds player information
public class player {

	public String name;
	public String image;
	public int numItems;
	int positionX;
	int positionY;
	
	public player(String name, String image, int numItems, int positionX, int positionY) 
	{
		this.name = name;
		this.image = image;
		this.numItems = numItems;
		this.positionX = positionX;
		this.positionY = positionY;
	}


	public String toString() 
	{
		return "player [name=" + name + ", image=" + image + ", numItems=" + numItems + ", positionX=" + positionX
				+ ", positionY=" + positionY + "]";
	}


	
	
}
