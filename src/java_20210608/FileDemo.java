package java_20210608;
import java.io.File;
public class FileDemo {
	public static void main(String[] args) {
		//ctrl + shift + o
		File f = new File("C:\\dev\\test\\2021\\05\\18\\apache.zip");
		long len = f.length();
		System.out.printf("%dK %n", len/1024);
		
		String fileName = f.getName();
		System.out.printf("%s%n", fileName);
		
		String name = fileName.substring(0, fileName.lastIndexOf("."));
		System.out.printf("%S%n", name);
		
		String extension = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.printf("%S%n", extension);
		
		String parentPath = f.getParent();
		System.out.printf("%S%n", parentPath);
		
		//File f2 = new File(parentPath, "apache." + extension);
		
		File f2 = new File(parentPath, System.currentTimeMillis() +"." + extension);
		f.renameTo(f2);
	}
}
