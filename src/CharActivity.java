import java.util.Scanner;

public class CharActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scanner.nextLine();
		int length = word.length();
		char cl = word.charAt(length - 1);
		System.out.println(cl);

	}

}
