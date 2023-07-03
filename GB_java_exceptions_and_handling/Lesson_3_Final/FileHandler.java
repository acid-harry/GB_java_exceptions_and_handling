import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {
    public static void createFile(String text, String name) {
        boolean fileExists = false;
        String fileContent = "";
        if (Files.exists(Path.of(name + ".txt"))) {
            fileContent = readFileContent(name);
            if (!fileContent.contains(text)) {
                fileExists = true;
                writeFile(name, text, fileExists);
                System.out.println("Data successfully added.");
            } else {
                System.out.println("Data already exists.");
            }
        } else {
            writeFile(name, text, fileExists);
            System.out.println("File " + name + ".txt successfully created.");
        }
    }

    public static String readFileContent(String name) {
        try (FileReader reader = new FileReader(name + ".txt")) {
            int c;
            StringBuilder content = new StringBuilder();
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
            return content.toString();
        } catch (IOException e) {
            throw new RuntimeException("Error reading file: " + e);
        }
    }

    public static void writeFile(String name, String text, boolean appendToFile) {
        try (FileWriter writer = new FileWriter(name + ".txt", appendToFile)) {
            writer.write(text + "\n");
        } catch (IOException e) {
            throw new RuntimeException("Error writing file: " + e);
        }
    }
}