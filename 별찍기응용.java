import java.util.Scanner;

public class 별찍기응용 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a;
		a = in.nextInt();
		
		String t1 = "";
		for(int i = a; i > 0; i--) {
			
			t1 = t1 + "*";
			System.out.println(t1);
			
		}
		
		
		for(int j = a; j > 1; j--) {
			String t2 = "";
			
			for(int k = 1; k < j; k++) {
//				if(k<j) {
					t2 = t2 + "*";
//				}
//				else {
//					t2 = t2 + " ";
//				}
			}
			System.out.println(t2);
		}
		
	}

}
