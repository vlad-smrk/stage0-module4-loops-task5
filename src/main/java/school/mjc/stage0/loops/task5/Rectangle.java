package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 0; i < height; i++) {
            Cross.multiplyString("8", length);
            System.out.println();
        }
    }

}
