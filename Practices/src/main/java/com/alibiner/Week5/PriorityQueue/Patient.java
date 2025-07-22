package com.alibiner.Week5.PriorityQueue;

public class Patient {
    private String name;
    private int age;
    private PatientCaseType patientCaseType;
    private Long seqNumber;

    public Patient(String name, int age, PatientCaseType patientCaseType, Long sqeuence) {
        this.name = name;
        this.age = age;
        this.patientCaseType = patientCaseType;
        this.seqNumber = sqeuence;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PatientCaseType getPatientCaseType() {
        return patientCaseType;
    }

    public Long getSeqNumber() {
        return seqNumber;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", patientCaseType=" + patientCaseType +
                ", seqNumber=" + seqNumber +
                '}';
    }
}
