import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {

        String fileName = "sample.txt";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a Java File Handling Example!\n");
            writer.write("Reading and writing files using FileReader and FileWriter.");
            writer.close();

            System.out.println("Data written successfully.");

            FileReader reader = new FileReader(fileName);
            int character;

            System.out.println("\nContents of the file:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}