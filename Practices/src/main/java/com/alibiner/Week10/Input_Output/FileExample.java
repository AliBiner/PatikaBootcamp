package com.alibiner.Week10.Input_Output;

import java.io.Console;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.Map;
import java.util.Properties;

public class FileExample {
    public static void main(String[] args) {

        System.out.println("System.identityHashCode(new FileExample()) = " + System.identityHashCode(new FileExample()));

        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        System.out.println();
        System.out.println("-------------------garbage collector------------------------");
        System.gc(); //Run Garbage Collector
        System.out.println();
        System.out.println("------------------ get property-------------------------");

        //System.exit(0);
        System.out.println("System.getProperty(\"file.separator\") = " + System.getProperty("file.separator"));
        //System.out.println("System.clearProperty(\"file.separator\") = " + System.clearProperty("file.separator"));
        System.out.println("System.getProperty(\"file.separator\") = " + System.getProperty("file.separator"));


        System.out.println();
        System.out.println("--------------- all properties----------------------------");

        Properties properties = System.getProperties();

        for(Object obj : properties.keySet())
            System.out.println("key: " + obj + " - value: "+ properties.get(obj));

        System.out.println();
        System.out.println("-------------------------------------------");
        Console console = System.console();

        console.println("test");

        System.out.println();
        System.out.println("----------------- all environments--------------------------");

        Map<String,String> envs = System.getenv();

        for (String key : envs.keySet())
            System.out.println( "key: " + key + " - value: " + envs.get(key));

        System.out.println();
        System.out.println("----------------System.Logger---------------------------");

        System.Logger logger = System.getLogger("test");

        logger.log(System.Logger.Level.INFO,"log alındı");

        System.out.println("logger.getName() = " + logger.getName());

        System.out.println("logger.isLoggable(System.Logger.Level.INFO) = " + logger.isLoggable(System.Logger.Level.INFO));


        System.out.println();
        System.out.println("----------------Path---------------------------");

        Path uriPath = Paths.get("test");
        Path path = Paths.get("test","test2","test3.txt");

        System.out.println(uriPath.toAbsolutePath());
        System.out.println(path.toAbsolutePath());

        try {
            System.out.println(uriPath.toRealPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            throw new Exception("deneme");
        } catch (Exception e) {
            e.printStackTrace();
        }



        Path directoryPath = Paths.get("New_File");
        File file = new File(directoryPath.toAbsolutePath().toUri());
        boolean mkdir = file.mkdir();

        if (mkdir) {
            try {
                System.out.println(directoryPath.toRealPath()+ " - Dosya oluşturuldu");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                System.out.println(directoryPath.toRealPath()+" - Dosya mevcut");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        boolean delete = file.delete();

        if (delete)
            System.out.println(directoryPath.toAbsolutePath() + " - Dosya Silindi.");
        else
            System.out.println(directoryPath.toAbsolutePath() + " - Dosya Silinemedi.");


        System.out.println(file);

        if (file.exists()) {
            System.out.println("Dosya mevcut");
        }else
            System.out.println("Dosya mevcut değildir.");

        if (file.isFile())
            System.out.println("Bu bir file'dır.");
        else
            System.out.println("Bu bir folder'dır.");

        System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());

        if (file.canExecute()) {
            System.out.println("Çalıştırılabilir.");
        }else
            System.out.println("Çalıştırılamaz.");

        if (file.isAbsolute()) {
            System.out.println("absolute'dur");
        }else
            System.out.println("Absolute değildir");

        if (file.isHidden()) {
            System.out.println("Gizli bir dosyadır.");
        }else
            System.out.println("Gizli bir dosya değildir.");

        if (file.canRead()) {
            System.out.println("Okunabilir.");
        }else
            System.out.println("Okunabilir değildir.");

        if (file.canWrite()) {
            System.out.println("Yazılabilir.");
        }else
            System.out.println("Yazılamaz.");

        try {
            if (file.createNewFile()) {
                System.out.println("File oluşturuldu.");
            }else
                System.out.println("File oluşturulamadı. ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //file.deleteOnExit();

        System.out.println("file.getUsableSpace() = " + file.getUsableSpace());

        System.out.println("file.getFreeSpace() = " + file.getFreeSpace());

        System.out.println("file.getTotalSpace() = " + file.getTotalSpace());

        try {
            System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("file.getName() = " + file.getName());

        System.out.println("file.getParent() = " + file.getParent());

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.renameTo(new File("test"));

        System.out.println("file.getName() = " + file.getName());

        Path pathFilesDir = Paths.get("files_test");
        Path pathFilesFile = Paths.get("files_test","deneme.txt");

        if (!Files.exists(pathFilesDir)) {
            try {
                Files.createDirectories(pathFilesDir);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!Files.exists(pathFilesFile)){
            try {
                Files.createFile(pathFilesFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Path pathCopy = Paths.get("files_test","test.txt");

        try {
            Files.copy(pathFilesFile,pathCopy, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (Files.isWritable(pathFilesFile)) {
            try {
                Files.write(pathFilesFile, "Ben Ali Biner".getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else
            System.out.println("Dosya yazılabilir değil.");

        if (Files.isReadable(pathFilesFile)){
            try {
                String str = Files.readString(pathFilesFile);
                System.out.println( str);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else
            System.out.println("Dosya okunabilir değil.");
    }
}
