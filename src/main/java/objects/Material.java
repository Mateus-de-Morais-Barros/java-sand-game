package objects;

import java.awt.*;

abstract class Material {

    Color color;
    String type;

    public Material(Color color, String type) {
        this.color = color;
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }
}
