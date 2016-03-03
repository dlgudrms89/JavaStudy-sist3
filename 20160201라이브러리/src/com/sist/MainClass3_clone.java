package com.sist;
//clone : 복제
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
class Student implements Cloneable//복제할때 호출
{
	String id;
	public Student display()
	{
		Student s=null;
		try
		{
			s=(Student)super.clone();//복제!
		}catch(Exception ex){}
		return s;
	}
}
public class MainClass3_clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		s1.name="홍길동";
		s1.dept="영업부";
		s1.print();
		Sawon s2=s1;
		s2.name="심청이";
		s2.dept="개발부";
		s2.print();
		s1.print(); //이건 복제가 아니라 주소 참조
		
		Student s3=new Student();
		s3.id="hong";
		System.out.println("s3.id:"+s3.id);
		Student s4=s3.display();
		s4.id="shim";
		System.out.println("s4.id:"+s4.id);
	}

}
