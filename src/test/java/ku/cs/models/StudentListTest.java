package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    static StudentList studentList;

    @BeforeAll
    static void init(){
        studentList = new StudentList();
    }

    @Test
    void testAddNewStudent(){
        studentList.addNewStudent("6710405460", "Hun");
        assertEquals("{id: '6710405460', name: 'Hun'}", studentList.findStudentById("6710405460"));
    }

    @Test
    void testAddNewStudent2(){
        studentList.addNewStudent("6710405460", "Hun", 6.25);
        assertEquals("{id: '6710405460', name: 'Hun', score: 6.25}", studentList.findStudentById("6710405460").toString());
    }

    @Test
    void testFindStudentById(){
        studentList.addNewStudent("6710405001", "tony", 0.0);
        studentList.addNewStudent("6710405002", "micael", 0.001);
        studentList.addNewStudent("6710405003", "jonathan", 0.0001);
        studentList.addNewStudent("6710405004", "praguyseang", 100.00);
        studentList.addNewStudent("6710405001", "tony", 0.0);
        assertEquals("{id: '6710405001', name: 'tony', score: 0.0}", studentList.findStudentById("6710405001").toString());
    }

    @Test
    void testFilterByName(){
        studentList.addNewStudent("6710405001", "tony", 0.0);
        studentList.addNewStudent("6710405002", "micael", 0.001);
        studentList.addNewStudent("6710405003", "jonathan", 0.0001);
        studentList.addNewStudent("6710405004", "praguyseang", 100.00);
        studentList.addNewStudent("6710405001", "tony", 0.0);
        assertEquals(1, studentList.filterByName("praguyseang").getStudents().size());
    }

    @Test
    void testGiveScoreToId(){
        studentList.addNewStudent("6710405001", "tony", 0.0);
        studentList.addNewStudent("6710405002", "micael", 0.001);
        studentList.addNewStudent("6710405003", "jonathan", 0.0001);
        studentList.addNewStudent("6710405004", "praguyseang", 100.00);
        studentList.addNewStudent("6710405001", "tony", 0.0);

        studentList.giveScoreToId("6710405001", 25.5);
        assertEquals(25.5, studentList.findStudentById("6710405001").getScore());
    }

    @Test
    void testViewGradeOfId(){
        studentList.addNewStudent("6710405001", "tony", 0.0);
        studentList.addNewStudent("6710405002", "micael", 0.001);
        studentList.addNewStudent("6710405003", "jonathan", 0.0001);
        studentList.addNewStudent("6710405004", "praguyseang", 100.00);
        studentList.addNewStudent("6710405001", "tony", 0.0);
        assertEquals("A", studentList.viewGradeOfId("6710405004"));
    }
}