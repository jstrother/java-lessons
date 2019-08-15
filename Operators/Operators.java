public class Operators {
  public static void main(String[] args) {
    // this is a comment. the computer will not read anything behind the double /. it is for human eyes only
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
    if ((topScore > secondTopScore) && (topScore < 100)) { // && is the logical AND operator which checks to see if BOTH statements are true
      // this will print
      System.out.println("topScore is greater than secondTopScore and less than 100");
    }

    secondTopScore = 81;
    if ((topScore > secondTopScore) && (topScore < 100)) {
      // this will not print
      System.out.println("secondTopScore is now larger than topScore");
    }

    if ((topScore > 90) || (secondTopScore > topScore)) { // || is the logical OR operator which checks to see if EITHER or BOTH statement is true, in this case the first is false and the second is true
      // this will print
      System.out.println("secondTopScore is might finally be larger than topScore");
    }

    if ((topScore > 90) || (secondTopScore > 95)) { // both statements are now false
      // this will not print
      System.out.println("both statements are false");
    }

    int newValue = 50;
    // if (newValue = 50) {
    //   System.out.println("This is an error! the if statement needs to determine booleans using ==, and cannot reassign a value using =");
    // }

    if (newValue == 50) { // == is how to determine true/false, = only assigns values to int, double, boolean, etc.
      // this will print
      System.out.println("newValue = 50");
    }

    boolean isCar = false;
    if (isCar = true) { // boolean checks can reassign with =. Be careful!!
      System.out.println("This should not print!");
    }
    // isCar is now equal to true
    System.out.println("isCar = " + isCar);

    isCar = false; // resetting isCar because the above code block changed the value
    if (isCar == true) { // == to compare!
      System.out.println("This really won't print");
    }

    if (isCar) { // shortcut for the above check. still looks to see if isCar == true, in this case no
      System.out.println("Another that won't print'");
    }

    if (isCar != true) { // remember that != checks for the opposite of something. isCar is NOT equal to true
      System.out.println("Finally! Displaying!");
    }

    if (isCar == false) { // evaluates to a true statement, after all isCar is equal to false
      System.out.println("Another display!");
    }

    if (!isCar) { // this is a shortcut for the above 2 as ! will check the opposite of what is placed next to. isCar is equal to false, so not false is true
      System.out.println("Three straight displays! We're on fire!");
    }

    boolean isAirplane = true;
    if (!isAirplane) { // since isAirplane is true, this becomes not true, or false.
      System.out.println("back to not displaying");
    }

    boolean wasCar = isCar ? true : false;
    // ternary operator
    // if isCar is equal to true do the first option
    // if isCar is equal to false do the second option
    // this will assign one of those two values to wasCar
    if (wasCar) { // isCar is equal to false, so wasCar gets assigned the second value of false
      System.out.println("not true, not displaying");
    }

    isCar = true;
    wasCar = isCar ? true : false;
    if (wasCar) { // now that isCar is true, the first value of true gets assigned to wasCar
      System.out.println("This prints!");
    }

    int ageOfClient = 20;
    boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
    // can also use ==, <=, <, > to compare instead of just >=
    if (isEighteenOrOver) { // this is true. 20 > 18
      System.out.println("Over eighteen, this prints");
    }
  }
}