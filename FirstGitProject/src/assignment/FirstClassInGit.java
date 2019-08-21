package assignment;
import java.util.*;

public class FirstClassInGit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello World!");
		System.out.println("My name is Seth!");
		System.out.println("What is your last name");
		String lastName = in.next();
		in.close();
		System.out.println("Your last name is " + lastName);
	}
}