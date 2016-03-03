package com.sist;
import java.util.*;
public class BookManager {
   private static ArrayList<Book> list=
		           new ArrayList<Book>();
   static
   {
	   list.add(new Book(1,"�����ϼ���! �� �κ��� 2","����","��Ű�Ͻ�","1.jpg",28000));
	   list.add(new Book(2,"�ǹ��� ���� �ý��� ���� ����ȭ","�ǹ���","�Ѻ��̵��","2.jpg",42000));
	   list.add(new Book(3,"�ý��� ���� �м��� ����ȭ","�귻�� �׷���","�������ǻ�","3.jpg",42000));
	   list.add(new Book(4,"��� ������Ʈ �������� ����","���μ�","��Ű�Ͻ�","4.jpg",27000));
	   list.add(new Book(5,"���� ���� �ϴ� ����� �� ����","������","�븲���ǻ�","5.jpg",22000));
	   list.add(new Book(6,"�ǿ����� ���� �н� (���Ⱓ��)","�ڿ���","��Ű�Ͻ�","6.jpg",22000));
	   list.add(new Book(7,"������������ ���ø����̼� ��Ű��ó ����","��ƾ �Ŀ﷯","��Ű�Ͻ�","7.jpg",35000));
	   list.add(new Book(8,"�ڹٽ�ũ��Ʈ+jQuery �������� ���͵�3","�����","�Ѻ��̵��","8.jpg",32000));
	   list.add(new Book(9,"�ڹٽ�ũ��Ʈ+jQuery �������� ���͵�2","�����","��Ű�Ͻ�","9.jpg",24000));
	   list.add(new Book(10,"�ڹٽ�ũ��Ʈ+jQuery �������� ���͵�1","�����","�븲���ǻ�","10.jpg",25000));
   }
   public ArrayList<Book> bookAllData()
   {
	   return list;
   }
   public Book bookDetail(int no)
   {
	  Book book=new Book();
	  for(Book b:list)
	  {
		  if(b.getNo()==no)
		  {
			  book=b;
			  break;
		  }
	  }
	  return book;
   }
   public ArrayList<Book> bookFindData(String pub)
   {
	    ArrayList<Book> list=
	    		new ArrayList<Book>();
	    for(Book book:BookManager.list)
	    {
	    	if(pub.equals(book.getPublisher()))
	    	{
	    		list.add(book);
	    	}
	    }
	    return list;
   }
}







