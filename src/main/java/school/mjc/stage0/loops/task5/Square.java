package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){

        for (int i = 1; i<=sideLength;i++){
            for (int a = 1; a<=sideLength;a++){
                if (i==1||i==sideLength){
                    System.out.print("8");
                }
                else if (a==1||a==sideLength){
                    System.out.print("8");
                }
                else
                    System.out.print(' ');
            }
            System.out.println("");
        }

    }
}