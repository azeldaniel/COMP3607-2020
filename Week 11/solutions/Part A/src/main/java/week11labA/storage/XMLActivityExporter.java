/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11labA.storage;

import week11labA.domain.Activity;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBException;  

/**
 *
 * @author phaedramohammed
 */
public class XMLActivityExporter implements ActivityExporter {
     public void exportActivity(Activity a) throws IOException, JAXBException{
        JAXBContext contextObj = JAXBContext.newInstance(Activity.class);  
        Marshaller marshallerObj = contextObj.createMarshaller();  
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
        marshallerObj.marshal(a, new FileOutputStream("src/files/"+a.getFilename()+".xml")); 
        
        
     }
}
