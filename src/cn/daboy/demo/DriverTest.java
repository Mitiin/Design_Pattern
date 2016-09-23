package cn.daboy.demo;


import junit.framework.TestCase;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

/**
 * Created by Administrator on 2016/9/23.
 */
public class DriverTest extends TestCase {
    Mockery context = new JUnit4Mockery();
    @Test
    public void testDriver() {
        final ICar car = context.mock(ICar.class);
        IDriver driver = new Driver();
        context.checking(new Expectations(){
            {
                oneOf(car).run();
            }
        });
        driver.driver(car);
    }
}
