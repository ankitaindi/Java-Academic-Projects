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
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterHistory;
    
    public EncounterHistory() {
        this.encounterHistory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addNewEncounter() {
        Encounter newEncounter = new Encounter();
        encounterHistory.add(newEncounter);
        return newEncounter;
    }
    
    public void deleteEncounter(Encounter encounter) {
        encounterHistory.remove(encounter);
    }
    
    public Encounter updateEncounter(int index) {
        Encounter newEncounter = new Encounter();
        encounterHistory.set(index, newEncounter);
        return newEncounter;
    }
    
}
