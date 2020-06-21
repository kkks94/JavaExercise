import java.util.Scanner;

public class AuthApp4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String inputId;
		String inputPass;
		
		inputId = in.nextLine();
		inputPass = in.nextLine();
		
		
		String[][] users = {
				{"egoing", "1111"},
				{"jinhuck", "2222"},
				{"youbin", "3333"}
		};
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String current[] = users[i];
			if(
					current[0].equals(inputId)
					&& current[1].equals(inputPass)
					) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master!!");
		} else {
			System.out.println("Who are you?");
		}
		
	}

}
