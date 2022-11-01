public class set4 {
    public static void main(String[] args) {
        //  startByteOverflowDemo();
        //  demonstrateArithmeticOperations();
       // convertToBinary();

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
        System.out.print("Please provide a hexadecimal number (e.g. 1f): ");
        int result = 0;
        char ch = Terminal.readChar();
        while (ch != '\n') {

            if (ch >= '0' && ch <= '9') {
                int val = ch - '0';

                System.out.println(val);
            } else if (ch >= 'a' && ch <= 'f') {
                int val = ch - 'a' + 10;
                System.out.println(val);

            }
            ch = Terminal.readChar();

        }
        System.out.println("Corresponding decimal number: " + result);
        System.out.println(ch);
    }
    public static int convertToNumber(char ch) {
        int result=0;




        return result;
        }


}
