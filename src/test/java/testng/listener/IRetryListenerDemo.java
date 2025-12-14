package testng.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryListenerDemo implements IRetryAnalyzer {

    int start = 0;
    int end = 1;
    @Override
    public boolean retry(ITestResult iTestResult) {
        while (start < end) {
            start++;
            return true;
        }
        return false;
    }
}
