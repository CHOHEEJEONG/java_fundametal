package java_20210511;

public class Parent {
	String name;
	String address;
	int age;

	//alt + shift + s -> c => 디폴트 생성자
	//디폴트 생성자가 없다면 하위 class에서 에러남 
	public Parent() {
		super();
	}
	
	
	
	//alt + shift + s -> o => 매개변수 있는 생성자
	public Parent(String name, String address, int age) {
		super(); //항상 자리가 첫라인에 있어야 함. 아니면 에러남
		this.name = name;
		this.address = address;
		this.age = age;
	}

}
