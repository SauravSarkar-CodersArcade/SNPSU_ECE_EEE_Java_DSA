package com.advanced.fileHandling;
import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        String[] filename = {"java.txt", "python.txt"};
        String path = "./Demo/"; // ./Demo/java.txt ./Demo/python.txt
        for (int i=0; i<filename.length; i++){
            File file = new File(path + filename[i]);
            if (file.delete()){
                System.out.println("Deleted " + file.getName());
            }else {
                System.out.println("Failed to delete the file.");
            }
        }
    }
}
