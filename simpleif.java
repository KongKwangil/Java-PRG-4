/**
 * 2023.03.28
 * 공광일
 */


package ch4;
import java.util.Scanner;

public class simpleif {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("input score");
		int grade=stdin.nextInt();
		
		if (grade>=90) 
		{
		System.out.print("pass");
		
		System.out.print("congratulation");
		System.out.print("thankyou");
		
	}
		else 
			System.out.print("fail");
}
}