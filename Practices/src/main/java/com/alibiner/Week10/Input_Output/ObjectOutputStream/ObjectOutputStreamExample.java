package com.alibiner.Week10.Input_Output.ObjectOutputStream;

import com.alibiner.Week10.Input_Output.ObjectOutputStream.Objects.Student;

import java.io.*;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        Student student = new Student("Ali","Biner",28,"Erkek");
        File file = new File("Student.ser");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(student);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
