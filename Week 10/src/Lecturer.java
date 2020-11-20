public class Lecturer {

    // State attributes of Lecturer
    private String firstName;
    private String lastName;
    private String position;
    private double salary;
    private int ID;

    private static int IDCounter = 10; // used to assign unique ID numbers

    // Constructor
    public Lecturer(String fName, String lName, String posn) {
        firstName = fName;
        lastName = lName;
        position = posn;
        salary = 0;

        ID = IDCounter;
        IDCounter = IDCounter + 10;

        assignSalary();
    }

    // Accessors
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    private void assignSalary() {
        switch (position) {
            case "Assistant Lecturer":
                salary = 5000.00;
                break;
            case "Lecturer":
                salary = 10000.00;
                break;
            case "Senior Lecturer":
                salary = 15000.00;
                break;
            default:
                salary = 0;

        }
    }
}
