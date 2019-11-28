package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try{
			//��� ��Ʈ��
			FileReader fr = new FileReader("./src/io/BufferedReaderTest.java"); //.������ ���� �ڱ��ڽ��� �ּҸ� ��Ÿ���°��̴�.
			
			//���� ��Ʈ��
			
			br = new BufferedReader(fr);
			
			int index = 0;
			String line = null;
			while((line = br.readLine()) != null) {
				index++;
				System.out.print(index);
				System.out.print(":");
				System.out.print(line);
				System.out.print("\n");
			}
		}catch(FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		} catch (IOException e) {
			System.out.println("error: " + e);
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

	}//main

}//class
