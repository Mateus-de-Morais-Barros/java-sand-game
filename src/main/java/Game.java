import objects.Character;
import utils.Conversions;
import utils.MapGen;
import utils.MapUpdate;

import javax.swing.Timer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Game extends JPanel {

    private static final int fontSize = 25;
    private static final int screenSize = 250;
    private static final int mapSize = screenSize / fontSize;
    private static ArrayList<Character> caracters = MapGen.generateMap(mapSize, fontSize);
    private static AtomicInteger counter = new AtomicInteger();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < caracters.size(); i++) {
            Character character = caracters.get(i);
            g.setFont(new Font("Monospace", Font.BOLD, fontSize)); // Tamanho e estilo
            g.setColor(character.getColor());

            int posX = (Conversions.getPosX(i, mapSize)  * fontSize) + fontSize;
            int posY = (Conversions.getPosY(i, mapSize)  * fontSize) + 2*fontSize;

            g.drawString(character.getCharacter(), posX, posY);
        };

        g.setFont(new Font("Monospace", Font.PLAIN, fontSize)); // Tamanho e estilo
        g.drawString("Frame: " + counter.getAndIncrement(), screenSize+2*fontSize, screenSize);
        MapUpdate.updateMap(caracters, mapSize);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Renderizando Caractere");
        Game painel = new Game();
        frame.add(painel);
        frame.setSize(screenSize*2, screenSize*2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null); // Centraliza a janela
        frame.setResizable(false);
        frame.setVisible(true);

        Timer timer = new Timer(128*2, e -> {
            painel.repaint();
        });
        timer.start();
    }



}
