package com.sist;
import java.util.*;
import java.text.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String today=sdf.format(date);//오늘 날짜가 잡힘
		System.out.println(today);
		StringTokenizer st=new StringTokenizer(today,"-");
		String year=st.nextToken();//하나씩 잘라서 들어온다
		String month=st.nextToken();
		String day=st.nextToken();
		
		System.out.println("연도:"+year);
		System.out.println("월:"+month);
		System.out.println("일:"+day);
	}

}
