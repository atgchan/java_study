package game;

public class GameLevel2 extends GameLevel{
	
	private GameLevel2() {}
	
	private static GameLevel2 instance = new GameLevel2();
	
	static GameLevel2 getInstance() {
		return instance;
	}

	@Override
	public void simpleAttack() {
		System.out.println("level2 simple attack : 메롱~~메롱~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("level2 turn attack : 돌려차기 씡~~");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level2 flying attack : 이건 못하지롱");
	}
}
