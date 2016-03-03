package com.sist;
/*
 * 	Thread : java.lang
 * 	������� : implements Runnable
 * 			extends Thread
 * 	Thread �����ֱ�
 * 		= new Thread() : name, priority(�켱����)
 * 						 name : Thread-0
 * 						priority : 1~10
 * 							MAX(10,MIN(1),NORM(5)
 * 							����� ���Ǵ� NORM
 * 		= ������(Runnable) => start()
 * 		= �������(Running) => run()
 * 			start() => run() ȣ��
 * 				run() : Thread�� ������ ����
 * 			= Blocked (�Ͻ� ����) : sleep, wait
 * 			= Dead (����) : join,interrupt()
 */
class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<10; i++)
			{
				System.out.println(getName()+":"+i);
				Thread.sleep(100);
			}
		}catch(Exception ex){}
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1=new MyThread();
//		m1.setName("ȫ�浿");
//		System.out.println(m1.getName());
//		m1.setPriority(Thread.MAX_PRIORITY);
//		System.out.println(m1.getPriority());
		MyThread m2=new MyThread();
		MyThread m3=new MyThread();
		
		m1.setPriority(10);
		m2.setPriority(1);
		m3.setPriority(1);
		m1.start();
		m2.start();
		m3.start();
	}

}
