package com.advanced.fileHandling;
import java.io.File;
public class DeleteFolder {
    public static void main(String[] args) {
        // I will show the use of the relative path
        // . means current directory or folder
        File folder = new File("./Demo/DSA");
        if (folder.delete()){
            System.out.println("Folder " + folder.getName() + " deleted.");
        }else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
