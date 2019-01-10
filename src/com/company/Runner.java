package com.company;

public class Runner {

    public static void main(String[] args) {
        String[]arr = {"cat","dog","fish","owl","moose","alpaca"};
        double[]arr2 = {1.6,34.7,3.7,9.81,3.14,2.7,4.6};
        int[]arr3 = {12,6,56,7,4,3,6,73,41,8,5,2,9,20};
        for(String num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        long time = System.nanoTime();
        InPlaceSorts.bubbleSort(arr);
        for(String num:arr){
            System.out.print(num+" ");// write your code here
        }
        System.out.println();
        time = System.nanoTime()-time;
        System.out.println("Time Taken: "+time);

        for(double num:arr2){
            System.out.print(num+" ");
        }
        System.out.println();
        long time2 = System.nanoTime();
        InPlaceSorts.selectionSort(arr2);
        for(double num:arr2){
            System.out.print(num+" ");
        }
        System.out.println();
        time2 = System.nanoTime()-time2;
        System.out.println("Time Taken: "+time2);
        long time3 = System.nanoTime();
        InPlaceSorts.insertionSort(arr3);
        for(int num:arr3){
            System.out.print(num+" ");
        }
        System.out.println();
        time3 = System.nanoTime()-time3;
        System.out.println("Time Taken: "+time3);
    }
}
