package java_20210510;

public class AdminDemo {

	public static void main(String[] args) {
		//생성자 ; 전체를 다 초기화할 떄는 생성자가 편함
		Admin a = new Admin("syh1011","123","syh@hblab.org",20);
		
		
		// setter 이옹하면 너무 길어서 불편.. setter은 하나만 변경할 때 유용
		//Admin a1 = new Admin();
		//a1.setId("syh1011");
		//a1.setPwd("123");
		//a1.setEmail("syh@hblab.org");
		//a1.setLevel(20);
		
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
	}

}
