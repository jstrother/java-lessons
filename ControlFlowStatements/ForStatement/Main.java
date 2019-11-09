package ControlFlowStatements.ForStatement;

public class Main {

  public static void main(String[] args) {
    System.out.println("$10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
    System.out.println("$10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
    System.out.println("$10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
    System.out.println("$10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

    System.out.println("***********************");

    for (int i = 0; i <= 5; i++) {
      System.out.println("From for loop: $10,000 at " + i + "% interest = " + calculateInterest(10000, i));
    }

    // *************************
    // For Statement Challenge 1
    // *************************
    System.out.println("***********************");

    for (double i = 2; i <= 8; i++) {
      System.out.println("Challenge 1: $10,000 at " + i + "% interest = $" + String.format("%.2f", calculateInterest(10000, i)));
    }

    // *************************
    // For Statement Challenge 2
    // *************************
    System.out.println("***********************");

    for (double i = 8; i >= 2; i--) {
      System.out.println("Challenge 2: $10,000 at " + i + "% interest = $" + String.format("%.2f", calculateInterest(10000, i)));
    }

    // *************************
    // For Statement Challenge 3
    // *************************
    System.out.println("***********************");
    int countOfPrimes = 0;
    for(int i = 0; i < 1000; i++) {
      if (isPrime(i)) {
        countOfPrimes++;
        System.out.println("The number " + i + " is a prime number.");
        if (countOfPrimes == 10) {
          System.out.println("Exiting for loop");
          break;
        }
      }
    }
    System.out.println("Count: " + countOfPrimes);
  }

  public static boolean isPrime(int n) {
    if((n == 0) || (n == 1)) {
      return false;
    }
    for(int i = 2; i <= (long) Math.sqrt(n); i++) {
      System.out.println("Looping " + i);
      if(n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static double calculateInterest(double amount, double interestRate) {
    return (amount * (interestRate / 100));
  }
}