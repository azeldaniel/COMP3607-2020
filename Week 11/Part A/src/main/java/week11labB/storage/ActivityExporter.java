
package week11labB.storage;
import week11labB.domain.Activity;
import java.lang.Exception;
/**
 *
 * @author phaedramohammed
 */
public interface ActivityExporter {
    public void exportActivity(Activity a) throws Exception;
    
}
