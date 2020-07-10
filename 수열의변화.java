import java.util.Scanner;

public class 수열의변화 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		
		String S = in.next();
		String[] seq = S.split(",");
		int[] inseq = new int[N];
		
		for(int i = 0; i < N; i++) {
			inseq[i] = Integer.parseInt(seq[i]);
		}
		
		for(int z = 0; z < K; z++) {
			
			for(int i = 0; i < N-1-z; i++) {
				inseq[i] = inseq[i+1] - inseq[i];
			}
			
		}
		for(int i = 0; i < N-K; i++) {
			System.out.print(inseq[i]);
			if(i != N-K-1) {
				System.out.print(",");
			}
		}
		
	}

}
