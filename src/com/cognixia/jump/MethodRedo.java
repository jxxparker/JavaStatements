package com.cognixia.jump;

public class MethodRedo {
    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            System.out.println(finalScore);
            return finalScore;
        }

        return -1;

    }

	public static void main(String[] args)  {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		
//		calculateScore(true, 5, 10, 10);
//		calculateScore(true, 10, 20, 10);
	}
}
