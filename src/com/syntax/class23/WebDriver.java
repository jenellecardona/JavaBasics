package com.syntax.class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openURL(String url){
        System.out.println("opening "+url);
    }
    public void testLoginPage(){
        System.out.println("checking if login page is visible");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    
    @Override
    public void startBrowser() {
        System.out.println("opening google chrome");
    }

    @Override
    public void openURL(String url) {
        System.out.println("opening the URL");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on google chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class FireFox extends WebDriver{
    
    @Override
    public void startBrowser() {
        System.out.println("starting the FireFox");
    }

    @Override
    public void openURL(String url) {
        System.out.println("opening the URL "+url+" on FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the FireFox");
    }
}
class Safari extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("starting the Safari");
    }

    @Override
    public void openURL(String url) {
        System.out.println("opening the URL "+url+" on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Safari");
    }
}
class Edge extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("starting the Edge");
    }

    @Override
    public void openURL(String url) {
        System.out.println("opening the URL "+url+" on Edge");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Edge");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Edge");
    }
}

