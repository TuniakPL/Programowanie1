package pl.sdacademy;

public class Main {

    public static void main(String[] args) {
        int height = 6;
        int width = 6;


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j <i) {
                    System.out.print('*');
                }

            }
            System.out.println();
        }
    }


}
