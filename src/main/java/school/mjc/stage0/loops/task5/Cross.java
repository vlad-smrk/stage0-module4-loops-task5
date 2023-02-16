package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String symbol = "8";
        int middle = sideLength / 2;
        for (int i = 0; i < sideLength; i++) {
            if (i == middle) {
                System.out.println(symbol.repeat(sideLength));
                continue;
            }
            System.out.println(" ".repeat(middle) + symbol + " ".repeat(middle));
        }
    }

}
