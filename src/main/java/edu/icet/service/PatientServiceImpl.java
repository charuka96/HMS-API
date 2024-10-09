package edu.icet.service;

import ch.qos.logback.core.model.Model;
import edu.icet.dto.Patient;
import edu.icet.entity.PatientEntity;
import edu.icet.repository.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{
   final PatientRepository repository;
   final ModelMapper mapper;
    @Override
    public List<Patient> getPatient() {

        List <Patient> patients =  new ArrayList<>();

        repository.findAll().forEach(patient->{
            patients.add(mapper.map(patient,Patient.class));

        });
        return  patients;
    }

    @Override
    public void savePatient(Patient patient) {
       repository.save( mapper.map(patient, PatientEntity.class));
    }
}
