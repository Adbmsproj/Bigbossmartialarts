/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbossclub.Interface;
import bigbossclub.DbClass.Parents.*;
import bigbossclub.DbClass.Parents.parent_infoDaoImp;
import bigbossclub.DbClass.Parents.parent_infoDao;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

/**
 *
 * @author viswa
 */
public class Parent extends javax.swing.JFrame {
    parent_infoDao parentinfoDao = new parent_infoDaoImp();


    /**
     * Creates new form Parent
     */
    public Parent() {
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

        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PSave = new javax.swing.JButton();
        PReset = new javax.swing.JButton();
        Sid = new javax.swing.JTextField();
        First_name = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        relation = new javax.swing.JTextField();
        Last_name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        UUpdate = new javax.swing.JButton();
        UReset = new javax.swing.JButton();
        upid = new javax.swing.JTextField();
        USubmit = new javax.swing.JButton();
        Usid = new javax.swing.JTextField();
        UFirst_name = new javax.swing.JTextField();
        UMob = new javax.swing.JTextField();
        URelation = new javax.swing.JTextField();
        ULast_name = new javax.swing.JTextField();
        UEmail = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PResult = new javax.swing.JTextPane();
        viewallparents = new javax.swing.JButton();
        clearparents = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DParentid = new javax.swing.JTextField();
        DeleteParent = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Viewsid = new javax.swing.JTextField();
        VSview = new javax.swing.JButton();
        VSclear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        PSResult = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student Id");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel5.setText("Mobile");

        jLabel6.setText("Email");

        jLabel7.setText("Relation");

        PSave.setText("Save");
        PSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSaveActionPerformed(evt);
            }
        });

        PReset.setText("Reset");
        PReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PResetActionPerformed(evt);
            }
        });

        jLabel23.setText("New Parent Creation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(relation, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(Sid)
                            .addComponent(First_name)
                            .addComponent(mob))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(Last_name)))
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(PSave)
                        .addGap(100, 100, 100)
                        .addComponent(PReset)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(First_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(relation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PSave)
                    .addComponent(PReset))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create Parent", jPanel1);

        jLabel10.setText("Enter Student ID");

        jLabel11.setText("Parent ID");

        jLabel12.setText("First Name");

        jLabel13.setText("Last Name");

        jLabel14.setText("Mobile");

        jLabel15.setText("Email");

        jLabel16.setText("Relation");

        UUpdate.setText("Update");
        UUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UUpdateActionPerformed(evt);
            }
        });

        UReset.setText("Reset");
        UReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UResetActionPerformed(evt);
            }
        });

        USubmit.setText("Submit");
        USubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USubmitActionPerformed(evt);
            }
        });

        jLabel17.setText("Updation Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addComponent(USubmit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(UFirst_name, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel15))
                                        .addGap(61, 61, 61)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ULast_name, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(URelation)
                                    .addComponent(UMob))
                                .addGap(194, 194, 194)
                                .addComponent(UReset))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(upid, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Usid, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(UUpdate)))
                .addGap(47, 47, 47))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(upid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USubmit))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Usid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(UFirst_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ULast_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(UMob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(URelation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UUpdate)
                    .addComponent(UReset))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Update Parent", jPanel2);

        jLabel18.setText("View All Parents");

        jScrollPane1.setViewportView(PResult);

        viewallparents.setText("View");
        viewallparents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallparentsActionPerformed(evt);
            }
        });

        clearparents.setText("Clear");
        clearparents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearparentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(viewallparents)
                        .addGap(156, 156, 156)
                        .addComponent(clearparents)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel18)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewallparents)
                    .addComponent(clearparents))
                .addGap(47, 47, 47))
        );

        jTabbedPane1.addTab("View Parents", jPanel3);

        jLabel8.setText("Delete Parent Details");

        jLabel9.setText("Parent ID");

        DeleteParent.setText("Delete");
        DeleteParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteParentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel9)
                        .addGap(66, 66, 66)
                        .addComponent(DParentid, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(DeleteParent)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(DParentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(DeleteParent)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete Parent", jPanel5);

        jLabel21.setText("View Student-Parent Details");

        jLabel22.setText("Student Id");

        VSview.setText("View");
        VSview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VSviewActionPerformed(evt);
            }
        });

        VSclear.setText("Clear");
        VSclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VSclearActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(PSResult);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(222, 222, 222))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel22)
                        .addGap(131, 131, 131)
                        .addComponent(Viewsid, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(VSview)
                        .addGap(74, 74, 74)
                        .addComponent(VSclear))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel21)
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Viewsid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VSview)
                    .addComponent(VSclear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Student Parent", jPanel6);

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(303, 303, 303))
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

    private void PSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSaveActionPerformed
