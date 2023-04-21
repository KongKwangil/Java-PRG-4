/**
 * 2023.03.28
 * 공광일
 * 직급과 나이를 입력 받아서 직급이 7 또는 8이고 나이가 40대이면 "연금 80%"
 * 직급이 5 또는 6이고 나이가 50대이면 "연금 100%"
 * 그 외의 경우는 "연금 대상자 아님"
 */

package ch4;

import java.util.Scanner;

public class testEX1 {

	public static void main(String[] args) {
		
		
			Scanner stdin=new Scanner(System.in);
			System.out.print("input position and age");
			int position=stdin.nextInt();
			int age=stdin.nextInt();
			
			if ((position==7 || position==8) &&(age>=40 && age<=49))
			{
				System.out.println("pension 80%");
			}
			if ((position==5 || position==6) &&(age>=50 && age<=59))
			{
				System.out.println("pension 100%");
			}
			else
			
				System.out.println("Not for pension");
			
			
			

	}

}
