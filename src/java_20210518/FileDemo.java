package java_20210518;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	
	public static String format(File f) {
		//1970년 1월 1일 00:00:00초부처 파일을 수정한 날까지의 시간을
		//밀리세컨드로 반환한 값
		long lastModified = f.lastModified();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(lastModified);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		//format안에 (date로 넣어야됨)cal바로 못넣으므로 getTime으로 넣으면 date.cal로 넣어짐
		String format = sdf.format(cal.getTime());
		return format;
	}
	
	public static void main(String[] args) {
		File f1 = new File("c:\\dev\\test\\2021\\05\\18");
		
		if(f1.mkdirs()) { //f1.mkdirs() = Directory들을 만드는 것
			System.out.println("디렉토리를 생성했습니다.");
		}else {
			System.out.println("이미 디렉토리가 존재합니다.");
		}
		
		File f2 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse.zip");
		long len = f2.length(); //파일 크기를 알아내기
		System.out.printf("%,dKB%n", len/1024); //KB로 출력하려면 len/1024
		boolean isFile = f2.isFile(); //isDirectory() //file인지 확인하기
		if(isFile){
			String path = f2.getPath();
			System.out.println(path);
			if(path.endsWith("zip")) {
				System.out.println("압축파일");
			}else if(path.endsWith("txt")) {
				System.out.println("텍스트파일");
			}else if(path.endsWith("java")) {
				System.out.println("자바파일");
			}
		}else {
			System.out.println("디렉토리 입니다.");
		}

		System.out.println(format(f2)); //파일 마지막 수정 날짜 확인하기
		
		
		File f3 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse2.zip");
		File f4 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse3.zip");
		
		f3.renameTo(f4); //f3파일을 f4파일 이름으로 변경
		
		String path = f4.getPath();
		String parent = f4.getParent();
		String name = f4.getName();
		System.out.printf("%s, %s, %s %n", path, parent, name);
		
		f4.delete(); //파일 지우기
		
		File f5 = new File("C:\\Users\\user\\eclipse-workspace\\Java_Fundamental");
		
		File [] files = f5.listFiles();
		for(int i =0; i<files.length; i++) {
			File f = files[i];
			if(f.isDirectory()) {
				String lastModified = format(f);
				String fileName = f.getName();
				System.out.printf("%s, %s, 파일폴더%n", fileName, lastModified);
			}else if(f.isFile()) {
				String lastModified = format(f);
				String fileName = f.getName();
				long fileSize = f.length();
				System.out.printf("%s, %s, 파일, %dB %n", fileName, lastModified, fileSize);
			}
		}
		
		
	}
}
