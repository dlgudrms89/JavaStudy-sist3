package com.sist;
//map => HashMap => Web,Spring
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();	//두개씩 저장하는것을 맵이라 함
		map.put("id", "admin");
		map.put("pwd", "1234");
		String id=(String)map.get("id");
		System.out.println(id);
	}

}
