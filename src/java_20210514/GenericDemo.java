package java_20210514;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		//제네릭으로 가져오기 => 객체의 안정성을 보장 & 코딩이 간단해진다.
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		
		for(int i=0; i<list.size(); i++) {
			String value = list.get(i); //또한 casting안해도 됨 (즉, (String)안적어줘도 된다는 의미)
		System.out.println(value);
		}
		
		for(String value : list) {
			System.out.println(value);
		}
		
		
	}
}
