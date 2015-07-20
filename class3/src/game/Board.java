package game;

public class Board {

	public static void main(String[] args) {
		Player player = new Player();
		
		for(int i=0; i<3; i++) {
			player.upgradeLevel();
			System.out.println("======== level " + (i+1) + " start ========");
			player.attack();
			System.out.println("======== level  " + (i+1) + "  end ========");
		}
	}

}
