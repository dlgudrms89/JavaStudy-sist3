package com.sist;
//clone : ����
class Sawon
{
	String name;
	String dept;
	public void print()
	{
		System.out.println("Name:"+name);
		System.out.println("Dept:"+dept);
	}
}
class Student implements Cloneable//�����Ҷ� ȣ��
{
	String id;
	public Student display()
	{
		Student s=null;
		try
		{
			s=(Student)super.clone();//����!
		}catch(Exception ex){}
		return s;
	}
}
public class MainClass3_clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		s1.name="ȫ�浿";
		s1.dept="������";
		s1.print();
		Sawon s2=s1;
		s2.name="��û��";
		s2.dept="���ߺ�";
		s2.print();
		s1.print(); //�̰� ������ �ƴ϶� �ּ� ����
		
		Student s3=new Student();
		s3.id="hong";
		System.out.println("s3.id:"+s3.id);
		Student s4=s3.display();
		s4.id="shim";
		System.out.println("s4.id:"+s4.id);
	}

}
