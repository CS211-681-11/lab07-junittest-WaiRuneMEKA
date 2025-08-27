package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    static StudentList studentList;
    static StudentHardCodeDatasource datasource;

    @BeforeAll
    static void init(){
        datasource = new StudentHardCodeDatasource();
    }

    @Test
    void testReadData() {
        studentList = datasource.readData();

        assertEquals(4, studentList.getStudents().size());
        assertEquals("First", studentList.findStudentById("6710400001").getName()); // ตรวจสอบว่าชื่อถูกต้อง
        assertEquals("Fourth", studentList.findStudentById("6710400004").getName());
    }
}