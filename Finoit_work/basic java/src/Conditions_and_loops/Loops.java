package Conditions_and_loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<=100;i+=25)
		{
			System.out.println("hello loop " +i);
		}
		*/
		Scanner scan=new Scanner(System.in);
		/*long n=scan.nextLong();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum =sum+i;
			
		}
		System.out.println(sum);

	}*/
		//we find the factorial
		int n=scan.nextInt();
		int factorial =1;
		for(int i=n;i>=1;i--)
		{
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

}
