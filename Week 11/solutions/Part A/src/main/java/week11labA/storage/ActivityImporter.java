
package week11labA.storage;
import java.lang.Exception;
import week11labA.domain.Activity;

/**
 *
 * @author phaedramohammed
 */
public interface ActivityImporter {
    public Activity importActivity(String filename) throws Exception;
}
