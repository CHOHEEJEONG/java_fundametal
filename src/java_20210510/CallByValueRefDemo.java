package java_20210510;
import java.lang.*; //보통 얘가 생략되어 있음
public class CallByValueRefDemo extends Object{ //마찬가지로 모든 instance에 Object가 상위로 설정되어 있으며 생략되어 있음
	public static void ascending(int[]temp) {
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length - (i + 1); j++) {
				if (temp[j] > temp[j + 1]) {
					int temp2 = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = temp2;
				}
			}
		}
	}
	
	
	
	
	public static void change(int i, int[]j) {
		i = 20;
		j[3] =400;
	}
	
	public static void main(String[] args) {
		int i = 10;
		int[] j = {1,2,3,4};
		System.out.println(i+","+j[3]);
		change(i,j);
		//출력된 값 확인해보기. 윗 부분 i,j와 아래부분 i,j가 다름 call by value와 call by reference 차이 
		System.out.println(i+","+j[3]);
		
		//이전에 했던 방식으로 위에서 return을 굳이 하지 않고 lotto2라는 새로운 변수도 만들지 않고 바로 ascending해서 출력
		int[] lotto = {3,5,12,45,23,1};
		ascending(lotto);
		for(int value : lotto) {
			System.out.print(value + "\t");
		}
		
		
		
		
	}

}
