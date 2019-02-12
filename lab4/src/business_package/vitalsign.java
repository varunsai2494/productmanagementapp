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
    
    public boolean isNormal(double low,double high){
     return (this.heartRate>=low && this.heartRate<=high);
    }
    
    @Override
    public String toString(){
            return this.getTimestamp();
                    }
}
