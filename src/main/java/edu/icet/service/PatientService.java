package edu.icet.service;

import edu.icet.dto.Patient;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PatientService {

    List<Patient> getPatient();

    void savePatient(Patient patient);

}
