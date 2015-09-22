package thread;

public class JoinTest extends Thread {
	
	int first;
	int last;
	int total;
	
	public JoinTest(int first, int last) {
		this.first = first;
		this.last = last;
	}
	
	public void run() {
		for( int i=first; i<=last; i++ ) {
			total += i;
		}
	}
	
	public static void main(String[] args) {
		
		JoinTest th1 = new JoinTest(1, 50);
		JoinTest th2 = new JoinTest(51, 100);
		
		th1.start();
		th2.start();
		
//		Thread thread = Thread.currentThread();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		int lastTotal = th1.total + th2.total;
		
		System.out.println("th1.total = " + th1.total);
		System.out.println("th2.total = " + th2.total);
		System.out.println("last total = " + lastTotal);

	}

}
