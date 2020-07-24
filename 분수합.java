import java.util.Scanner;

public class 분수합 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a1 = in.nextInt();
		int b1 = in.nextInt();
		int a2 = in.nextInt();
		int b2 = in.nextInt();
		
		int a3 = (a1*b2) + (a2*b1);
		int b3 = b1*b2;
		int c = gcd(a3,b3);
		
		a3 = a3/c;
		b3 = b3/c;
		
		System.out.println(a3+" "+b3);
		
	}
	public static int gcd(int a, int b) {
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
}
