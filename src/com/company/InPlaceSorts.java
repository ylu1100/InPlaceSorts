package com.company;

public class InPlaceSorts {
    public static void bubbleSort(String[] list1) {
        int x = 0;
        while (x != list1.length - 1) {
            for (int i = x + 1; i < list1.length; i++) {
                if (list1[x].compareTo(list1[i]) > 1) {
                    SortingUtil.swap(list1, x, i);
                }
            }
            x++;
        }
    }
    public static void selectionSort(double[] list1) {
        for (int i = 0; i < list1.length; i++) {
            SortingUtil.minIndex(list1,i);
        }
    }
}
