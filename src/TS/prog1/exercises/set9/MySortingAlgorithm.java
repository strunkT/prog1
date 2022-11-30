package TS.prog1.exercises.set9;

import java.util.Random;

public class MySortingAlgorithm {
    int[] data;
    private static int comp(int data1, int data2){
        if (data1< data2) return 0;
        if (data1>data2) return 1;
        else return -1;
    }
    public void setData(int size){// array füllen
        for (int i=0; i<size; i++){
            data= new int[size];
            Random r= new Random();
            data[i]= r.nextInt();
        }
        }
    
    public static void sort(int[] data){

        for (int i=0; i< data.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (comp(data[j], data[min])< 0) min=j;
            }
        int tmp= data[i];
            data[i]= data[i+1];
            data[i+1]= tmp;
            System.out.println(data[i]);
    }
        }


    public static void main(String[] args) {
        MySortingAlgorithm stool= new MySortingAlgorithm();
        stool.setData(9);
        sort(stool.data);
    }
}
