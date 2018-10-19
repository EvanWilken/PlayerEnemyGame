//Evan Wilken
//Oct. 17th 2018
//Holds the enemies information
public class Enemy {
	
	String image;
	int positionX;
	int positionY;
	
	public Enemy(String image, int positionX, int positionY)
	{
		this.image = image;
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public String toString()
	{
		return "Enemy [image=" + image + ", positionX=" + positionX + ", positionY=" + positionY + "]";
	}
	
	

}
