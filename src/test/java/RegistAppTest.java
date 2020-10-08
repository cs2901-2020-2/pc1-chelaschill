import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistAppTest {

    @Test(expectedExceptions = FailException.class)
    public void vacio() throws Exception{
        RegistrApp.registrar();
    }

    @Test(invocationCount = 100, threadPoolSize = 100)
    public void Test2() throws Exception {
        long inicio = System.currentTimeMillis();
        generic(0);
        long end = System.currentTimeMillis();
        long total = end - inicio;
        Assert.assertTrue(total < 100);
    }

    private void generic(int i) throws Exception,FailException {
        RegistrApp Clase1 = new RegistrApp();
    }

}
