package maze.player;

public class Position {

	public int x;
	public int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Position p) {
		if(this.x == p.x && this.y == p.y) {
			return true;
		}
		return false;
	}

}
