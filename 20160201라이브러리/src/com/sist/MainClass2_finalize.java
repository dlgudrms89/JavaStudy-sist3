package com.sist;
//Object : finalize() : ��ü�޸� ȸ�� �� ȣ��Ǵ� �޼ҵ�
class Member
{
	public Member()
	{
		System.out.println("(������ȣ��:�޸��ʱ�ȭ) Member() Call..");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("��ü �Ҹ� : finalize() Call.."); //�Ҹ��� finalize
	}
	
}

public class MainClass2_finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m=new Member();
		m=null;
		System.gc(); //�޸� ȸ�� gc=garbage collection
	}

}
