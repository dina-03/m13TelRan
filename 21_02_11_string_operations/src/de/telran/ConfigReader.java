package de.telran;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.List;

public class ConfigReader {

    private static final String DEFAULT_PATHS = "paths";
    Properties properties;

    ConfigReader(String filePaths) throws IOException {
        properties = new Properties();
        properties.load(new FileReader(filePaths));
    }

    public List<String> getOperationPaths() {
        String pathsStr = properties.getProperty(DEFAULT_PATHS);
        String[] pathArray = pathsStr.split(",");
        return Arrays.asList(pathArray);
    }

}
