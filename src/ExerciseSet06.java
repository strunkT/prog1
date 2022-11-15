import java.util.Random;
import java.util.Scanner;
public class ExerciseSet06 {
   public static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1: random array");
        System.out.println("2: sorting algorithm");
        System.out.println("3: number game");
        System.out.println("4: find pattern");
        System.out.println("5: Tour");
        System.out.println("6: exit");
        int h= scanner.nextInt();
        switch (h){
            case 1:
                random();
                break;
            case 2:
                insertionsort(random());
                break;
            case 3:
                spiel();
                break;
            case 4:
                find("safectracgg", "cg");
                break;
            case 5:
                route();
                break;
            case 6: System.exit(0);
        }


    }
    public static int[] random(){

        System.out.println("size");
        int size= scanner.nextInt();
        System.out.println("min");
        int min= scanner.nextInt();
        System.out.println("max");
        int max= scanner.nextInt();

        int [] ran= new int[size];
        Random zufall= new Random();

        for (int i=0; i<size; i++) {
            ran[i] = zufall.nextInt(max-min)+1;
            System.out.println( ran[i]);
        }
                return ran;

    }
    public static int[] insertionsort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int a = arr[i];
            int b = i;

            while (b > 0 && arr[b - 1] > a) {
                arr[b] = arr[b - 1];
                b--;
            }
            arr[b] = a;
        }

            System.out.println(arr);

          return arr;
    }
    public static void spiel() {
        Random zufall = new Random();
        int zahl = zufall.nextInt(1, 20);
        System.out.println("number between 1 and 20, your guess:");
        int guess = scanner.nextInt();
        while (guess != zahl) {
            if (guess < zahl)
                System.out.println("number is higher");

            else if (guess > zahl)
                System.out.println("number is smaller");

            System.out.println("next guess");
            guess = scanner.nextInt();
        }
            System.out.println("hoenig is the winner!!!!!!");
            scanner.close();
        }
        public static  int find(String text, String pattern){// geht nicht
            for (int i=0; i<= text.length()- pattern.length(); i++){
                int a=0;
                while (a < pattern.length() && text.charAt(i+a) == pattern.charAt(a) )
                    a++;
                if (a == pattern.length()){
                    System.out.println(i);
                    return i;}
            }
            System.out.println(-1);
          return -1;
        }


    public static String[] names= new String[]{"Angeregg", "Hanslettalm", "Wiedersberger_Horn", "Hanslettalm", "Angeregg"};
    public static int[] hights= new int[]{950, 1616, 2127, 1616, 950};
    public static double[] routeDistances = new double[] {0, 3.5, 5, 6.5, 10};
    public static int down = 500;
    public static int up = 300;
    public static double dist = 4;
    public static int horizontal= 4;

    public static void route(){
        System.out.println("number of places:");
        int num= scanner.nextInt();
        for (int i=0; i<num; i++) {
            System.out.println("name: "+ names[i]);
            System.out.println("heights: "+ hights[i]);
            System.out.println("distance from start: "+ routeDistances[i]);
            System.out.println();
        }
        System.out.println("persons:");
        int per= scanner.nextInt();
        if (per<=5 ){
              down = 800;
              up = 400;
              horizontal= 5;
        }
        System.out.println("Upward speed  [m/h]: "+ up);
        System.out.println("Downward speed [m/h]: "+ down);
        System.out.println("Horizontal speed [km/h]: "+ horizontal);
        int h= (int) ( routeDistances[num]/horizontal);
        double min=  ( routeDistances[num]%horizontal);
        if (min !=0) h--;
        double vtime= h+min;
        int time= 0;
        for (int i=0; i< names.length; i++){
            int j= hights[i+1]-  hights[i];
            double k=(double) j/up;
            double g= (double) j/down;
            System.out.println(names[i]+ ": "+ time/60+ time%60);
            if (hights[i]< hights[i+1])
                System.out.println(j*60/up + "h");
            else System.out.println(-j*60 /down + "h");
            if (vtime< k) vtime= vtime/2+ k;
            else if (vtime> k) vtime= k/2+ vtime;
            System.out.println(names[i]+ ": "+ vtime);
            System.out.println();
        }

    }
}

