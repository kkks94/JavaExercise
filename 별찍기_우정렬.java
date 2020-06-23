import java.util.Scanner;

public class 별찍기_우정렬 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int a;
		a = in.nextInt();
		
		String t1 = new String();
		t1 = "*";
		
		String t2 = new String();
		t2 = " ";
		
		for(int b = 0; b < a; b++) {
			if(b<a) {
				int c;
				c = a - b - 1;
				System.out.println(t2.repeat(c)+t1.repeat(b+1));
			}
		}
		
		
		for(int i = a; i > 0; i--) {
			String test = "";
			for(int j = 1; j<=a; j++) {
				if(j<i) {
					test = test + " ";
				}
				else {
					test = test + "*";
				}
			}

			
			System.out.println(test);
		}
		

		
		
		
		
	}

}
