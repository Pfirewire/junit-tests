import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class CohortTest {

    private Cohort emptyCohort;
    private Cohort testCohort;
    private Student student1;
    private Student student2;

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
        testCohort.addStudent(student1);
        testCohort.addStudent(student2);
    }

    @Test
    public void testAddStudent() {
        assertTrue(emptyCohort.isEmpty());
        emptyCohort.addStudent(student1);
        emptyCohort.addStudent(student2);
        assertFalse(emptyCohort.isEmpty());
    }

}
