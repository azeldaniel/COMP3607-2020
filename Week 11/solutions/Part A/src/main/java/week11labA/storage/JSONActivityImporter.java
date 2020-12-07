/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11labA.storage;

import week11labA.domain.Activity;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author phaedramohammed
 */
public class JSONActivityImporter implements ActivityImporter {


     public Activity importActivity(String filename) throws JsonParseException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        Activity a = mapper.readValue(new File("src/files/"+filename+".json"), Activity.class);
        return a;
   }
    
}
