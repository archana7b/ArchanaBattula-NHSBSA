package utils;

import java.io.File;

public class FilePaths
{
    public static String propertiesFilePath =  new File("src/main/resources/testData/config.properties").getAbsolutePath();
    public static String errorShotsPath = new File("src/main/resources/errorShorts").getAbsolutePath();

}
