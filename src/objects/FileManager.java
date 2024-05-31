package objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

/*
 * Question 12: File I/O
Create a class FileManager with methods to write data to a file and read data from a file.
Use these methods to write a list of student names to a file.
Then read the names from the file and display them.
 */
public class FileManager {
    FileInputStream fileInputStream = null;
    PrintStream printStream = null;

    public FileManager() throws FileNotFoundException {
        this.fileInputStream = new FileInputStream(
                "C:\\Users\\konga\\Core_Java\\Java_OOPS\\src\\resources\\file.txt");
        this.printStream = new PrintStream(new FileOutputStream(
                "C:\\Users\\konga\\Core_Java\\Java_OOPS\\src\\resources\\file.txt"));
    }

    public void writeData(List<String> names) {
        for (String name : names) {
            printStream.println(name);
        }
    }

    public void readData() throws IOException {
        int ch;
        while ((ch = fileInputStream.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}
