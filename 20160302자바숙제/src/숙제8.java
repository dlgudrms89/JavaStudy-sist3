public class ¼÷Á¦8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=18; i++)
		{
			if(i<=9)
			{
				for(int k=2; k<=5; k++)
				{
					System.out.print(k+"x"+i+"="+k*i+" ");
				}
				System.out.println();
			}
			else
			{
				for(int k=6; k<=9; k++)
				{
					System.out.print(k+"x"+(i-9)+"="+k*(i-9)+" ");
				}
				System.out.println();
			}
		}
	
	}

}
