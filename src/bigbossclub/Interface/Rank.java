/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbossclub.Interface;

import bigbossclub.DbClass.Rank.*;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

/**
 *
 * @author viswa
 */
public class Rank extends javax.swing.JFrame {
    rankDao rankao = new rankDaoImp();
    /**
     * Creates new form Rank
     */
    public Rank() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        r_id = new javax.swing.JTextField();
        r_belt = new javax.swing.JTextField();
        RSave = new javax.swing.JButton();
        RReset = new javax.swing.JButton();
        ur_color = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        urid = new javax.swing.JTextField();
        Ur_color = new javax.swing.JTextField();
        USubmit = new javax.swing.JButton();
        Uupdate = new javax.swing.JButton();
        UReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Drid = new javax.swing.JTextField();
        Ddelete = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        presult = new javax.swing.JTextPane();
        Display = new javax.swing.JButton();
        Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Rank Creation");

        jLabel2.setText("Rank Id");

        jLabel3.setText("Belt Color");

        RSave.setText("Save");
        RSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSaveActionPerformed(evt);
            }
        });

        RReset.setText("Reset");
        RReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(211, 211, 211)
                            .addComponent(RSave)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RReset))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(203, 203, 203)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(71, 71, 71)
                                    .addComponent(r_belt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(85, 85, 85)
                                    .addComponent(r_id, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(r_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(r_belt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RSave)
                    .addComponent(RReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create Rank", jPanel1);

        jLabel4.setText("Update Rank Form");

        jLabel5.setText("Rank Id");

        jLabel6.setText("Belt Color");

        Ur_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ur_colorActionPerformed(evt);
            }
        });

        USubmit.setText("Submit");
        USubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USubmitActionPerformed(evt);
            }
        });

        Uupdate.setText("Update");
        Uupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UupdateActionPerformed(evt);
            }
        });

        UReset.setText("Reset");
        UReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ur_colorLayout = new javax.swing.GroupLayout(ur_color);
        ur_color.setLayout(ur_colorLayout);
        ur_colorLayout.setHorizontalGroup(
            ur_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ur_colorLayout.createSequentialGroup()
                .addGroup(ur_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ur_colorLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(ur_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(64, 64, 64)
                        .addGroup(ur_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(urid)
                            .addComponent(Ur_color, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addGap(115, 115, 115)
                        .addComponent(USubmit))
                    .addGroup(ur_colorLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(ur_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Uupdate)
                            .addComponent(jLabel4))
                        .addGap(93, 93, 93)
                        .addComponent(UReset)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        ur_colorLayout.setVerticalGroup(
            ur_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ur_colorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(ur_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(urid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USubmit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ur_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Ur_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addGroup(ur_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Uupdate)
                    .addComponent(UReset)))
        );

        jTabbedPane1.addTab("Update Rank", ur_color);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel7.setText("Delete Rank");

        jLabel8.setText("Rank ID");

        Ddelete.setText("Delete");
        Ddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DdeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(82, 82, 82)
                                .addComponent(Drid, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(Ddelete))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel7)))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Drid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ddelete)
                        .addGap(30, 30, 30))))
        );

        jTabbedPane1.addTab("Delete Rank", jPanel3);

        jScrollPane1.setViewportView(presult);

        Display.setText("Display");
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(Display)
                .addGap(101, 101, 101)
                .addComponent(Clear)
                .addGap(0, 343, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display)
                    .addComponent(Clear))
                .addContainerGap())
        );

        jTabbedPane1.addTab("View Rank", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RResetActionPerformed
        r_id.setText("");
   
        r_belt.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_RResetActionPerformed

    private void RSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSaveActionPerformed
         rank nstudent;
        nstudent = new rank(
            Integer.parseInt(r_id.getText()),
           
            r_belt.getText()
        );
        rankao.addRank(nstudent);        // TODO add your handling code here:
    }//GEN-LAST:event_RSaveActionPerformed

    private void USubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USubmitActionPerformed
rank students = rankao.getRank(Integer.parseInt(urid.getText()));
       // Ur_name.setText(String.valueOf(students.getR_name()));
        Ur_color.setText(students.getR_belt());    
        // TODO add your handling code here:
    }//GEN-LAST:event_USubmitActionPerformed

    private void Ur_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ur_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ur_colorActionPerformed

    private void UResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UResetActionPerformed
    
        Ur_color.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_UResetActionPerformed

    private void UupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UupdateActionPerformed
       rank ustudent = rankao.getRank(Integer.parseInt(urid.getText()));
        ustudent.setR_belt(Ur_color.getText());
       // ustudent.setR_name(Ur_name.getText());
        rankao.updateRank(ustudent);        // TODO add your handling code here:
    }//GEN-LAST:event_UupdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 Main m = new Main();
        m.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DdeleteActionPerformed
 rankao.deleteRank(Integer.parseInt(Drid.getText()));        // TODO add your handling code here:
    }//GEN-LAST:event_DdeleteActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
 StyledDocument doc = presult.getStyledDocument();
        List<rank> parnts;
        parnts = rankao.getAllRank();
        if (parnts != null) {
            parnts.stream().map((students) -> 
                    "Rank Id:" + students.getR_id()
             
                + ", Belt: " + students.getR_belt()
                + "\n\n").forEachOrdered((str) -> {
                    try {
                        doc.insertString(doc.getLength(), str, null);
                    } catch (BadLocationException e) {
                        System.out.println(e);
                    }
                });
            } if(parnts.isEmpty()) {
                try {
                    doc.insertString(doc.getLength(), "No Record is found", null);
                } catch (BadLocationException e) {
                    System.out.println(e);
                }
            }        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
presult.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(Rank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Ddelete;
    private javax.swing.JButton Display;
    private javax.swing.JTextField Drid;
    private javax.swing.JButton RReset;
    private javax.swing.JButton RSave;
    private javax.swing.JButton UReset;
    private javax.swing.JButton USubmit;
    private javax.swing.JTextField Ur_color;
    private javax.swing.JButton Uupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane presult;
    private javax.swing.JTextField r_belt;
    private javax.swing.JTextField r_id;
    private javax.swing.JPanel ur_color;
    private javax.swing.JTextField urid;
    // End of variables declaration//GEN-END:variables
}
