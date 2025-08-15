package ui;

import utils.MouseHandler;

import javax.swing.*;


public class MousePositionPanel extends JPanel {

    static JLabel mouseClickPositionLabel;

    public MousePositionPanel() {

        mouseClickPositionLabel = new JLabel("PosX = "+MouseHandler.clickPosX+" PosY = "+MouseHandler.clickPosY);
        add(mouseClickPositionLabel);
    }

    public static JLabel update(int x, int y) {
        if(MouseHandler.clickPosX != -1 && MouseHandler.clickPosY != -1) {
            mouseClickPositionLabel.setText("PosX = "+ x +" PosY = " + y);
            return mouseClickPositionLabel;
        } else {
            return mouseClickPositionLabel;
        }
    }


}