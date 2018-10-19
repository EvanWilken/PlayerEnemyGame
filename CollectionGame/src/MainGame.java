//I did this earlier before lab

//Evan Wilken
//Oct. 17th 2018
//Graphical section to run the game


import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainGame extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	//class level
	GridPane pane;
	GridPane game;
	Scene scene;
	int round = 1;
	Random rand = new Random();
	
	
	public void start(Stage primaryStage) throws Exception
	{
		pane = new GridPane();
		BorderPane Bpane = new BorderPane(pane);
		pane.setAlignment(Pos.CENTER);
		
		
		//Start Game Button
		Button start = new Button("Click to Start");
		start.setOnAction(this::startGame);
		pane.add(start, 10, 10);
		
		
		//GridPane for Game
		game = new GridPane();
		
		//items
		String items[];
		for (int i = (round*3);i>0;i--)
		{
			int randomX = rand.nextInt(25);
			int randomY = rand.nextInt(25);
			item item = new item("File:src/apple.jpg", randomX,randomY);
			Image image = new Image(item.image);
			ImageView imageV = new ImageView(image);
			imageV.setScaleX(.1);
			imageV.setScaleY(.1);
			game.add(imageV, randomX, randomY);
		}
		
		
		
		scene = new Scene(Bpane ,800,500,Color.CRIMSON);
		primaryStage.setTitle("Playing Basketball!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void startGame(ActionEvent args)
	{
		scene.setRoot(game);
	}

}
