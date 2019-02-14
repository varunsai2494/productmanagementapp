/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uipackage;

/**
 *
 * @author imperio2494
 */
import javax.swing.table.DefaultTableModel;
import business_package.vitalsign;
import business_package.vitalsignhistory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import javafx.util.Pair;
import javax.swing.*;
public class viewpanel extends javax.swing.JPanel {

    /**
     * Creates new form viewpanel
     */
    vitalsignhistory vitalSignHistory;
    JPanel rightpanel;
    Myrenderer r;
    public viewpanel(JPanel rightpanel, vitalsignhistory vitalsignhistory ) {
        initComponents();
        this.rightpanel = rightpanel;
        this.vitalSignHistory=vitalsignhistory;
        this.r=new Myrenderer();
        
        populate();
        
        
    }
    
    private void populate(){
        refreshTableRendering();
        DefaultTableModel model = (DefaultTableModel) historyTbl.getModel();
        Object rowdata[]=new Object[6];
        model.setRowCount(0);
        for(vitalsign i:vitalSignHistory.getVitalSignHistory()){
        rowdata[0] = i;
        rowdata[1] = i.getBp();
        rowdata[2] = i.getRespiratoryRate();
        rowdata[3] = i.getHeartRate();
        rowdata[4] = i.getWeightinkg();
        rowdata[5] = i.getWeightinlbs();
        model.addRow(rowdata);
        
        }
//        historyTbl.getColumnModel().getColumn(0).setHeaderValue("qwerqwer");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTbl = new javax.swing.JTable();
        deleteBTN = new javax.swing.JButton();
        detailsBTN = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        bplow = new javax.swing.JTextField();
        bphigh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rrlow = new javax.swing.JTextField();
        rrhigh = new javax.swing.JTextField();
        hrlow = new javax.swing.JTextField();
        hrhigh = new javax.swing.JTextField();
        weightkglow = new javax.swing.JTextField();
        weightkghigh = new javax.swing.JTextField();
        weightlblow = new javax.swing.JTextField();
        weightlbhigh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("vital sign history");

        historyTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure", "respiratory rate", "heart rate", "weight(kgs)", "weight(lbs)"
            }
        ));
        historyTbl.setGridColor(new java.awt.Color(10, 255, 255));
        historyTbl.setSelectionForeground(new java.awt.Color(51, 51, 255));
        jScrollPane1.setViewportView(historyTbl);

        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        detailsBTN.setText("details");
        detailsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsBTNActionPerformed(evt);
            }
        });

        backbtn.setText("<<Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        bplow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplowActionPerformed(evt);
            }
        });
        bplow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bplowKeyReleased(evt);
            }
        });

        bphigh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bphighKeyReleased(evt);
            }
        });

        jLabel5.setText("Abnormal Filters");

        jLabel6.setText("Blood Pressure");

        rrlow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rrlowKeyReleased(evt);
            }
        });

        rrhigh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rrhighKeyReleased(evt);
            }
        });

        hrlow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hrlowKeyReleased(evt);
            }
        });

        hrhigh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hrhighKeyReleased(evt);
            }
        });

        weightkglow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                weightkglowKeyReleased(evt);
            }
        });

        weightkghigh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                weightkghighKeyReleased(evt);
            }
        });

        weightlblow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                weightlblowKeyReleased(evt);
            }
        });

        weightlbhigh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                weightlbhighKeyReleased(evt);
            }
        });

        jLabel7.setText("Respiratory Rate");

        jLabel8.setText("Heart Rate");

        jLabel9.setText("Weight(Kg)");

        jLabel10.setText("Weight(Lb)");

        jLabel11.setText("Low");

        jLabel12.setText("High");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(detailsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hrlow, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(hrhigh, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rrlow, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rrhigh, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(weightkglow, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(weightkghigh, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(weightlblow, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(weightlbhigh, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bplow, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bphigh, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18))
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbtn)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bplow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bphigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rrlow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rrhigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hrlow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hrhigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightkglow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightkghigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(weightlblow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightlbhigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detailsBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(deleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        int i = historyTbl.getSelectedRow();
        vitalsign vitalSignfordeletion = (vitalsign)historyTbl.getValueAt(i, 0);
        vitalSignHistory.deletevitalsign(vitalSignfordeletion);
        populate();
        

    }//GEN-LAST:event_deleteBTNActionPerformed

    private void detailsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsBTNActionPerformed
        int index = historyTbl.getSelectedRow();
        vitalsign vs=(vitalsign) historyTbl.getValueAt(index, 0);
        viewvitalsign viewvitalsignpanel= new viewvitalsign(rightpanel,vs);
        rightpanel.add("viewvitalsignpanel",viewvitalsignpanel);
        CardLayout layout=(CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
        
//        vitalsign dataobj = historyglbl.getVitalSignHistory().get(i);
//        temperatureTB.setText(String.valueOf(dataobj.getTemperature()));
//        bpTB.setText(String.valueOf(dataobj.getTemperature()));
//        pulseTB.setText(String.valueOf(dataobj.getPulse()));
//        dateTB.setText(dataobj.getDate());
    }//GEN-LAST:event_detailsBTNActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here: 
        rightpanel.remove(this);
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.previous(rightpanel);
        
        Component[] comps=rightpanel.getComponents();
        for(Component c:comps){
        if(c instanceof viewpanel){
        viewpanel panel = (viewpanel)c;
        panel.populate();
        }
        }
    }//GEN-LAST:event_backbtnActionPerformed

    private void bplowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bplowActionPerformed

    private void bplowKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bplowKeyReleased
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_bplowKeyReleased

    private void bphighKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bphighKeyReleased
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_bphighKeyReleased

    private void rrlowKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rrlowKeyReleased
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_rrlowKeyReleased

    private void rrhighKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rrhighKeyReleased
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_rrhighKeyReleased

    private void hrlowKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hrlowKeyReleased
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_hrlowKeyReleased

    private void hrhighKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hrhighKeyReleased
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_hrhighKeyReleased

    private void weightkglowKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightkglowKeyReleased
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_weightkglowKeyReleased

    private void weightkghighKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightkghighKeyReleased
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_weightkghighKeyReleased

    private void weightlblowKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightlblowKeyReleased
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_weightlblowKeyReleased

    private void weightlbhighKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightlbhighKeyReleased
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_weightlbhighKeyReleased
    
    private void refreshTableRendering(){
        r.clearpair();
        historyTbl.setDefaultRenderer(Object.class,r);
        if((bplow.getText().trim().length()>0 && bphigh.getText().trim().length()>0)||
            (rrhigh.getText().trim().length()>0 && rrlow.getText().trim().length()>0)||
                    (hrhigh.getText().trim().length()>0 && hrlow.getText().trim().length()>0)||
                    (weightkghigh.getText().trim().length()>0 && weightkglow.getText().trim().length()>0)||
                    (weightlbhigh.getText().trim().length()>0 && weightlblow.getText().trim().length()>0))
        {
        double highbp,lowbp,lowrr,highrr,lowhr,highhr,lowwkg,highwkg,lowwlb,highwlb;
        
        try{    
        lowbp=Double.parseDouble(bplow.getText());
         highbp=Double.parseDouble(bphigh.getText());
        }
        catch(Exception e){
         lowbp=-1;
         highbp=-1;
        }
        try{
         lowrr=Double.parseDouble(rrlow.getText());
         highrr=Double.parseDouble(rrhigh.getText());
        }
        catch(Exception e1){
        lowrr=-1;
        highrr=-1;
        }
        try{
         lowhr=Double.parseDouble(hrlow.getText());
         highhr=Double.parseDouble(hrhigh.getText());}
        catch(Exception e2){
        highhr=-1;
        lowhr=-1;
        }
        try{
         lowwkg=Double.parseDouble(weightkglow.getText());
         highwkg=Double.parseDouble(weightkghigh.getText());}
        catch(Exception e3)
        {
        lowwkg=-1;
        highwkg=-1;
        }
        try{
         lowwlb=Double.parseDouble(weightlblow.getText());
         highwlb=Double.parseDouble(weightlbhigh.getText());
        }
        catch(Exception e4){
        lowwlb=-1;
        highwlb=-1;
        }
        int i=0;
        for(vitalsign item:vitalSignHistory.getVitalSignHistory()){
            if (!(lowbp<0 || highbp<0) && (highbp>=lowbp) && !item.isNormal(lowbp,highbp,1))
                r.addpair(i,1);
            if (!(lowrr<0 || highrr<0) && (highrr>=lowrr) && !item.isNormal(lowrr,highrr,2))
                r.addpair(i,2);
            if (!(lowhr<0 || highhr<0) && (highhr>=lowhr) && !item.isNormal(lowhr,highhr,3))
                r.addpair(i,3);
            if (!(lowwkg<0 || highwkg<0) && (highwkg>=lowwkg) && !item.isNormal(lowwkg,highwkg,4))
                r.addpair(i,4);
            if (!(lowwlb<0 || highwlb<0) && (highwlb>=lowwlb) && !item.isNormal(lowwlb,highwlb,5))
                r.addpair(i,5);
            
            
            ++i;
        }

}
        System.out.print("hi");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField bphigh;
    private javax.swing.JTextField bplow;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton detailsBTN;
    private javax.swing.JTable historyTbl;
    private javax.swing.JTextField hrhigh;
    private javax.swing.JTextField hrlow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rrhigh;
    private javax.swing.JTextField rrlow;
    private javax.swing.JTextField weightkghigh;
    private javax.swing.JTextField weightkglow;
    private javax.swing.JTextField weightlbhigh;
    private javax.swing.JTextField weightlblow;
    // End of variables declaration//GEN-END:variables
}
