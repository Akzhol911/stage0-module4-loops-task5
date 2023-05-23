package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i<=sideLength;i++){
            for (int a = 1; a<=sideLength;a++){
                if (i==Math.ceil(sideLength/ 2.0)||a==Math.ceil(sideLength / 2.0)){
                    System.out.print("8");
                }
                else
                    System.out.print(' ');
            }
            System.out.println("");
        }
    }
}
