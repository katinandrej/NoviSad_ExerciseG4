import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {
	
	BowlingGame game;
	Frame frame;
	
	@Test
	public void test_addingFrame() {
		game = new BowlingGame();
		frame = new Frame(0, 0);
		game.addFrame(frame);
		
		assertEquals(1, game.frames.size());
	}

}
