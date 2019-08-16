public class Main {
  public static void main(String[] args) {
    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 100;

    // if (score == 5000) { // use curly braces even for one line. easier to read and add code w/fewer bugs later
    //   System.out.println("score = 5000. this will print");
    // }

    // if (score < 5000) {
    //   System.out.println("score < 5000. this will not print");
    // } else {
    //   System.out.println("score at least 5000. this will print");
    // }

    // if (score <= 5000) {
    //   System.out.println("score <= 5000. this will print");
    // } else {
    //   System.out.println("score over 5000. this will not print");
    // }

    // if (score == 5000) {
    //   System.out.println("score = 5000. this will print");
    // } else {
    //   System.out.println("score is not 5000. this will not print");
    // }

    // if (score >= 5000) {
    //   System.out.println("score >= 5000. this will print");
    // } else {
    //   System.out.println("score under 5000. this will not print");
    // }

    // if (score > 5000) {
    //   System.out.println("score > 5000. this will not print");
    // } else {
    //   System.out.println("score no greater than 5000. this will print");
    // }

    // if (score <= 1000) {
    //   System.out.println("equal to or less than 1000");
    // } else if (score < 5000 && score > 1000) {
    //   System.out.println("between 1000 and 5000");
    // } else {
    //   System.out.println("equal to or greater than 5000");
    // }

    if (gameOver) { // shorthand for (gameOver == true)
      int finalScore = score + (levelCompleted * bonus); // score accessed from outsided of code block
      System.out.println("Your final score was " + finalScore);
    }

    // int savedFinalScore = finalScore; cannot access finalScore from outside the code block it was created in

    int secondScore = 10000;
    int secondLevelCompleted = 8;
    int secondBonus = 200;

    if (gameOver) {
      int finalScore = secondScore + (secondLevelCompleted * secondBonus);
      // it is ok to use finalScore here as it is in a different code block than the first one.
      System.out.println("Second Final Score was " + finalScore);
    }
  }
}