package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {
	
	public static void main(String[] args) {
		Reader in = null;	// 하위 블럭에서 in한것을 close할 수 있도록
		InputStream is = null;
		try{
			in = new FileReader("123.txt");
			
			int count = 0;
			int data = -1;
			while((data = in. read()) != -1) {			//더 이상 read할 것이 없으면 자기숫자인 -1 로 돌아오게 되니까 사용가능
				count++;
				System.out.print((char)data);  	//2바이트이나 자바에선 3바이트 중 1바이트를 안쓰는 변형된 utf-8을 사용해서 변형가능
			}
			
			System.out.println("");
			System.out.println("count: " + count);
			System.out.println("=================");
			
			is = new FileInputStream("123.txt");
			count = 0;
			while((data = is.read()) != -1) {
				count++;
				System.out.print((char)data);
			}
			System.out.println("");
			System.out.println("count: " + count);
			System.out.println("=================");
			
			
		}catch(FileNotFoundException e) {	//생성자에서 익셉션
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {		//리드에서 익셉션
			System.out.println("error: " + e);
			
		} finally {	
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
