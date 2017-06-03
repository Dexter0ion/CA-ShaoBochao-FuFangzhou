import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * Created by think on 2017/6/3.
 */
public class MapTest {
    Map mapTest;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void ifInitMap() throws Exception {
        int twidth=1;
        int theight=2;
        char[]tmapdata = new char[twidth*theight];
        mapTest = new Map(tmapdata,twidth,theight);
        assertThat(mapTest.getHeight(),is(theight));
    }
}