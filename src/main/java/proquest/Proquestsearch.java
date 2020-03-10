package proquest;

import org.eclipse.jdt.internal.compiler.lookup.CaptureBinding;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Proquestsearch extends Utils {

;

    public void retrieveSearchResults() throws InterruptedException {

        LoadProp prop = new  LoadProp();//creating object of loadprop class

        driver.findElement(By.name("q")).sendKeys("proquest");//locator for  search box and enter the word proquest

        driver.findElement(By.xpath("//input[@class='gNO89b'and @value='Google Search']")).sendKeys(Keys.ENTER);//locator for google search box and press enter
        driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();//locator to go on proquest site
        driver.switchTo().frame(0);//this is command for handle the frame in the webpage
        Thread.sleep(10000);//wait driver for given time
        driver.findElement(By.xpath("//a[@class='call']")).click();//locator for the cookies
        driver.switchTo().defaultContent();//selects  the main document when a page contains i frames
        driver.switchTo().frame(0);//for handling the frames  we use this command

        Thread.sleep(10000);//wait driver for given period of time
        driver.findElement(By.id("gwt-debug-close_id")).click();//locator for close button
        driver.switchTo().defaultContent();//elects  the main document when a page contains i frames
        Thread.sleep(5000);//wait driver for given period of time

        driver.findElement(By.xpath("//div[@id='wrap']/nav/div/div[@id='main-navbar-collapse']/ul/li[8]/a/i"))
                .click();//locator for search box

        //locator for passing the value  QA in search box
        driver.findElement(By.xpath("//div[@id='wrap']/nav/div/div[@id='main-navbar-collapse']/ul/li[8]/ul/li/form/div/span[1]/input[2]")).sendKeys("QA");


        driver.findElement(By.xpath("//div[@id='wrap']/nav/div/div[@id='main-navbar-collapse']/ul/li[8]/ul/li/form/div/span[2]/button")).click();
        //locator for click on search button

    }
    //this method is used to capture screenshot
    public void capturescreenshot(String filename) {
        Utils utils =new Utils();
        utils.capturescreenshot(filename);
                    }
}

