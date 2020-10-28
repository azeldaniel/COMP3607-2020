import Question2.Faculty;
import Question2.Department;
import Question2.Unit;
import Question3.OnCommand;
import Question3.Projector;
import Question3.RemoteControl;
import Question3.OffCommand;
import Question1.Agent;

/**
 *
 * @author phaedramohammed
 */
public class Tutorial5 {

    public static void main(String[] args) {
        // TODO code application logic here
        question1();

        question2();

        question3();
    }

    public static void question1() {

        Agent agent = Agent.getAgent();
        agent.toString();
        agent.foo();
        
        for (int requests = 1; requests < 10; requests++) {
            //Agent bureau = new Agent();
            //System.out.println(Agent.getAgent());
        }
    }

    public static void question2(){
        Faculty fst = new Faculty("FST");        
        Department dcit = new Department("DCIT");
        Unit unit1 = new Unit("DCIT Unit 1");
        Unit unit2 = new Unit("DCIT Unit 2");
        Unit unit3 = new Unit("FST Unit");

        unit1.addEmployees(5);
        unit2.addEmployees(10);
        unit3.addEmployees(10);

        dcit.addUniversityOrganisationalElement(unit1);
        dcit.addUniversityOrganisationalElement(unit2);

        fst.addUniversityOrganisationalElement(dcit);
        fst.addUniversityOrganisationalElement(unit3);

        //System.out.println(dcit.countEmployees());
        //System.out.println(fst.countEmployees());
    }

    public static void question3(){

        Projector projector = new Projector();

        OnCommand onCommand = new OnCommand(projector);
        OffCommand offCommand = new OffCommand(projector);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(onCommand);
        remote.pressButton();

        remote.setCommand(offCommand);
        remote.pressButton();
    }
}
