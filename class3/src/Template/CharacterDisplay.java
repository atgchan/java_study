package Template;

public class CharacterDisplay extends AbstractDisplay {
	
	char ch;
	
	public CharacterDisplay(char ch) {
		this.ch = ch;
	}
	
	@Override
	public void begin() {
		System.out.print("<<");
		
	}

	@Override
	public void display() {
		System.out.print(ch);
		
	}

	@Override
	public void end() {
		System.out.println(">>");
		
	}

}
