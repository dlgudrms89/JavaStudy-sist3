package com.io;
/*
 * 	IO => �����
 * 	 = �޸�
 * 		InputStream
 * 		OutputStream => interface
 * 		============
 * 		System.out
 * 		System.in
 * 		============ �ڹ� �޸� ����� ǥ��
 * 	 = ����
 * 		FileInputStream
 * 		FileOutputStream
 * 	 = �����ͺ��̽�
 * 	 = ��Ʈ��ũ
 * 	=> �ڹٿ��� �����(Stream : �����Ͱ� �̵��ϴ� ���)
 * 	1byte(����Ʈ ��Ʈ��)
 * 		InputStream, OutputStream
 * 		=> FileInputStream, FileOutputStream
 * 			ObjectInputStream, ObjectOutputStream
 * 			BufferedInputStream, BufferedOutputStream
 * 	2byte(���� ��Ʈ��)
 * 		Reader, Writer
 * 		=> FileReader, FileWriter
 * 		FileWriter fw=new FileWriter(file��,true); //true�� �ٿ��� ���Ӱ� ����
 * 		fw.write("aaa"); //���Ͽ� aaa��� �����ϰڴ�
 * 		fw.write("ccc"); //true�� �� ���̸� ccc�� �����
 * 			BufferedReader, BufferedWriter
 */
import java.util.*;
import java.io.*;
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String msg="����\n";
			FileWriter fos= new FileWriter("c:\\�̹���\\io.txt");//������ �о��
			fos.write(msg);
			fos.close();
			System.out.println("�Է¿Ϸ�");
			FileReader fis=new FileReader("c:\\�̹���\\io.txt");
			int i=0;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			fis.close();
		}catch(Exception ex){}
	}

}
