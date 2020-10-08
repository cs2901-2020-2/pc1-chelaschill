import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistAppTest {

    @Test(expectedExceptions = FailException.class)
    public void vacio() throws Exception{
        RegistrApp.registrar();
    }

    @Test(invocationCount = 100, threadPoolSize = 100)
    public void testCase3() throws Exception {
        long startTime = System.currentTimeMillis();
        generic(0);
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        Assert.assertTrue(timeElapsed < 100);
    }

    private void generic(int i) throws Exception,FailException {
        RegistrApp Clase1 = new RegistrApp();
    }

}
