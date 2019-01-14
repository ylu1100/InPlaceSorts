package com.company;

public class Runner {

    public static void main(String[] args) {
        String[]arr = SortingUtil.randomStringArr(8,5);
        double[]arr2 = SortingUtil.randomDoubleArr(8);
        int[]arr3 = SortingUtil.randomIntArr(8);
        long timeStart=0;
        long timeStop=0;
        System.out.println("BubbleSort");
        for(String num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        timeStart = System.nanoTime();
        InPlaceSorts.bubbleSort(arr);
        timeStop = System.nanoTime()-timeStart;
        for(String num:arr){
            System.out.print(num+" ");// write your code here
        }
        System.out.println();
        System.out.println("Time Taken: "+timeStop);
        System.out.println("Is it sorted?: "+SortingUtil.isSorted(arr));
        System.out.println();
        System.out.println("SelectionSort");
        for(double num:arr2){
            System.out.print(num+" ");
        }
        System.out.println();
        double[]before2 = SortingUtil.copydoublearray(arr2);
        timeStart = System.nanoTime();
        InPlaceSorts.selectionSort(arr2);
        timeStop = System.nanoTime()-timeStart;
        double[]after2 = SortingUtil.copydoublearray(arr2);
        for(double num:arr2){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Time Taken: "+timeStop);
        System.out.println("Are the sums equal?: "+SortingUtil.checkSum(before2,after2));
        System.out.println("Is it sorted?: "+SortingUtil.isSorted(arr2));
        System.out.println();
        System.out.println("InsertionSort");
        for(int num:arr3){
            System.out.print(num+" ");
        }
        System.out.println();
        int[] before3 = SortingUtil.copyintarray(arr3);
        timeStart = System.nanoTime();
        InPlaceSorts.insertionSort(arr3);
        timeStop = System.nanoTime()-timeStart;
        int[]after3=SortingUtil.copyintarray(arr3);
        for(int num:arr3){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Time Taken: "+timeStop);
        System.out.println("Are the sums equal?: "+SortingUtil.checkSum(before3,after3));
        System.out.println("Is it sorted?: "+SortingUtil.isSorted(arr3));
    }
}
