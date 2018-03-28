package com.kodilla;

import java.util.*;

class SuperList {
    String name;
    int year;
    public SuperList(String name, int year) {
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
public class BookLinkedList {
    public static void main (String[] args) throws java.lang.Exception {

        LinkedList<SuperList> library = new LinkedList<SuperList>();
        library.add(new SuperList("50 shades of Grey", 2010));
        library.add(new SuperList("Sherlock Holmes", 2017));
        library.add(new SuperList("The Last Mohikan", 1990));
        library.add(new SuperList("The infinity", 1995));
        library.add(new SuperList("Coma", 2000));
        library.add(new SuperList("50000 miles undersea journey", 1977));

        for(SuperList lib: library){
            if(lib.getYear()>=2000) {
                System.out.println(lib.getName()+"\t "+lib.getYear());
            }
        }
    }
}