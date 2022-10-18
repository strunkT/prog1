public class ExerciseSet03 {
    public static void main(String[] args) {
     /*   for (int i=0; i<3;i++) {
            System.out.println("knurts saibot");
            print();
        }*/
        planProject();
    }

    public static void print(){
        System.out.println("knurts saibot");
    }
    public static void planProject(){
        int h= Terminal.readInt("arbeitsstunden");
        int e= Terminal.readInt("stundensatz");
        int a= Terminal.readInt("anzahl mitarbeiter");

        int o= (h/8)/a;
        int u= a*e*o;
        if (o%2==0);
        else o++;
        System.out.println(o+" arbeitstage");
        System.out.println(u+ " EUR gesamtkosten");
    }
}
