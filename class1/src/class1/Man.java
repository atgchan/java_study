package class1;

public class Man {
	
	public String name;
	private int height;
	private float weight;
	public String character;
	
	public Man() {}
	
	public Man(String name) {
		this.name = name;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public void setName(String name_s) {
		name = name_s;
	}
	
	public String getName() {
		return name;
	}
	
}
