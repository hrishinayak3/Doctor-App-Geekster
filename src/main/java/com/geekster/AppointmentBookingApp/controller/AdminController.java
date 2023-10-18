package com.geekster.AppointmentBookingApp.controller;

import com.geekster.AppointmentBookingApp.model.BloodGroup;
import com.geekster.AppointmentBookingApp.model.Doctor;
import com.geekster.AppointmentBookingApp.model.Patient;
import com.geekster.AppointmentBookingApp.model.dto.AuthenticationInputDto;
import com.geekster.AppointmentBookingApp.service.DoctorService;
import com.geekster.AppointmentBookingApp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
public class AdminController {

    @Autowired
    DoctorService doctorService;

    @Autowired
    PatientService patientService;

    @GetMapping("patients")
    public List<Patient> getAllPatients()
    {
        return patientService.getAllPatients();
    }

    @PostMapping("doctor")
    public String addDoctor(@RequestBody Doctor newDoctor)
    {
        return doctorService.addDoctor(newDoctor);
    }

    @GetMapping("patients/bloodGroup/{bloodGroup}")
    public List<Patient> getAllPatientsByBloodGroup(@PathVariable BloodGroup bloodGroup)
    {
        return patientService.getAllPatientsByBloodGroup(bloodGroup);
    }


}