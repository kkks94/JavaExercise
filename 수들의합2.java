import java.util.Scanner;

public class 수들의합2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[] array = new int[N];
		for(int i = 0; i < N; i++) {
			int num = in.nextInt();
			array[i] = num;
		}
		
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			int sum = 0;
			int aryj = 0;
			if(array[i] == M) {
				cnt++;
			}
			else {
			for(int j = i+1; j < N; j++) {
				aryj += array[j];
				sum = array[i] + aryj;
				if(sum == M) {
					cnt++;
				}
			}
			}
			
		}
		System.out.println(cnt);
	}

}
