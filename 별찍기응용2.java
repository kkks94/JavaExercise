import java.util.Scanner;

public class 별찍기응용2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int a;
		a = in.nextInt();
		
		for(int i = a; i > 0; i--) {
			String t1 = "";
			for(int j = 1; j <= a; j++) {
				if(j < i) {
					t1 = t1 + " ";
				}
				else {
					t1 = t1 + "*";
				}
			}
			System.out.println(t1);
		}
		
		
		for(int q = a-1; q > 0; q--) {
			String t2 = "";
			for(int w = a; w >= 1; w--) {
				if(q >= w) {
					t2 = t2 + "*";
				}
				else {
					t2 = t2 + " ";
				}
			}
			System.out.println(t2);
		}
		
	}

}
