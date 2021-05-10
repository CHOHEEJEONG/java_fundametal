package javja_20210503;

public class ContinueDemo {

	public static void main(String[] args) {
		int sum =0;
		for (int i = 1; i <= 10; i++) {
			if(i==6) continue;
			sum+= i;
			
			/*
			 * 위에 cintinue문과 아래 if문과 결과 같은데 위에가 더 보기 좋음
			 * if(i !=6) {
			 * 		sum+=i;
			 * }
			 */
			
		}
		System.out.println("합은 : " + sum); 
		
		
		
	}

}
