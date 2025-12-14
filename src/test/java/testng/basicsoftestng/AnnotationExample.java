package testng.basicsoftestng;

import org.testng.annotations.*;

public class AnnotationExample {

    @BeforeSuite
    public void beforeSuiteDemo() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuiteDemo() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTestDemo() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTestDemo() {
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClassDemo() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClassDemo() {
        System.out.println("After Class");
    }

    @BeforeMethod
    public void PreRequisite() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void potAction() {
        System.out.println("After Method");
    }

    @Test(groups = "smoke")
    public void testCase1() {
        System.out.println("Test Case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("Test Case 2");
    }
}
