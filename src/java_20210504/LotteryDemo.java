package java_20210504;

public class LotteryDemo {
	public static void main(String[] args) {
		// Math.random() => 0보다 크거나 같고 1보다 작은 임의의 double 반환
		//int random = (int)(Math.random() *45)+1; // 1보다 크고 45보다 작은 int 반환
		
		int [] lotto = new int[6];
		for(int i =0; i<lotto.length;i++) {
			// 1보다 크거나 같고 45보다 작은 int  반환
			int random = (int)(Math.random() *45)+1; 
			boolean isExisted = false;
			for(int j = 0; j<i; j++) {
				if(random == lotto[j]) {
					isExisted = true;
					break;
				}
			}
			//값이 중복될 경우 i를 그대로 두게 만들어서 다시 random을 돌게함 그리고 중복이 안될경우 random값을 입력
			if(isExisted) {
				i--;
			}else {
				lotto[i] = random;
			}
		}
		
		//오름차순 정렬
		for (int i=0; i<lotto.length; i++) {
			for(int j =0; j<lotto.length - (i+1); j++) {
				if(lotto[j]> lotto[j+1]) {   //여기서 등호 바꾸면 내림차순 정렬
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
	
		for(int j =0; j<lotto.length;j++) {
			System.out.print(lotto[j]+"\t");
		}
		
		
	}
}
