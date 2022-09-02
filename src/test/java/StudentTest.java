import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private Student emptyStudent;
    private Student testStudent;
    private ArrayList<Integer> emptyGrades;
    private ArrayList<Integer> testGrades;

    @Before
    public void setUp() {
        emptyStudent = new Student();
        emptyGrades = new ArrayList<>();

        testStudent = new Student(12345, "John Doe");
        testStudent.addGrade(80);
        testStudent.addGrade(100);
        testStudent.addGrade(50);
        testStudent.addGrade(98);
        testStudent.addGrade(89);

        testGrades = new ArrayList<>();
        testGrades.add(80);
        testGrades.add(100);
        testGrades.add(50);
        testGrades.add(98);
        testGrades.add(89);
    }
    @Test
    public void testGetID() {
        assertEquals(0, emptyStudent.getId());
        assertEquals(12345, testStudent.getId());
        Student otherTestStudent = new Student(23456, "Name");
        assertEquals(23456, otherTestStudent.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("", emptyStudent.getName());
        assertEquals("John Doe", testStudent.getName());
        Student otherTestStudent = new Student(23456, "Name");
        assertEquals("Name", otherTestStudent.getName());
    }

    @Test
    public void testGetGrades() {
        assertEquals(emptyGrades, emptyStudent.getGrades());
        assertEquals(testGrades, testStudent.getGrades());
    }

    @Test
    public void testAddGrades() {
        testStudent.addGrade(50);
        testGrades.add(50);
        assertEquals(testGrades, testStudent.getGrades());
        testStudent.addGrade(87);
        testGrades.add(87);
        assertEquals(testGrades, testStudent.getGrades());
    }

    @Test
    public void testGetGradeAverage() {
        Integer totalGrades = 0;
        double gradeAverage;
        for(Integer grade : testGrades) {
            totalGrades += grade;
        }
        gradeAverage = totalGrades.doubleValue() / testGrades.size();
        assertEquals(gradeAverage, testStudent.getGradeAverage(), 0.1);
    }

    @Test
    public void testUpdateGrade() {
        testStudent.updateGrade(50, 100);
        for(int i = 0; i < testGrades.size(); i++) {
            if(testGrades.get(i) == 50) {
                testGrades.set(i, 100);
            }
        }
        assertEquals(testGrades, testStudent.getGrades());
    }

    @Test
    public void testDeleteGrade() {
        testGrades.remove(3);
        testStudent.deleteGrade(98);
        assertEquals(testGrades, testStudent.getGrades());
    }
}