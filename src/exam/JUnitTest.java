package exam;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 42160 on 2017/3/20.
 */
public class JUnitTest {
    @Test
    public void testArea() {
        Rectangle r = new Rectangle(3, 4);
        TestCase.assertEquals(12.0, r.area());
    }

    @Test
    public void testIllegalInput() {
        Rectangle r1 = new Rectangle(0, 1);
        Rectangle r2 = new Rectangle(1, 0);
        Rectangle r3 = new Rectangle(0, 0);
        Rectangle r4 = new Rectangle(-1, 1);
        Rectangle r5 = new Rectangle(1, -1);
        Rectangle r6 = new Rectangle(100.1, 50);
        Rectangle r7 = new Rectangle(50, 75.1);

    }


}
