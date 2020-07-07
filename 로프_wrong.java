import java.util.Scanner;

public class 로프 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] rof = new int[N];
		
		for(int i = 0; i < N; i++) {
			rof[i] = in.nextInt();
		}
		
		int min = 10000;
		int max = 0;
		for(int i = 0; i < N; i++) {
			if(min>rof[i]) {
				min = rof[i];
			}
			if(max<rof[i]) {
				max = rof[i];
			}
		}
		
		
			if(min*N>max) {
				System.out.println(min*N);
			}
			else {
				System.out.println(max);
			}
		
	}

}
