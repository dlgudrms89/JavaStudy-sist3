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
		String data="admin|hong|����";
		StringTokenizer st=new StringTokenizer(data, "|");//"|"�� �������� �ڸ���
		while(st.hasMoreTokens())//��ū�� ������ŭ ������ ������
		{
			System.out.println(st.nextToken());
		}
	}

}
