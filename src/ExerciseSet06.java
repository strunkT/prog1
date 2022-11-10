import java.util.Random;
import java.util.Scanner;
public class ExerciseSet06 {

    public static void main(String[] args) {

        zufall();
    }
    public static int random(){
        int size= Terminal.readInt("size");
        int min= Terminal.readInt("min");
        int max= Terminal.readInt("max");
        Scanner scanner= new Scanner(System.in);
        int [] ran= new int[size];
        Random zufall= new Random();

        for (int i = 0; i < size; i++) {
            while (i > min && i < max) {
                ran[i] = zufall.nextInt(min, max);
                System.out.println("Array:" + ran[i]);

            }
            return ran[i];
        }
        //dauerschleife - methode ruft unendlich oft sich selbst auf
        return random();
    }

    public static int[] zufall()
    {
        int size = Terminal.readInt("size");
        int min = Terminal.readInt("min");
        int max = Terminal.readInt("max");
        int[] array = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            array[i] = min + (int) (Math.random() * ((max - min) + 1));
            System.out.println(array[i]);
        }
        return array;
    }
}
