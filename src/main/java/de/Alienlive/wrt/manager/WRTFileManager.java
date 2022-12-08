package de.Alienlive.wrt.manager;

import java.io.File;
import java.io.IOException;

public class WRTFileManager {

    public static boolean checkFileExist(String name) {
        File wrt = new File("./wrtdata/" + name + ".wrt");
        if (!wrt.exists()) {
            throw new RuntimeException("[WRT]: File '" + name + "' does not exist");
        }
        return true;
    }

    public static void create(String name, String identifiers) throws IOException {
        checkFileExist(name);
        File wrt = new File("./wrtdata/" + name + ".wrt");
        wrt.createNewFile();
    }
}
