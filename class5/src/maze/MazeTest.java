package maze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import maze.maze.Maze;
import maze.player.Player;
import maze.strategy.IStrategy;
import maze.strategy.eightMethod.EightStrategy;
import maze.strategy.fourMethod.FourStrategy;

public class MazeTest {

	public static void main(String[] args) throws IOException {
		
		Maze maze = new Maze();
		maze.setInitialMap();
		
		//IStrategy strategy = new FourStrategy();
		//IStrategy strategy = new EightStrategy();
		
		IStrategy strategy = null;
		
		FileInputStream fis = new FileInputStream("src/maze/strategy.property");
		Properties prop = new Properties();
		prop.load(fis);
		String strType = prop.getProperty("STRTYPE");
		
		if(strType.equals("FOUR")){
			strategy = new FourStrategy();
		} else if(strType.equals("EIGHT")){
			strategy = new EightStrategy();
		} else {
			return;
		}
		
		Player player = new Player(strategy, maze);
		
		player.findPath();
		
	}

}
