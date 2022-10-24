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
        if (month < 8) {
            if (month == 2) {
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            } else {
                if (month % 2 == 0) {
                    return 30;
                } else {
                    return 31;
                }
            }
        } else {
            if (month % 2 == 0) {
                return 31;
            } else {
                return 30;
            }
        }
    }

    public static int getDayOfTheWeek(int day, int month, int year)
    {
        int wochentag = ((day + ((month + 1) * 13) / 5) % +(year % 100) + ((year % 100) / 4) % +(((year - (year % 100)) / 100) / 4) % -2 * ((year - (year % 100)) / 100)) % 7;
        if (wochentag == 0) wochentag = 7;
        System.out.println(wochentag);
        return wochentag;
    }

    public static void printCalendar(int month, int year)
    {
        for (int i = 1; i <= getDaysOfMonth(month, year); i++)
            if (i % 7 != 0) System.out.print(i + " ");
            else System.out.println(i);
    }
}

