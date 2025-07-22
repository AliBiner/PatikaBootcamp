package com.alibiner.Week5.PriorityQueue;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient patient1, Patient patient2) {
        if (patient1.getPatientCaseType()==PatientCaseType.EMERGENCY && patient2.getPatientCaseType()!=PatientCaseType.EMERGENCY)
            return -1;
        if (patient2.getPatientCaseType()==PatientCaseType.EMERGENCY && patient1.getPatientCaseType()!=PatientCaseType.EMERGENCY)
            return 1;
        if (patient1.getPatientCaseType()==PatientCaseType.EMERGENCY && patient2.getPatientCaseType()==PatientCaseType.EMERGENCY)
            return Long.compare(patient1.getSeqNumber(),patient2.getSeqNumber());

        boolean isPatient1ImportantCase = patient1.getAge() >=65 && patient1.getPatientCaseType()==PatientCaseType.IMPORTANT;
        boolean isPatient2ImportantCase = patient2.getAge() >= 65 && patient2.getPatientCaseType() == PatientCaseType.IMPORTANT;
        if (isPatient1ImportantCase && !isPatient2ImportantCase)
            return -1;
        if (isPatient2ImportantCase && !isPatient1ImportantCase)
            return 1;

        return Long.compare(patient1.getSeqNumber(),patient2.getSeqNumber());
    }
}
