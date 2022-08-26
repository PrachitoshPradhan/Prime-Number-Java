package com.primeNumber;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if its prime or not: ");
		int n=sc.nextInt();
		boolean check=false;
		if (n==0||n==1)
		{
			System.out.println("As the number "+ n +" is one of 0/1 so its not prime.");
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not prime.");
					check=true;
					break;
				}
			}
			if (check==false)
			{
				System.out.println(n+" is a prime number.");
			}
		}
		sc.close();

	}

}
