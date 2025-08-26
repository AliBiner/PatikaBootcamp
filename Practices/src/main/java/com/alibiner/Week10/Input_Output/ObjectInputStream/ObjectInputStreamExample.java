package com.alibiner.Week10.Input_Output.ObjectInputStream;

import com.alibiner.Week10.Input_Output.ObjectOutputStream.Objects.Student;

import java.io.*;

public class ObjectInputStreamExample {
    public static void main(String[] args)  {

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.ser"))) {
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
