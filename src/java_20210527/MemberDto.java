package java_20210527;
//1. member테이블 객체화
//용도 : 1. 매개변수를 줄일 목적,
//      2. 테이블의 한개의 row 정보를 객체화하기 위한 목적
public class MemberDto {
	//member 테이블의 칼럼을 멤버변수로 설정한다.
	private int num; 
	private String name; 
	private String addr;
	
	//디폴트 생성자 만들기 (Default constructor = 매개변수 없는 생성자), 멤버변수가 없기 때문에 초기화를 할 수 없음
	public MemberDto() {
		super();
	}
	
	//매개변수 3개짜리 생성자 만들기
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	//setter getter만들기
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
