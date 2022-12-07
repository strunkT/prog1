package TS.prog1.exercises.set10;

public class set10 {
    public static double fakultaet(int fak){
        double res=0;
        if (fak == 0) {
            res = 1;
        } else {
            return fak * fakultaet(fak - 1);
        }

        //System.out.println(res);
        return res;
    }

    public static void main(String[] args)
    {
        System.out.println(fakultaet(1));
        System.out.println(fakultaet(2));
        System.out.println(fakultaet(3));
        System.out.println(fakultaet(4));

    }

}
