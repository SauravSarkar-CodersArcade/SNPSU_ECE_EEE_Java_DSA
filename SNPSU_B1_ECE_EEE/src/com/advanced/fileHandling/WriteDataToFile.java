package com.advanced.fileHandling;
import java.io.FileWriter;
public class WriteDataToFile {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new
                FileWriter("./Demo/current_status.txt", true);
        writer.append("\nConsistency is the key. You need Discipline.");
        writer.close();
        System.out.println("Successfully wrote data into the file.");
    }
}
