package Crio.DSA1;

import java.util.Scanner;

public class SeriesSumII {
	
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        double A = sc.nextDouble();
	        double R = sc.nextDouble();

	        double result = seriesSumII(A, R);

	        System.out.println(result);
	        sc.close();
	 }

	    static double seriesSumII(double A, double R) {

	        double sum=0;

	        if(1 > R)
	         sum = A/(1-R);
	        else
	         sum = A/(R-1);

	        return sum;
	    }

}
