package com.sunglowsys.Test;

import com.sunglowsys.Domain.Patient;
import com.sunglowsys.Service.PatientServiceImpl;

import java.util.List;

public class FindAll {
    public static void main(String[] args) {
        List<Patient> patientList = new PatientServiceImpl().findAll();
        for (Patient patient : patientList){
            System.out.println(patient);
        }
    }
}
