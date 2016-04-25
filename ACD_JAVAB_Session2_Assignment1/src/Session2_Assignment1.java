//Session2_Assignment1 : 24.4.2016
//Author: Kamakshi Abbi
import java.util.Scanner;
public class Session2_Assignment1 {
	public static void main(String[] args) {
		
		System.out.println("Enter your age:");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		input.close();
		if(age >= 18){
			System.out.println("You are eligible to vote ");
		}
		//Additionally, Adding condition is case age is negative
		else if(age < 0){
			System.out.println("Age cannot be less than 0");
			
		}
		else{
			System.out.println("You are not eligible to vote ");
		}
	}
}
