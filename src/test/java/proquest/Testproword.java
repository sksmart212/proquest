package proquest;

import org.junit.Test;

public class Testproword {

    // Test Class to Fetch ProQuest Results from Google
    @Test
    public void testProword() throws InterruptedException {

        BrowserSelector select = new BrowserSelector();//creating object;
        select.setUpBrowser();
        Proquestword Questsword = new Proquestword();//creating object of proquestword class
        Questsword.fetchResults();//calling the function of proquest class
    }}
