package com.geekster.AppointmentBookingApp.repo;

import com.geekster.AppointmentBookingApp.model.PatientAuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPTokenRepo extends JpaRepository<PatientAuthenticationToken,Integer> {
    PatientAuthenticationToken findFirstByTokenValue(String tokenValue);
}