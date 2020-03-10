package proquest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.List;

//Class to Search ProQuest Results on Google and storing them in file
public class Proquestword extends Utils {
    LoadProp prop = new  LoadProp();//object of load prop class

    public void fetchResults() throws InterruptedException {
     driver.findElement(By.name("q")).sendKeys("proquest");//locator for  search box and enter the word proquest
        driver.findElement(By.xpath("//input[@class='gNO89b'and @value='Google Search']")).sendKeys(Keys.ENTER);
        //locator to press enter

        Thread.sleep(10000);//wait driver for given period of time
        List<WebElement> list= driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));//locator for proquest links

        try {
            createResultsFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //String listitems;
        for(int iText = 0; list.size() > iText; iText++){
            // listitems =list.get(iText).getText();
            try {
                writeTOFile(list.get(iText).getText());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }




}
