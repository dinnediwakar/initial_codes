package Patterns;

import java.util.Scanner;

public class AdvancePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=1;
		
		/*for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" "+a);
				a++;
			}
			System.out.println();
		}
		*/
		for(int i=0;i<n;i++)
		{
		
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
		
			for(int k=n-1;k>i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
