package AarraysDatastructure;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the total number of students");
		int n=scan.nextInt();
		System.out.println("Enter the name of the students");
		scan.hasNextLine();
		String[] name=new String[n];
		int[] marks=new int[n];
		for(int i=0;i<n;i++)
		{
			name[i]=scan.nextLine();
			marks[i]=scan.nextInt();
		}
		
		
			
		
		

	}

}
