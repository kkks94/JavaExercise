import java.util.Scanner;

public class 제곱수의합_to_wr {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cnt = 0;
		
		for(int i=n; i>0; i--) {
			if(n-(i*i)>=0) {
				n -= (i*i);
				cnt++;
				i++;
			}
		}
		System.out.println(cnt);
	}

}
