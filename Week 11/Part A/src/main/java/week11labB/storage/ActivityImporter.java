
package week11labB.storage;
import java.lang.Exception;
import week11labB.domain.Activity;

/**
 *
 * @author phaedramohammed
 */
public interface ActivityImporter {
    public Activity importActivity(String filename) throws Exception;
}
