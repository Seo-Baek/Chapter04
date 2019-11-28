package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {		// 코딩을 마치고 리프레시(f5)를 해야 결과가 나온다!

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("dooly.jpg");
			os = new FileOutputStream("dooly2.jpg");
			
			int data = -1;
			while((data = is.read()) != -1) {
				os.write(data);
				
			}
			
		}catch(FileNotFoundException e){
			System.out.println("파일이 없습니다.");
		} catch(IOException e) {
			System.out.println("error: " + e);
			
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
				
			}
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		
		
		}//finally

	}//main
	
}//class

