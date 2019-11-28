package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			bos = new BufferedOutputStream(fos);
			for(int i = 'a'; i <= 'z'; i++) {
			//for(int i = 97; i <= 122; i++) { ascii	
				bos.write(i);				
			}

		} catch(IOException e) {		// FileNot~ extends IOE, not have to write
			System.out.println("error: " + e);
			
		}  finally {
			if(bos != null) {
				try {
					bos.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
				
			}
		}//finally
		
		
	}

}
