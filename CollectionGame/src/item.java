//Evan Wilken
//Oct. 17th 2018
//holds item information
public class item {

	public String image;
	public int positionx;
	public int positiony;
	
	
	public item(String image, int positionx, int positiony)
	{
		this.image = image;
		this.positionx = positionx;
		this.positiony = positiony;
	}



	public String toString()
	{
		return "item [image=" + image + ", positionx=" + positionx + ", positiony=" + positiony + "]";
	}
	
}
