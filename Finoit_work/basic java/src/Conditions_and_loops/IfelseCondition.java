package Conditions_and_loops;
import java.util.*;
import java.io.*;

public class IfelseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int age=9;
		if(age>10)
		{
			System.out.println("you are 11th year old");
		}
		else if(age==10)
		{
			System.out.println("You are 10 year");
		}
		else
		{
			System.out.println("Sorry you are not eligibel");
		} */
		Scanner scan=new Scanner(System.in);
		
		/*int patels=scan.nextInt();
		if(patels %2==0)
		{
			System.out.println("Not love me");
		}
		else
		{
			System.out.println("Yes love me");
		}*/
		
		int b=scan.nextInt();
		int a=scan.nextInt();
		
		/*if(b>=20 && b<=20)
		{
			System.out.println("b is 20");
		}
		else if(b>10 && b<20)
		{
			System.out.println("b is betweeb 10 and 20");
		}
		else
		{
			System.out.println("b is not in  correct format");
		}
		*/
		int largestnumber=0;
		largestnumber = a > b ? a:b;
		System.out.println("maximum number is:" + largestnumber);

}
}
