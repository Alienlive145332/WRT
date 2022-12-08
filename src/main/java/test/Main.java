package test;

import de.Alienlive.wrt.manager.WRTDataManager;

public class Main {
    public static void main(String[] args) {
        WRTDataManager.createWRTStructure("test2", "hallo:String, nein:boolean, doch:boolean, oh:int");
    }
}