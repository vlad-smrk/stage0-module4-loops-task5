package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            Cross.multiplyString("8", i + 1);
            System.out.println();
        }
    }

}
