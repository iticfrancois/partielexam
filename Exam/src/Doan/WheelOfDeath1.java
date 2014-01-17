package Doan;

import specifications.WheelOfDeath;

public class WheelOfDeath1 implements WheelOfDeath {

	private int limit;
	private int range;
	private int score=0;
	@Override
	public void setLimit(int limit) {
		this.limit=limit;

	}

	@Override
	public void setRange(int range) {
		this.range = range;

	}

	@Override
	public void setLastResult(int result) {
		score += result;
	}

	@Override
	public boolean playAgain() {
		return score + range <=limit;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
