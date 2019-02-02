/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uipackage;
import javax.swing.table.DefaultTableModel;
import business_package.vitalsign;
import business_package.vitalsignhistory;
import com.sun.rowset.internal.Row;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author imperio2494
 */
public class abnormal extends javax.swing.JPanel {

    /**
     * Creates new form abnormal
     */
    private double minbpglbl,maxbpglbl;
    private HashMap<Integer,Integer> mapping=new HashMap<>();
    vitalsignhistory historyglbl=new vitalsignhistory();
    public abnormal(vitalsignhistory history,double minbp,double maxbp) {
        minbpglbl=minbp;
        maxbpglbl=maxbp;
        initComponents();
        historyglbl=history;
        
        if (maxbp>minbp){
        displayproduct(history,minbp,maxbp);
        }
        else{
        JOptionPane.showMessageDialog(null, "check maxbp and minbp values");
        }
    }
    
    private void displayproduct(vitalsignhistory history,double minbp,double maxbp){
        
        ArrayList <vitalsign> tempo= new ArrayList<vitalsign>();
        tempo = history.getVitalSignHistory();
//        for (int i = 0; i < tempo.size(); i++)
//        {
//            double temperature = tempo.get(i).getTemperature();
//            double bp = tempo.get(i).getBloodPressure();
//            int pulse = tempo.get(i).getPulse();
//            String date = tempo.get(i).getDate();
//        }
        
        DefaultTableModel model = (DefaultTableModel) historyTbl.getModel();
        Object rowdata[]=new Object[2];
        int j=0;
        for(int i=0;i <tempo.size();i++ ){
            if ((tempo.get(i).getBloodPressure()>minbp) && (tempo.get(i).getBloodPressure()< maxbp))
                    {
                    rowdata[0] = tempo.get(i).getDate();
                    rowdata[1] = tempo.get(i).getBloodPressure();
                    mapping.put(j,i);
                    j++;
                            
                    }
        
        
        model.addRow(rowdata);
        }
        model.setColumnCount(2);
        model.setRowCount(tempo.size());
        historyTbl.setAutoCreateRowSorter(true);
                
//        int a =234;
//        namettextfield.setText("sdg");
//        pricetextfield.setText(product.getPrice());
//        availtextfield.setText(product.getAvailNum());
//        descrptiontextfield.setText(product.getDescription());
    }

//    private void filterrows() {                                        
//        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) historyTbl.getModel();
//        TableRowSorter<DefaultTableModel> tr =new TableRowSorter<DefaultTableModel>(model);
//        historyTbl.setRowSorter(tr);
//        tr.setRowFilter(RowFilter.regexFilter(historyTbl.));
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        dateTB = new javax.swing.JTextField();
        temperatureTB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bpTB = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTbl = new javax.swing.JTable();
        pulseTB = new javax.swing.JTextField();
        deleteBTN = new javax.swing.JButton();
        detailsBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setText("Date");

        dateTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTBActionPerformed(evt);
            }
        });

        temperatureTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatureTBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Abnormal Vitalsigns");

        bpTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpTBActionPerformed(evt);
            }
        });

        historyTbl.setForeground(new java.awt.Color(90, 100, 10));
        historyTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
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

        jLabel2.setText("Temperature");

        jLabel3.setText("Blood Pressure");

        jLabel4.setText("Pulse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 187, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bpTB, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pulseTB, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(temperatureTB, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateTB, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(detailsBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBTN)))
                .addContainerGap(276, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsBTN)
                    .addComponent(deleteBTN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(temperatureTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pulseTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dateTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTBActionPerformed

    private void temperatureTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperatureTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temperatureTBActionPerformed

    private void bpTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpTBActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        int i = historyTbl.getSelectedRow();
        int key=mapping.get(i);
        historyglbl.deletevitalsign(key);

        displayproduct(historyglbl,minbpglbl,maxbpglbl);

        //        ArrayList <vitalsign> tempo= new ArrayList<vitalsign>();
        //        tempo = historyglbl.getVitalSignHistory();
        ////        for (int i = 0; i < tempo.size(); i++)
        //        {
            //            double temperature = tempo.get(i).getTemperature();
            //            double bp = tempo.get(i).getBloodPressure();
            //            int pulse = tempo.get(i).getPulse();
            //            String date = tempo.get(i).getDate();
            //        }

        //        DefaultTableModel model = (DefaultTableModel) historyTbl.getModel();
        //        Object rowdata[]=new Object[2];
        //        for(int l=0;l <tempo.size();l++ ){
            //        rowdata[0] = tempo.get(i).getDate();
            //        rowdata[1] = tempo.get(i).getBloodPressure();
            //
            //        model.addRow(rowdata);
            //        }
        //        model.setColumnCount(5);
        //        model.setRowCount(tempo.size());
        //        historyTbl.setAutoCreateRowSorter(true);

    }//GEN-LAST:event_deleteBTNActionPerformed

    private void detailsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsBTNActionPerformed
        int i = historyTbl.getSelectedRow();
        vitalsign dataobj = historyglbl.getVitalSignHistory().get(i);
        temperatureTB.setText(String.valueOf(dataobj.getTemperature()));
        bpTB.setText(String.valueOf(dataobj.getTemperature()));
        pulseTB.setText(String.valueOf(dataobj.getPulse()));
        dateTB.setText(dataobj.getDate());
    }//GEN-LAST:event_detailsBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bpTB;
    private javax.swing.JTextField dateTB;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton detailsBTN;
    private javax.swing.JTable historyTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pulseTB;
    private javax.swing.JTextField temperatureTB;
    // End of variables declaration//GEN-END:variables
}
