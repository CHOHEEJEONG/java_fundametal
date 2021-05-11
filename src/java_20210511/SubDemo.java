package java_20210511;

public class SubDemo {

	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.money);
		sub.makeMoney();
		System.out.println(sub.chicken);
		sub.gotoSchool();

		sub.play("~~~");
		
		Super sup = new Super();
		System.out.println(sup.money);
		sup.makeMoney();
		sup.play("~~");
		
		//이 경우는 Super만 접근가능하고 overriding 된 것만 하위 클래스에서 호출할 수 있음
		Super sup1 = new Sub();
		System.out.println(sup1.money);
		sub.makeMoney();
		sub.play("~~~");
		
		//아래 두개 결과가 똑같이 나옴. 즉, sub 프린트 한 것에 toString()이 생략되어 있는 것임
		// object 매서드에 toString이 있는 것
		System.out.println(sub.toString());
		System.out.println(sub);
		
		
		Object obj = new Sub();
		System.out.println(obj.toString());
		System.out.println(obj);
	}

}
