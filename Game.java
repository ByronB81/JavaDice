public class Game {
  Player player1 = new Player();
  Dice die1 = new Dice();

  public void playTurn(){
    int result1 = die1.roll();
    player1.score += result1;
    // if (result1 != 1){
    //   System.out.println(String.format("You rolled a %d and your score is now %d", result1, player1.score));
    // } else {
    //   System.out.println(String.format("You rolled a %d, your score is"));
    // }
  }



}
