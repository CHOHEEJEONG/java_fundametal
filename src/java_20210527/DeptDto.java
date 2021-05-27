package java_20210527;

public class DeptDto {
	//데이터베이스에서는 칼럼이름 중복을 허용하지 않기에 칼럼이름에 테이블의 정보를 넣어서 지음
	//그러나 자바에서는 중복허용하기 때문에 테이블 정보를 제외하고 이름을 지어줌
	private int no;
	private String name;
	private String loc;
	
	//Alt + Shift + s -> c ; 디폴트 생성자	
	public DeptDto() {
		super();
	}
	
	//Alt + Shift + s -> o ; 매개변수 3개자리 생성자
	public DeptDto(int no, String name, String loc) {
		super();
		this.no = no;
		this.name = name;
		this.loc = loc;
	}
	
	
	//Alt + Shift + s -> r ; setter, getter 
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	
	
}
