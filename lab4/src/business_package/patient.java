/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_package;

/**
 *
 * @author imperio2494
 */
public class patient {
    private static int count = 0;
    private String patName;
    private int patId;
    private String docFirstName;

    public vitalsignhistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(vitalsignhistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    private String docLastName;
    private String pharmacyName;
    private String dob;
    private String contact;
    private vitalsignhistory vitalSignHistory;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    
    public patient() {
        count++;
        this.patId = count;
        this.vitalSignHistory=new vitalsignhistory();
    }

    public int getPatId() {
        return patId;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getDocFirstName() {
        return docFirstName;
    }

    public void setDocFirstName(String docFirstName) {
        this.docFirstName = docFirstName;
    }

    public String getDocLastName() {
        return docLastName;
    }

    public void setDocLastName(String docLastName) {
        this.docLastName = docLastName;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }
  
    @Override
    public String toString() {
        return Integer.toString(this.getPatId());
        //To change body of generated methods, choose Tools | Templates.
    }
}
