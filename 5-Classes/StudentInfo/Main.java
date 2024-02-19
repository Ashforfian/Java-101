package Class.StudentInfo;

import Class.StudentInfo.Course;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("İrem", "05060513508","FZK");
        Course c1 = new Course("fizik", "101", "FZK");
        Course c2 = new Course("kimya", "102", "KMY");
        Course c3 = new Course("matematik", "122", "MAT");
        Student s1 = new Student("Kerem", "374", "1", c1, c2, c3);
        
        c1.addTeacher(t1);
        c1.printTeacher(t1);

    }
}
