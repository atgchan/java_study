package videoshop;

public class VideoShopTest {
	
	public static void main(String[] args) {
	
		IQueue vShop = new VideoShop();
		
		vShop.enQueue("martrix1");
		vShop.enQueue("martrix2");
		vShop.enQueue("martrix3");
		
		System.out.println(vShop.deQueue());
		System.out.println(vShop.deQueue());
		System.out.println(vShop.deQueue());
	
	}
}
