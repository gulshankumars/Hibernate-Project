package com.sunglowsys.Test;

import com.sunglowsys.Domain.Patient;
import com.sunglowsys.Service.PatientService;
import com.sunglowsys.Service.PatientServiceImpl;

public class TestSavePatient {

    public static void main(String[] args) {
        Patient patient = new Patient("Devendra", "Pratap", "9876543210", "Male", 78L);
        PatientService patientService = new PatientServiceImpl();
        Patient result = patientService.save(patient);
        System.out.println(result);
    }
}
