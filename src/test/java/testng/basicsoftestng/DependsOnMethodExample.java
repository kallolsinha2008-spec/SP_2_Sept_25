package testng.basicsoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void verifyLogin() {
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }
    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomeDashboard() {
        System.out.println("Verify Home Dashboard");
    }

    @Test
    public void verifyAccountDashboard() {
        System.out.println("Account Creation");
    }

}
