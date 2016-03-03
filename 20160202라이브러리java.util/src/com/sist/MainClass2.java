package com.sist;
//StringToken
/*
 * 	hasMoreTokens
 * 	nextToken
 */
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="admin|hong|남자";
		StringTokenizer st=new StringTokenizer(data, "|");//"|"를 기준으로 자른다
		while(st.hasMoreTokens())//토큰의 갯수만큼 루프를 돌린다
		{
			System.out.println(st.nextToken());
		}
	}

}
