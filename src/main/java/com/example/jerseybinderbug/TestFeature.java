package com.example.jerseybinderbug;

import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;

public class TestFeature implements Feature {

    @Override
    public boolean configure(FeatureContext context) {
        Configuration config = context.getConfiguration();

        // avoid double registration
        if (!config.isRegistered(TestFilter.class)) {
            context.register(new TestContextBinder());
            // Registers the filter.
            context.register(TestFilter.class);
            return true;
        }
        return false;
    }

}
