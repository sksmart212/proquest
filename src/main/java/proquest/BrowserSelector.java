package proquest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserSelector extends Utils {

    public void setUpBrowser() {
        String Browser;//instance variable
        String URL;//instance variables

       LoadProp loadprop = new LoadProp();// creating object of loadprop class to call function of this class
       Browser = loadprop.getProperty("Browser");
       URL=loadprop.getProperty("url");
       System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");//set the property for chrome
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extension");
        options.addArguments("--disable-setUpBrowser-side-navigation");
        options.addArguments("--incognito");
        options.addArguments("--disable-blink-features-BlockCredentialeSubresources");
        driver=new ChromeDriver(options);//object of chrome driver
        driver.manage().window().fullscreen();//open the window screen full
        driver.navigate().to(URL);//for navigating url
        waitForFixedTimeGivenInSecond(50);
        //implicit wait means webdriver should  wait for all webelement  in webpage

       // driver.quit();//used to close the browser
    }

}
