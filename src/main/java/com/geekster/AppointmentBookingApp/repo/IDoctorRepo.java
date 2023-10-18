package com.geekster.AppointmentBookingApp.repo;

import com.geekster.AppointmentBookingApp.model.Doctor;
import com.geekster.AppointmentBookingApp.model.Qualification;
import com.geekster.AppointmentBookingApp.model.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDoctorRepo extends JpaRepository<Doctor,Integer> {
    List<Doctor> findByDocQualificationOrDocSpecialization(Qualification qual, Specialization spec);
}