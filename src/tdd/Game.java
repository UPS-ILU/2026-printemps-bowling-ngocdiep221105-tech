package tdd;

public class Game {
	private int[] rolls=new int[20];
	private int currenRoll=0;
	public void roll(int nbPins) {
		rolls[currenRoll++]=nbPins;
	}
	
	public int score() {
		int score=0;
		int i=0;
		for(int frame=0; frame<10;frame++) {
			if(rolls[i]+rolls[i+1]==10) {
				score+=10+rolls[i+2];
				i+=2;
			}
			else {
				score+=rolls[i]+rolls[i+1];
				i+=2;
			}
		}
		return score;
		
	}
}
