package com.fibonaccimatrix.www;
import java.util.*;
import java.math.BigInteger;
public class HWW {
	private static BigInteger fibonacciNumber(int n) {
		BigInteger[] matrix = {BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.ONE};
		return pow(matrix, n)[1];
	}
	private static BigInteger[] pow(BigInteger[] matrix, int n) {
		BigInteger[] result = {BigInteger.ONE, BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE};
		while (n != 0) {  
			if (n % 2 != 0)
				result = multiply(result, matrix);
			n /= 2;
			matrix = multiply(matrix, matrix);
		}
		return result;
	}
	private static BigInteger[] multiply(BigInteger[] x, BigInteger[] y) {
		return new BigInteger[] {
			multiply(x[0], y[0]).add(multiply(x[1], y[2])),
			multiply(x[0], y[1]).add(multiply(x[1], y[3])),
			multiply(x[2], y[0]).add(multiply(x[3], y[2])),
			multiply(x[2], y[1]).add(multiply(x[3], y[3]))};
		
	}
	private static BigInteger multiply(BigInteger x, BigInteger y) {
		return x.multiply(y); 
	}
	  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Number of Fibonacci number: ");
		int n = sc.nextInt();
		sc.close();
        long startTime,finishTime,elapsedTime;
		startTime = System.nanoTime();
        System.out.println("Fibonacci number no." + n + " is "
                         + fibonacciNumber(n));
        finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		System.out.println("elapsedTime: "+elapsedTime);
    }

}
	 
