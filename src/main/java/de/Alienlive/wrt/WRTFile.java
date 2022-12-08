package de.Alienlive.wrt;

import de.Alienlive.wrt.manager.WRTDataManager;
import de.Alienlive.wrt.manager.WRTFileManager;

import java.io.IOException;

public class WRTFile {

    String name;

    public WRTFile(String name) {
        WRTFileManager.checkFileExist(name);
        this.name = name;
    }


    //Insert
    public void insert(String identifier, char data) {
        //WRTDataManager.checkIdentifier(name, identifier);
    }

    public void insert(String identifier, String data) {
        //WRTDataManager.checkIdentifier(name, identifier);
    }

    public void insert(String identifier, byte data) {
        //WRTDataManager.checkIdentifier(name, identifier);
    }

    public void insert(String identifier, short data) {
        //WRTDataManager.checkIdentifier(name, identifier);
    }

    public void insert(String identifier, int data) {
        //WRTDataManager.checkIdentifier(name, identifier);
    }

    public void insert(String identifier, long data) {
        //WRTDataManager.checkIdentifier(name, identifier);
    }

    public void insert(String identifier, float data) {
        //WRTDataManager.checkIdentifier(name, identifier);
    }

    public void insert(String identifier, double data) {
        //WRTDataManager.checkIdentifier(name, identifier);
    }

    public void insert(String identifier, boolean data) {
        //WRTDataManager.checkIdentifier(name, identifier);
    }


    //GetEntryBy


    //Value String
    public char getCharEntryBy(String identifier, String value, String targetIdentifier) {
        return 	'\u0000';
    }

    public String getStringEntryBy(String identifier, String value, String targetIdentifier) {
        return 	"";
    }

    public byte getByteEntryBy(String identifier, String value, String targetIdentifier) {
        return 0;
    }





    //GetElementBy
    public String getElementBy(String identifier, char value) {
        return "";
    }

    public String getElementBy(String identifier, String value) {
        return "";
    }

    public String getElementBy(String identifier, byte value) {
        return "";
    }

    public String getElementBy(String identifier, short value) {
        return "";
    }

    public String getElementBy(String identifier, int value) {
        return "";
    }

    public String getElementBy(String identifier, long value) {
        return "";
    }

    public String getElementBy(String identifier, float value) {
        return "";
    }

    public String getElementBy(String identifier, double value) {
        return "";
    }

    public String getElementBy(String identifier, boolean value) {
        return "";
    }


    //EditBy


    //RemoveBy
    public void removeBy(String identifier, String value) {

    }
}
