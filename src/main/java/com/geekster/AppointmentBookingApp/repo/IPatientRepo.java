package com.geekster.AppointmentBookingApp.repo;

import com.geekster.AppointmentBookingApp.model.BloodGroup;
import com.geekster.AppointmentBookingApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPatientRepo extends JpaRepository<Patient,Integer> {


    Patient findFirstByPatientEmail(String newEmail);

    List<Patient> findByPatientBloodGroup(BloodGroup bloodGroup);
}