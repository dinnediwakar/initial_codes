package Conditions_and_loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<n;i++)
		{
			System.out.print(a+ " ");
			c=a+b;
			a=b;
			b=c;
			
			
		}

	}

}
