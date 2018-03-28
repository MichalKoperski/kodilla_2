package com.kodilla;

import java.util.*;

public class MarksArray {
    public static void main (String[] args) throws java.lang.Exception {

        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(5);
        marks.add(3);
        marks.add(4);
        marks.add(2);
        marks.add(6);
        marks.add(3);
        marks.add(2);
        marks.add(6);
        marks.add(5);
        marks.add(4);
        marks.add(5);
        marks.add(5);
        marks.add(4);
        marks.add(3);
        marks.add(4);

        System.out.println("Marks:");
        for(Integer mark: marks) {
            System.out.println(mark);
        }
        Collections.sort(marks);
        double result=0;

        for(int i=1; i<marks.size()-1; i++) {
            //System.out.println(marks.get(i));
            //for(int i=0; marks.get(i)<marks.get(i+1); i++) {
            //	if(marks.get(i)<marks.get(i+1)) {
            result += marks.get(i);
            //System.out.println(result);
            //	}
        }
        System.out.println();
        System.out.println("Average = "+result/(marks.size()-2));
    }
}