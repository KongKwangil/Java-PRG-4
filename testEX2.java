/**
 * 2023.03.28
 * 공광일
 * 입력된 숫자가 정수, 0,음수인지 판별하는 피로그램 작성
 */


package ch4;

import java.util.Scanner;

public class testEX2 {

	public static void main(String[] args) {
		
			Scanner stdin=new Scanner(System.in);
			System.out.print("input number");
			int num=stdin.nextInt();
			
			if (num>0)
			{
				System.out.println("integer");
			}
			if (num==0)
			{
				System.out.println("0");
			}
		    if (num<0)
		    {
		    	System.out.println("negative number");
		    
		    }
	}

}
