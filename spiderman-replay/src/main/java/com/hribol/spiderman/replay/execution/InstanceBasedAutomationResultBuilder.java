package com.hribol.spiderman.replay.execution;

import com.hribol.spiderman.replay.report.AutomationResult;

import java.util.concurrent.TimeoutException;

/**
 * Created by hvrigazov on 20.05.17.
 */
public class InstanceBasedAutomationResultBuilder implements AutomationResultBuilder {
    @Override
    public AutomationResult buildAutomationResult(Throwable throwable) {
        if (throwable instanceof AssertionError) {
            return AutomationResult.ASSERTION_ERROR;
        } else if (throwable instanceof TimeoutException) {
            return AutomationResult.TIMEOUT;
        } else if (throwable instanceof InterruptedException) {
            return AutomationResult.INTERRUPTED;
        } else if (throwable instanceof org.openqa.selenium.TimeoutException) {
            return AutomationResult.TIMEOUT;
        }

        return AutomationResult.UNRECOGNIZED_EXCEPTION;
    }
}
