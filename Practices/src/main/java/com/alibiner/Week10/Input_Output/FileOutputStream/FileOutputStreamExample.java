package com.alibiner.Week10.Input_Output.FileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Practices","src","main","java","com","alibiner","Week10","Input_Output",
                "FileOutputStream","metin" +
                        ".txt");

        File file = new File(path.toUri());

        FileOutputStream fos = new FileOutputStream(file,true);

        fos.write("Merhaba Ali".getBytes(StandardCharsets.UTF_8));
    }
}
