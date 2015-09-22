package class6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class ShiftError {

	public URL makeUrl(String filename, String url) throws FileNotFoundException, MalformedURLException {
		
		FileInputStream fis = new FileInputStream(filename);
		return new URL(url);
	}
	
	public static void main(String[] args) {
	
		ShiftError sh = new ShiftError();
		try{
			sh.makeUrl("a.txt", "http://www.naver.com");
			
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			
		}

	}

}
