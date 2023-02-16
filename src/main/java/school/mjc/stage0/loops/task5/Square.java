package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        String symbol = "8";
        for (int i = 0; i < sideLength; i++) {
            if (i == 0 || i == sideLength - 1) {
                Cross.multiplyString(symbol, sideLength);
                System.out.println();
                continue;
            }
            System.out.print(symbol);
            Cross.multiplyString(" ", sideLength - 2);
            System.out.println(symbol);
        }
    }
}
