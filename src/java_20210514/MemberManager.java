package java_20210514;

import java.util.ArrayList;

public class MemberManager {
	private ArrayList list;
	public MemberManager() {
		list = new ArrayList();
	}
	
	public void insert(String id, String name, int age) {
		list.add(new Member(id, name, age));
	}
	
	public void update(String id, String name, int age) {
		for(int i =0; i<list.size(); i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				//list.remove(i);
				//add할 때 index위치를 정해줄 수 있음, 그렇지 않으면 지워지고 맨 뒤에 새로 입력이 됨
				//list.add(i, new Member(id, name, age));
				//혹은 지우지 않고 객체를 바꿔주는 법
				m.setAge(age);
				m.setName(name);
				break;
			}
		}
	}
	
	public void delete(String id) {
		for(int i =0; i<list.size();i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				list.remove(i);
				break;
			}
		}
	}

	public ArrayList select() {
		return list;
	}

	public Member select(String id) {
		Member member = null;
		for(int i = 0; i<list.size(); i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				member = m;
				break;
			}
		}
		return member;
	}

}
