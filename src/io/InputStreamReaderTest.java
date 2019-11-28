package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr = null; //byte로 들어오는 것을 char로 바꿔주는 메소드  거칙로 BufferedReader로 라인단위로 읽게한다!
		try {
			FileInputStream fis = new FileInputStream("ms949.txt");
			isr = new InputStreamReader(fis,"MS949");	//ms949로 되어있는 것은 ms949로 읽을 수 있도록 코딩해줘야한다.	
													    // , 뒤에 문자형을 넣으면 됨! 2바이트 짜리를 3바이트인 UTF-8로 하면 깨진다.
			int data = -1;
			while((data = isr.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch(IOException e) {
			System.out.println("error: " + e);
		}
	}

}
