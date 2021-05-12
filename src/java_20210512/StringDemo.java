package java_20210512;

public class StringDemo {
	public static String reverse(String str) {
		String temp = "";
		for(int i=1; i<=str.length(); i++) {		
			temp += str.substring(str.length()-i,str.length()-i+1);
		}
		return temp;
	}
	
	public static void m(int a, int[] b, String s) {
		a = 20;
		b[3] = 40000;
		s += "123";
	}

	public static void main(String[] args) {
		String str = "beautiful"; // => "lufituaeb"
		//str의 글자 반환하는 방법 : System.out.println(str.substring(0,3));
		String str5 = reverse(str);
		System.out.println(str5);
		
		int a = 10;
		int []b = {1,2,3,4};
		String s = "abc";
		
		System.out.println(a + "," + b[3] + "," + s);
		m(a,b,s);
		///s는 m으로 갔다와도 안바뀜 
		System.out.println(a + "," + b[3] + "," + s);
	
	
	
	
	
	
		String str1 = new String("hello");
		String str2 = new String("hello");
		//아래와 같이 쓰면 constant pool에 데이터가 계속 쌓임. 별로 안좋음 재사용할 일이 많지 않기 때문에 new로 쓰는게 좋음..
		//절대로 바뀌지 않음
		String str3 = "test";
		String str4 = "test";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str3 == str4);
		//문자열 비교는 아래와 같이 확실하게 하기. 위에처럼 하지말고
		System.out.println(str3.equals(str4));
		
	}
}
