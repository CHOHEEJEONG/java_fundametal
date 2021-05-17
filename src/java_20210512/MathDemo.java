package java_20210512;

public class MathDemo {
	public static void main(String[] args) {
		
		//올림
		double d = Math.ceil(4.3);
		System.out.println(d);
		
		//내림
		d = Math.floor(4.9);
		System.out.println(d);
		
		//float를 넣으면 int로 출력 
		//반올림
		int i = Math.round(2.6f);
		System.out.println(i);

		//double로 넣으면 long으로 출력. 후자를 int로 출력하면 에러남
		long l = Math.round(4.2);
		
		d = Math.abs(-4.2);
		System.out.println(d);
		
		d = Math.max(4.2, 5.2);
		System.out.println(d);
		
		d = Math.min(2.4, 1002.56);
		System.out.println(d);
		
		l = (long)Math.sqrt(4);
		System.out.println(l);
		
		d = Math.pow(2.0, 3.0);
		System.out.println(d);
		
		//long로 반환할때 long범위 (21억) 고려하기
		l = (long)Math.pow(2, 3);
		System.out.println(l);
		
		d = Math.random();
		System.out.println(d);
		
	}
}
 		