import java.util.Scanner;

public class 공 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		
		int[] arr = {0, 1, 2, 3};
		int t = 0;
		for(int i = 0; i < M; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			t = arr[x];
			arr[x] = arr[y];
			arr[y] = t;
		}
		
		for(int i = 0; i < 4; i++) {
			if(arr[i]==1) {
				System.out.println(i);
			}
		}
	}

}
