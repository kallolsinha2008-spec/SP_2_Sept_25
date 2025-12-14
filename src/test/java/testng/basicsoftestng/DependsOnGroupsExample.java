package testng.basicsoftestng;

import org.testng.annotations.Test;

public class DependsOnGroupsExample {

    /*@Test(groups = {"smoke"})
    public void verifyFromToAccountSelection() {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(dependsOnGroups = "smoke")
    public void verifyFundTransfer() {
        System.out.println("Verify Home Dashboard");
    }*/

    @Test
    public void verifyCashBackOffer() {
        System.out.println("Account Creation");
    }

}
