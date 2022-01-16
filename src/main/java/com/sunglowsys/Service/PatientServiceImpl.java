package com.sunglowsys.Service;

import com.sunglowsys.Domain.Patient;
import com.sunglowsys.Repository.PatientRepository;
import com.sunglowsys.Repository.PatientRepositoryImpl;

import java.util.List;

public class PatientServiceImpl implements PatientService{
    private PatientRepository patientRepository = new PatientRepositoryImpl();

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient update(Patient patient, Long id) {
        return patientRepository.update(patient,id);
    }

    @Override
    public List<Patient> findAll() {
        List<Patient> patientList = patientRepository.findAll();
        return patientList;
    }

    @Override
    public Patient findById(long id) {
        Patient patient = patientRepository.findById(id);
        return patient;
    }

    @Override
    public void delete(Long id) {
        patientRepository.delete(id);
    }
}
