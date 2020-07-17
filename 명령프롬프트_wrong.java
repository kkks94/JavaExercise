import java.util.Scanner;

public class 명령프롬프트_wrong {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String[] name = new String[n];
		for(int i = 0; i < n; i++) {
			String input = in.next();
			name[i] = input;
		}
		String output = name[0]; 
		for(int j=0; j<name[0].length(); j++) {
			for(int i=0; i<n-1; i++) {
				if(name[i].charAt(j)!=name[i+1].charAt(j)) {
					output.charAt(j) = '?';
				}
			}
		}
	}

}
