import java.util.Scanner;

public class AskingQuestion
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String name;
		
		System.out.print("What is your name?");
		name = keyboard.next();
		
		System.out.print("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("So you are " + name + " and you are " + age + " years old.");
	}
}