package game;

public class GameLevel1 extends GameLevel{
	
	private GameLevel1() {}
	
	private static GameLevel1 instance = new GameLevel1();
	
	static GameLevel1 getInstance() {
		return instance;
	}

	@Override
	public void simpleAttack() {
		System.out.println("level1 simple attack : 메롱~~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("level1 turn attack : 못하지롱");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level1 flying attack : 이것도 못하지롱");
	}
}
