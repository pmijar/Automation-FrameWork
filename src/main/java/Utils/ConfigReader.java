package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ConfigReader {

    public static HashMap<String, String> Config_Params  = getProperty();

    public static HashMap<String, String> getProperty() {
        Properties properties = new Properties();
        HashMap<String, String> propValues = new HashMap<String, String>();

        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +
                    "/src/main/resources/config.properties");
            properties.load(fis);
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

        Set<Object> keys = properties.keySet();
        for (Object k : keys) {
            String key = (String) k;
            String value = properties.getProperty((String) k);
            propValues.put(key, value);
        //    System.out.println(propValues.get(key));
        }
        return propValues;
    }

}
