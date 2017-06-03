import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by think on 2017/6/3.
 */
public class HelloTest {
    Hello helloTest;

    @Before
    public void setUp() throws Exception {
        helloTest = new Hello();
    }

    @Test
    public void name() throws Exception {
        assertThat(helloTest.say(),is("nihao"));
    }
}