package com.sist;
import java.util.*;//Calendar
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		//�̱�������
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DATE);
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month+1);//month��0~11�̶� +1����� ��
		System.out.println(day);
		String[] strWeek={"��","��","ȭ","��","��","��","��"};
		System.out.println(strWeek[week-1]);//1~7���� �Ǿ��־ -1����� ��
	}

}
