package com.alibiner.Week10.Input_Output.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Practices","src","main","java","com","alibiner","Week10","Input_Output",
                "FileInputStream","metin" +
                ".txt");
        System.out.println(path.toAbsolutePath());
        File file = new File(path.toAbsolutePath().toUri());
        file.createNewFile();

        FileInputStream fis = new FileInputStream(file);

        int ch;
        while ((ch = fis.read()) != -1){
            System.out.print((char) ch);
        }
    }
}
