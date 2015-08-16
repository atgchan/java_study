package maze.player;

import maze.maze.Maze;
import maze.strategy.IStrategy;

public class Player {
	
	private IStrategy strategy;
	private Maze maze;
	private Position currentPosition = new Position(1, 1);
	private Position nextPosition = new Position(1, 1);
	private Path path = new Path();
	private int moveCnt = 0;
	
	public Player(IStrategy strategy, Maze maze) {
		this.strategy = strategy;
		this.strategy.setMaze(maze);
		this.maze = maze;
	}
	
	public void findPath() {
		while(!maze.isEndPosition(currentPosition)) {
			nextPosition = strategy.getNextAvailableTile(currentPosition);
			moveCnt++;
			markTile();
			if(nextPosition == null) {
				currentPosition = path.popPath();
				if(maze.isStartPosition(currentPosition)) {
					System.out.println("길을 찾을 수 없습니다!!");
					break;
				}
			} else {
				moveTo();
			}
		}
		path.pushPath(currentPosition);
		maze.printMaze();
		System.out.print("출구까지의 거리 : ");
		System.out.println(path.getSize());
		System.out.print("찾을때까지 이동 횟수 : ");
		System.out.println(moveCnt);
		System.out.println("---------------경로 출력---------------");
		path.printPath();
	}
	
	public void markTile() {
		maze.getTile(currentPosition).getStartDirection().next();
		maze.getTile(currentPosition).setPassed(true);
	}
	
	public void moveTo() {
		path.pushPath(currentPosition);
		currentPosition = nextPosition;
	}

}
