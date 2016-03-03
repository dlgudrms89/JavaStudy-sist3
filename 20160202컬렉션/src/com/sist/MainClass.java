package com.sist;
/*
 *    �÷��� (Collection) : �ڷᱸ��
 *      => �����͸� �����ϴ� �� 
 *           Collection
 *              |
 *      -----------------------
 *      |          |           |
 *     Set       List        Queue   Map
 *                 |
 *            --------------
 *            |       |      |
 *         ArrayList  Vector LinkedList
 *        ===========
 *        1) ������ �����Ѵ�
 *        2) �����͸� �ߺ����� ������ ���� 
 *        3) �����(������) ���� 
 *        4) ��� 
 *           1. �߰�   add(Object obj) , add(int , Object)
 *           2. ����   remove
 *           3. ����  set
 *           4. ������ ����  get
 *           5. ���� ���� size
 *        5) ���� : �ӵ���  ������ 
 *        6) �迭���� 
 *        7) �����Ͱ� �����Ӱ� ÷���� �� �ִ� (������ ����)
 *           ============================
 *           ���׸�
 *           
 *        class Box<T>
 *        {
 *            T t;
 *            public void setT(T t)
 *            {
 *                this.t=t;
 *            }
 *            public T getT()
 *            {
 *                return t;
 *            }
 *            
 *        }
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=
        		new ArrayList<String>();
        list.add("ȫ�浿1"); // 0
        list.add("ȫ�浿2"); // 2
        list.add("ȫ�浿3"); // 3 // remove
        list.add("ȫ�浿4"); // 4 // 3
        list.add("ȫ�浿5"); // 5 // 4
        list.add(1,"ȫ�浿6"); // 1
        System.out.println("���� ����:"+list.size());
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
        list.remove(3);
        System.out.println("���� ����:"+list.size());
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
        list.set(3, "��û��");
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
	}

}
