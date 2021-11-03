/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ankitaindi
 */
public class Patient extends Person {
    
    private VitalSigns patientVitalSigns;

    public VitalSigns getPatientVitalSigns() {
        return patientVitalSigns;
    }

    public void setPatientVitalSigns(VitalSigns patientVitalSigns) {
        this.patientVitalSigns = patientVitalSigns;
    }
    
}
