package Main;

import javax.swing.*;

public class GameWindow {
    private JFrame jframe;

    public GameWindow(GamePanel gamePanel) {
        // CREATE JFrame OBJECT
        jframe = new JFrame();

        // SETTING SIZE
        jframe.setSize(400, 400);

        // EXITS GAME WHEN WINDOW IS CLOSED
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.add(gamePanel);

        jframe.setLocationRelativeTo(null);

        // DETERMINING WHETHER SCREEN IS VISIBLE
        jframe.setVisible(true);
    }

}

