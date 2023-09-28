package by.bsuir.main;

public class Task2 {
    public static boolean check(int x, int y){
        return checkTopPart(x, y) ||
                checkBottomPart(x, y);
    }

    public static boolean checkTopPart(int x, int y){
        return (x >= -4 && x <= 4) && (y >= 0 && y <= 5);
    }

    public static boolean checkBottomPart(int x, int y){
        return (x >= -6 && x <= 6) && (y >= -3 && y <= 0);
    }
}
