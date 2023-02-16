package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        String symbol = "8";
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                Cross.multiplyString(symbol, length);
                System.out.println();
                continue;
            }
            System.out.print(symbol);
            Cross.multiplyString(" ", length - 2);
            System.out.println(symbol);
        }
    }

    public static void main(String[] args) {
        Rectangle test = new Rectangle();
        test.printRectangleFrom8s(4,5);
    }
}
