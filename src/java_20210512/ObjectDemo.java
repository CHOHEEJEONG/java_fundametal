package java_20210512;

class Test{
	String name;
	Test(String name){
		
		this.name = name;
	}
	//오버라이딩 하는 법 = alt + Shift + s -> h
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	//참조변수를 문자열로 변환 ; toString <= alt + Shift + s -> s 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}
	
}
public class ObjectDemo {
	public static void main(String[] args) {
		Test t1 = new Test("성영한");
		Test t2 = new Test("성영한");
		Test t3 = t2;
		//오버라이딩해도 무조건 false나옴
		System.out.println(t1 == t2);
		//오버라이딩 안하면 false, 하면 true가 나옴
		System.out.println(t1.equals(t2));
		//t2와 t3의 해쉬코드가 같음
		System.out.println(t2.equals(t3));
		
		//오버라이딩 안하면 해쉬코드가 다르게 나오는데 오버라이딩 하면 해쉬코드가 같게 나옴
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		//참조변수 출력
		//오버라이딩 하면 객체 안에 있는 instance 구성요소가 보임, 안하면 패키지명 ~~ 나옴
		System.out.println(t1);
		
		
	}
}
