package Question2;

import java.util.ArrayList;

public class Faculty implements UniversityOrganisationalElement {
    private ArrayList<UniversityOrganisationalElement> elements;
    private String name;

    public Faculty(String name) {
        this.name = name;
        elements = new ArrayList<UniversityOrganisationalElement>();
    }

    public int countEmployees() {
        int numEmployees = 0;
        for (UniversityOrganisationalElement e : elements)
            numEmployees += e.countEmployees();
        return numEmployees;
    }

    public void addUniversityOrganisationalElement(UniversityOrganisationalElement element) {
        elements.add(element);
    }

    public String getName() {
        return name;
    }
}
