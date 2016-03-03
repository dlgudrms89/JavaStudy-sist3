package com.sist;
/*
 * 	패키지 => java.lang, java.util
 * 	1) java.lang => import를 생략할 수 있다
 * 		Object : 최상위 클래스
 * 			= finalize() : 객체 소멸시에 호출 (소멸자)
 * 			= toString() : 
 * 		String : 문자열 관리 클래스
 * 			=> char[]
 * 			= 문자열 비교 : equals
 * 			= 문자열 분해 : substring
 * 						split
 * 			= 문자한개 가지고 오기 : charAt
 * 			= 모든 데이터형을 문자열 변경 : valueOf
 * 						==> static
 * 			= 앞에 같은 문자열이 있는지 확인 : startsWith
 * 			= 뒤에 같은 문자열이 있는지 확인 : endsWith
 * 			==================서제스트
 * 			= 원하는 문자의 위치확인 : indexOf, lastIndexOf
 * 			= toUpperCase, toLowerCase
 * 		Math : 숫자(수학클래스)
 * 			= random() => Random
 * 			= abs() : 절대값
 * 			= ceil() : 올림!!!//많이 쓰임
 * 			=> count=38;//게시물수 -> 총 페이지를 구하고 싶을 때
 * 				total=count/10; => 3이므로
 * 				if(count%10>9)
 * 					total++; => 4
 * 			한줄로 => total=(int)(Math.ceil(count/10.0))
 * 		System
 * 		Wrapper
 * 			= Integer(int)
 * 				parseInt() : 문자열 => 정수형
 * 				valueOf() : 정수를 추출할 때
 * 			= Double(double)
 * 			= Float(float)
 * 			= Boolean(boolean)
 * 			= Byte(byte)
 * 		StringBuffer
 * 			= append()
 */
import java.util.*;//Date
import java.text.*;//SimpleDateFormat
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(date));
	}

}
