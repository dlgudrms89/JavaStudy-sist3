package com.sist;
import java.util.*;
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec=new Vector<String>(5); //default�� 10
		// Vector : List(������ ����, �ߺ��� ���)
		// �߰� ==> 0
		System.out.println("�ʱ�����ũ��:"+vec.capacity()); //5 => �ʱ� ���� ũ��, �߰��ϸ� �ʰ�����(�ټ����� �þ)
		vec.addElement("ȫ�浿");//0
		vec.addElement("��û��");//2
		vec.add(1, "������");//1
		for(int i=0; i<vec.size(); i++)
		{
			String name=vec.elementAt(i);
			// vec.get(i); //���� ������ �ǹ�
			System.out.println(name);
		}
		vec.set(1, "�̼���"); //������==>�̼���
		System.out.println("���� ����:"+vec.size());
		vec.removeElementAt(0);//ȫ�浿 ����,�̼��� => ��û��
		vec.removeAllElements();//��ü���� (= vec.clear();)
		System.out.println("���� ����:"+vec.size());
		for(String name:vec)
		{
			System.out.println(name);
		}
	}

}
