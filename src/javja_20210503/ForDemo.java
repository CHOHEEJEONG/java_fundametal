package javja_20210503;

public class ForDemo {

	public static void main(String[] args) {
		// 1부터 10까지 합
		int sum = 0;
		for (int i = 1; i <=10 ; i++) {
			sum = sum + i;
			
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);
		
		
		
		//1부터 10까지 짝수 합
		sum = 0;
		for (int i = 1; i<=10; i++) {
			if (i%2==0) {
				sum = sum + i;
			}
			
		}
		System.out.printf("1부터 10까지 짝수 합은 %d 입니다.%n", sum);
		
		
		
		//1부터 10까지 짝수 합 다른 방법
				sum = 0;
				for (int i = 1; i<=10; i+= 2) {
						sum = sum + i;					
				}
				System.out.printf("1부터 10까지 짝수 합은 %d 입니다.%n", sum);
				
				
				
		//2부터 9까지 구구단
		for (int first = 2; first <= 9; first++) {
			System.out.printf("%d단 입니다.%n", first);
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d*%d = %d %n", first, second, first*second);
			}
		}
		
		
		
		//100보다 작은 소수 찾기
		int totalCountOfPrimeNumber = 0;
		int totalIndex = 0;
		//예) 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, ...
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			
			for (int j = 2; j*j <= i; j++) {
				if (i%j ==0) {
					count++;
					break;
				}
				totalIndex++;
			}
			if (count==0) {
				totalCountOfPrimeNumber++;
				System.out.print(i +"\t");
			}
			totalIndex++;
		}
		System.out.println();
		System.out.println(totalCountOfPrimeNumber);
		System.out.println(totalIndex);
		
		

				
		// 이중 for문으로 별 만들기 (별 하나 별 둘 별 셋 별 넷)
		for (int i = 1; i<=4; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		
		// 이중 for문으로 별 만들기 (별 넷 별 셋 별 둘 별 하나)
				for (int i = 1; i<=4; i++) {
					for(int j=1; j<=4-i+1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
				
	}

}
