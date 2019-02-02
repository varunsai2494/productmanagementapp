/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uipackage;
import business_package.vitalsignhistory;
import business_package.vitalsign;
import java.awt.CardLayout;
import java.util.HashSet;
/**
 *
 * @author imperio2494
 */
public class mainframe extends javax.swing.JFrame {

    /**
     * Creates new form mainframe
     */
    
    
    private vitalsignhistory history;
    private vitalsign vitalsign;
    private CardLayout cl;
    
    public mainframe() {
        initComponents();
        history=new vitalsignhistory();
        vitalsign=new vitalsign();
        
        cl = new CardLayout();
        rightpanel.setLayout(cl);
        
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitpane = new javax.swing.JSplitPane();
        rightpanel = new javax.swing.JPanel();
        leftpanel = new javax.swing.JPanel();
        viewbutton = new javax.swing.JButton();
        createBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        abnormalBTN = new javax.swing.JButton();
        maxBP = new javax.swing.JTextField();
        minBP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout rightpanelLayout = new javax.swing.GroupLayout(rightpanel);
        rightpanel.setLayout(rightpanelLayout);
        rightpanelLayout.setHorizontalGroup(
            rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );
        rightpanelLayout.setVerticalGroup(
            rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        splitpane.setRightComponent(rightpanel);

        viewbutton.setText("view vital sign");
        viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbuttonActionPerformed(evt);
            }
        });

        createBTN.setText("create vital sign");
        createBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBTNActionPerformed(evt);
            }
        });

        jLabel1.setText("MAXBP");

        jLabel2.setText("MINBP");

        abnormalBTN.setText("Abnormal");
        abnormalBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abnormalBTNActionPerformed(evt);
            }
        });

        maxBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxBPActionPerformed(evt);
            }
        });

        minBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minBPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftpanelLayout = new javax.swing.GroupLayout(leftpanel);
        leftpanel.setLayout(leftpanelLayout);
        leftpanelLayout.setHorizontalGroup(
            leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftpanelLayout.createSequentialGroup()
                .addGroup(leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewbutton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(leftpanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftpanelLayout.createSequentialGroup()
                                .addGroup(leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(maxBP)
                                    .addComponent(minBP, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
                            .addGroup(leftpanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(abnormalBTN)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        leftpanelLayout.setVerticalGroup(
            leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftpanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(createBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewbutton)
                .addGap(18, 18, 18)
                .addGroup(leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(maxBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(minBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abnormalBTN)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        splitpane.setLeftComponent(leftpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitpane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitpane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBTNActionPerformed
        // TODO add your handling code here:
        createjpanel createpanel=new createjpanel(vitalsign,history);  
        rightpanel.add("createpanel",createpanel);
        CardLayout layout=(CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
//        splitpane.setRightComponent(createpanel);
    }//GEN-LAST:event_createBTNActionPerformed

    private void viewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbuttonActionPerformed
        // TODO add your handling code here:
        viewpanel viewpanel=new viewpanel(vitalsign,history);
        rightpanel.add("viewpanel",viewpanel);
        CardLayout layout=(CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
//        splitpane.setRightComponent(viewpanel);
    }//GEN-LAST:event_viewbuttonActionPerformed

    private void maxBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxBPActionPerformed

    private void minBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minBPActionPerformed

    private void abnormalBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abnormalBTNActionPerformed
        // TODO add your handling code here:
        double minbp=Double.parseDouble(minBP.getText());
        double maxbp=Double.parseDouble(maxBP.getText());
        abnormal abnormalpanel=new abnormal(history,minbp,maxbp);
        rightpanel.add("abnormalpanel",abnormalpanel);
        CardLayout layout=(CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_abnormalBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abnormalBTN;
    private javax.swing.JButton createBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JTextField maxBP;
    private javax.swing.JTextField minBP;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JSplitPane splitpane;
    private javax.swing.JButton viewbutton;
    // End of variables declaration//GEN-END:variables
}
