import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int score;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException {
		if (frames.size() < 10) {
			this.frames.add(frame);
		}
		else {
			throw new BowlingException();
		}
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public void addBonus() throws BowlingException {
		for (int i = 0; i < frames.size() - 2; i++) {
			if (frames.get(i).isStrike() && i < frames.size() - 1) {
				score = score + frames.get(i+1).getFirstThrow() + frames.get(i).getSecondThrow();
			}
		}
	}
	
	// Returns the game score
	public int score() throws BowlingException{
		int score = 0;
		addBonus();
		for (int i = 0; i < frames.size(); i++) {
			score = score + frames.get(i).score();
		}
		return score;
	}

	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}
}
