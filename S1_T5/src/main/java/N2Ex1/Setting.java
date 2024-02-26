package N2Ex1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Setting {

    private final Properties PROPERTIES;

    public Setting(String settingFile) {
        PROPERTIES = new Properties();
        try (FileInputStream input = new FileInputStream(settingFile)) {
            PROPERTIES.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDirectoryToBeRead() {
        return PROPERTIES.getProperty("directoryToBeRead");
    }

    public String getResultingTXTFile() {
        return PROPERTIES.getProperty("resultingTXTFile");
    }
}
