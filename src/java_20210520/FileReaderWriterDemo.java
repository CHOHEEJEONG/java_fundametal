package java_20210520;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("C:\\dev\\test\\2021\\05\\18\\FileDemo.java");
			fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\FileDemo-copy.java");
			
			/*
			int readChar = 0;
			//read() : 한개의 문자를 읽는다.
			while((readChar = fr.read()) != -1 ) {
				System.out.print((char)readChar);
				//write() : 한개의 문자를 쓴다.
				fw.write(readChar);
			}
			*/
			
			
			int readCharCount = 0;
			char [] readChars = new char[1024*8];
			System.out.println(readChars);
			
			while((readCharCount = fr.read(readChars))!= -1 ) {
				System.out.println(readChars);
				fw.write(readChars, 0, readCharCount);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
}
