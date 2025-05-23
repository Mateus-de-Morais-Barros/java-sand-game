import org.w3c.dom.ls.LSOutput;
import utils.Character;
import utils.MapGen;

import javax.swing.*;
import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;

public class Game extends JPanel {

    private static final int fontSize = 20;
    private static final int screenSize = 300;
    private static final int mapSize = screenSize/fontSize;
    private static MapGen mapGen = new MapGen();
    private static ArrayList<Character> caracters = mapGen.generateMap(mapSize, fontSize);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        caracters.forEach((character)->{

            g.setFont(new Font("Monospace", Font.BOLD, fontSize)); // Tamanho e estilo
            g.setColor(Color.BLUE);

            g.drawString(character.getCharacter(), character.getPosX(), character.getPosY());
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Renderizando Caractere");

        Game painel = new Game();
        frame.add(painel);

        frame.setSize(screenSize, screenSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null); // Centraliza a janela
        frame.setResizable(false);
        frame.setVisible(true);

    }
}
