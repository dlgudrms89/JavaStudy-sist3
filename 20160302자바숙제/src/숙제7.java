import java.util.Scanner;
public class 숙제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("나이를 입력하시오 : ");
		int a=scan.nextInt();
		if(a>19)
			System.out.println("영화를 관람할 수 있습니다.");
		else if(a<15)
			System.out.println("영화를 관람할 수 없습니다.");
		else
			System.out.println("성인을 동반한 경우 영화를 관람할 수 있습니다.");
		
	}

}
