package java_20210511;

public class ChildDemo {
	public static void main(String[] args) {
		
	//객체 생성을 자기 자식것만 만들어서 생성할 수도 있고
	Child child = new Child("010-9090-8765", 50.3, 155.2);
	
	System.out.println(child.name);
	System.out.println(child.address);
	System.out.println(child.age);
	System.out.println(child.phone);
	System.out.println(child.weight);
	System.out.println(child.height);
	
	
	//부모의 것이랑 자식것 모두 만들어서 생성할 수 있음
	Child child2 = new Child("성영한","서울",30,"010-9090-8765",50.3,155.2);


	}
}
