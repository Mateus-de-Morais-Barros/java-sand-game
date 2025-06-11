package utils;

public class Conversions {

    public static int findIndex(int x, int y, int width) {
        return y * width + x;
    }

    public static int getPosX(int index, int width) {
        return index % width;
    }

    public static int getPosY(int index, int width) {
        return index / width;
    }

    public static int getBottomLimit(int width, int mapLength) {
        int layers = mapLength / width;
        return layers;
    }

//    public static int getTopLimit(int width) {
//        return width;
//    }
//
//    public static int getWallLimitRight(int y, int width, int mapSize) {
//        return width;
//    }
//
//    public static int getWallLimitLeft(int y, int width, int mapSize) {
//        return width;
//    }
}
