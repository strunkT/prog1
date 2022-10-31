public class set4 {
    public static void main(String[] args) {
        //  startByteOverflowDemo();
        //  demonstrateArithmeticOperations();
       // convertToBinary();
        System.out.print("Please provide a hexadecimal number (e.g. 1f): ");
        convertHexToDec0();
     //   convertToNumber(Terminal.readChar());

    }
    public static void startByteOverflowDemo() {
        byte num = 0;
        int i = 0;
        while (i < 10) {
            System.out.print(num + " ");
            num+=30;
            i++;
        }
        System.out.println();
    }
    public static void demonstrateArithmeticOperations(){
        int a= Terminal.readInt("1st operand");
        int b= Terminal.readInt("2nd operand");

        System.out.println(a+"+"+b+"="+ (a+b));
        System.out.println(a+"-"+b+"="+ (a-b));
        System.out.println(a+"*"+b+"="+ (a*b));
        System.out.println(a+"/"+b+"="+(a/b));
        System.out.println(a+"%"+b+"="+(a%b));
    }

    public static void convertToBinary(){
        int i= Terminal.readInt("number");
        System.out.println("Binary representation (from bottom to top!):");
        while (i/2>0|| i%2!=0) {
            System.out.println(i%2);
            i=i/2;
        }
    }
    public static void convertHexToDec0() {
        int result = 0;
        char ch = Terminal.readChar();
        while (ch != '\n') {
            int code = ch;
            System.out.println(ch + " -> " + code);
            ch = Terminal.readChar();
        System.out.println("Corresponding decimal number: " + result);
    }
    }
    public static int convertToNumber(char ch) {
        int result=0;




        return result;
        }


}
