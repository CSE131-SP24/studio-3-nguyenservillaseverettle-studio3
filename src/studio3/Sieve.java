package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Find prime numbers up to what number?");
		int n = in.nextInt();
		int[] primes = new int[n-2];
		
		for(int i=2; i<n; i++) {
			for(int j=(2*i); j<n; j=j+i) {
				primes[(j-2)]=1;
				
			}
		}
		System.out.print("The prime numbers up to " + n + " are:");
		for(int i=0; i<n-2; i++) {
			if(primes[i]==0) {
				System.out.print(" " + (i+2) + " ");
			}
		}
		

	}

}
