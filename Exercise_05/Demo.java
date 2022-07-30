import java.util.Scanner;

public class Demo{
	public static void main(String args[]){
		
		//Create an object using EvenOddNumber class
		EvenOddNumber EONum = new EvenOddNumber();
		
		Scanner sc = new Scanner(System.in);
		
		//Get User Input
		System.out.println("Enter a Number :");
		int Num = sc.nextInt();
		
		//Variable to catch True or False
		boolean result = EONum.findEvenOrOdd(Num);
		
		if(result== true){
			System.out.println("it's a Even Number");
		}
		else{
			System.out.println("It's a Odd Number");
		}
		
	}

	
}