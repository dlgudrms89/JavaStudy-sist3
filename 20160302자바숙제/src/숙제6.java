import java.util.Scanner;
public class 숙제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력");
		int a=scan.nextInt();
		
		if(a%3==0)
			System.out.println(a+"은(는) 3의 배수이다.");
		if(a%5==0)
			System.out.println(a+"은(는) 5의 배수이다.");
		if(a%8==0)
			System.out.println(a+"은(는) 8의 배수이다.");
	}

}
