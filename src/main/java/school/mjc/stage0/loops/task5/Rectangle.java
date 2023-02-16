package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        String symbol = "8";
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                System.out.println(symbol.repeat(length));
                continue;
            }
            System.out.println(symbol + " ".repeat(length - 2) + symbol);
        }
    }

    public static void main(String[] args) {
        Rectangle test = new Rectangle();
        test.printRectangleFrom8s(4,5);
    }
}
