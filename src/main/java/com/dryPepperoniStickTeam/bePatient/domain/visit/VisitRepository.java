package com.dryPepperoniStickTeam.bePatient.domain.visit;

import com.dryPepperoniStickTeam.bePatient.domain.doctor.Doctor;
import com.dryPepperoniStickTeam.bePatient.domain.patient.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VisitRepository {
    List<Visit> findByDoctorAndPatient(Doctor doctor, Patient patient);
    List<Visit> findByPatient(Patient patient);
    Optional<Visit> findByIdAndDoctor(long id, Doctor doctor);}