package java_20210506;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "성영한";
		c1.age = 20;
		c1.email = "test@test.com";
		c1.phone = "010-9090-9090";
		c1.balance = 1_000_000;
		c1.released = false;
		// 클래스 변수(Static 변수)는 클래스 이름으로 접근하는 것이 관례
		// 변수로도 접근가능하나 권장하지 않음 예) c1.interestRate = 6.2;
		Customer.interestRate = 6.2;
		// final 변수는 값을 재할당 할 수 없음 => 에러가 남
		//Customer.BANKNAME = "국민은행";
		
		
		System.out.printf("%s, %d, %s, %s, %f, %s %n", c1.name, c1.age, c1.email, c1.phone, c1.balance, c1.released);
		
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.age = 30;
		c2.email = "ceo@softbank.com";
		c2.phone = "010-1231-2222";
		c2.balance = 50_000_000_000_000l;
		c2.released = false;
		Customer.interestRate =8.2;
		
		System.out.printf("%s, %d, %s, %s, %f, %s %n", c2.name, c2.age, c2.email, c2.phone, c2.balance, c2.released);
		
		Customer c3 = c2;
		c3.name = "손정의1";

		System.out.printf("%s, %s %n", c2.name, c3.name);
		System.out.printf("%f", Customer.interestRate);
		
	}

}
