package com.sist;
/*
 * 	Library : ����ǰ(�ڹ�) .class => ����� ���ؼ� ����
 * 	Framework : ���� .class, .java => ���������� ����
 * 			= spring, mybatis, jquery
 * 	============================= Open Source
 * 	1) �޸𸮱���
 * 		=============
 * 		�޼ҵ� ���� => �޼ҵ�,static
 * 		=============
 * 		���� => �Ű�����, �������� : �޸� ��ü ����
 * 			{}�� ���ᰡ �Ǹ� �޸� ����
 * 		=============
 * 		�� => ���α׷��� ����(�ν��Ͻ�) => new
 * 			GC(������ �÷���)
 * 
 * 	=============================
 * 	���̺귯��
 * 		1) java.lang
 * 			=> import�� ������ �� �ֵ�
 * 			Object : �ֻ��� Ŭ���� (��� Ŭ������ Object���)
 * 				���)
 * 					toString():��ü�� ���ڿ��� ��ȯ
 * 					(String)
 * 					finalize:
 * 						c++ => ��ü����(������)
 * 							        ��ü�Ҹ�(�Ҹ���)
 * 					���� ====>   Ȱ��        ====> �Ҹ�
 * 				A a=new A() a.display() a=null
 * 										(GC=> finalize())
 * 					������
 * 
 * 		2) java.util
 * 		3) java.sql
 * 		4) java.io
 * 		5) java.net
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 * 	1)Ŭ���� ���� : �Ϲ� ����(��������), �迭
 * 		class A
 * 		{
 * 			int a;
 * 			int[] arr;
 * 			JButton b; => ���
 * 			�޼ҵ� : ����޼ҵ�
 * 			class B
 * 			{
 * 			}
 * 		}
 */
public class MainClass_toString extends JFrame{
	JComboBox box;
	JLabel la;
	JButton b;
	public MainClass_toString()
	{
		//��������� �ʱ�ȭ => ������
		//������� : �Ϲݺ���(int a,b...), ��ü
		la=new JLabel("����");
		box=new JComboBox();
		box.addItem("����");
		box.addItem("����");
		b=new JButton("����");
		setLayout(new FlowLayout());
		add(la);
		add(box);
		add(b);
		setSize(300,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b.addActionListener(new MyEvent(this));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass_toString();
	}

}
