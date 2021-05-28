package java_20210528;

import java.util.ArrayList;

public class EmpDemo {
	public static void main(String[] args) {
		EmpDao dao = EmpDao.getInstance();
		
		/*
		// insert 실행
		EmpDto dto = new EmpDto(9003, "KIM", "MANAGER", 7839, null, 50000.0, 40000.0, 30);
		boolean success = dao.insert(dto);
		if(success) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
		*/
		
		
		
		//update 실행
		boolean success = dao.update(new EmpDto(9003, "KIM1", "MANAGER1", 7839, null, 50001.0, 40001.0, 40));
		if(success) {
			System.out.println("update 성공");
		}else {
			System.out.println("update 실패");
		}
		
		
		
		
		
		/*
		//delete 실행
		boolean success = dao.delete(9003);
		if(success) {
			System.out.println("delete 성공");
		}else {
			System.out.println("delete 실패");
		}
		*/
		
		
		/*
		//select 실행
		ArrayList<EmpDto> list = dao.select(0, 10);
		for(EmpDto dto : list) {
			System.out.printf("%d, %s, %s, %d, %s, %.1f, %.1f, %d %n", 
					dto.getNo(), dto.getName(), dto.getJob(), dto.getMgr(), 
					dto.getHiredate(), dto.getSal(), dto.getComm(), dto.getDeptNo());
		}
		*/
		
		
	}
}
