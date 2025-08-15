package utils;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseHandler {

    public static int clickPosX;
    public static int clickPosY;

    public static MouseAdapter click() {
        return new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at X: " + e.getX() + ", Y: " + e.getY());
                clickPosX = e.getX();
                clickPosY = e.getY();
            }
        };
    }

    public static void resetClickPosition() {
        clickPosX = -1;
        clickPosY = -1;
    }

    public static MouseMotionListener drag() {
        return new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                clickPosX = e.getX();
                clickPosY = e.getY();
            }
        };
    }
}
