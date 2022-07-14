package com.syntax.class23;

public class BrowserTester {
    public static void main(String[] args) {
        WebDriver[] b={new Chrome(),new Safari(), new FireFox(), new Edge()};
        for(WebDriver browser:b){
            browser.startBrowser();
            browser.openURL("www.google.com");
            browser.testLoginPage();
            browser.closeBrowser();
        }

    }
}
