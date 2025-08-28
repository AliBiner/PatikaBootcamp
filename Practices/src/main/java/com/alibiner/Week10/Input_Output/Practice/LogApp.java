package com.alibiner.Week10.Input_Output.Practice;

import com.alibiner.Week3.GreengrocerCase.Main;

import java.io.*;
import java.lang.System.Logger.Level;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class LogApp {
    private static final Path LOG_FILE_PATH = Paths.get("Practices","src","main","resources","log","log.txt");
    private static final File LOG_FILE = new File(LOG_FILE_PATH.toUri());
    private static Set<String> users = new HashSet<>();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        writeLog(Level.INFO,"Uygulama Başlatıldı!");
        users.add("Ali");
        users.add("Ecrin");
        users.add("Mahmut");

        System.out.println("Kullanıcı adı giriniz: ");
        String name = scanner.nextLine();
        if (login(name).isEmpty()) {
            System.out.println("Kullanıcı adı hatalı!");
            writeLog(Level.ERROR,"Kullanıcı adı hatalı!");
            writeLog(Level.ERROR,"Uygulama Kapatılıyor...");
            System.out.println("Uygulama Kapatılıyor...");
            return;
        }
        writeLog(Level.INFO,"Giriş Başarılı!");
        System.out.println("-------------------Log Uygulaması----------------------");
        boolean exit = false;
        while (!exit){
            System.out.println("1. Log arama");
            System.out.println("2. Log dosyasını temizleme");
            System.out.println("3. Çıkış");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Aranacak Kelimeyi Giriniz: ");
                    String searchKey = scanner.nextLine();
                    searchLog(searchKey);
                    break;
                case 2:
                    //todo log temizleme methodu yazılacak.
                    break;
                case 3:
                    System.out.println("Uygulama Kapatılıyor...");
                    writeLog(Level.INFO,"Uygulama Kapatılıyor...");
                    exit=true;
            }

        }

    }

    private static Optional<String> login(String username){
        return users.stream().filter(n-> n.equals(username)).findFirst();
    }

    private static void writeLog(Level logLevel, String message){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE,true))) {
            String formatedDate = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            String log = String.format("[%s] [%s] [%s]",formatedDate,logLevel,message);
            writer.write(log);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Log yazılamadı: " + e.getMessage());
        }
    }

    private static void searchLog(String searchKey){
        try(BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))) {
            String line;
            boolean isFound=false;

            while ((line = reader.readLine())!=null){
                if (line.toLowerCase().contains(searchKey.toLowerCase())){
                    System.out.println("Bulunan log -> " + line);
                    isFound=true;
                }
            }
            if (!isFound) {
                System.out.println("Eşleşen log kaydı bulunamadı.");
            }
        } catch (FileNotFoundException e) {
            writeLog(Level.ERROR,"Dosya bulunamadı. " + Arrays.toString(e.getStackTrace()));
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            writeLog(Level.ERROR,"Okuma/Yazma işlemi yapılamadı. " + Arrays.toString(e.getStackTrace()));
            System.out.println("Okuma/Yazma işlemi yapılamadı.");
        }
    }
}
