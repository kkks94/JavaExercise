import java.util.Arrays;
import java.util.Scanner;

public class 로프 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] rof = new int[N];
		
		for(int i = 0; i < N; i++) {
			rof[i] = in.nextInt();
		}
		Arrays.sort(rof);
		
		int max = 0;
		for(int i = N-1; i >=0; i--) {
			rof[i] = rof[i] * (N-i);
			if(max<rof[i]) {
				max = rof[i];
			}
		}
		System.out.println(max);
		
		
	}

}
