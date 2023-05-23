package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i<=sideLength;i++){
            for (int a = 1; a<=sideLength;a++){
                if (i==sideLength/2||a==sideLength/2){
                    System.out.print("8");
                }
                else
                    System.out.print(' ');
            }
            System.out.println("");
        }
    }
}
