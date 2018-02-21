import java.util.Scanner;

public class AgeIn5Years{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int age, age5early, age5later;
		String name;
		System.out.print("What is your name? ");
		name = keyboard.next();
		System.out.print("Hi, " + name + ". How old are you? ");
		age = keyboard.nextInt();
		age5early = age - 5;
		age5later = age + 5;
		System.out.println("Oh, so you are " + age5early + " five years ago, and you will be " + age5later + " in five years.");
	}
}
		