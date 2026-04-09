import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {

    public void createFile(String name, String content) {
        try {
            Files.write(Paths.get(name), content.getBytes());
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }

    public String getContentFile(String name) {
        try {
            return new String(Files.readAllBytes(Paths.get(name)));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }
    }

    public void deleteFile(String name) {
        try {
            Files.deleteIfExists(Paths.get(name));
        } catch (IOException e) {
            System.err.println("Error deleting file: " + e.getMessage());
        }
    }
}
