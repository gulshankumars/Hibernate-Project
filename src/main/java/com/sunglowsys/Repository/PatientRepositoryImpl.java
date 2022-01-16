package com.sunglowsys.Repository;

import com.sunglowsys.Domain.Patient;
import com.sunglowsys.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class PatientRepositoryImpl implements PatientRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Patient save(Patient patient) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(patient);
        session.getTransaction().commit();
        Patient result = session.get(Patient.class,id);
        return result;
    }

    @Override
    public Patient update(Patient patient, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Patient patient1 = session.get(Patient.class,id);
        patient1.setFirstName(patient.getFirstName());
        session.update(patient1);
        session.getTransaction().commit();
        session.close();
        System.out.println("updated----");
        return null;
    }

    @Override
    public List<Patient> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Patient");
        List<Patient> patientList = query.list();
        session.getTransaction().commit();
        session.close();
        return patientList;
    }

    @Override
    public Patient findById(long id) {
        Session session = sessionFactory.openSession();
        Patient patient = session.get(Patient.class,id);
        return patient;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Patient patient = session.get(Patient.class,id);
        session.delete(patient);
        session.getTransaction().commit();
        session.close();
        System.out.println("deleted-----");
    }
}
