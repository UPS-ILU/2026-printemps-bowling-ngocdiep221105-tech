package tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Game game;
	@BeforeEach
	void init() {
		game=new Game();
	}

	@Test
	void testAucuneQuille() {
		for (int i = 0; i<20;i++) {
			game.roll(0);
		}
		assertEquals(0, game.score());
	}

	@Test
	void testVingtUn() {
		for (int i = 0; i<20;i++) {
			game.roll(1);
		}
		assertEquals(20, game.score());
	}
	
	@Test
	void testDixUnDixDeux() {
		for (int i = 0; i<10;i++) {
			game.roll(1);
		}
		for (int i = 0; i<10;i++) {
			game.roll(2);
		}
		assertEquals(30, game.score());
	}
	
	@Test
	void testSpare() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		for (int i = 0; i<17;i++) {
			game.roll(0);
		}
		assertEquals(18, game.score());
	}

}
