
package week11labA.domain;
import java.util.ArrayList;
import java.util.Random ;

//import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  
  
/**
 *
 * @author phaedramohammed
 */
@XmlRootElement 
public class Activity {
    private String question;
    private String answer;
    private String filename;
    private static int filenameCounter=0;
    private ArrayList<String> hints;
    
    
    @XmlElement 
    public String getQuestion() {
        return question;
    }
    @XmlElement 
    public String getAnswer() {
        return answer;
    }
    @XmlElement 
    public String getFilename(){
        return filename;
    }
    
    public void setQuestion(String question) {
        this.question = question;
    }   
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Activity(){
        hints = new ArrayList<String>();
        setFilename();
        generateRandomValues();
    }
    
    private void generateRandomValues(){
        int operand1 =  new Random().nextInt(400);
        int operand2 =  new Random().nextInt(400);
        generateQuestion(operand1, operand2);
        setAnswer(operand1, operand2);
    }
    
    private void generateQuestion(int operand1, int operand2){
        question = "What is ";
        question += operand1 + " + " +operand2 + "?";
    }
    
    private void setAnswer(int operand1, int operand2){
        answer = ""+ (operand1 + operand2);
    }
    
    public void addHint(String hint){
        hints.add(hint);
    }
    
    private void setFilename(){
        filename = "activity" + filenameCounter;
        filenameCounter++;
    }
    
    @Override
    public String toString() {
        return "Activity{" + "question=" + question + ", answer=" + answer + '}';
    }
    
}
