package java_20210514;
//C:\\Users\\chohe\\git\\java_fundametal\\src

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintAll {

	public static void print(String path) {
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br= null;
		BufferedWriter bw= null;
		File f = new File(path);
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			fw = new FileWriter("C:\\Users\\chohe\\allprint.txt",true);
			bw = new BufferedWriter(fw);
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				bw.write(readLine);
				bw.newLine();
			}
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				if(fw != null) fw.close();
				if(bw != null) bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void scanDir(String folderPath, ArrayList<String> listFile) { 
		File[] files = new File(folderPath).listFiles(); 
		for(File f : files) { 
			if(f.isDirectory()) { 
				scanDir(f.getPath(), listFile); 
			} else { 
				listFile.add(f.getPath()); 
			} 
		} 
	}
			
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> listFile = new ArrayList<String>(); 
		scanDir("C:\\Users\\chohe\\git\\java_fundametal\\src", listFile); 
		for(String path : listFile) { 
			print(path); 
			System.out.println(path);
		}
		
	}

}