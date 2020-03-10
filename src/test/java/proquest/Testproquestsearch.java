package proquest;

import org.junit.Test;

public class Testproquestsearch {
    // Test class to Search QA in the ProQuest Site
    @Test
    public  void testSearch() throws InterruptedException {
        BrowserSelector select=new BrowserSelector();//creating object
        select.setUpBrowser();
        Proquestsearch Questsearch = new Proquestsearch();//creating object of proquestsearch class
        Questsearch.retrieveSearchResults();//calling the function of proquestsearch class
        Questsearch.capturescreenshot("Home Page of ProQuest");
        //calling the  capture screenshotfunction of proquestsearch class
          }

          }
