package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int a = 1; a <= cathetusLength; a++) {
                if (i == cathetusLength) {
                    System.out.print("8");
                } else if (a == 1) {
                    System.out.print("8");
                } else if (i == a) {
                    System.out.print("8");
                } else
                    System.out.print(' ');
            }
            System.out.println("");
        }
    }
}