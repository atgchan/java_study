package Template;

public abstract class AbstractDisplay {

	public abstract void begin();
	public abstract void display();
	public abstract void end();
	
	public final void show() { //show라는 시나리오는 바뀌면 안되
		begin();
		
		for(int i=0; i<5; i++) {
			display();
		}
		
		end();
	}
}
