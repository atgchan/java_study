package maze.maze;

import maze.player.Position;

public class Maze {
	
	private static final int mazeWidth = 10;
	private static final int mazeHeight = 10;
	private Tile[][] map = new Tile[mazeWidth][mazeHeight];
	private final Position startPosition = new Position(1, 1);
	private final Position endPosition = new Position(8, 8);
	
	public Maze() {
		for(int i=0; i<mazeWidth; i++) {
			for(int j=0; j<mazeHeight; j++) {
				map[i][j] = new Tile();
			}
		}
	}
	
	public boolean isStartPosition(Position p) {
		if(p == null) {
			return true;
		}
		if(p.equals(startPosition)) {
			return true;
		}
		return false;
	}
	
	public boolean isEndPosition(Position p) {
		if(p.equals(endPosition)) {
			return true;
		}
		return false;
	}
	
	public Directions getStartDirection(Position p) {
		return map[p.x][p.y].getStartDirection();
	}
	
	/*
	* map 의 Tile에서 갈 수 있는 부분은 isPath를 true로 변
	* */
	public void setInitialMap(){
		map[1][1].setIsPath(true);
		map[1][5].setIsPath(true);
		map[2][1].setIsPath(true);
		map[2][2].setIsPath(true);
		map[2][3].setIsPath(true);
		map[2][5].setIsPath(true);
		map[2][6].setIsPath(true);
		map[2][7].setIsPath(true);
		map[2][8].setIsPath(true);
		map[3][3].setIsPath(true);
		map[3][4].setIsPath(true);
		map[3][5].setIsPath(true);
		map[3][7].setIsPath(true);
		map[4][3].setIsPath(true);
		map[4][7].setIsPath(true);
		map[5][2].setIsPath(true);
		map[5][3].setIsPath(true);
		map[5][5].setIsPath(true);
		map[5][6].setIsPath(true);
		map[5][7].setIsPath(true);
		map[5][8].setIsPath(true);
		map[6][1].setIsPath(true);
		map[6][5].setIsPath(true);
		map[7][2].setIsPath(true);
		map[7][5].setIsPath(true);
		map[7][6].setIsPath(true);
		map[7][7].setIsPath(true);
		map[7][8].setIsPath(true);
		map[8][1].setIsPath(true);
		map[8][4].setIsPath(true);
		map[8][8].setIsPath(true);
	}

	
	public boolean checkTileIsPath(Position nextPosition) {
		Tile targetTile = map[nextPosition.x][nextPosition.y];
		return (targetTile.getIsPath() && !targetTile.isPassed());
	}
	
	public Tile getTile(Position p) {
		return map[p.x][p.y];
	}

	public void printMaze() {
		
		for(int i=1; i<mazeWidth-1; i++) {
			for(int j=1; j<mazeHeight-1; j++) {
				if(isStartPosition(new Position(i, j))) {
					System.out.print("♡");
				} else if(isEndPosition(new Position(i, j))) {
					System.out.print("♡");
				} else if(map[i][j].getIsPath()) {
					System.out.print("◉");
				} else {
					System.out.print("▣");
				}
			}
			System.out.println("");
		}
		
		return;
	}
}
