package java_20210430;

public class CharLiteralDemo {
	public static void main(String[] args) {
		// char 리터럴 => 문자 표현법
		char c1 = '정';
		char c2 = '초';
		char c3 = '희';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		// char 리터럴 -> 유니코드 표현법
		char c4 = '\uc815';
		char c5 = '\ucd08';
		char c6 = '\ud76c';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		// print 뒤에 ln 붙이는 것 = 출력후 개행하라는 의미
		
		// char 리터럴 => 아스키코드 표현법
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;
		
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		
		// 문자 중에 사용할 수 없는 문자는 ',\
		// 사용하기 위해서는 \를 사용해야 한다.
		char c10 = '\'';
		char c11 = '\\';
		
		System.out.println(c10);
		System.out.println(c11);
		
		// 특수문자 \t, \n
		
		System.out.print("안녕하세요. \n저는 정초희입니다. \n잘 부탁드립니다.\n");
		
		System.out.println("아이디\t이름\t지역");
		System.out.println("chohee0505\t정초희\t경기");
		
		
		
		
	}
}
