package com.alibiner.Week10.Input_Output.BufferedOutputStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String message = """
                Buffered stream ile eklendi.Buffered stream ile eklendi.Buffered stream ile eklendi.
                Buffered stream ile eklendi.Buffered stream ile eklendi.Buffered stream ile eklendi.
                Buffered stream ile eklendi.Buffered stream ile eklendi.Buffered stream ile eklendi.               
                Buffered stream ile eklendi.Buffered stream ile eklendi.Buffered stream ile eklendi.               
                Buffered stream ile eklendi.Buffered stream ile eklendi.Buffered stream ile eklendi.               
                Buffered stream ile eklendi.Buffered stream ile eklendi.Buffered stream ile eklendi.               
                Buffered stream ile eklendi.Buffered stream ile eklendi.Buffered stream ile eklendi.               
                Buffered stream ile eklendi.Buffered stream ile eklendi.Buffered stream ile eklendi.               
                Buffered stream ile eklendi.Buffered stream ile eklendi.Buffered stream ile eklendi.             
                """;
        File file = new File("source.txt");
        long start = System.currentTimeMillis();
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))) {
            bos.write(message.getBytes(StandardCharsets.UTF_8));
            //bos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        long finish = System.currentTimeMillis();
        System.out.println((finish-start)+ " ms");
    }
}
