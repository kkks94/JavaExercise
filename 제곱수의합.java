import java.util.Scanner;

public class 제곱수의합 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] d = new int[n+1];
		
		for(int i =1; i<=n; i++) {
			d[i]=i;
			for(int j=1; j*j<=i; j++) {
				if(d[i]>d[i-j*j]+1) {
					d[i]=d[i-j*j]+1;
				}
			}
		}
		System.out.println(d[n]);
	}

}
