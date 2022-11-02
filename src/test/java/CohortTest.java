import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {

    private Cohort emptyCohort;
    private Cohort testCohort;
    private Student student1;
    private Student student2;
    private Student student3;

    @Before
    public void setUp() {
        emptyCohort = new Cohort();
        testCohort = new Cohort();
        student1 = new Student(12345, "John Doe");
        student1.addGrade(100);
        student1.addGrade(77);
        student1.addGrade(98);
        student1.addGrade(85);
        student1.addGrade(93);
        student2 = new Student(12346, "Jane Dee");
        student2.addGrade(66);
        student2.addGrade(79);
        student2.addGrade(82);
        student2.addGrade(77);
        student2.addGrade(88);
        student3 = new Student(12347, "Joan Doo");
        student3.addGrade(44);
        student3.addGrade(98);
        student3.addGrade(59);
        student3.addGrade(66);
        student3.addGrade(33);
        testCohort.addStudent(student1);
        testCohort.addStudent(student2);
        testCohort.addStudent(student3);
    }

    @Test
    public void testAddStudent() {
        assertTrue(emptyCohort.isEmpty());
        assertFalse(testCohort.isEmpty());
    }

    @Test
    public void testGetStudents() {
        ArrayList<Student> studentList = new ArrayList<>(List.of(student1, student2, student3));
        assertEquals(studentList.get(0), testCohort.getStudents().get(0));
        assertEquals(studentList.get(1), testCohort.getStudents().get(1));
        assertEquals(studentList.get(2), testCohort.getStudents().get(2));
    }

    @Test
    public void testGetCohortAverage() {
        double cohortAverage = (student1.getGradeAverage() + student2.getGradeAverage() + student3.getGradeAverage()) / 3;
        assertEquals(cohortAverage, testCohort.getCohortAverage(), 0.0001);
    }

}
