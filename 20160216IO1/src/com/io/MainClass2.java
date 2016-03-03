package com.io;
//File 속성
import java.util.*;
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			/*
			 * 	File 2개의 정보
			 * 		파일정보 => isFile()
			 * 		디렉토리 => isDirectory()
			 */
			File dir=new File("c:\\download");//폴더정보
			if(!dir.exists())//폴더 또는 파일이 존재하지 않는다면
			{
				dir.mkdir();//생성
			}
			File[] fileList=dir.listFiles();//이미지 폴더에 있는 모든 정보를 가져옴
			for(File f:fileList)
			{
				if(f.isFile())
				{
					System.out.println(f.getPath());
					//getName()이름만, getPath()경로명까지
				}
			}
		}catch(Exception ex){}
	}

}
