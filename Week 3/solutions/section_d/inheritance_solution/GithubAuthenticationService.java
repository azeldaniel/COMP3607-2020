package solutions.section_d.inheritance_solution;

public class GithubAuthenticationService extends AuthenticationService {
    @Override
    public void authenticate() {
        System.out.println("Authenticating with Github");
    }
}
