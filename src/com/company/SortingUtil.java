package com.company;

public class SortingUtil {
    public static void swap(String[] testArr, int x, int i) {
        String y = testArr[x];
        testArr[x] = testArr[i];
        testArr[i] = y;
    }

    public static void swap(int[] testArr, int i, int i2) {
        int y = testArr[i];
        testArr[i] = testArr[i2];
        testArr[i2] = y;
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
    public static int minIndex(double arr[],int ind){
        for(int i = ind;i<arr.length;i++){
            if(arr[i]<arr[ind]){
                swap(arr,i,ind);
                ind=i;
            }
        }
        return ind;
    }

}
