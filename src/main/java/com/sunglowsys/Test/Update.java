package com.sunglowsys.Test;

import com.sunglowsys.Domain.Patient;
import com.sunglowsys.Service.PatientServiceImpl;

public class Update {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setFirstName("Hirdesh");
        new PatientServiceImpl().update(patient,1L);
    }
}
