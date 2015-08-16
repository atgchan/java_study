package maze.maze;

public class Tile {

	private boolean isPath = false;
	private boolean passed = false;
	private Directions startDirection = Directions.N;
	
	public Directions getStartDirection() {
		return startDirection;
	}

	public void setStartDirection(Directions startDirection) {
		this.startDirection = startDirection;
	}

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	public void setIsPath(boolean isPath) {
		this.isPath = isPath;
	}
	
	public boolean getIsPath() {
		return isPath;
	}
	
}
