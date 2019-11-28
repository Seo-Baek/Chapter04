package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr = null; //byte�� ������ ���� char�� �ٲ��ִ� �޼ҵ�  ��Ģ�� BufferedReader�� ���δ����� �а��Ѵ�!
		try {
			FileInputStream fis = new FileInputStream("ms949.txt");
			isr = new InputStreamReader(fis,"MS949");	//ms949�� �Ǿ��ִ� ���� ms949�� ���� �� �ֵ��� �ڵ�������Ѵ�.	
													    // , �ڿ� �������� ������ ��! 2����Ʈ ¥���� 3����Ʈ�� UTF-8�� �ϸ� ������.
			int data = -1;
			while((data = isr.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch(IOException e) {
			System.out.println("error: " + e);
		}
	}

}
