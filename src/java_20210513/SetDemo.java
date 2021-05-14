package java_20210513;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//HashSet 클래스는 데이터(객체)의 중복을 허용하지 않고 순서가 없음
		//HashSet set = new HashSet();
		//TreeSet 클래스는 데이터(객체)의 중복을 허용하지 않고 
		//natural ordering(숫자일때와 문자일때 정렬방식이 다름)을 한다.
		//TreeSet set = new TreeSet();
		//LinkedHashSet 클래스는 데이터의 중복을 허용하지 않고 순서는 FIFO(first in first out) 구조이다. 
		LinkedHashSet set = new LinkedHashSet();
		
		set.add("1");
		set.add("1");
		set.add("2");
		set.add("1");
		set.add("11");
		set.add("12");
		set.add("43");
		set.add("15");
		set.add("27");
		
		//HashSet 클래스는 자체적으로 출력할 방법이 없음
		//HashSet를 Iterator로 변환해서 출력해야 함
		Iterator i = set.iterator();
		//hasNext() : Iterator에 출력할 객체가 존재하는지 판단하는 메서드
		//있으면 true, 없으면 false
		//여기서 for문 쓰면 안됨
		while(i.hasNext()) { 
			String temp = (String)i.next(); //해당 객체를 가져온다.
			//Integer temp = (Integer)i.next(); //해당 객체를 가져온다.
			System.out.println(temp);
		}
		
		//Treeset이용해서 lotto번호 뽑기
		TreeSet lottoSet = new TreeSet();
		while(true){
			int random = (int)(Math.random()*45)+1;
			lottoSet.add(random);
			if(lottoSet.size() == 6) break;
		}
		
		Iterator i2 = lottoSet.iterator();
		
		while(i2.hasNext()) {
			Integer temp = (Integer)i2.next();
			System.out.print(temp + "\t");
			
		}
		
		System.out.println();
		
		StringBuffer s1 = new StringBuffer("a");
		StringBuffer s2 = new StringBuffer("a");
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		//HashSet 클래스는 데이터의 중복을 판단할 때 equals(로 비교해서)
		//true가 나오면 데이터가 중복되었다가 판단하여 데이터를 추가해주지 않음
		HashSet set1 = new HashSet();
		set1.add(s1);	
		set1.add(s2);	
		
		System.out.println(set1.size());
		
		//TreeSet 클래스는 데이터의 중복을 판단할 떄 compareTo()로 비교해서 
		//0가 나오면 데이터가 중복되었다고 판단하여 데이터를 추가해주지 않음
		TreeSet set2 = new TreeSet();
		set2.add(s1);
		set2.add(s2);

		System.out.println(set2.size());
	}
}
