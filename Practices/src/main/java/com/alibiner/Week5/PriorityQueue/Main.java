package com.alibiner.Week5.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    private static final AtomicLong seqNumber = new AtomicLong(0);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comparator<Patient> comparator = new PatientComparator();
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>(comparator);

        System.out.println("--- Hastalar hastaneye geliyor (karışık sırada) ---\n");

        // Hastaları sisteme ekleyelim. Geliş sıraları otomatik artacak.
        patientQueue.add(new Patient("Ahmet Yılmaz", 45, PatientCaseType.NORMAL, seqNumber.incrementAndGet()));
        patientQueue.add(new Patient("Zeynep Kaya", 70, PatientCaseType.NORMAL, seqNumber.incrementAndGet()));
        patientQueue.add(new Patient("Mehmet Öztürk", 30, PatientCaseType.NORMAL, seqNumber.incrementAndGet()));
        patientQueue.add(new Patient("Ayşe Demir", 25, PatientCaseType.EMERGENCY, seqNumber.incrementAndGet())); // Acil vaka!
        patientQueue.add(new Patient("Fatma Şahin", 65, PatientCaseType.IMPORTANT, seqNumber.incrementAndGet())); // 65 yaş
        // ve önemli!
        patientQueue.add(new Patient("Mustafa Arslan", 80, PatientCaseType.NORMAL, seqNumber.incrementAndGet()));

        System.out.println("Hasta adı giriniz: ");
        String name = scanner.nextLine();
        System.out.println("Hasta yaşı giriniz: ");
        int age = scanner.nextInt();
        patientQueue.add(new Patient(name,age,PatientCaseType.EMERGENCY,seqNumber.incrementAndGet()));

        System.out.println("Mevcut hasta kuyruğu (içsel sıralama): " + patientQueue);
        System.out.println("\n--- Randevu Sırası Çağrılıyor ---");

        // Kuyruk boşalana kadar en öncelikli hastayı çağır.
        while (!patientQueue.isEmpty()) {
            // poll() metodu, kuyruğun başındaki (en öncelikli) elemanı alır ve kuyruktan çıkarır.
            Patient nextPatient = patientQueue.poll();
            System.out.println("Sıradaki Hasta: " + nextPatient.getName() + " -> " + nextPatient);
        }
    }
}
