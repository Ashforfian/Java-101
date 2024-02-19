package Class.StudentInfo;
public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int performanceNote;
    Teacher courseTeacher;
    Course(String name, String code, String prefix ){
        int note = 0;
        this.code = code;
        this.name = name;
        this.prefix = prefix;
    }
    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.courseTeacher = teacher;
            System.out.println(this.courseTeacher.name+" adlı öğretmen '"+this.courseTeacher.branch+"' dersine atanmıştır.");
        }else {
            System.out.println(teacher.name+" adlı öğretmen bu derse atanamaz.İşlem başarısız!!");
        }
    }
    void printTeacher(Teacher courseTeacher){
        System.out.println("Öğretmenin adı: "+courseTeacher.name+
        "\nÖğretmenin verdiği ders: "+courseTeacher.branch+
        "\nÖğretmenin telefon numrası: "+courseTeacher.mobileNo);
    }
}
