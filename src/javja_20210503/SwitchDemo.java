package javja_20210503;

public class SwitchDemo {

	public static void main(String[] args) {
		// Run configurations => Arguments => Program arguments (에 숫자 집어넣으면 됨)
				int month = Integer.parseInt(args[0]);
				String season = "";
				switch(month) {
				// case12,1,2 : 라고 표기해도 된다. (버전이 업데이트 되면서 가능해짐)
				// case는 중복되면 안된다.
				case 12 : case 1 : case 2 : 
					season ="겨울";break;
		
				case 3 : case 4 : case 5 : 
					season ="봄";break;
	
				case 6 : case 7 : case 8 : 
					season ="여름";break;
			
				case 9 : case 10 : case 11 : 
					season ="가을";break;
				
				default : season = "없는 계절";
				}
				
				System.out.println(month + "월은 "+ season + "입니다.");
	}

}
