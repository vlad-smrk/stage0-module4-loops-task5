package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = height; i >= -height; i -= 2) {
            if (i == 0 || i == -1) {
                continue;
            }
            int length = Math.abs(i);
            int offset = (height - length) / 2;
            System.out.println(" ".repeat(offset) + "8".repeat(length) + " ".repeat(offset));
        }
    }

}
