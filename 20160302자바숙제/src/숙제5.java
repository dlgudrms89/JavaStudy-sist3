import java.util.Scanner;
public class ¼÷Á¦5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Á¤¼öÀÔ·Â:");
		int a=scan.nextInt();
		int even=0,odd=0;
		for(int i=1; i<=a; i++)
		{
			if(i%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("È¦¼öÀÇ °¹¼ö:"+odd);
		System.out.println("Â¦¼öÀÇ °¹¼ö:"+even);
	}

}
