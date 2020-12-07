
package week11labA.storage;
import week11labA.domain.Activity;
import java.lang.Exception;
/**
 *
 * @author phaedramohammed
 */
public interface ActivityExporter {
    public void exportActivity(Activity a) throws Exception;
    
}
