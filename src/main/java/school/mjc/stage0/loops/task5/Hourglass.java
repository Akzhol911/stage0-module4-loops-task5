package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int y = 1; y <= height; y++) {
            for (int x = 1; x <= height; x++) {
                if (y == 1||y==height) {
                    System.out.print("8");
                } else if (x == y||x == height-y+1) {
                    System.out.print("8");
                } else
                    System.out.print(' ');
            }
            System.out.println("");
        }
    }
}

