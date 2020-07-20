import java.util.Scanner;

public class 명령프롬프트1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String[] name = new String[n];
		for(int i = 0; i < n; i++) {
			String input = in.next();
			name[i] = input;
		}
		boolean que;
		
		for(int j=0; j<name[0].length(); j++) {
			que = false;
			for(int i=0; i<n-1; i++) {
				if(name[i].charAt(j)!=name[i+1].charAt(j)) {
					que = true;
				}
			}
			if(que == true)
				System.out.print("?");
			else
				System.out.print(name[0].charAt(j));
		}
	}

}
