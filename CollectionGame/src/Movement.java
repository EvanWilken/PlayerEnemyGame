//Evan Wilken
//Oct. 17th 2018
//enemy and player classes can use this to move around
public class Movement {
	
	int startPosX;
	int startPosY;
	int spaceToMove;
	
	public Movement(int startPosX, int startPosY, int spaceToMove)
	{
		this.startPosX = startPosX;
		this.startPosY = startPosY;
		this.spaceToMove = spaceToMove;
	}


	public String toString()
	{
		return "Movement [startPosX=" + startPosX + ", startPosY=" + startPosY + ", spaceToMove=" + spaceToMove + "]";
	}
	public int MoveRight()
	{
		startPosX = startPosX + (1 * spaceToMove);
		return startPosX;
	}
	public int MoveLeft()
	{
		startPosX = startPosX - (1 * spaceToMove);
		return startPosX;
	}
	public int MoveForward()
	{
		startPosY = startPosY - (1 * spaceToMove);
		return startPosX;
	}
	public int MoveBack()
	{
		startPosY = startPosY + (1 * spaceToMove);
		return startPosX;
	}
	


}
