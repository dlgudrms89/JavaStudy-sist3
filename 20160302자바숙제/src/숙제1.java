
public class 숙제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=278970;
		
		System.out.println("10000원권 -> "+a/10000+"개");
		System.out.println("5000원권 -> "+(a%10000)/5000+"개");
		System.out.println("1000원권 -> "+(a%5000)/1000+"개");
		System.out.println("500원권 -> "+(a%1000)/500+"개");
		System.out.println("100원권 -> "+(a%500)/100+"개");
		System.out.println("50원권 -> "+(a%100)/50+"개");
		System.out.println("10원권 -> "+(a%50)/10+"개");
	}

}
