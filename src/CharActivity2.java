import java.util.Scanner;
public class CharActivity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	System.out.println("Enter anything");	
	String word = scanner.nextLine();
	
	
	System.out.println(Anything(word));
	}
public static String Anything (String word){
	
	int length = word.length();
    char cl = word.charAt(0);
	char cl2 = word.charAt(length -2);
	return ""+cl+ " " + cl2;
	
}
}
