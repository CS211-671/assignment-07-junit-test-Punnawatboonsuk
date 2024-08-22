package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    void testfindstudent(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("66104","pun",50);
        studentList.addNewStudent("66105","net",80);
        studentList.addNewStudent("66106","oat",20);

        Student actual = studentList.findStudentById("66104");
        String expected = "pun";
        assertEquals(expected,actual.getName());


    }


    @Test

    void testgiveScoreToId(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("66104","pun",50);
        studentList.addNewStudent("66105","net",80);
        studentList.addNewStudent("66106","oat",20);

        studentList.giveScoreToId("66106",30);

        double expected = 50;
        double actual = studentList.findStudentById("66106").getScore();
        assertEquals(expected,actual);


    }


    @Test

    void testviewGradeOfId(){

        StudentList studentList = new StudentList();
        studentList.addNewStudent("66104","pun",50);
        studentList.addNewStudent("66105","net",80);
        studentList.addNewStudent("66106","oat",20);

        String expected = "A";
        String actual = studentList.viewGradeOfId("66105");
        assertEquals(expected,actual);
    }

}