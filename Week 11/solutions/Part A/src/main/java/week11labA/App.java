package week11labA;
import week11labA.storage.*;
import week11labA.domain.*;
import java.util.ArrayList;

public final class App {
 
    public static void main(String[] args) {
        //Create a few activity objects
        ArrayList<Activity> exercises = new ArrayList<Activity>();
        for(int i=0; i<5; i++){
            exercises.add(new Activity());
        }
        
        //Declare Generic export/import objects
        ActivityExporter activityExporter;
        ActivityImporter activityImporter;
        
        // JSON export/import
        try{
            activityExporter = new JSONActivityExporter();
            for(Activity a: exercises)
                activityExporter.exportActivity(a);
            
            activityImporter = new JSONActivityImporter();
            for(Activity a: exercises){
                Activity importedA = activityImporter.importActivity(a.getFilename());
                System.out.println("From JSON: "+ importedA);
            }
        }
        catch(Exception eJSONException){
            System.out.println(eJSONException.getMessage());
        }
       
        //XML export/import
        try{
            activityExporter = new XMLActivityExporter();
            for(Activity a: exercises)
                activityExporter.exportActivity(a);
            
            activityImporter = new XMLActivityImporter();
            for(Activity a: exercises){
                Activity importedA = activityImporter.importActivity(a.getFilename());
                System.out.println("From XML: "+ importedA);
            }
        }
        catch(Exception eXMLException){
            System.out.println(eXMLException.getMessage());
        }
     
    }
}

