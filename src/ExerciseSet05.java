import java.text.DecimalFormat;

public class ExerciseSet05 {
    public static void main(String[] args) {

        System.out.println("1 : Zinsberechnung");
        System.out.println("2 : Durchschnittsberechnung");
        System.out.println("3 : Vektor-Test");
        System.out.println("4 : Maulwurfsimulation");
        System.out.println("0 : Beenden");
        int h = Terminal.readInt("Programmauswahl");
            while (h != 0) {
            switch (h) {
                case 1:
                    System.out.println("Zinsberechnung");
                    zinsrechnung();
                    break;
                case 2:
                    System.out.println("2 : Durchschnittsberechnung");
                    klausurnoten();
                    break;
                case 3:
                    System.out.println("  Vektor-Test");
                    System.out.println("1 : mult");
                    System.out.println("2 : plus");
                    System.out.println("3 : minus");
                    System.out.println("4 : rotate");
                    System.out.println("5 : vlength");
                    int k = Terminal.readInt("ihre wahl");

                    switch (k) {
                        case 1:
                            double[] vec1 = new double[2];
                            vec1[0] = Terminal.readDouble("x1");
                            vec1[1] = Terminal.readDouble("y1");
                            int f = Terminal.readInt("faktor");
                            mult(vec1, f);

                            break;
                        case 2:
                            double[] vec2 = new double[2];
                            vec2[0] = Terminal.readDouble("x1");
                            vec2[1] = Terminal.readDouble("y1");
                            double[] vec3 = new double[2];
                            vec3[0] = Terminal.readDouble("x2");
                            vec3[1] = Terminal.readDouble("y2");
                            plus(vec2, vec3);
                            break;
                        case 3:
                            double[] vec4 = new double[2];
                            vec4[0] = Terminal.readDouble("x1");
                            vec4[1] = Terminal.readDouble("y1");
                            double[] vec5 = new double[2];
                            vec5[0] = Terminal.readDouble("x2");
                            vec5[1] = Terminal.readDouble("y2");
                            minus(vec4, vec5);
                            break;
                        case 4:
                            double[] vec6 = new double[2];
                            vec6[0] = Terminal.readDouble("x1");
                            vec6[1] = Terminal.readDouble("y1");
                            int e = Terminal.readInt("grad");
                            rotate2d(vec6, e);
                            break;
                        case 5:
                            double[] vec7 = new double[2];
                            vec7[0] = Terminal.readDouble("x1");
                            vec7[1] = Terminal.readDouble("y1");
                            vlength(vec7);
                            break;
                    }
                case 4:
                    double[] pos1 = new double[2];
                    pos1[0] = Terminal.readDouble("x1");
                    pos1[1] = Terminal.readDouble("y1");
                    double[] pos2 = new double[2];
                    pos2[0] = Terminal.readDouble("x2");
                    pos2[1] = Terminal.readDouble("y2");
                    hügelx100(pos1, pos2);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    public static void zinsrechnung(){
        double k= Terminal.readDouble("anfangskapital");
        double z= Terminal.readDouble("zinssatz in %")/100;
        double t= Terminal.readDouble(" Anlagedauer");
        for (int i=1; i<=t; i++) {
            System.out.println("Kapital nach "+ i+" Jahren:"+ k*(1+z)+" EUR");
            k= k*(1+z);
        }
    }
    public static void klausurnoten() {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        double sum = 0;
        int k = Terminal.readInt("Wie viele Zahlen sollen analysiert werden?");
        double[] noten = new double[k];
        for (int i = 0; i < k; i++) {
            noten[i] = Terminal.readDouble("naechste Zahl");
            if (noten[i] < min) {
                min = noten[i];
            }
            if (noten[i] > max) {
                max = noten[i];
            }
            sum += noten[i];
        }
        System.out.print(" Die Zahlen lauten: ");
        for (int i = 0; i < k; i++) System.out.print(noten[i] + ", ");
        System.out.printf("Min: %.2f Max: %.2f Durchschnitt: %.2f", min, max, (sum / k));
    }

    public static double[] mult(double[] vec1, double factor){
        double[] result= new double[vec1.length];
        for (int i=0; i< vec1.length;i++) {
            result[i]= vec1[i]*factor;
            System.out.println(vec1[i] +"*"+ factor + "= "+ result[i]);
        }
        return result;
    }
    public static double[] plus(double[] vec1, double[] vec2){
        double[] result= new double[vec1.length];
        for (int i=0; i< vec1.length;i++) {
            result[i]= vec1[i]+ vec2[i];
            System.out.println(vec1[i] +"+"+ vec2[i] + "= "+result[i]);
        }
        return result;
    }
    public static double[] minus(double[] vec1, double[] vec2){

        double[] result= new double[vec1.length];
        for (int i=0; i< vec1.length;i++) {
            result[i]= vec1[i]- vec2[i];
            System.out.println(vec1[i] +"-"+ vec2[i] + "= "+result[i]);
        }
        return result;
    }
    public static double[] rotate2d(double vec1[], int deg){
        double rad = ((double)deg * Math.PI) /  180;
        double[] result= new double[vec1.length];
        result[0]= vec1[0]* (Math.cos( rad))- (vec1[1]* Math.sin( rad));
        result[1]= vec1[0]*(Math.sin(rad))+ (vec1[1]* Math.cos(rad));
        System.out.println("x"+ "= "+ result[0]+ " y"+"= "+ result[1]);
        return result;
    }
    public static double vlength(double[] vec) {
        int dimensions = vec.length;
        double lenght = 0;
        for (int i= 0; i< dimensions; i++) {
            lenght += Math.pow(vec[i], 2);
        }
        return Math.pow(lenght, 0.5);
    }
    public static double[] Maulwurfshügel(double[] pos1, double[] pos2) {

        double[]res= minus(pos1, pos2);
        res= rotate2d(res, 5) ;
       res= mult(res, 0.99);
        System.out.println("naechster haufen");
        for (int i=0; i<2; i++){
            if (i==1) System.out.println("x");
       else System.out.println("y");
        System.out.println(Math.round(res[i]*100000d) / 100000d);
    }
    return res ;
    }
    public static void hügelx100(double[] pos1, double[] pos2){

           for (int i=0; i<100; i++){
               System.out.printf("Haufen %d : ( %1.5f | %1.5f)\n ", i + 1,Math.round( pos1[0]),Math.round( pos1[1]));
               double[] nutzlos= new double[2];
               nutzlos= pos1;
               pos1 = plus(pos1, Maulwurfshügel(pos1, pos2));
               pos2= nutzlos;
           }
               Maulwurfshügel(pos1, pos2);
    }
}