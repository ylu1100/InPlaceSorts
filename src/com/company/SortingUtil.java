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
    public static boolean checkSum(double[] before, double[] after) {
        double sumbefore = 0;
        double sumafter = 0;
        for (int x = 0; x < before.length; x++) {
            sumbefore = sumbefore + before[x];
        }
        for (int y = 0; y <after.length; y++) {
            sumafter = sumafter + after[y];
        }
        return sumafter == sumbefore;
    }
    public static boolean checkSum(int[] before, int[] after) {
        int sumbefore = 0;
        int sumafter = 0;
        for (int x = 0; x < before.length; x++) {
            sumbefore = sumbefore + before[x];
        }
        for (int y = 0; y <after.length; y++) {
            sumafter = sumafter + after[y];
        }
        return sumafter == sumbefore;
    }
    public static double[]copydoublearray(double[]arr){
        double[]copyarray=new double [arr.length];{
            for(int i = 0;i<copyarray.length;i++){
                copyarray[i]=arr[i];
            }
            return copyarray;
        }
    }
    public static int[]copyintarray(int[]arr){
        int[]copyarray=new int [arr.length];{
            for(int i = 0;i<copyarray.length;i++){
                copyarray[i]=arr[i];
            }
            return copyarray;
        }
    }
    public static boolean isSorted(String[] testArr) {
        for (int x = 0; x < testArr.length - 1; x++) {
            if (testArr[x].compareTo(testArr[x + 1])>1) {
                return false;
            }
        }
        return true;
    }
    public static boolean isSorted(double[] testArr) {
        for (int x = 0; x < testArr.length - 1; x++) {
            if (testArr[x] > testArr[x + 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isSorted(int[] testArr) {
        for (int x = 0; x < testArr.length - 1; x++) {
            if (testArr[x] > testArr[x + 1]) {
                return false;
            }
        }
        return true;
    }
    public static String[]randomStringArr(int count,int length){
        String[]arr=new String[count];
       while(count>0){
           int i=0;
           String s = "";
           while(i<length){
               char c = (char)((Math.random()*26)+97);
               s=s+c;
               i++;
           }
           count--;
           arr[count]=s;
       }
       return arr;
    }
    public static double[] randomDoubleArr(int count) {
        double[] arr = new double[count];
        for (int counter = 0; counter < count; counter++) {
            arr[counter] = (Math.random() * 10000);
        }
        return arr;
    }
    public static int[] randomIntArr(int count) {
        int[] arr = new int[count];
        for (int counter = 0; counter < count; counter++) {
            arr[counter] = (int) (Math.random() * 10000);
        }
        return arr;
    }
}
