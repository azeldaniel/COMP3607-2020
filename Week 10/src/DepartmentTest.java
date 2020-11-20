import org.junit.jupiter.api.AfterEach;
// Method is executed after each test method.

import org.junit.jupiter.api.AfterAll;
//Method is executed once after all test methods are executed. (Must be static)

import org.junit.jupiter.api.BeforeEach;
// Method is executed before each test method.

import org.junit.jupiter.api.BeforeAll;
//Method is executed once before all test methods are executed. (Must be static)

import org.junit.jupiter.api.Test;
// Denotes that a method is a test method.

import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTest {

    private Department dept;
    private Lecturer halley;

    public DepartmentTest() {

    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Executing before all...");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Executing before each...");
        dept = new Department();
        // dept's numLecturers should be 0
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Executing after all...");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Executing after each...");
    }

    @Test
    public void testGetNumLecturers() {
        System.out.println("Testing getNumLecturers()");
        int expected = 0;
        int result = dept.getNumLecturers();
        assertTrue(expected == result);
    }

    @Test
    public void testGetLecturers() {
        System.out.println("Testing getLecturers()");
        Lecturer[] result = dept.getLecturers();
        assertNotNull(result);
    }

    @Test
    public void testAddLecturer() {
        System.out.println("Testing addLecturer()");
        Lecturer result = dept.addLecturer("Halley", "Zu", "Senior Lecturer");
        assertNotNull(result);
    }

    @Test
    public void testGetLecturer() {
        System.out.println("Testing getLecturer()");
        Lecturer expected = halley;
        Lecturer actual = dept.getLecturer(10);
        assertEquals(expected, actual);
        assertNull(expected);
        assertNull(actual);
    }
}
