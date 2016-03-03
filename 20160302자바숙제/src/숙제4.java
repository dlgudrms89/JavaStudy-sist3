import java.util.Scanner;

public class 숙제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("두개의 정수를 입력하시오:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println("합:"+(a+b));
		System.out.println("차:"+(a-b));
		System.out.println("곱:"+(a*b));
	}

}
