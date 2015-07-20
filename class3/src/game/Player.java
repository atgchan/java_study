package game;

import java.util.ArrayList;

public class Player {
	
	private GameLevel gameLevel = GameLevel1.getInstance();
	
	static int currentLevel = 0;
	private ArrayList<GameLevel> glList = new ArrayList<GameLevel>();
	
	public Player() {
		glList.add(GameLevel1.getInstance());
		glList.add(GameLevel2.getInstance());
		glList.add(GameLevel3.getInstance());
	}
	
	public void attack() {
		gameLevel.play();
		
	}

	public void upgradeLevel() {
		currentLevel++;
		gameLevel = glList.get(currentLevel-1);
	}
	
	public GameLevel getGameLevel() {
		return gameLevel;
	}

}
