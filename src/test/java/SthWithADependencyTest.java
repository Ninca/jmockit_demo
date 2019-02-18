import org.junit.Assert;
import org.junit.Test;

import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;

// https://stackoverflow.com/questions/53910097/run-jmockit-in-intelijidea
//@RunWith(JMockit.class)
public class SthWithADependencyTest {

    @Injectable
    private ADep adep;

    @Tested
    private SthWithADependency sthWithADependency;

    @Test
    public void test() {
        new mockit.Expectations(){{
           adep.isSth(anyString); result = false;
        }};

        final boolean result = sthWithADependency.determineSth("bla");
        Assert.assertFalse(result);
    }


}
