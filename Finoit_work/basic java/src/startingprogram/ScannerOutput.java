package startingprogram;
import java.util.*;
import java.io.*;

public class ScannerOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		/*int m= scan.nextInt();
		System.out.println(m);
		Double n= scan.nextDouble();
		System.out.println(n);
		long a=scan.nextLong();
		System.out.println(a);
		String b=scan.nextLine();
		System.out.println(b);*/
		int principle =scan.nextInt();
		float rate_of_interest= scan.nextFloat();
		int time =scan.nextInt();
		double simple_interest= (principle*rate_of_interest*time)/100;
		System.out.println("Simple interest is :" + simple_interest);
		

	}

}
