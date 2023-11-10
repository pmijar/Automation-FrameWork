package Utils;

public class Global_Variables {
    public static final int EXPLICIT_TIMEOUT = 9;
  // public static final String BASE_URL = ConfigReader.getProperty().get("base_url");
  // public static final String BROWSER = ConfigReader.getProperty().get("browser");

     public static final String BASE_URL = ConfigReader.Config_Params.get("base_url");
     public static final String BROWSER = ConfigReader.Config_Params.get("browser");
}
