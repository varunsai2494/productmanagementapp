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
import java.util.ArrayList;
public class vitalsignhistory {
    private  ArrayList<vitalsign> vitalSignHistory;
    
    public vitalsignhistory(){
        vitalSignHistory=new ArrayList<vitalsign>();
    }
    
    public ArrayList<vitalsign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<vitalsign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public  vitalsign addnewvitalsign() {
        vitalsign v =new vitalsign();
        this.vitalSignHistory.add(v);
        return v;
    }
    
    public  void deletevitalsign(vitalsign vitalSign ) {
        this.vitalSignHistory.remove(vitalSign);
    }
    
}
