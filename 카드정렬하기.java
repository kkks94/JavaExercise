import java.util.Arrays;
import java.util.Scanner;

public class 카드정렬하기 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] card = new int[N];
		
		for(int i = 0; i < N; i++) {
			int bunch = in.nextInt();
			card[i] = bunch;
		}
		
		Arrays.sort(card);
		int[] cardbunch = new int[N-1];
		
		for(int i = 0; i < N-1; i++) {
			cardbunch[i] = card[i] + card[i+1];
			card[i+1] = cardbunch[i];
		}
		
		long sum = 0;
		for(int i = 0; i < N-1; i++) {
			sum += cardbunch[i];
		
		}
		System.out.println(sum);
	}

}
