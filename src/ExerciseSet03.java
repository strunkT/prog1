public class ExerciseSet03 {
    public static void main(String[] args) {
      /*   for (int i=0; i<3;i++)
            System.out.println("knurts saibot");
            print();

        planProject();
        getDaysOfMonth(Terminal.readInt("month"), Terminal.readInt("year"));
    getDayOfTheWeek(Terminal.readInt("day"),Terminal.readInt("month"), Terminal.readInt("year"));
*/ printCalendar(Terminal.readInt("month"), Terminal.readInt("year"));
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
                System.out.println("wrong argument");
                break;
            case 1:
                days= 29;
                System.out.println("es waren 29 tage");
            case 2:
                days= 28;
                if ( year%4==0){
                    System.out.println("es waren 29 tage");
                } else
                System.out.println("es waren 28 tage");
            break;
            case 3:
            case 5:
            case 8:
            case 12:
                days= 31;
                System.out.println("es waren 31 tage");
                break;
            case 4:
            case 11:
            case 6:
            case 7:
            case 9:
                days= 30;
                System.out.println("es waren 30 tage");
                break;
            case 10:
                days= 29;
                System.out.println("es waren 29 tage");
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

                for (int i=0; i<=getDaysOfMonth(month,year); i++)
                System.out.println(i);
        }
    }

