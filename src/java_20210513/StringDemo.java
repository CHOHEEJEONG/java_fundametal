package java_20210513;

public class StringDemo {
	public static void main(String[] args) {
		char[] c = {'h','e','l','l','o'};
		String str = new String(c);
		//문자열 중에 특정 하나만 반환하는 메서드
		//index는 0부터 시작
		char c1= str.charAt(1);
		System.out.println(c1);
		
		//문자열 연결하는 메서드
		str = str.concat("123");
		System.out.println(str);
		
		str = new String("abc.zip");
		//endswith(String msg) => msg문자열로 끝나면 true, 그렇지 않으면 false
		if(str.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		}else if(str.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		}else {
			System.out.println("파일 입니다.");
		}
	
		//시작하는 문자열
		String url = new String("http://www.naver.com");
		String path = new String("/news/board.do?id=123&cat=1");
		//startswith(String msg) => msg문자열로 시작하면 true, 그렇지 않으면 false
		if(path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		//equals() => 문자열 비교 
		//equalsIgnoreCase() => 대소문자 구분하지 않고 비교
		String m1 = new String("hello");
		String m2 = new String("Hello");
		if(m1.equals(m2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(m1.equalsIgnoreCase(m2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//""안에 띄어스기 하나라도 하면 false뜸
		//문자가 직접입력안되어있고 파일에서 풀러오면 골치아픔
		//trim() => 앞뒤 공백 제거 <-얘를 해줘야 됨
		String m3 = new String("hello ").trim();
		String m4 = new String("hello");
		if(m3.equals(m4)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(m3.equalsIgnoreCase(m4)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//getbytes() => 문자열을 바이트 배열로 반환하는 메서드
		String m5 = new String("안녕하세요");
		byte[] b = m5.getBytes();
		System.out.println(b.length);

		String m6 = new String("111111-1111118");
		int index = m6.indexOf("-");
		System.out.println(index);
		
		String m7 = new String("a.b.c.zip");
		int lastIndexOf = m7.lastIndexOf(".");
		
		System.out.println(m7.substring(0,m7.lastIndexOf(".")));
		System.out.println(m7.substring(m7.lastIndexOf(".")+1));
		
		
		
		System.out.println(m6.substring(0,m6.indexOf("-")));
		System.out.println(m6.substring(m6.indexOf("-")+1));
		
		String m8 = new String("010-3024-9999");
		System.out.println(m8.substring(0,m8.indexOf("-")));
		System.out.println(m8.substring(m8.indexOf("-")+1,m8.lastIndexOf("-")));
		System.out.println(m8.substring(m8.lastIndexOf("-")+1));
		
		
		//숫자로 구성된 String => primitive data type로 변환시켜주는 메서드
		int a1 = Integer.parseInt(m6.substring(0,1));
		//이걸로 사용하면 없어보이고 데이터도 자꾸 쌓이므로
		String m9 = 123+"";
		//String.valueOf사용하기 
		String m10 = String.valueOf(123);
		System.out.println(m10);
		
		String m11 = m8.replace("-", "_");
		System.out.println(m11);
		
		String m12 = new String("hello");
		String m13 = m12.toUpperCase();
		String m14 = m12.toLowerCase();
		System.out.println(m13);
		System.out.println(m14);
		
		String[] temp = m8.split("-");
		for(String value : temp) {
			System.out.println(value);
		}
		
		double d  = 123456.345;
		String m15 = String.format("%,.2f",d);
		System.out.println(m15);
		System.out.format("%s%n", m15);
		
	}
}
