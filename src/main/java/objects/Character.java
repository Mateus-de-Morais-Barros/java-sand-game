package objects;

import java.awt.*;

public class Character extends Material {

    private String character;

    public Character(String character, Color color, String type) {
        super(color, type);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

}
