package com.kodilla;

public class Loop {
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] names = new int[20];
        double result = 0;

        for(int i=0; i<names.length; i++){
            names[i]=i;
            System.out.println("Array element names[" + i + "] = " + names[i]);
            result+=i;
        };
        System.out.println("Average = "+result/names.length);
    }
}