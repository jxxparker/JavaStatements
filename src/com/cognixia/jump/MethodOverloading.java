package com.cognixia.jump;

public class MethodOverloading {
	public static void main(String[] args) {
		int newScore = calculateScore("Tim", 500);
		System.out.println("new score is " + newScore);
		
		calculateScore(400); //uses second method\
		
		calculateScore();
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore() {
		System.out.println("no player name ");
		return 0;
	}
}
