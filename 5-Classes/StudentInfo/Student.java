package Class.StudentInfo;

import Class.StudentInfo.Course;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;
    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        calculateAverage();
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int note2, int note3){
        if (note1>=0 && note1<=100){
            this.course1.note = note1;
        }if (note2>=0 && note2<=100){
            this.course2.note = note2;
        }if (note3>=0 && note3<=100){
            this.course3.note = note3;
        }
    }
    void calculateAverage(){
        this.average = (course1.note+course2.note+course3.note) / 3.0;
    }
    void isPassCheckPrint(){
        if (this.average>60){
            isPass = true;
        }
        if (isPass){
            System.out.println(this.name+" adlı öğrenci sınıfı geçmiştir.");
        }else{
            System.out.println(this.name+" adlı öğrenci sınıfı geçememiştir.");
        }
    }
    void  printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println(this.course1.name+" Notu: " + this.course1.note);
        System.out.println(this.course2.name+" Notu : " + this.course2.note);
        System.out.println(this.course3+" Notu : " + this.course3.note);
    }
}
