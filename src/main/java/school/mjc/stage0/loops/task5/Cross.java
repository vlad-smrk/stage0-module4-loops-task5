package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String symbol = "8";
        int middle = sideLength / 2;
        for (int i = 0; i < sideLength; i++) {
            if (i == middle) {
                multiplyString(symbol, sideLength);
                System.out.println();
                continue;
            }
            multiplyString(" ", middle);
            System.out.println(symbol);
        }
    }

    static void multiplyString(String string, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(string);
        }
    }

}
