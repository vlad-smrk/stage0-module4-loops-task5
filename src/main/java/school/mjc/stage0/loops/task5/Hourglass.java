package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int last = 0;
        for (int i = height; i > 0; i -= 2) {
            int offset = (height - i) / 2;
            Cross.multiplyString(" ", offset);
            Cross.multiplyString("8", i);
            System.out.println();
            last = i;
        }
        for (int i = last + 2; i <= height; i += 2) {
            int offset = (height - i) / 2;
            Cross.multiplyString(" ", offset);
            Cross.multiplyString("8", i);
            System.out.println();
        }
    }

}
