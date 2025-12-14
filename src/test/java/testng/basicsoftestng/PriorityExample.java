package testng.basicsoftestng;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;
import testng.listener.IRetryListenerDemo;

public class PriorityExample {

    @Test(priority = -5, retryAnalyzer = IRetryListenerDemo.class)
    public void caseX() {
        Assert.assertTrue(false);
        System.out.println("Case X");
    }

    @Test(priority = 2, retryAnalyzer = IRetryListenerDemo.class)
    public void caseK() {
        System.out.println("Case K");
    }

    @Test(retryAnalyzer = IRetryListenerDemo.class)  //Default priority = 0
    public void caseQ() {
        System.out.println("Case Q");
    }

    @Test(priority = 4, retryAnalyzer = IRetryListenerDemo.class)
    public void caseP() {
        System.out.println("Case P");
    }

    @Test(priority = 5, retryAnalyzer = IRetryListenerDemo.class)
    public void caseB() {
        System.out.println("Case B");
    }

    @Test(priority = 6, retryAnalyzer = IRetryListenerDemo.class)
    public void caseA() {
        System.out.println("Case A");
    }
}
