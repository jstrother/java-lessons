public class Operators {
  public static void main(String[] args) {
    int result = 1 + 2; // 1 + 2 = 3
    System.out.println("1 + 2 = " + result);
    int previousResult = result;
    System.out.println("previousResult = " + previousResult);
    result = result - 1; // 3 - 1 = 2
    System.out.println("3 - 1 = " + result);
    System.out.println("previousResult = " + previousResult);

    result = result * 10; // 2 * 10 = 20
    System.out.println("2 * 10 = " + result);

    result = result / 5; // 20 / 5 = 4
    System.out.println("20 / 5 = " + result);

    result = result % 3; // the remainder of 4 % 3 = 1
    System.out.println("4 % 3 = " + result);

    // result = result + 1;
    result++; // 1 + 1 = 2
    System.out.println("1 + 1 = " + result);

    // result = result - 1;
    result--; // 2 - 1 = 1
    System.out.println("2 - 1 = " + result);

    // result = result + 2;
    result += 2; // 1 + 2 = 3
    System.out.println("1 + 2 = " + result);

    // result = result * 10;
    result *= 10; // 3 * 10 = 30
    System.out.println("3 * 10 = " + result);

    // result = result / 3;
    result /= 3; // 30 / 3 = 10
    System.out.println("30 / 3 = " + result);

    // result = result - 2;
    result -= 2; // 10 - 2 = 8
    System.out.println("10 - 2 = " + result);

    boolean isAlien = false;
    if (isAlien == false) 
      System.out.println("It is not an alien!");

    if (isAlien == true);  // notice ; on this line! ends if statement and System.out below will print no matter how if statement goes!
      System.out.println("It is still not an alien!");

    if (isAlien == true) 
      System.out.println("If it was really an alien"); // this line does not print as only one line is controlled by the if statement when there is no code block
      System.out.println("Then I would be scared of it");
    
    if (isAlien == false) { // curly brace here and the first one below create a code block and allow for multiple lines of code to be run from the same if statement
      System.out.println("I'm sorry, I missed that");
      System.out.println("I said I would be scared of aliens!");
    }
    // always use a code block, even for one-liners, to help prevent bugs if more code needs to be added in the future

    int topScore = 100;
    if (topScore == 100) {
      System.out.println("You got the high score!");
    }

    if (topScore != 100) { // the ! operator looks for whether the oppsite is true. in this case, is topScore NOT equal to 100?
      // the System.out below will not print
      System.out.println("You did not score 100");
    }

    if (topScore > 100) {
      // this will not print
      System.out.println("You beat the high score!");
    }

    if (topScore >= 100) { // this looks to see if topScore is greater than or equal to 100
      // this will print
      System.out.println("You equaled or beat 100!");
    }

    if (topScore < 100) {
      // this will not print
      System.out.println("You got less than 100");
    }

    if (topScore <= 100) {  // this looks to see if topScore is less than or equal to 100 
      // this will print
      System.out.println("You equaled or got less than 100. You did not set the high score.");
    }

    topScore = 80;
    int secondTopScore = 60;
    if (topScore > secondTopScore && topScore < 100) { // && is the logical AND operator which checks to see if both statements are true
      // this will print
      System.out.println("topScore is greater than secondTopScore and less than 100");
    }

    secondTopScore = 81;
    if (topScore > secondTopScore && topScore < 100) {
      // this will not print
      System.out.println("secondTopScore is now larger than topScore");
    }
  }
}