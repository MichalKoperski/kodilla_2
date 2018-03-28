package com.kodilla;

import java.util.*;

class SuperList2 {
    String name;
    int year;
    public SuperList2(String name, int year) {
        this.name=name;
        this.year=year;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
}
class ArrayLinked {
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
        System.out.println("ARRAYLIST");
        System.out.println();
        System.out.println("Marks:");
        for(Integer mark: marks) {
            System.out.println(mark);
        }
        Collections.sort(marks);
        double result=0;

        for(int i=1; i<marks.size()-1; i++) {
            result += marks.get(i);
        }
        System.out.println("Average = "+result/(marks.size()-2));
        System.out.println();
        System.out.println("LINKEDLIST");
        System.out.println();
        LinkedList<SuperList2> library = new LinkedList<SuperList2>();
        library.add(new SuperList2("50 shades of Grey", 2010));
        library.add(new SuperList2("Sherlock Holmes", 2017));
        library.add(new SuperList2("The Last Mohikan", 1990));
        library.add(new SuperList2("The infinity", 1995));
        library.add(new SuperList2("Coma", 2000));
        library.add(new SuperList2("50000 miles undersea journey", 1977));

        for(SuperList2 lib: library){
            if(lib.getYear()>=2000) {
                System.out.println(lib.getName()+"\t "+lib.getYear());
            }
        }
    }
}