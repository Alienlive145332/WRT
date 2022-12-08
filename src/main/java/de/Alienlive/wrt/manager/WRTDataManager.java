package de.Alienlive.wrt.manager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WRTDataManager {

    /*public static boolean checkIdentifier(String name, String providedIdentifier) throws IOException {
        WRTFileManager.checkFileExist(name);
        String[] providedIdentifierArray = providedIdentifier.split(",");
        for (String providedIdentifier : providedIdentifierArray) {
            providedIdentifier = providedIdentifier.replace(",", "");
            String[] data = Files.readString(Path.of("./wrtdata/" + name + ".wrt")).split("}");
            data = data[0].split(",");
            boolean exists = false;
            for (String identifier : data) {
                identifier = identifier
                        .replace(",", "")
                        .replace("{", "")
                        .replace("}", "")
                        .replace(" ", "");
                if (providedIdentifier.equals(identifier)) {
                    exists = true;
                    continue;
                }
            }
            if (!exists) {
                throw new RuntimeException("[WRT]: wrong identifier '" + providedIdentifier + "'");
            }
        }
        return true;
    }*/

    /*public static boolean checkIdentifiersType(String identifier, String requiredType) {
        String[] identifierArray = identifier.split("=");
        String identifierName = identifierArray[0].replace("=", "");
        String identifierDataType = identifierArray[1].replace(",", "");
        return true;
    }*/

    public static void createWRTStructure(String name, String identifiers) {
        try {
            Path path = Path.of("./wrtdata/" + name + ".wrt");
            Files.writeString(path, "{\r\n");
            String[] identifiersArray = identifiers.split(",");
            int length = identifiersArray.length;
            int currentLength = 0;
            for (String identifier : identifiersArray) {
                currentLength++;
                identifier = identifier.replace(" ", "");
                String content = Files.readString(path);
                if (currentLength != length) Files.writeString(path, content + identifier + ",\r\n");
                else Files.writeString(path, content + identifier);
            }
            Files.writeString(path, Files.readString(path) + "\r\n}");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
