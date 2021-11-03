/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ankitaindi
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientDirectory;
    
    public void PatientDirectory() {
        this.patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public Patient addNewPatient() {
        Patient newPatient = new Patient();
        patientDirectory.add(newPatient);
        return newPatient;
    }
    
}
