//Evan Wilken
//Oct. 17th 2018
//Testing the classes before I start to use them
public class TestDriver {

	public static void main(String[] args) {
		player player = new player("File:src/salmon.jpg","Evan",0,0,0);
		System.out.println(player);
		
		Enemy enemy = new Enemy("File:src/pBear.jpg",1,1);
		System.out.println(enemy);
		
		item item = new item("File:src/apple.jpg",2,2);
		System.out.println(item);
		
		Movement movement = new Movement(0,0,3);
		movement.MoveForward();
		movement.MoveRight();
		
		HighScores scores = new HighScores(5, 2, 6, "me", 4, "you", 3, "someone");
		System.out.println(scores.checkNewScore());
		System.out.println(scores.toString());

	}

}
