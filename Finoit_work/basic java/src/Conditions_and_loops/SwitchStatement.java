package Conditions_and_loops;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		/*String a=scan.nextLine();
		switch(a)
		{
		case "dinesh":
			System.out.println("1 is correct");
			break;
		case "kumar":
			System.out.println("2 is correct");
			break;
		case "diwakar":
			System.out.println("10 is the answer");
			break;
		case "delhi":
			System.out.println("12 is coorect");
			break;
		default:
			System.out.println("this is default case");
			break;
		}
		*/
		int n=scan.nextInt();
		switch(n)
		{
		case 1:
		case 2:
			System.out.println("the rating is bad");
			break;
		case 3:
			System.out.println("the rating is average");
			break;
		case 4:
		case 5:
			System.out.println("the rating is good");
			break;
		default:
			System.out.println("rating is not mentioned");
			break;
		}

	}

}