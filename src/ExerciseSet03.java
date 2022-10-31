public class ExerciseSet03 {
    public static void main(String[] args) {
      /*   for (int i=0; i<3;i++)
            System.out.println("knurts saibot");
            print();

        planProject();
        getDaysOfMonth(Terminal.readInt("month"), Terminal.readInt("year"));*/
    getDayOfTheWeek(Terminal.readInt("day"),Terminal.readInt("month"), Terminal.readInt("year"));
// printCalendar(Terminal.readInt("month"), Terminal.readInt("year"));
    }

    public static void print(){
        for (int i=0; i<3;i++)
        System.out.println("knurts saibot");
    }

    public static void planProject(){
        int h= Terminal.readInt("arbeitsstunden");
        int e= Terminal.readInt("stundensatz");
        int a= Terminal.readInt("anzahl mitarbeiter");

        double o= (h/8)/a;
        int u= (int) (a*e*o);
        if (o%2==0);

        else o++;
        System.out.println((int)o+" arbeitstage");
        System.out.println(u+ " EUR gesamtkosten");
    }
    public static int getDaysOfMonth(int month, int year){

          int days= 0;
        switch (month){
            case 0:
                break;
            case 1:
                days= 31;
                break;
            case 2:
                if ( year%4==0){
                   days= 29;
                } else
                days=28;
                break;
            case 3:
                days= 31;
                break;
            case 5:
                days= 31;
                break;
            case 8:
                days= 31;
                break;
            case 12:
                days= 31;
                break;
            case 4:
                days= 30;
                break;
            case 11:
                days= 30;
                break;
            case 6:
                days= 30;
                break;
            case 7:
                days= 31;
                break;
            case 9:
                days= 30;
                break;
            case 10:
                days= 31;
                break;
        }
return days;
    }
    public static int getDayOfTheWeek
            (int day, int month, int year) {
          int wochentag= ((day+((month+1)*13)/5)%+(year%100)+((year%100)/4)%+(((year- (year%100))/100)/4)%-2*((year- (year%100))/100))%7;
        if (wochentag==0) wochentag=7;
          System.out.println(wochentag);
          return wochentag;
    }
    public static void printCalendar(int month, int year){


        System.out.println("" +
                "MO     " + "DI     " + "MI     " + "DO     " + "FR     " + "SA     " + "SO");
        for (int i=1; i<getDayOfTheWeek(1, month, year); i++)
            System.out.print(" "); //passt aber sout von getDayOfTheWeek stört




        for (int k=1; k>getDayOfTheWeek(1, month, year); k++)
            if (k%7!=0)
                System.out.print(k+
                        "   ")   ;
            else System.out.println(k+
                    "");


        }
    }

