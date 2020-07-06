import java.util.Scanner;

public class 막대기 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int X = in.nextInt();
		int A = 64;
		int count = 0;

		while(X>0) {
			if(A>X) {
				A = A/2;
			}
			else {
				X = X - A;
				count++;
			}
		}
		System.out.println(count);
	}

}
