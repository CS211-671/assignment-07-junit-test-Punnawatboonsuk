package ku.cs;

import ku.cs.models.Student;
import ku.cs.models.StudentList;

public class MainTestConsole {
    public static void main(String[] args) {
        StudentList students = new StudentList();
        students.addNewStudent("66104","pun",15);
        students.addNewStudent("66105","auto",20);
        students.addNewStudent("66106","j",5);

        Student s1 = new Student("66106","gay");
        System.out.print("using find by object method :");
        System.out.println(students.findStudentByObject(s1));
        // ตรงนี้จะได้ null
        System.out.print("using find by ID method :");
        System.out.println(students.findStudentById("66106"));

        // ตรงนี้จะได้ปริ้น object ของ student ?ที่มี name เป็น j



    }
}
