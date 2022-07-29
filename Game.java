package Main;

public class Game {
    // Create object of GameWindow();
    private GameWindow gameWindow;
    private GamePanel gamePanel;

    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();
        opening();
        // chapterOneSequenceOne();
    }

    static void opening() {
        System.out.println("*********************************************\n" +
                "\tWELCOME TO THE SAGA OF PLANET AZANIA!\n" +
                "*********************************************\n");
    }

   /*static void chapterOneSequenceOne() {
       System.out.println("ADD THE STORY");
   }*/
}

