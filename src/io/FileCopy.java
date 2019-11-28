package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {		// �ڵ��� ��ġ�� ��������(f5)�� �ؾ� ����� ���´�!

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
			System.out.println("������ �����ϴ�.");
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

