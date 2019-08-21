public class Main {
  private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
  public static void main(String[] args) {
    System.out.println(getDurationString(65, 45));
    System.out.println(getDurationString(12, 32));
    System.out.println(getDurationString(68));
    System.out.println(getDurationString(8247));
    System.out.println(getDurationString(45));
    System.out.println(getDurationString(-1, -2));
    System.out.println(getDurationString(-4));
  }
  public static String getDurationString(int minutes, int seconds) {
    if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
      return INVALID_VALUE_MESSAGE;
    }
    
    int hours = minutes / 60;
    int remainingMinutes = minutes % 60;
    String  hoursString = hours + "h";
    String  minutesString = remainingMinutes + "m";
    String secondsString = seconds + "s";
    if (hours < 10) {
      hoursString = "0" + hoursString;
    }
    if (remainingMinutes < 10) {
      minutesString = "0" + minutesString;
    }
    if (seconds < 10) {
      secondsString = "0" + secondsString;
    }
    return hoursString + " " + minutesString + " " + secondsString;
  }

  public static String getDurationString(int seconds) {
    if (seconds < 0) {
      return INVALID_VALUE_MESSAGE;
    } else {
      int minutes = seconds / 60;
      int remainingSeconds = seconds % 60;
      return getDurationString(minutes, remainingSeconds);
    }
  }
}