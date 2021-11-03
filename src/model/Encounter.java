/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ankitaindi
 */
public class Encounter {
    
    private VitalSigns vitalSigns;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public VitalSigns getPatientVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns patientVitalSigns) {
        this.vitalSigns = patientVitalSigns;
    }
    
    @Override
    public String toString() {
        return patient.getName();
    }
    
}
