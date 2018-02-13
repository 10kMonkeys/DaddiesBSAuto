package DaddiesBoardShop.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Properties;

public class UsersProperties implements Serializable {
    public final static UsersProperties INSTANCE = new UsersProperties();

    private Properties prop = null;

    public UsersProperties() {
        prop = new Properties();

        try {
            FileInputStream file = new FileInputStream(new File("users.properties"));
            prop.load(file);
        } catch (Exception e) {
            System.out.println("Error: users.properties file is not found.");
        }
    }

    public synchronized String getProperty(String key) {
        String value = null;

        if (prop.containsKey(key)) {
            value = (String) prop.get(key);
        } else {
            System.out.println(key + " is not found");
        }
        return value;
    }

    public synchronized void setProperty(String key, String value) {
        if (prop.containsKey(key)) {
            prop.setProperty(key, value);

            try {
                FileOutputStream file = new FileOutputStream(new File("users.properties"));
                prop.store(file, "");
            } catch (Exception e) {
                System.out.println("Can't store " + value + "into user.properties");
            }
        } else {
            System.out.println(key + " is not found");
        }
    }
}
