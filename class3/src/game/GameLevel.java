package game;

public abstract class GameLevel {
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	
	public final void play() {
		simpleAttack();
		turnAttack();
		flyingAttack();
	}
}
