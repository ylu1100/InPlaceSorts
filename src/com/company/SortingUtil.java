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
        int index = ind;
        for(int i = index+1;i<arr.length;i++){
            if(arr[i]<arr[index]){
                index=i;
            }
        }
        return index;
    }
    public static boolean checkSum(int[] before, int[] after) {
        int sumbefore = 0;
        int sumafter = 0;
        for (int x = 0; x != before.length - 1; x++) {
            sumbefore = sumbefore + before[x];
        }
        for (int y = 0; y != after.length - 1; y++) {
            sumafter = sumafter + after[y];
        }
        return sumafter == sumbefore;
    }
    public static int[]copyintarray(int[]arr){
        int[]copyarray=new int [arr.length];{
                for(int i = 0;i<copyarray.length;i++){
                    copyarray[i]=arr[i];
                }
                return copyarray;
        }
    }
}
