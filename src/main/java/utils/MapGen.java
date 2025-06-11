package utils;

import objects.Character;

import java.awt.*;
import java.util.ArrayList;

public class MapGen {

    static ArrayList<objects.Character> map;

    public MapGen() {}

    public static ArrayList<objects.Character>  generateMap(int mapSize, int fontSize) {

        map = new ArrayList<objects.Character>();

        for (int y = 0; y < mapSize; y++) {
            for (int x = 0; x < mapSize; x++) {

                if(x==(5) && y>=(0)) {
                    map.add(new Character("⬛", Color.ORANGE, "SAND"));
                } else {
                    map.add(new Character("⬜", Color.BLACK, "AIR"));
                }
            }
        }

        return map;
    }
}
