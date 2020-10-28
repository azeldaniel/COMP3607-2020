package Question2;

public class Unit implements UniversityOrganisationalElement {

    private int numEmployees;
    private String name;

    public Unit(String name) {
        this.name = name;
        numEmployees = 0;
    }

    public void addEmployees(int num) {
        numEmployees = numEmployees + num;
    }

    public int countEmployees() {
        return numEmployees;
    }

    public String getName() {
        return name;
    }
}
