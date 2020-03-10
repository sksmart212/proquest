package proquest;

import org.eclipse.jetty.util.IO;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage{
    private IO FileUtils;
    static String TestFile;//instance variable

    //Clicking element
    public  void clickElement(By by)
    {
        driver.findElement(by).click();
    }

    //method for getting text from web
    public  String getTextFromElement(By by) {
        String actualText = driver.findElement(by).getText();
        System.out.println(actualText);
        return actualText;
    }

    public  String assertTextMessage(String expected, By by) {
        String actual = getTextFromElement(by);
        // Assert.assertEquals(expected, actual);
        System.out.println(actual);
        return actual;
    }

    public static void createResultsFile() throws IOException {
        LoadProp prop=new LoadProp();
        String sFilename= prop.getProperty("filename");
        TestFile="src\\main\\" + sFilename;
        File FC = new File(TestFile);//Created object of java File class.
        FC.createNewFile();//Create file.

    }

    public static void writeTOFile(String swrite) throws IOException {

        //Writing In to file.
        //Create Object of java FileWriter and BufferedWriter class.
        FileWriter FW = new FileWriter(TestFile,true);

        BufferedWriter BW = new BufferedWriter(FW);
        BW.write(swrite); //Writing In To File.
        BW.newLine();//To write next string on new line
        BW.close();
    }

    //GetURL
    public static void currentURL(String text)
    {
        driver.get(text);

    }

    //Wait for fixed time given in seconds
    public  void waitForFixedTimeGivenInSecond(long time_in_seconds)
    {
        WebDriverWait wait = new WebDriverWait(driver,time_in_seconds);
        driver.manage().timeouts().implicitlyWait(time_in_seconds, TimeUnit.SECONDS);


}

    //take screenshot of current display(full)
    public void capturescreenshot(String sName)
    {
        try{
            TakesScreenshot screenshot  =(TakesScreenshot)driver;  /*create object as it is interface*/
            File source =screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./Screenshots/"+ sName + ".png"));

        }
        catch  (java.io.IOException e)
        {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }

    }}
