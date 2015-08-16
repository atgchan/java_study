package maze.maze;

public enum Directions {
	N(1), NE(2), E(3), SE(4), S(5), SW(6), W(7), NW(8), END(9);
	private int value;
	
	private Directions(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}

	public Directions next() {
		return values()[ordinal() + 1];
	}
}

