import java.util.Scanner;

public class 쉽게푸는문제 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		int[] seq = new int[b];
		int adnum = 1;
		int stnd = 1;
		for(int i = 0; i < b; i++) {
			seq[i] = adnum;
			if(stnd == adnum) {
				stnd = 0;
				adnum++;
			}
			stnd++;
		}
		int sum = 0;
		for(int i = a-1; i < b; i ++) {
			sum += seq[i];
		}
		System.out.println(sum);
	}

}
