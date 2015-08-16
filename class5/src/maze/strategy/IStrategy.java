package maze.strategy;

import maze.maze.Maze;
import maze.player.Position;

public interface IStrategy {
	
	Position getNextAvailableTile(Position currentPosition);
	
	void setMaze(Maze maze);

}
