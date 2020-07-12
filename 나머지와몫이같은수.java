import java.util.Scanner;

public class 나머지와몫이같은수 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		long N = in.nextInt();
		long a = 0;
		
		for(int i=1; i<N; i++) {
			a = a + (N+1)*i;
		}
		System.out.println(a);
	}
	

}
