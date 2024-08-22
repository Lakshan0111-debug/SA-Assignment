package Task3;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        int width = 7;  // You can adjust the width as needed
        int height = 4; // You can adjust the height as needed

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
