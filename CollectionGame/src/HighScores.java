//Evan Wilken
//Oct. 17th 2018
//holds the highscores and replaces them if new scores are greater
public class HighScores {
	int playerScore;
	int enemyScore;
	int highScore1;
	String highScoreName1;
	int highScore2;
	String highScoreName2;
	int highScore3;
	String highScoreName3;
	
	public HighScores(int playerScore, int enemyScore, int highScore1, String highScoreName1, int highScore2,
			String highScoreName2, int highScore3, String highScoreName3)
	{
		this.playerScore = playerScore;
		this.enemyScore = enemyScore;
		this.highScore1 = highScore1;
		this.highScoreName1 = highScoreName1;
		this.highScore2 = highScore2;
		this.highScoreName2 = highScoreName2;
		this.highScore3 = highScore3;
		this.highScoreName3 = highScoreName3;
	}

	public String checkNewScore()
	{
		if (playerScore > highScore1)
		{
			highScore1 = playerScore;
			return "You have the new High Score!";
		}
		else if (playerScore > highScore2)
		{
			highScore2 = playerScore;
			return "You have the 2nd Highest Score!";
		}
		else if (playerScore > highScore3)
		{
			highScore3 = playerScore;
			return "You have the 3rd Highest Score!";
		}
		else
		{
			return "Good try";
		}
		
	}
	
	
	
	
	
	
	public String toString()
	{
		return "HighScores [playerScore=" + playerScore + ", enemyScore=" + enemyScore + ", highScore1=" + highScore1
				+ ", highScoreName1=" + highScoreName1 + ", highScore2=" + highScore2 + ", highScoreName2="
				+ highScoreName2 + ", highScore3=" + highScore3 + ", highScoreName3=" + highScoreName3 + "]";
	}
	
	

}
