import java.util.Random;

public class Dice {
  int rolledNum;
  Random myRNG = new Random();

  public int roll(){
    rolledNum = myRNG.nextInt(6) + 1;
    return rolledNum;
  }
}
