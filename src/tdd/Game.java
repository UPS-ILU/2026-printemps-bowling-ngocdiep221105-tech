package tdd;

public class Game {
	private int score=0;
	public void roll(int nbQuillesAbatues) {
		score+=nbQuillesAbatues;
	}
	
	public int score() {
		return score;
	}
}
