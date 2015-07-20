package game;

public class GameLevel3 extends GameLevel{
	
	private GameLevel3() {}
	
	private static GameLevel3 instance = new GameLevel3();
	
	static GameLevel3 getInstance() {
		return instance;
	}

	@Override
	public void simpleAttack() {
		System.out.println("level3 simple attack : 메롱~메롱~메롱~");
	}

	@Override
	public void turnAttack() {
		System.out.println("level3 turn attack : 뒤돌려차기 앞돌려차기~");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level3 flying attack : 날라차기 휙~~");
	}
}
