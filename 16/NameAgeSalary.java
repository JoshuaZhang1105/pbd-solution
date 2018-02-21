import java.util.Scanner;

public class NameAgeSalary{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		double tall;
		
		System.out.print("What is your name?");
		name = keyboard.next();
		System.out.println("Hi," + name + ".");
		System.out.print("How old are you?");
		age = keyboard.nextInt();
		System.out.println(name + ", so you are " + age + " years old.");
		System.out.print("How tall are you? (cm)");
		tall = keyboard.nextDouble();
		System.out.println("So " + name + ", you are " + age + " years old and " + tall + " cm height.");
	}
}
		
		
		