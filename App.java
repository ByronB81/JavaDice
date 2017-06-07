public class App {
  public static void main(String[] args) {
    Dice die1 = new Dice();
    Dice die2 = new Dice();
    int result1 = die1.roll();
    int result2 = die2.roll();
    int total = result1 + result2;
    System.out.println(String.format("You rolled a %s and a %s for a total score of %s", result1, result2, total));
    System.out.println();
  }
}
