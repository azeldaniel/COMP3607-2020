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

public class LecturerTest {

    private Lecturer bob;

    public LecturerTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Executing before all...");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Executing before each...");
        bob = new Lecturer("Bob", "Doe", "Assistant Lecturer");
        // Bob's ID should be 10 and his salary should be 5000
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
    public void testGetFirstName() {
        System.out.println("Testing getFirstName()");
        String expected = "Bob";
        String result = bob.getFirstName();
        assertEquals(expected, result);
    }

    @Test
    public void testGetLastName() {
        System.out.println("Testing getLastName()");
        String expected = "Doe";
        String result = bob.getLastName();
        assertEquals(expected, result);
    }

    @Test
    public void testGetPosition() {
        System.out.println("Testing getPosition()");
        String expected = "Assistant Lecturer";
        String results = bob.getPosition();
        assertEquals(expected, results);
    }

    @Test
    public void testGetSalary() {
        System.out.println("Testing getSalary()");
        double expected = 5000.00;
        double actual = bob.getSalary();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetID() {
        System.out.println("Testing getID()");
        Lecturer phil = new Lecturer("Phillip", "Head", "Lecturer");
        int expected = bob.getID() + 10;
        int actual = phil.getID();
        assertEquals(expected, actual);
    }
}
