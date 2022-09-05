package org.example.pageobject;

import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage {
    private String categoryPath = "/s?k=gaming+keyboard&pd_rd_r=da8afc49-fa94-41c3-9d45-7e811ac33b10&pd_rd_w=gSHhP&pd_rd_wg"
            + "=fx882&pf_rd_p=12129333-2117-4490-9c17-6d31baf0582a&pf_rd_r=XYWA244WM0H05HEYD0RE&ref=pd_gw_unk";

    public IndexPage(WebDriver webDriver) {
        super(webDriver);
    }

    public IndexPage openIndexPage() {
        webDriver.get("https://www.amazon.com");
        return this;
    }

    public GamingKeyboardsCategoryPage openGamingKeyboardsPage() {
        webDriver.get("https://www.amazon.com" + categoryPath);
        return new GamingKeyboardsCategoryPage(webDriver);
    }




}
