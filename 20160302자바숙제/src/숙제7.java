import java.util.Scanner;
public class ����7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���̸� �Է��Ͻÿ� : ");
		int a=scan.nextInt();
		if(a>19)
			System.out.println("��ȭ�� ������ �� �ֽ��ϴ�.");
		else if(a<15)
			System.out.println("��ȭ�� ������ �� �����ϴ�.");
		else
			System.out.println("������ ������ ��� ��ȭ�� ������ �� �ֽ��ϴ�.");
		
	}

}
