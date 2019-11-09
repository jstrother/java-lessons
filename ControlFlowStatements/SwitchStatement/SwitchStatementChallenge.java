package ControlFlowStatements.SwitchStatement;

public class SwitchStatementChallenge {

  public static void whichLetter(char letter) {
    switch (letter) {
      case 'A':
        System.out.println("The letter entered was " + letter);
        break;
      case 'B':
        System.out.println("The letter entered was " + letter);
        break;
      case 'C':
        System.out.println("The letter entered was " + letter);
        break;
      case 'D':
        System.out.println("The letter entered was " + letter);
        break;
      case 'E':
        System.out.println("The letter entered was " + letter);
        break;
      default:
        System.out.println("The letter entered was not in this list");
        break;
    }
  }
}