package org.example.properties.convertors;

import org.example.enumeration.SupportedBrowsers;

public class SupportedBrowserConverter {
    public static SupportedBrowsers valueOfWebBrowser(String webBrowserName){
        return switch (webBrowserName) {
            case "local_chrome" -> SupportedBrowsers.LOCAL_CHROME;
            case "local_firefox" -> SupportedBrowsers.LOCAL_FIREFOX;
            default -> throw new IllegalArgumentException("Incorrect browser name");
        };
    }
}
