package testng.basicsoftestng;

import org.testng.annotations.Test;

public class TestNGAttribute {

    @Test(invocationCount = 1000, invocationTimeOut = 1)
    public void caseT() {
        System.out.println("Case T");
    }
}
