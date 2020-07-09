import java.util.Scanner;

public class 뒤집기 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String S = in.next();
		char S1 = S.charAt(0);
		
		int count0 = 0;
		int count1 = 0;
		
		if(S1 == '0') {
			count0++;
		} else {
			count1++;
		}
		
		for(int i = 1; i < S.length(); i++) {
			if(S.charAt(i) != S.charAt(i-1)) {
				if(S.charAt(i)=='0') {
					count0++;
				}
				else {
					count1++;
				}
			}
		}
		
		System.out.println(Math.min(count0, count1));
	}

}
