package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInOutTest {

	public static void main(String[] args) {
		
		
		System.out.println("엔터를 입력하세요");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			int i;
			while( (i = isr.read()) != '끝' ) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
