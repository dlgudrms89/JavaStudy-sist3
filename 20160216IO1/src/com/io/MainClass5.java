package com.io;
import java.io.*;
import java.net.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			/*
			 * 	키보드 입력값을 받는 경우
			 * 	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			 * 	
			 * 	파일 입력값을 받는 경우
			 *  BufferedReader in=new BufferedReader(new FileInputStream(System.in));
			 *  
			 *  네트워크
			 *  BufferedReader in=new BufferedReader(socket.getInputStream(System.in));
			 *  
			 *  웹서버 이용
			 *  BufferedReader in=new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
			 * 
			 */
			
//			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("입력값:");
//			String msg=in.readLine();
//			System.out.println(msg);
			
//			URL url=new URL("http://www.daum.net");
//			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
//			if(conn!=null)
//			{
//				BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
//				while(true)
//				{
//					String msg=in.readLine();
//					System.out.println(msg);
//					if(msg==null)break;					
//				}
//			}
			
			BufferedReader in=new BufferedReader(new InputStreamReader(new FileInputStream("c:\\이미지\\io.txt")));
			while(true)
			{
				String msg=in.readLine();
				if(msg==null)break;
				System.out.println(msg);
			}
			
//			System.out.println("입력:");
//			int data=System.in.read();
//			System.out.println((char)data);
		}catch(Exception ex){}
		
	}

}
