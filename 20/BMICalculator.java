import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Your height in m: ");
		double height = input.next();
		System.out.print("Your weight in kg: ");
		double weight = input.next();
		System.out.println("Your BMI is " + weight/(height*height) + ".");