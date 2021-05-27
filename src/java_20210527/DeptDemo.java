package java_20210527;
import java.util.ArrayList;

public class DeptDemo {
	public static void main(String[] args) {
		DeptDao dao = DeptDao.getInstance();
		
		/*
		//insert 실행하기
		boolean success = dao.insert(new DeptDto(50, "Development", "LA"));
		if(success) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
		*/
		
		
		
		
		/*
		//update 실행하기
		boolean success = dao.update(new DeptDto(50, "Development1", "LA1"));
		if(success) {
			System.out.println("update 성공");
		}else {
			System.out.println("update 실패");
		}
		*/
		
		
		
		/*
		//delete 실행하기
				boolean success = dao.delete(50);
				if(success) {
					System.out.println("delete 성공");
				}else {
					System.out.println("delete 실패");
				}
		*/
		
		
		
		
		//select 실행하기
		int start = 0;
		int len = 10;
		
		ArrayList<DeptDto>list = dao.select(start, len);
		for(DeptDto dto : list) {
			int deptno = dto.getNo();
			String dname = dto.getName();
			String loc = dto.getLoc();
			System.out.printf("%d, %s, %s %n", deptno, dname, loc);
		}			
		
		
		
		
		
		
		
	}
}
