/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11labA.storage;

import java.io.File;
import java.io.IOException;
import week11labA.domain.Activity;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 *
 * @author phaedramohammed
 */
public class JSONActivityExporter implements ActivityExporter{
    
    
    public void exportActivity(Activity a) throws JsonGenerationException, 
                                           JsonMappingException, IOException{
      ObjectMapper mapper = new ObjectMapper();	
      mapper.writeValue(new File("src/files/"+a.getFilename()+".json"), a);
     
    }
}
    

