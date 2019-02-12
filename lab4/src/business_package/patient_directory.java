/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_package;

import java.util.ArrayList;

/**
 *
 * @author imperio2494
 */
public class patient_directory {
     private ArrayList<patient> patientDirectory;

    public patient_directory() {
        patientDirectory = new ArrayList<patient>();
    }
    public void deletepatient(patient p){
    patientDirectory.remove(p);
    }
    public ArrayList<patient> getPatientDirectory() {
        return patientDirectory;
    }
    
    public void setPatientDirectory(ArrayList<patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
 
    public patient addPatient() {
        patient p = new patient();
        patientDirectory.add(p);
        return p;
    }
    
    public void removePatient(patient p) {
        patientDirectory.remove(p);
    }
    
    public patient searchPatient(int id) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(patient p : patientDirectory) {
            if(p.getPatId()== id) {
                return p;
            }
        }
        return null;
    }
}
