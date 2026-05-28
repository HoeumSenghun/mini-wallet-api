package com.wallet;

import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        // auto-scan all classes in these packages
        packages("com.wallet.controller", "com.wallet.filter");
        register(org.glassfish.jersey.jackson.JacksonFeature.class);
    }
}
