import java.util.Random;

/**
 * Created by Dariya on 20.10.2015.
 * 5. —оздать двумерный массив из случайных чисел так чтобы размер внутреннего массива был случайным. ¬ывести массив на экран.
 */
public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int array[][] = new int[8][random.nextInt(100)+1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] =  (int)(Math.random() * 50);

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
