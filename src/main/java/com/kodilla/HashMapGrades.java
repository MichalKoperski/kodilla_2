package com.kodilla;

import java.util.*;

class Student {
    String firstName;
    String lastName;

    public Student(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String toString() {
        return firstName + " " + lastName;
    }
}
class MarksCollection {
    private List<Mark> marks;

    public MarksCollection(List<Mark> marks) {
        this.marks=marks;
    }
    public double getAverage() {
        double sum=0;

        for(int i=0; i<marks.size(); i++) {
            sum+=marks.get(i).getGrade();
        } 			return sum/marks.size();
    }
}
class Mark {
    String subject;
    double grade;
    public Mark(String subject, double grade) {
        this.subject=subject;
        this.grade=grade;
    }
    public String getSubject() {
        return subject;
    }
    public Double getGrade() {
        return grade;
    }
    public String toString() {
        return subject + " " + grade;
    }
}
class HashMapGrades {
    public static void main (String[] args) throws java.lang.Exception {

        List<Mark> markList = new LinkedList<Mark>();
        markList.add(new Mark("history", 4));
        markList.add(new Mark("biology", 5));
        markList.add(new Mark("math", 5));
        markList.add(new Mark("geography", 5));

        List<Mark> markList2 = new LinkedList<Mark>();
        markList2.add(new Mark("math",3));
        markList2.add(new Mark("biology",6));
        markList2.add(new Mark("history",4));
        markList2.add(new Mark("history",6));

        List<Mark> markList3 = new LinkedList<Mark>();
        markList3.add(new Mark("history",3));
        markList3.add(new Mark("biology",2));
        markList3.add(new Mark("math",4));
        markList3.add(new Mark("history",3));

        List<Mark> markList4 = new LinkedList<Mark>();
        markList4.add(new Mark("biology",3));
        markList4.add(new Mark("history",6));
        markList4.add(new Mark("math",4));
        markList4.add(new Mark("history",4));

        MarksCollection marksss1 = new MarksCollection(markList);
        MarksCollection marksss2 = new MarksCollection(markList2);
        MarksCollection marksss3 = new MarksCollection(markList3);
        MarksCollection marksss4 = new MarksCollection(markList4);

        Student student1 = new Student("Jennifer", "Taylor");
        Student student2 = new Student("Monica", "Kowalski");
        Student student3 = new Student("Tom", "Greenfield");
        Student student4 = new Student("Robert", "Greenfield");

        HashMap<Student, Double> marksTable = new HashMap<Student, Double>();

        marksTable.put(student1, marksss1.getAverage());
        marksTable.put(student2, marksss2.getAverage());
        marksTable.put(student3, marksss3.getAverage());
        marksTable.put(student4, marksss4.getAverage());

        for(Map.Entry<Student, Double> entry: marksTable.entrySet()) {
            System.out.println(entry.getKey()+" average: "+entry.getValue());
        }
    }
}