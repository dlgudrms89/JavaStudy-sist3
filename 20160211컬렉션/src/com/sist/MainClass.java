package com.sist;
import java.util.*;
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec=new Vector<String>(5); //default는 10
		// Vector : List(순서가 존재, 중복을 허용)
		// 추가 ==> 0
		System.out.println("초기저장크기:"+vec.capacity()); //5 => 초기 저장 크기, 추가하면 초과가능(다섯개씩 늘어남)
		vec.addElement("홍길동");//0
		vec.addElement("심청이");//2
		vec.add(1, "춘향이");//1
		for(int i=0; i<vec.size(); i++)
		{
			String name=vec.elementAt(i);
			// vec.get(i); //위와 동일한 의미
			System.out.println(name);
		}
		vec.set(1, "이순신"); //춘향이==>이순신
		System.out.println("저장 갯수:"+vec.size());
		vec.removeElementAt(0);//홍길동 삭제,이순신 => 심청이
		vec.removeAllElements();//전체삭제 (= vec.clear();)
		System.out.println("저장 갯수:"+vec.size());
		for(String name:vec)
		{
			System.out.println(name);
		}
	}

}
