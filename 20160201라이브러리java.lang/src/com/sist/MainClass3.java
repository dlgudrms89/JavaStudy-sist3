package com.sist;
import java.util.*;//Calendar
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		//싱글턴패턴
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DATE);
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month+1);//month는0~11이라 +1해줘야 됨
		System.out.println(day);
		String[] strWeek={"일","월","화","수","목","금","토"};
		System.out.println(strWeek[week-1]);//1~7까지 되어있어서 -1해줘야 됨
	}

}
