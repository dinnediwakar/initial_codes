package Conditions_and_loops;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		boolean isprime=true;
		for(int i=2;i<n;i++)
		{
			if(n % i==0)
			{
				isprime=false;
				break;
			}
		}
		if(n<2) isprime=false;
		
		System.out.println("Number is prime: "+isprime);

	}

}
