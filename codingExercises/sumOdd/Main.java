public class Main {

  public static void main(String[] args) {
    System.out.println("Sum of Odds in Range 1 to 100  = " + SumOddRange.sumOdd(1, 100));
    System.out.println("Sum of Odds in Range -1 to 100 = " + SumOddRange.sumOdd(-1, 100));
    System.out.println("Sum of Odds in Range 100 to 100  = " + SumOddRange.sumOdd(100, 100));
    System.out.println("Sum of Odds in Range 13 to 13  = " + SumOddRange.sumOdd(13, 13));
    System.out.println("Sum of Odds in Range 100 to -100  = " + SumOddRange.sumOdd(100, -100));
    System.out.println("Sum of Odds in Range 100 to 1000  = " + SumOddRange.sumOdd(100, 1000));
  }
}