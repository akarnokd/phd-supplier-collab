package com.github.akarnokd.scp.gui;

import java.util.*;

import org.eclipse.rap.rwt.application.*;
import org.eclipse.rap.rwt.client.WebClient;

/** RWT Application configuration. */
public class SCPConfiguration implements ApplicationConfiguration {
    @Override
    public void configure(Application application) {
        Map<String, String> properties = new HashMap<>();
        properties.put(WebClient.PAGE_TITLE, "Supplier Collaboration Platform");
        properties.put(WebClient.THEME_ID, "business");
        application.addStyleSheet("business", "theme/business/business.css");
        application.addEntryPoint("/login", SCPEntryPointLogin.class, properties);
        application.addEntryPoint("/main", SCPEntryPoint.class, properties);
    }
}