/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_package;

import java.util.HashMap;

/**
 *
 * @author imperio2494
 */
public class vitalsign {
    private double respiratoryRate;
    private double heartRate;
    private double bp;
    private String timestamp;
    private double weightinkg;
    private double weightinlbs;

    public double getWeightinkg() {
        return weightinkg;
    }

    public void setWeightinkg(double weightinkg) {
        this.weightinkg = weightinkg;
    }

    public double getWeightinlbs() {
        return weightinlbs;
    }

    public void setWeightinlbs(double weightinlbs) {
        this.weightinlbs = weightinlbs;
    }

    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getBp() {
        return bp;
    }

    public void setBp(double bp) {
        this.bp = bp;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    
    public boolean isNormal(double low,double high,int filterType){
        double temp;
        if (filterType==1)
            temp=this.bp;
        else if (filterType==2)
            temp=this.respiratoryRate;
        else if (filterType==3)
            temp=this.heartRate;
        else if (filterType==4)
            temp=this.weightinkg;
        else if (filterType==5)
            temp=this.weightinlbs;
        else
            temp=0;
                  
                
     return (temp>=low && temp<=high);
    }
    
    @Override
    public String toString(){
            return this.getTimestamp();
                    }
}
