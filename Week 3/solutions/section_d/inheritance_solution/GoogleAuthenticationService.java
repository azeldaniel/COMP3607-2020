package solutions.section_d.inheritance_solution;

public class GoogleAuthenticationService extends AuthenticationService {
    @Override
    public void authenticate() {
        System.out.println("Authenticating with Google");
    }
}
