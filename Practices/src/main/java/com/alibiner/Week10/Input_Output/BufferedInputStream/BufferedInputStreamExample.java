package com.alibiner.Week10.Input_Output.BufferedInputStream;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedInputStreamExample {
    private static final Object lock = new Object();
    public static void main(String[] args) {
        Path sourcePath = Paths.get("source.txt");
        Path destinationPath = Paths.get("destination.txt");

        synchronized (lock){
            try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath.toFile()))) {
                int read;
                lock.wait(1000);

                while ((read = bis.read())!=-1){
                    System.out.print((char) read);

                }
                bis.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("--------------------------------------");
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath.toFile()));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationPath.toFile()))) {
            byte[] buffer = new byte[8192];
            int read;
            while ((read = bis.read(buffer))!=-1) {
                bos.write(buffer, 0, read);
                bos.flush();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
