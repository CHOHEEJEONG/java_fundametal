package java_20210514;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		m.insert("syh1011", "성영한1", 10);
		m.insert("syh2022", "성영한2", 20);
		m.insert("syh3033", "성영한3", 30);
		m.insert("syh4044", "성영한4", 40);
		
		ArrayList list = m.select();
		for(int i=0; i<list.size(); i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s, %s, %d %n", m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("=========================");
		
		m.delete("syh1011");
		
		for(int i=0; i<list.size(); i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s, %s, %d %n", m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("=========================");
		
		m.update("syh2022","성영한2",100);
		
		for(int i=0; i<list.size(); i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s, %s, %d %n", m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("=========================");
		
		Member m3 = m.select("syh4044");
		System.out.printf("%s, %s, %d %n",m3.getId(), m3.getName(), m3.getAge());
	}
}
