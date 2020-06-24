import java.util.Scanner;

public class Find_Max_Min_wrong {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n;
		
		n = in.nextInt();
		
		int[] A = new int[n];
		
		for(int i = 0; i < n; i++) {
			int Num = in.nextInt();
			A[i] = Num;
			for(int k = n; k > 0; k--) {
				if(A[i]>A[k]) {
					int q = A[i];
				
				if(A[i]<A[k]) {
					int w = A[i];
					System.out.println("Max : " + q + " Min : "+ w);
				}
				}
			}
		}
		
//		for(int j = 0; j < n; j++) {
//			System.out.println(A[j]);
			
//		}
		
	}

}
