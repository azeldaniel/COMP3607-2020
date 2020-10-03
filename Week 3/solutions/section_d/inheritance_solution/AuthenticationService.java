package solutions.section_d.inheritance_solution;

public class AuthenticationService {

    public AuthenticationService() {
        super();
    }

    public void authenticate() {
        /*
         * Note that a small problem arises if we use the generic AuthenticationService
         * class as there will be no real implementation here. The implementation will
         * only be in the subclasses.
         */
        System.out.println("Some generic auth service");
    }
}
