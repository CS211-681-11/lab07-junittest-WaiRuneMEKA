package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;
    @BeforeAll
    //@BeforeEach
    static void init(){
        s = new Student("671040xxxx", "test");
    }

    @Test
    @DisplayName("Test add score")
    void testAddScore(){
        s.addScore(40.1);
        assertEquals(40.1, s.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s = new Student("671040xxxx", "test");
        s.addScore(90);
        assertEquals("A", s.getGrade());
    }

    @Test
    void testChangeName(){
        String checkName = "Prayut";
        assertEquals("Prayut", s.getName());
    }

    @Test
    void testIsId(){
        String checkId = "671040xxxx";
        assertEquals(true, s.isId(checkId));
    }

    @Test
    void testIsNameContains(){
        String checkNameContains = "test";
        assertEquals(true, s.isNameContains(checkNameContains));
    }
}