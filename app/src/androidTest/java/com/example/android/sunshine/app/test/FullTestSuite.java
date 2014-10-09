package com.example.android.sunshine.app.test;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;

/**
 * Created by jerem_000 on 2014-10-09.
 */
public class FullTestSuite {
    public static Test suite() {
        return new TestSuiteBuilder(FullTestSuite.class)
                .includeAllPackagesUnderHere().build();
    }

    public FullTestSuite() {
        super();
    }
}
