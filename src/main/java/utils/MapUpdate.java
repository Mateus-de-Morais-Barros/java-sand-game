package utils;

import objects.Character;

import java.awt.*;
import java.text.MessageFormat;
import java.util.ArrayList;

public class MapUpdate {

    public static ArrayList<Character> updateMap(ArrayList<Character> originalMap, int mapSize) {
        ArrayList<Character> map = originalMap;

        int height = mapSize;
        int width = mapSize;
        int indexBottomLimit = Conversions.getBottomLimit(width, map.size());
        System.out.println("indexBottomLimit: "+indexBottomLimit);

        for (int y = height-1; y >= 0; y--) {
            for (int x = width-1; x > 0; x--) {

                int index = Conversions.findIndex(x, y, width);
                Character selectedCharacter = map.get(index);

                if (selectedCharacter.getType() != "AIR" && selectedCharacter.getType() == "SAND") {

                System.out.println(MessageFormat.format("""
                        =====CURRENT CHARACTER: {0} {1} ============================================================
                        MATRIX INDEX [{2},{3}] ARRAY INDEX: {4}
                        """, selectedCharacter.getCharacter() ,selectedCharacter.getType(), x,y, index));


                    int belowIndex = (y + 1) * width + x;
                    int bellowRightIndex = belowIndex + 1;
                    int bellowLeftIndex = belowIndex - 1;

                    if((y + 1) < height &&
                        Conversions.getPosY(belowIndex, width) != indexBottomLimit && "AIR".equals(map.get(belowIndex).getType())) {

                        map.set(belowIndex, new Character("⬛", Color.ORANGE, "SAND"));
                        map.set(index, new Character("⬜", Color.GRAY, "AIR"));
                    } else if ((x + 1) < width && (y + 1) < height &&
                        "SAND".equals(map.get(belowIndex).getType()) && "AIR".equals(map.get(bellowRightIndex).getType())) {

                        map.set(bellowRightIndex, new Character("⬛", Color.ORANGE, "SAND"));
                        map.set(index, new Character("⬜", Color.GRAY, "AIR"));
                    } else if ((x - 1) >= 0 && (y + 1) < height &&
                        "SAND".equals(map.get(belowIndex).getType()) && "AIR".equals(map.get(bellowLeftIndex).getType())) {

                        map.set(bellowLeftIndex, new Character("⬛", Color.ORANGE, "SAND"));
                        map.set(index, new Character("⬜", Color.GRAY, "AIR"));
                    }

                }


            }
        }




        return map;
    }



}
