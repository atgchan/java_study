package maze.strategy.eightMethod;

import maze.maze.Directions;
import maze.maze.Maze;
import maze.player.Position;
import maze.strategy.IStrategy;

public class EightStrategy implements IStrategy {
	
	private Position nextPosition;
	private Maze maze;
	
	@Override
	public Position getNextAvailableTile(Position currentPosition) {
		
		nextPosition = new Position(currentPosition.x, currentPosition.y);
		
		for(Directions d = maze.getStartDirection(currentPosition); d.getValue()<9; d = d.next()) {
			nextPosition.x = currentPosition.x;
			nextPosition.y = currentPosition.y;
			switch (d) {
			case N:
				nextPosition.y += 1;
				break;
			case E:
				nextPosition.x += 1;
				break;
			case S:
				nextPosition.y -=1;
				break;
			case W:
				nextPosition.x -=1;
				break;
			case NE:
				nextPosition.x += 1;
				nextPosition.y += 1;
				break;
			case SE:
				nextPosition.x += 1;
				nextPosition.y -= 1;
				break;
			case SW:
				nextPosition.x -= 1;
				nextPosition.y -= 1;
				break;
			case NW:
				nextPosition.x -= 1;
				nextPosition.y += 1;
				break;
			default:
				nextPosition = null;
				break;
			}
			if(nextPosition != null && maze.checkTileIsPath(nextPosition)) {
				return nextPosition;
			}
		}
		
		return null;
	}
	
	
	@Override
	public void setMaze(Maze maze) {
		this.maze = maze;
	}

}
