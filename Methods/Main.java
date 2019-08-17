public class Main {

  public static void main(String[] args) {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    // int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    // System.out.println("Your final score was " + highScore);

    // highScore = calculateScore(true, 10000, 8, 200);
    // System.out.println("Your final score was " + highScore);

    // calculateScore(false, score, levelCompleted, bonus)

    // call methods with either hardcoded numbers or passed-in variables or mix of both

    // challenge code below
    int highScorePosition = calculateHighScorePosition(1500);
    String displayStatement = displayHighScorePosition("Oscar", highScorePosition);
    System.out.println(displayStatement);

    highScorePosition = calculateHighScorePosition(900);
    displayStatement = displayHighScorePosition("Deb", highScorePosition);
    System.out.println(displayStatement);

    highScorePosition = calculateHighScorePosition(400);
    displayStatement = displayHighScorePosition("Jim", highScorePosition);
    System.out.println(displayStatement);

    highScorePosition = calculateHighScorePosition(50);
    displayStatement = displayHighScorePosition("A Cat", highScorePosition);
    System.out.println(displayStatement);

    highScorePosition = calculateHighScorePosition(1000);
    displayStatement = displayHighScorePosition("Somebody Else", highScorePosition);
    System.out.println(displayStatement);
  }

  public static int calculateScore(
    boolean gameOver, 
    int score, 
    int levelCompleted, 
    int bonus
  ) {

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 2000;
      return finalScore;
    }

    return -1;
  }

  public static int calculateHighScorePosition(int playerScore) {
    
    int position = 4; // assuming position 4 will be returned

    if (playerScore >= 1000) {
      position = 1;
    } else if (playerScore >= 500) {
      position = 2;
    } else if (playerScore >= 100) {
      position = 3;
    }

    return position;
  }

  public static String displayHighScorePosition(String name, int position) {

    String finalPositionStatement = name + 
      " managed to get into postion " + 
      position + 
      " on the high score table.";
    
    return finalPositionStatement;
  }
}