import javax.swing.*;

public class WindowManager {

    private String gameTitle;

    public WindowManager(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public void setup() {
        JFrame frame = new JFrame(this.gameTitle);
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

}
