import java.util.Scanner;
public class 숙제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어:");
		int kor=scan.nextInt();
		System.out.println("영어:");
		int eng=scan.nextInt();
		System.out.println("수학:");
		int math=scan.nextInt();
		System.out.println("합계:"+(kor+eng+math)+" 평균:"+(kor+eng+math)/3);
	}

}
