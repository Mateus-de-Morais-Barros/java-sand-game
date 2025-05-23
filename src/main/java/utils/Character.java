package utils;

public class Character {

    private String character;
    private int posX;
    private int posY;
    private String color;

    public Character(String character, int posX, int posY, String color) {
        this.character = character;
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
