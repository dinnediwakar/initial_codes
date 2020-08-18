package Patterns;

import java.util.Scanner;

public class PatternStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		
		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n;k>i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<n;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
