package jp.mydns.akanekodou;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SampleTest {
    public static Sample target;

    @BeforeClass
    public static void getTestClass() {
        target = new Sample();
    }

    @Test
    public void testHello() {
        String expected = "Hello, AspectJ.";
        String actual = target.hello();
        assertThat("Failed!", actual, is(expected));
    }
}
