package com.geekster.AppointmentBookingApp.repo;

import com.geekster.AppointmentBookingApp.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment,Integer> {
}
