package com.sunglowsys.Service;

import com.sunglowsys.Domain.Patient;

import java.util.List;

public interface PatientService {

    Patient save(Patient patient);

    Patient update(Patient patient, Long id);

    List<Patient> findAll();

    Patient findById(long id);

    void delete(Long id);
}
