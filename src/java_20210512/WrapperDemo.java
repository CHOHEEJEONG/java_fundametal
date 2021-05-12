package java_20210512;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		//Ctrl + Shift + o -> auto import
		//자바 1.4 이전 버전에서는 primitive data type을 collection에 저장할 수 없었기 때문에 
		//primitive data type을 객체화 할 수 있는 Wrapper Class으로 변환하여 저장해야 했다.
		//아래와 같이 1을 저장할 수 없음
		ArrayList list = new ArrayList();
		list.add(1); //이전 버전에서는 오류나는데 현재 버전에서는 boxing을 내부적으로 해줘서 오류가 안남
		list.add(new Integer(1));
		
		//1. primitive data type => wrapper class (valueOf()) <- 버전이 업뎃 돼서 안해줘도 됨(auto-boxing이라 함)
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("20");
		
		//2. wrapper class => primitive data type (intValue()) <- 버전이 업뎃 돼서 안해줘도 됨 (auto-unboxing이라 함)
		int i3 = i1.intValue();
		int i4 = i2.intValue();
		
		int i5 = i3 + i4;
		
		//3. 숫자로 구성된 String => primitive data type <- 자동으로 안되기 때문에 외워야 됨, 자주 사용됨
		//Integer.parseInt("10");
		String s1 = "1234";
		int i6 = Integer.parseInt(s1);
		
		//4. auto-boxing : primitive data type -> wrapper class
		Integer i7 = 100; //1번이 생략된 것
		Integer i8 = 200;		
		
		//5. auto-unboxing : wrapper class -> primitive data type
		int i9 = i7 + i8; //2번이 생략된 것
	
	
	}
}
