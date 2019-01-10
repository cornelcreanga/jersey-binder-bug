package com.example.jerseybinderbug;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.jersey.ResourceConfigCustomizer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration implements ResourceConfigCustomizer {

    @Override
    public void customize(ResourceConfig config) {

        config.register(TestFeature.class);
    }
}
