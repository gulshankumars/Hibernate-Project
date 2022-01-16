package com.sunglowsys.Test;

import com.sunglowsys.Domain.Patient;
import com.sunglowsys.Service.PatientServiceImpl;

public class FindById {
    public static void main(String[] args) {
        Patient patient = new PatientServiceImpl().findById(1L);
        System.out.println(patient);
    }
}
