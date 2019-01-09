package com.company;

public class InPlaceSorts {
    public static void bubbleSort(String[] list1) {
        int x = 0;
        while (x != list1.length - 1) {
            for (int i = x + 1; i < list1.length; i++) {
                if (list1[x].compareTo(list1[i]) > 1) {
                    swap(list1, x, i);
                }
            }
            x++;
        }
    }

    public static void swap(String[] testArr, int x, int i) {
        String y = testArr[x];
        testArr[x] = testArr[i];
        testArr[i] = y;
    }

    public static void swap(double[] testArr, int i, int i2) {
        double y = testArr[i];
        testArr[i] = testArr[i2];
        testArr[i2] = y;
    }
    public static double minimum(double[]list1,int index){
        double min = list1[index];
        for(int i = index;i<list1.length;i++)
        {
            if(min>list1[i])
            {
                min = list1[i];
            }
        }
        return min;
    }

    public static void selectionSort(double[] list1) {
        double x = 0;
        for (int i = 0; i < list1.length; i++) {
            x=minimum(list1,i);
            list1[1]=x;
        }
    }
}
