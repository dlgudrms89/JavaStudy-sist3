package com.sist;
class MyNumber
{
	int num;
	public MyNumber(int num)
	{
		this.num=num;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.num==((MyNumber)obj).num)
			return true;
		else
			return false;
	}
	
}
public class MainClass4_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber m1=new MyNumber(10);
		MyNumber m2=new MyNumber(10);
		//m1==m2(�ּҰ��� �ٸ���) equals
		if(m1.equals(m2))
		{
			System.out.println("m1�� m2�� ���� �����ϴ�");
		}
		else
		{
			System.out.println("m1�� m2�� ���� �ٸ���");
		}
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		//str1==str2(false)
		if(str1.equals(str2))
		{
			System.out.println("str1�� str2�� ����� ���ڰ� �����ϴ�");
		}
		else
		{
			System.out.println("str1�� str2�� ����� ���ڰ� �ٸ���");
		}
	}

}
