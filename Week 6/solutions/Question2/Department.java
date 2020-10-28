package Question2;

import java.util.ArrayList;

public class Department implements UniversityOrganisationalElement {
    private ArrayList<UniversityOrganisationalElement> units;
    private String name;

    public Department(String name) {
        this.name = name;
        units = new ArrayList<UniversityOrganisationalElement>();
    }

    public int countEmployees() {
        int numEmployees = 0;
        for (UniversityOrganisationalElement e : units)
            numEmployees += e.countEmployees();
        return numEmployees;
    }

    public void addUniversityOrganisationalElement(UniversityOrganisationalElement unit) {
        units.add(unit);
    }

    public String getName() {
        return name;
    }
}
