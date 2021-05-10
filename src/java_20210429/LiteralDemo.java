package java_20210429;

public class LiteralDemo {
	public static void main(String[] args) {
		//byte 범위를 넘어가면 컴파일 에러 발생
		byte b1 = 127;
		
		int a1 = 128; //10진수
		int a2 = 076; //8진수
		int a3 = 0x123; //16진수
		int a4 = 0b111;//2진수
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		//long 리터럴은 숫자뒤에 1,L로 표시함
		long a5 = 2200000000l;
		
		//10진수를 표기할 때 3자리 단위로 '_'를 사용할 수 있음
		int a6 = 1_000_000;
		
		// float 리터럴은 숫자뒤에 f,F로 표시함
		float f1 = 1234.43f;
		
		//double 리터럴은 숫자뒤에 d,D로 표시함, 생략가능
		double d1 = 1234.45;
		
		//boolean 리터럴은 true, flase
		boolean isExited = false;
		
	}
}