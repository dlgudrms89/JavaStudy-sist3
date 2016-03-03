package com.io;
/*
 * 	IO => 입출력
 * 	 = 메모리
 * 		InputStream
 * 		OutputStream => interface
 * 		============
 * 		System.out
 * 		System.in
 * 		============ 자바 메모리 입출력 표준
 * 	 = 파일
 * 		FileInputStream
 * 		FileOutputStream
 * 	 = 데이터베이스
 * 	 = 네트워크
 * 	=> 자바에서 입출력(Stream : 데이터가 이동하는 통로)
 * 	1byte(바이트 스트림)
 * 		InputStream, OutputStream
 * 		=> FileInputStream, FileOutputStream
 * 			ObjectInputStream, ObjectOutputStream
 * 			BufferedInputStream, BufferedOutputStream
 * 	2byte(문자 스트림)
 * 		Reader, Writer
 * 		=> FileReader, FileWriter
 * 		FileWriter fw=new FileWriter(file명,true); //true를 붙여야 새롭게 저장
 * 		fw.write("aaa"); //파일에 aaa라고 저장하겠다
 * 		fw.write("ccc"); //true를 안 붙이면 ccc만 저장됨
 * 			BufferedReader, BufferedWriter
 */
import java.util.*;
import java.io.*;
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String msg="ㅎㅇ\n";
			FileWriter fos= new FileWriter("c:\\이미지\\io.txt");//파일을 읽어옴
			fos.write(msg);
			fos.close();
			System.out.println("입력완료");
			FileReader fis=new FileReader("c:\\이미지\\io.txt");
			int i=0;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			fis.close();
		}catch(Exception ex){}
	}

}
