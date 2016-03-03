package com.sist;
//Object : finalize() : 객체메모리 회수 시 호출되는 메소드
class Member
{
	public Member()
	{
		System.out.println("(생성자호출:메모리초기화) Member() Call..");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 소멸 : finalize() Call.."); //소멸자 finalize
	}
	
}

public class MainClass2_finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m=new Member();
		m=null;
		System.gc(); //메모리 회수 gc=garbage collection
	}

}
