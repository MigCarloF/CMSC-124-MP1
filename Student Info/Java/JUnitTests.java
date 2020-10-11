import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JUnitTests {
    @Test 
    public void testAddRemoveStudent(){
        StudentDossier sd = new StudentDossier();
        sd.addStudent(new Student("Dandi", 20, 1.0f, "Junior"));
        sd.addStudent(new Student("Carlo", 23, 1.5f, "Senior"));

        assertEquals(sd.getStudent(0).getName(), "Dandi");
        assertEquals(sd.getStudent(0).getAge(), 20);
        assertEquals(sd.getStudent(0).getGpa(), 1.0f, 1);
        assertEquals(sd.getStudent(0).getGradeLevel(), "Junior");

        assertEquals(sd.getStudent(1).getName(), "Carlo");
        assertEquals(sd.getStudent(1).getAge(), 23);
        assertEquals(sd.getStudent(1).getGpa(), 1.5f, 1);
        assertEquals(sd.getStudent(1).getGradeLevel(), "Senior");

        sd.list();

        sd.removeStudent(0);

        assertEquals(sd.getStudent(0).getName(), "Carlo");
        assertEquals(sd.getStudent(0).getAge(), 23);
        assertEquals(sd.getStudent(0).getGpa(), 1.5f, 1);
        assertEquals(sd.getStudent(0).getGradeLevel(), "Senior");
        sd.list();

    }
}
