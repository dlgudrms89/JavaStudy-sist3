import java.util.Scanner;
public class ����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է�:");
		int a=scan.nextInt();
		int even=0,odd=0;
		for(int i=1; i<=a; i++)
		{
			if(i%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Ȧ���� ����:"+odd);
		System.out.println("¦���� ����:"+even);
	}

}
