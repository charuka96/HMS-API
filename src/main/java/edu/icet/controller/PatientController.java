package edu.icet.controller;
import edu.icet.dto.Patient;
import edu.icet.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PatientController {

  @Autowired
  public PatientService service;
    @GetMapping("/patient-all")
    public List<Patient> getPatient(){
      return service.getPatient();
    }

   @PostMapping("/patient-save")
    public void savePatient(@RequestBody Patient patient){
      service.savePatient(patient);
    }

}
