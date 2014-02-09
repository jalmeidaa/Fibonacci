package com.fibonacciiterative.www;
import java.math.BigInteger;
import java.util.*;
public class HW {
	public static void main(String[] args) {
		int n;
		long startTime,finishTime,elapsedTime;
		startTime = System.nanoTime();

		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Fibonacci number: ");
		n = sc.nextInt();
		sc.close();
		
		BigInteger a =BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		System.out.println(a);
		System.out.println(b);
		BigInteger temp;
		
		for (int c = 2; c <= n ; c++){
			temp = b;
			b=a.add(b);
			a = temp;    
		}
		
	      System.out.println("Fib: " + b);  
	      finishTime = System.nanoTime();
			elapsedTime = finishTime - startTime;
			System.out.println("elapsedTime: "+elapsedTime);

	}
} 
