package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int y = 1; y <= height; y++) {
            for (int x = 1; x <= length; x++) {
                if (y == 1||y==length||x == 1||x == height) {
                    System.out.print("8");
                } else
                    System.out.print(' ');
            }
            System.out.println("");
        }
    }
}
