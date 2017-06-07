import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    Game myGame = new Game();
    boolean appRunning = true;

    while (appRunning){
      myGame.playTurn();
      System.out.println("'roll again' or 'exit'?");
      String navResponse = console.readLine();
      if (navResponse.equals("exit")){
        appRunning = false;
      }
    }

  }
}
