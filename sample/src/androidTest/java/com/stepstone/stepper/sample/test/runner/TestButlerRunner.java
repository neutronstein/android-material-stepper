package com.stepstone.stepper.sample.test.runner;

import android.os.Bundle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnitRunner;

import com.linkedin.android.testbutler.TestButler;

/**
 * @author Piotr Zawadzki
 */
public class TestButlerRunner extends AndroidJUnitRunner {

    @Override
    public void onStart() {
        TestButler.setup(InstrumentationRegistry.getTargetContext());
        super.onStart();
    }

    @Override
    public void finish(int resultCode, Bundle results) {
        TestButler.teardown(InstrumentationRegistry.getTargetContext());
        super.finish(resultCode, results);
    }
}
