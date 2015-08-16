package maze.player;

import java.util.ArrayList;

public class Path {
	
	private ArrayList<Position> path = new ArrayList<Position>();
	
	public void printPath() {
		
		for(int i=0; i<path.size(); i++) {
			Position p = path.get(i);
			System.out.print(i+1);
			System.out.print(" = I : ");
			System.out.print(p.x);
			System.out.print(", J : ");
			System.out.println(p.y);
		}
		
		return;
	}
	
	public int getSize() {
		return path.size();
	}
	
	public Position popPath() {
		if(path.size() <= 0) {
			return null;
		}
		return path.remove(path.size()-1);
	}

	public void pushPath(Position currentPosition) {
		path.add(currentPosition);		
	}

}
