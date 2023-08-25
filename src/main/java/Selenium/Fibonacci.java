package Selenium;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10; 

        System.out.println("Fibonacci Series:");
        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

 
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

	}
	}
}


