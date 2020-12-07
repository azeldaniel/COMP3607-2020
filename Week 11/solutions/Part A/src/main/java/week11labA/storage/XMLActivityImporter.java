/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11labA.storage;

import week11labA.domain.Activity;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author phaedramohammed
 */
public class XMLActivityImporter implements ActivityImporter {
    
    public Activity importActivity(String filename) throws Exception{
        File file = new File("src/files/"+filename +".xml");  
        JAXBContext jaxbContext = JAXBContext.newInstance(Activity.class);  
   
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Activity a= (Activity) jaxbUnmarshaller.unmarshal(file);   
        return a; 
    }

    
}
