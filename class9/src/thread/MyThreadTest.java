package thread;

import java.util.Scanner;

class MyThread extends Thread{
	
	boolean flag = false;
	
	public MyThread(String name){
		super(name);
	}
	
	void setFlag( boolean flag ) {
		this.flag = flag;
	}
	
	public void run() {
//		
//		for(int i=0; i<=200; i++) {
//			System.out.print(i + "\t");
//		}
		
		while(!flag) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + "is dead");
	}
}

public class MyThreadTest {

	public static void main(String[] args) {
		
		System.out.println("main start");
		
		MyThread threadA = new MyThread("A");
		MyThread threadB = new MyThread("B");
		MyThread threadC = new MyThread("C");

		threadA.start();
		threadB.start();
		threadC.start();
		
		outerLoop:
		while(true){
			String s = "";
			Scanner scan = new Scanner(System.in); 
			s = scan.nextLine();
			
			switch (s){
			case "A":
				threadA.setFlag(true);
				break;
			case "B":
				threadB.setFlag(true);
				break;
			case "C":
				threadC.setFlag(true);
				break;
			case "M":
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break outerLoop;
			default:
				System.out.println("eerrr");
				break;
			}
		}
		
		System.out.println("main end");

	}

}
