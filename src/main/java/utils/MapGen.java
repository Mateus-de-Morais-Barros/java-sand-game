package utils;

import java.util.ArrayList;

public class MapGen {

    ArrayList<Character> map;

    public MapGen() {}

    public ArrayList<Character>  generateMap(int size, int fontSize) {

        map = new ArrayList<Character>();

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                int posX = (x * fontSize) + 4;
                int posY = (y * fontSize) + 20;

                map.add(new Character("@", posX, posY, "BLACK"));
            }
        }

        return map;
    }
}
