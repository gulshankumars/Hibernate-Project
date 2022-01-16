package com.sunglowsys.Test;

import com.sunglowsys.Service.PatientServiceImpl;

public class DeleteById {
    public static void main(String[] args) {
        new PatientServiceImpl().delete(2L);
    }
}
