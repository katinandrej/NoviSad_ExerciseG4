public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		return this.firstThrow + this.secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike() throws BowlingException {
		if (this.firstThrow > 10) {
			throw new BowlingException();
		}
		else if (this.firstThrow == 10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if (this.firstThrow + this.secondThrow == 10) {
			return true;
		}
		else
			return false;
	}
}
