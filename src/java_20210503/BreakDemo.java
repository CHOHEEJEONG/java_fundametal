package java_20210503;

public class BreakDemo {

	public static void main(String[] args) {
		int sum =0;
		aa : 
		for (int i = 1; i <=10; i++) {
			if (i==6) break aa;
			sum +=i;
		}
		System.out.println("합은 : " + sum);
		
		
		
		outter : 
		for (int i =2; i<=9 ; i++) {
			inner :
			for (int j =1; j<=9; j++) {
				// break inner 은 4*7까지 계산하고 5단으로 넘어가서 9단까지 계산 나옴
				//break outter 은 4*7까지 계산하고 아에 나가서 그 뒤 결과 없음
				if(i==4 && j==8) break inner;
				System.out.printf("%d*%d =%d%n", i, j, i*j);
			}
		}
			
		
	}
}
