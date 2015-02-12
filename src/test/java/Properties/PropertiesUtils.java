package Properties;

import Utils.PropertiesReader;

import java.util.Properties;


abstract class PropertiesUtils {

    public Properties search;

    {
        search = PropertiesReader.readProperties("values.properties");
    }
}
