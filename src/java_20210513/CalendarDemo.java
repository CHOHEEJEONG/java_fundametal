package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//월만 index가 0부터 시작 나머지는 1부터 시작
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		//int hour = cal.get(Calendar.HOUR);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %n", year, month, day);
		System.out.printf("%d:%d:%d %n", hour, minute, second);
		
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		StringBuffer message = new StringBuffer();
		
		if(dayOfWeek == Calendar.SUNDAY) {
			message.append("일요일");
		}else if(dayOfWeek == Calendar.MONDAY) {
			message.append("월요일");
		}else if(dayOfWeek == Calendar.TUESDAY) {
			message.append("화요일");
		}else if(dayOfWeek == Calendar.WEDNESDAY) {
			message.append("수요일");
		}else if(dayOfWeek == Calendar.THURSDAY) {
			message.append("목요일");
		}else if(dayOfWeek == Calendar.FRIDAY) {
			message.append("금요일");
		}else if(dayOfWeek == Calendar.SATURDAY) {
			message.append("토요일");
		}
		System.out.printf("%d년 %d월 %d일 %s 입니다.%n", year, month+1, day, message.toString());
		
		//ctrl + Shift + o 눌러줘서 자동으로 import 시킴
		cal.set(2020, 1, 13); //날짜를 변경할 사용하는 메서드
		
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy년 MM월 dd일 HH시mm분ss초 E요일");
		//System.out.println(sdf.format(cal.getTime()));
		Date d = cal.getTime();
		String display = sdf.format(d);
		System.out.println(display);

		//해당월에 마지막 날짜를 반환함
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
		
		
		
		
		
		
	}
}
