package com.company;

public class Runner {

    public static void main(String[] args) {
        String[]arr = SortingUtil.randomStringArr(8,5);
        double[]arr2 = SortingUtil.randomDoubleArr(8);
        int[]arr3 = SortingUtil.randomIntArr(8);
        System.out.println("BubbleSort");
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
        System.out.println("Is it sorted?: "+SortingUtil.isSorted(arr));
        System.out.println();
        System.out.println("SelectionSort");
        for(double num:arr2){
            System.out.print(num+" ");
        }
        System.out.println();
        long time2 = System.nanoTime();
        double[]before2 = SortingUtil.copydoublearray(arr2);
        InPlaceSorts.selectionSort(arr2);
        double[]after2 = SortingUtil.copydoublearray(arr2);
        for(double num:arr2){
            System.out.print(num+" ");
        }
        System.out.println();
        time2 = System.nanoTime()-time2;
        System.out.println("Time Taken: "+time2);
        System.out.println("Are the sums equal?: "+SortingUtil.checkSum(before2,after2));
        System.out.println("Is it sorted?: "+SortingUtil.isSorted(arr2));
        System.out.println();
        System.out.println("InsertionSort");
        for(int num:arr3){
            System.out.print(num+" ");
        }
        System.out.println();
        long time3 = System.nanoTime();
        int[] before3 = SortingUtil.copyintarray(arr3);
        InPlaceSorts.insertionSort(arr3);
        int[]after3=SortingUtil.copyintarray(arr3);
        for(int num:arr3){
            System.out.print(num+" ");
        }
        System.out.println();
        time3 = System.nanoTime()-time3;
        System.out.println("Time Taken: "+time3);
        System.out.println("Are the sums equal?: "+SortingUtil.checkSum(before3,after3));
        System.out.println("Is it sorted?: "+SortingUtil.isSorted(arr3));
    }
}
