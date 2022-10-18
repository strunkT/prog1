public class ExerciseSet02 {
    public static int computeSum(int number)
    {
        int result = 0;
        int i = 1;
        while (i <= number) {
            result = result + i;
            i = i + 1;
        }
        return result;
    }

    /**
     * make it easier
     * before:
     * int num6= Terminal.readInt("höhe");
     * printTriangle(num6);
     */
    public static void main(String[] args)
    {

        System.out.println(computeSum(Terminal.readInt("Provide a number")));

        printSequence1(Terminal.readInt("anzahl"));

        printSequence2(Terminal.readInt("anzahl"));

        printSequence3(Terminal.readInt("anzahl"));

        printTriangle(Terminal.readInt("hoehe"));
    }
    public static void printSequence1(int number1){
    for (int i = 1; i <= number1; i++) System.out.println(i * i);
    }

    public static void printSequence2(int number2){
        for (int i = 1; i <= number2; i++)
            if ((-(i)) % 2 == 0) System.out.println(-(i));
            else System.out.println(i);
    }

    public static void printSequence3(int number3){
        for (int i = 1; i < number3; i++) System.out.println((i * (i + 1)) / 2);
    }

    public static void printTriangle(int height)
    {
        for (int i = 0; i < height; i++) System.out.print(". ".repeat(i + 1).indent(height - i));

    }
}
