package de.Alienlive.wrt;

import de.Alienlive.wrt.manager.WRTFileManager;

import java.io.IOException;

public class WRT {

    public static WRTFile create(String name, String identifiers) throws IOException {
        WRTFileManager.create(name, identifiers);
        return new WRTFile(name);
    }

    public static WRTFile open(String name) {
        return new WRTFile(name);
    }

    public static void edit(WRTFile wrt, String identifiers, boolean confirm) {

    }

    public static void delete(WRTFile wrt, boolean confirm) {

    }
}
