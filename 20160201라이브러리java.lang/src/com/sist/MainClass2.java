package com.sist;
/*
 * 	��Ű�� => java.lang, java.util
 * 	1) java.lang => import�� ������ �� �ִ�
 * 		Object : �ֻ��� Ŭ����
 * 			= finalize() : ��ü �Ҹ�ÿ� ȣ�� (�Ҹ���)
 * 			= toString() : 
 * 		String : ���ڿ� ���� Ŭ����
 * 			=> char[]
 * 			= ���ڿ� �� : equals
 * 			= ���ڿ� ���� : substring
 * 						split
 * 			= �����Ѱ� ������ ���� : charAt
 * 			= ��� ���������� ���ڿ� ���� : valueOf
 * 						==> static
 * 			= �տ� ���� ���ڿ��� �ִ��� Ȯ�� : startsWith
 * 			= �ڿ� ���� ���ڿ��� �ִ��� Ȯ�� : endsWith
 * 			==================������Ʈ
 * 			= ���ϴ� ������ ��ġȮ�� : indexOf, lastIndexOf
 * 			= toUpperCase, toLowerCase
 * 		Math : ����(����Ŭ����)
 * 			= random() => Random
 * 			= abs() : ���밪
 * 			= ceil() : �ø�!!!//���� ����
 * 			=> count=38;//�Խù��� -> �� �������� ���ϰ� ���� ��
 * 				total=count/10; => 3�̹Ƿ�
 * 				if(count%10>9)
 * 					total++; => 4
 * 			���ٷ� => total=(int)(Math.ceil(count/10.0))
 * 		System
 * 		Wrapper
 * 			= Integer(int)
 * 				parseInt() : ���ڿ� => ������
 * 				valueOf() : ������ ������ ��
 * 			= Double(double)
 * 			= Float(float)
 * 			= Boolean(boolean)
 * 			= Byte(byte)
 * 		StringBuffer
 * 			= append()
 */
import java.util.*;//Date
import java.text.*;//SimpleDateFormat
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� mm�� dd�� hh�� mm�� ss��");
		System.out.println(sdf.format(date));
	}

}
