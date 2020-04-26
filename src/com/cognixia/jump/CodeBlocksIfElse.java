package com.cognixia.jump;

public class CodeBlocksIfElse {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 4000;
		int levelCompleted = 5;
		int bonus = 100;
		
		if (score < 5000 && score > 1000) {
			System.out.println("score is less than 5000 but greater than 1000");
		} else if (score < 1000){
			System.out.println("less than 1000");
		} else {
			System.out.println("got here");
		}

		if (gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("your final score was " + finalScore);
		}
		boolean newgameOver = true;
		int newscore = 8000;
		int newlevelCompleted = 50;
		int newbonus = 1000;
		
		if (gameOver == true) {
			int finalScore = score + (newlevelCompleted * newbonus);
			System.out.println("your final score was " + finalScore);
		}
		
		

	}

}
