package KeywordsAndExpressions;

public class Main {
  public static void main(String[] args) {
    double kilometers = (100 * 1.609344);
    int highScore = 50;
    if (highScore == 50) {
      System.out.println("this is an expression");
      System.out.println(kilometers);
    }
  }
}

// from video challenge
// which parts of the following code are expressions?

// int score = 100; only int is not part of the expression, just score = 100

// if (score > 99) { only score > 99 is an expression
//   System.out.println("You got the high score!"); the string output is the expression, including ""
//   score = 0; this is an expression, with exception of ;
// }