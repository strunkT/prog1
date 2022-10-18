public class ExerciseSet02 {
    public static int computeSum(int number) {
        int result = 0; int i = 1;
        while (i <= number) {
            result = result + i; i = i + 1;
        }
        return result;
    }
    public static void main(String[] args) {

        /*  int num = Terminal.readInt("Provide a number");
        System.out.println(computeSum(num));

        int number1= Terminal.readInt("anzahl");
        printSequence1(number1);

        int num3=Terminal.readInt("anzahl");
        printSequence2(num3);

        int num4= Terminal.readInt("anzahl");
        printSequence3(num4);

        int num5= Terminal.readInt("höhe");
        printTriangle(num5);
        */
        int num6= Terminal.readInt("hoehe");
        printTriangle(num6);
    }
    public static void printSequence1(int number1){
    for (int i=1; i<= number1; i++)
    System.out.println(i*i);
    }
    public static void printSequence2(int number2){
        for (int i=1; i<= number2; i++)
            if ((-(i)*1)%2==0)
            System.out.println(-(i));
        else
                System.out.println(i);
    }
    public static void printSequence3(int number3){
        for (int i=1; i< number3; i++)
            System.out.println((i*(i+1))/2);
    }
    public static void printTriangle(int height) {

        for (int i = 0; i < height; i++) {
            for (int e = 1; e < height; e++) {
                System.out.print(" ");
            }
        }
        for (int j = 0; j < height; j++) {
                System.out.println(".");

            }
    }
}