parent_info nstudent;
        nstudent = new parent_info(
            First_name.getText(),
            Last_name.getText(),
            relation.getText(),
            Long.parseLong(mob.getText()),
            email.getText(),
            Integer.parseInt(Sid.getText())
        );
        parentinfoDao.addParent(nstudent);        // TODO add your handling code here:
    }//GEN-LAST:event_PSaveActionPerformed

    private void PResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PResetActionPerformed
  Sid.setText("");
        First_name.setText("");
        Last_name.setText("");
        relation.setText("");
        mob.setText("");
        email.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_PResetActionPerformed

    private void DeleteParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteParentActionPerformed
 parentinfoDao.deleteParent(Integer.parseInt(DParentid.getText()));        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteParentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  Main m = new Main();
        m.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void USubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USubmitActionPerformed
 parent_info students = parentinfoDao.getParent(Integer.parseInt(upid.getText()));
        Usid.setText(String.valueOf(students.getP_id()));
        UFirst_name.setText(students.getP_fname());
        ULast_name.setText(students.getP_lname());
        URelation.setText(students.getP_relation());
        UMob.setText(String.valueOf(students.getP_mobile()));
        UEmail.setText(students.getP_email());        // TODO add your handling code here:
    }//GEN-LAST:event_USubmitActionPerformed

    private void UUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UUpdateActionPerformed

        parent_info ustudent = parentinfoDao.getParent(Integer.parseInt(upid.getText()));
        ustudent.setP_fname(UFirst_name.getText());
        ustudent.setP_lname(ULast_name.getText());
        ustudent.setP_relation(URelation.getText());
        ustudent.setP_mobile(Long.parseLong(UMob.getText()));
        ustudent.setP_email(UEmail.getText());

        parentinfoDao.updateParent(ustudent);        // TODO add your handling code here:
    }//GEN-LAST:event_UUpdateActionPerformed

    private void UResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UResetActionPerformed
  Usid.setText("");
        UFirst_name.setText("");
        ULast_name.setText("");
        URelation.setText("");
        UMob.setText("");
        UEmail.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_UResetActionPerformed

    private void viewallparentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallparentsActionPerformed
StyledDocument doc = PResult.getStyledDocument();
        List<parent_info> parnts;
        parnts = parentinfoDao.getAllparents();
        if (parnts != null) {
            parnts.stream().map((students) -> "Parent Id:" + students.getP_id()
                + ", Student ID " + students.getParentfk_s_sid()
                + ", Name:" + students.getP_fname() + students.getP_lname()
                + ", Relation" + students.getP_relation()
                + ", email:" + students.getP_email()
                + ", Mobile:" + students.getP_mobile() + "\n\n").forEachOrdered((str) -> {
                    try {
                        doc.insertString(doc.getLength(), str, null);
                    } catch (BadLocationException e) {
                        System.out.println(e);
                    }
                });
            } else {
                try {
                    doc.insertString(doc.getLength(), "No Record is found", null);
                } catch (BadLocationException e) {
                    System.out.println(e);
                }
            }        // TODO add your handling code here:
    }//GEN-LAST:event_viewallparentsActionPerformed

    private void clearparentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearparentsActionPerformed
 PResult.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_clearparentsActionPerformed

    private void VSviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VSviewActionPerformed
StyledDocument doc = PSResult.getStyledDocument();
        List<parent_info> parnts;
        parnts = parentinfoDao.getUserparents(Integer.parseInt(Viewsid.getText()));
        
        if (parnts != null) {
            parnts.stream().map((students) -> "Parent Id:" + students.getP_id()
                + ", Student ID " + students.getParentfk_s_sid()
                + ", Name:" + students.getP_fname() + students.getP_lname()
                + ", Relation" + students.getP_relation()
                + ", email:" + students.getP_email()
                + ", Mobile:" + students.getP_mobile() + "\n\n").forEachOrdered((str) -> {
                    try {
                        doc.insertString(doc.getLength(), str, null);
                    } catch (BadLocationException e) {
                        System.out.println(e);
                    }
                });
            
            } if(parnts == null) {
                try {
                    doc.insertString(doc.getLength(), "No Record is found", null);
                } catch (BadLocationException e) {
                    System.out.println(e);
                }
            }        // TODO add your handling code here:
    }//GEN-LAST:event_VSviewActionPerformed

    private void VSclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VSclearActionPerformed
 PSResult.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_VSclearActionPerformed

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
            java.util.logging.Logger.getLogger(Parent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DParentid;
    private javax.swing.JButton DeleteParent;
    private javax.swing.JTextField First_name;
    private javax.swing.JTextField Last_name;
    private javax.swing.JButton PReset;
    private javax.swing.JTextPane PResult;
    private javax.swing.JTextPane PSResult;
    private javax.swing.JButton PSave;
    private javax.swing.JTextField Sid;
    private javax.swing.JTextField UEmail;
    private javax.swing.JTextField UFirst_name;
    private javax.swing.JTextField ULast_name;
    private javax.swing.JTextField UMob;
    private javax.swing.JTextField URelation;
    private javax.swing.JButton UReset;
    private javax.swing.JButton USubmit;
    private javax.swing.JButton UUpdate;
    private javax.swing.JTextField Usid;
    private javax.swing.JButton VSclear;
    private javax.swing.JButton VSview;
    private javax.swing.JTextField Viewsid;
    private javax.swing.JButton clearparents;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField relation;
    private javax.swing.JTextField upid;
    private javax.swing.JButton viewallparents;
    // End of variables declaration//GEN-END:variables
}
