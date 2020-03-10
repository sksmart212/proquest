package proquest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp extends BasePage {
    Properties prop;//local variable
    FileInputStream input;//local variable
    String fileName="config.properties";/*create file config file*/
    String fileLocatio="src\\main\\Resources\\Properties\\";//path of config properties file where all enviorment variables



    public String getProperty(String key)

    {
        //how to read properties file
        prop=new Properties();//object of property class
        try
        {
            //file input stream  make the connection between java code and config file
            input=new FileInputStream( fileLocatio + fileName);//object of file input
            prop.load(input);//load all the properties which are available in config file
            input.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}


