package java_20210528;

import java.util.ArrayList;

public class EmpDao {
	private static EmpDao jeong;
	private EmpDao() {
		
	}
	
	public static EmpDao getInstance() {
		if(jeong == null) {
			jeong = new EmpDao();
		}
		return jeong;
	}
	
	
	public boolean insert(EmpDto dto) {
		boolean success = false;
		
		return success;
	}
	
	
	public boolean update(EmpDto dto) {
		boolean success = false;
		
		return success;
	}

	public boolean update(int no) {
		boolean success = false;
		
		return success;
	}


	public ArrayList<EmpDto> select(int start, int len){
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();
		
		return list;
	}






}

