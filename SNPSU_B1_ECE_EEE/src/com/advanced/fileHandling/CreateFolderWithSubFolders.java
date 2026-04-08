package com.advanced.fileHandling;
import java.io.File;
public class CreateFolderWithSubFolders {
    public static void main(String[] args) {
        // Operating System - Two Types of Paths
        // 1. Absolute Path - Root Directory
        // 2. Relative Path - Current Directory
        File folder = new
                File("D:\\SNPSU_ECE_EEE\\SNPSU_B1_ECE_EEE\\Demo\\F1\\F2\\F3\\F4\\F5");
        if (folder.mkdirs()){
            System.out.println("Folder " + folder.getName() + " created.");
        }else {
            System.out.println("Folder already exists.");
        }
    }
}
